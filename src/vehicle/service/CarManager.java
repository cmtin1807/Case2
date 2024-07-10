package vehicle.service;



import vehicle.model.Car;
import vehicle.model.MotorBike;
import vehicle.model.Vehicle;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static vehicle.service.CompanyManager.getCompany;
import static vehicle.util.ReadAndWrite.*;


public class CarManager {
    public static void addVehicleCar(Scanner scanner, List<Car> carManager, File fileCar) {
        System.out.println("Biển kiểm soát: ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Tên hãng sản xuất ");
        String hangSanXuat = getCompany();
        System.out.println("Năm sản xuất");
        int namSanXuat = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Chủ sở hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Loại xe");
        String loaiXe = scanner.nextLine();
        System.out.println("Số ghế ngồi");
        int soGheNgoi = scanner.nextInt();
        Car car = new Car(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, loaiXe, soGheNgoi);
        carManager.add(car);
        System.out.println("Đã thêm thành công \n" + car);
        writeFileCarAddCar(fileCar, car);
        loadFileCar(fileCar, carManager);
    }
    public static void displayCar(File fileCar, List<Car> carManager){
        loadFileCar(fileCar, carManager);
        for (Vehicle car : carManager) {
            System.out.println(car);
        }
    }
    public static void removeVehicleCar(Scanner scanner,  File fileCar, List<Car> carManager){
        System.out.println("Enter chọn biển số xóa");
        String licensePlatesRemove = scanner.nextLine();
        boolean isLicensePlatesRemove = false;
        loadFileCar(fileCar, carManager);

        List<Car> carToKeep = new ArrayList<>();
        for (Car car : carManager) {
            if (!car.getLicensePlates().equals(licensePlatesRemove)) {
                carToKeep.add(car);
            } else {
                isLicensePlatesRemove = true;
                System.out.println("Biển số xe bạn vừa nhập có trong kho quản lý. Bạn có thực sự muốn xóa hay không");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Xóa thành công " + car);
                        break;
                    case 2:
                        carToKeep.add(car);
                        break;
                }
            }
        }
        carManager.clear();
        carManager.addAll(carToKeep);
        writeFileCar(fileCar, carManager);
        if (!isLicensePlatesRemove) {
            System.out.println("Biển số xe bạn nhập không hợp lệ");
        }
    }
    public static void updateVehicleCar(Scanner scanner,  File fileCar, List<Car> carManager){
        System.out.println("Enter chọn biển số update");
        String licensePlatesUpdate = scanner.nextLine();
        boolean isLicensePlatesUpdate = false;
        loadFileCar(fileCar, carManager);
        List<Car> carToKeep = new ArrayList<>();
        for (Car car : carManager) {
            if (!car.getLicensePlates().equals(licensePlatesUpdate)) {
                carToKeep.add(car);
            } else {
                System.out.println("Biển số vừa nhập của bạn có trong hệ thống vui lòng nhập đầy đủ thông tin để cập nhập");
                System.out.println("Tên hãng sản xuất ");
                String hangSanXuat = getCompany();
                System.out.println("Năm sản xuất");
                int namSanXuat = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Chủ sở hữu");
                String chuSoHuu = scanner.nextLine();
                System.out.println("Loại xe");
                String loaiXe = scanner.nextLine();
                System.out.println("Số ghế ngồi");
                int soGheNgoi = Integer.parseInt(scanner.nextLine());
                Car newCar = new Car(licensePlatesUpdate,hangSanXuat, namSanXuat,chuSoHuu,loaiXe,soGheNgoi);
                carToKeep.add(newCar);
                System.out.println("Cập nhập thành công " + newCar);
                isLicensePlatesUpdate = true;
            }
        }
        carManager.clear();
        carManager.addAll(carToKeep);
        writeFileCar(fileCar, carManager);
        if (!isLicensePlatesUpdate) {
            System.out.println("Biển số xe bạn nhập không hợp lệ");
        }
    }
    public static void sortVehicleCar(File fileCar, List<Car> carManager){
        loadFileCar(fileCar, carManager);
        Collections.sort(carManager, Comparator.comparing(Car::getLicensePlates));
        for (Vehicle car : carManager) {
            System.out.println(car);
        }
    }
}
