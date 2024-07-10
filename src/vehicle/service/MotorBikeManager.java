package vehicle.service;


import vehicle.model.MotorBike;
import vehicle.model.Truck;
import vehicle.model.Vehicle;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static vehicle.service.CompanyManager.getCompany;
import static vehicle.util.ReadAndWrite.*;


public class MotorBikeManager {
    public static void addVehicleMotorBike(Scanner scanner, List<MotorBike> motorBikeManager, File fileMotorBike){
        System.out.println("Biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Tên hãng sản xuất ");
        String hangSanXuat = getCompany();
        System.out.println("Năm sản xuất");
        int namSanXuat = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Chủ sở hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Tải trọng ");
        int congSuat = scanner.nextInt();
        scanner.nextLine();
        MotorBike motorBike = new MotorBike(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
        motorBikeManager.add(motorBike);
        System.out.println("Đã thêm thành công \n" + motorBike);
        writeFileMotorBikeAddMotorBike(fileMotorBike, motorBike);
        loadFileMotorBike(fileMotorBike, motorBikeManager);
    }

    public static void displayMotorBike(File fileMotorBike, List<MotorBike> motorBikeManager){
        loadFileMotorBike(fileMotorBike, motorBikeManager);
        for (Vehicle motorBike : motorBikeManager) {
            System.out.println(motorBike);
        }
    }

    public static void removeVehicleMotorBike(Scanner scanner, File fileMotorBike, List<MotorBike> motorBikeManager) {
        System.out.println("Enter chọn biển số xóa");
        String licensePlatesRemove = scanner.nextLine();
        boolean isLicensePlatesRemove = false;
        loadFileMotorBike(fileMotorBike, motorBikeManager);
        List<MotorBike> motorBikeToKeep = new ArrayList<>();
        for (MotorBike motorBike : motorBikeManager) {
            if (!motorBike.getLicensePlates().equals(licensePlatesRemove)) {
                motorBikeToKeep.add(motorBike);
            } else {
                isLicensePlatesRemove = true;
                System.out.println("Biển số xe bạn vừa nhập có trong kho quản lý. Bạn có thực sự muốn xóa hay không");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Xóa thành công " + motorBike);

                        break;
                    case 2:
                        motorBikeToKeep.add(motorBike);
                        break;
                }

            }
        }

        motorBikeManager.clear();
        motorBikeManager.addAll(motorBikeToKeep);
        writeFileMotorBike(fileMotorBike, motorBikeManager);
        if (!isLicensePlatesRemove) {
            System.out.println("Biển số xe bạn nhập không hợp lệ");
        }
    }

    public static void updateVehicleMotorBike(Scanner scanner, File fileMotorBike, List<MotorBike> motorBikeManager){
        System.out.println("Enter chọn biển số cập nhập");
        String licensePlatesUpdate = scanner.nextLine();
        boolean isLicensePlatesUpdate = false;
        loadFileMotorBike(fileMotorBike, motorBikeManager);
        List<MotorBike> motorBikeToKeep = new ArrayList<>();
        for (MotorBike motorBike : motorBikeManager) {
            if (!motorBike.getLicensePlates().equals(licensePlatesUpdate)) {
                motorBikeToKeep.add(motorBike);
            } else {
                System.out.println("Biển số vừa nhập của bạn có trong hệ thống vui lòng nhập đầy đủ thông tin để cập nhập");
                System.out.println("Tên hãng sản xuất ");
                String hangSanXuat = getCompany();
                System.out.println("Năm sản xuất");
                int namSanXuat = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Chủ sở hữu");
                String chuSoHuu = scanner.nextLine();
                System.out.println("Tải trọng ");
                int congSuat = Integer.parseInt(scanner.nextLine());
                MotorBike newMotorBike = new MotorBike(licensePlatesUpdate, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
                motorBikeToKeep.add(newMotorBike);
                System.out.println("Cập nhập thành công " + newMotorBike);
                isLicensePlatesUpdate = true;
            }
        }

        motorBikeManager.clear();
        motorBikeManager.addAll(motorBikeToKeep);
        writeFileMotorBike(fileMotorBike, motorBikeManager);
        if (!isLicensePlatesUpdate) {
            System.out.println("Biển số xe bạn nhập không hợp lệ");
        }
    }
    public static void sortVehicleMotorBike(File fileMotorBike, List<MotorBike> motorBikeManager){
        loadFileMotorBike(fileMotorBike, motorBikeManager);
        Collections.sort(motorBikeManager, Comparator.comparing(MotorBike::getLicensePlates));
        for (Vehicle motorBike : motorBikeManager) {
            System.out.println(motorBike);
        }
    }


}
