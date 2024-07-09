package vehicle.service;



import vehicle.model.MotorBike;
import vehicle.model.Vehicle;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import static vehicle.service.CompanyManager.getCompany;
import static vehicle.util.ReadAndWrite.*;


public class MotorBikeManager {
    public static void addVehicleMotorBike(Scanner scanner, List<MotorBike> motorBikeManager, File fileMotorBike) throws IOException {
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
    public static void displayMotorBike(File fileMotorBike, List<MotorBike> motorBikeManager) throws IOException {
        loadFileMotorBike(fileMotorBike, motorBikeManager);
        for (Vehicle motorBike : motorBikeManager) {
            System.out.println(motorBike);
        }
    }
    public static void removeVehicleMotorBike(Scanner scanner, File fileMotorBike, List<MotorBike> motorBikeManager) throws IOException {
        System.out.println("Enter chọn biển số xóa");
        String licensePlatesRemove = scanner.nextLine();
        boolean isLicensePlatesRemove = false;
        loadFileMotorBike(fileMotorBike, motorBikeManager);
        List<MotorBike> motorBikeToKeep = new ArrayList<>();
        for (MotorBike motorBike : motorBikeManager) {
            if (!motorBike.getLicensePlates().equals(licensePlatesRemove)) {
                motorBikeToKeep.add(motorBike);
            } else {
                System.out.println("Xoa thanh cong " + motorBike);
                isLicensePlatesRemove = true;
            }
        }

        motorBikeManager.clear();
        motorBikeManager.addAll(motorBikeToKeep);
        writeFileMotorBike(fileMotorBike, motorBikeManager);
        if (!isLicensePlatesRemove) {
            System.out.println("Biển số xe bạn nhập không hợp lệ");
        }
    }
    public static void updateVehicleMotorBike(Scanner scanner, File fileMotorBike, List<MotorBike> motorBikeManager) throws IOException {
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




}
