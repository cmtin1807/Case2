package vehicle.service;



import vehicle.model.Truck;
import vehicle.model.Vehicle;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static vehicle.service.CompanyManager.getCompany;
import static vehicle.util.ReadAndWrite.*;


public class TruckManager {
    public static void addVehicleTruck(Scanner scanner, List<Truck> truckManager, File fileTruck){
        try {
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
            int taiTrong = scanner.nextInt();
            scanner.nextLine();
            Truck truck = new Truck(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, taiTrong);
            truckManager.add(truck);
            System.out.println("Đã thêm thành công \n" + truck);
            writeFileTruckAddTruck(fileTruck, truck);
            loadFileTruck(fileTruck, truckManager);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void displayTruck(File fileTruck, List<Truck> truckManager){
        loadFileTruck(fileTruck, truckManager);
        for (Vehicle truck : truckManager) {
            System.out.println(truck);
        }
    }
    public static void removeVehicleTruck(Scanner scanner, File fileTruck, List<Truck> truckManager) {
        System.out.println("Enter chọn biển số xóa");
        String licensePlatesRemove = scanner.nextLine();
        boolean isLicensePlatesRemove = false;
        loadFileTruck(fileTruck, truckManager);
        List<Truck> trucksToKeep = new ArrayList<>();
        for (Truck truck : truckManager) {
            if (!truck.getLicensePlates().equals(licensePlatesRemove)) {
                trucksToKeep.add(truck);
            } else {
                isLicensePlatesRemove = true;
                System.out.println("Biển số xe bạn vừa nhập có trong kho quản lý. Bạn có thực sự muốn xóa hay không");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Xóa thành công " + truck);

                        break;
                    case 2:
                        trucksToKeep.add(truck);

                        break;
                }
            }
            truckManager.clear();
            truckManager.addAll(trucksToKeep);
            writeFileTruck(fileTruck, truckManager);
            if (!isLicensePlatesRemove) {
                System.out.println("Biển số xe bạn nhập không hợp lệ");
            }
        }
    }
    public static void updateVehicleTruck(Scanner scanner, File fileTruck, List<Truck> truckManager) {

        System.out.println("Enter chọn biển số xóa");
        String licensePlatesUpdate = scanner.nextLine();
        boolean isLicensePlatesUpdate = false;
        loadFileTruck(fileTruck, truckManager);
        List<Truck> trucksToKeep = new ArrayList<>();
        for (Truck truck : truckManager) {
            if (!truck.getLicensePlates().equals(licensePlatesUpdate)) {
                trucksToKeep.add(truck);
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
                int taiTrong = Integer.parseInt(scanner.nextLine());

                Truck newTruck = new Truck(licensePlatesUpdate, hangSanXuat, namSanXuat, chuSoHuu, taiTrong);
                trucksToKeep.add(newTruck);
                System.out.println("Cập nhập thành công " + newTruck);
                isLicensePlatesUpdate = true;
            }
        }
        truckManager.clear();
        truckManager.addAll(trucksToKeep);
        writeFileTruck(fileTruck, truckManager);
        if (!isLicensePlatesUpdate) {
            System.out.println("Biển số xe bạn nhập không hợp lệ");
        }
    }
    public static void sortVehicleTruck(File fileTruck, List<Truck> truckManager){
        loadFileTruck(fileTruck, truckManager);
        Collections.sort(truckManager, Comparator.comparing(Truck::getLicensePlates));
        for (Vehicle truck : truckManager) {
            System.out.println(truck);
        }
    }


}
