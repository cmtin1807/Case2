package vehicle.controller;

import vehicle.model.Car;
import vehicle.model.MotorBike;
import vehicle.model.Truck;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static vehicle.service.CarManager.*;
import static vehicle.service.CarManager.updateVehicleCar;
import static vehicle.service.FactoryVehicle.*;
import static vehicle.service.MotorBikeManager.*;
import static vehicle.service.MotorBikeManager.updateVehicleMotorBike;
import static vehicle.service.TruckManager.*;
import static vehicle.service.TruckManager.updateVehicleTruck;
import static vehicle.template.DisplayProgram.*;
import static vehicle.template.DisplayProgram.getChoiceUpdateVehicle;
import static vehicle.util.IViewAddVehicle.*;
import static vehicle.util.IViewAddVehicle.EXIT_ADD;
import static vehicle.util.IViewDisplayVehicle.*;
import static vehicle.util.IViewDisplayVehicle.EXIT_DISPLAY;
import static vehicle.util.IViewRemoveVehicle.*;
import static vehicle.util.IViewRemoveVehicle.EXIT_REMOVE;
import static vehicle.util.IViewSortVehicle.*;
import static vehicle.util.IViewUpdateVehicle.*;
import static vehicle.util.IViewUpdateVehicle.EXIT_UPDATE;

public class MenuVehicle {
    public static void functionAddVehicle(Scanner scanner){
        boolean addVehicle = true;
        while (addVehicle) {
            int choiceThem = getChoiceAddVehicle(scanner);
            switch (choiceThem) {
                case ADD_VEHICLE_TRUCK:
                    addVehicleTruck(scanner, truckManager, fileTruck);
                    break;
                case ADD_VEHICLE_CAR:
                    addVehicleCar(scanner, carManager, fileCar);
                    break;
                case ADD_VEHICLE_MOTORBIKE:
                    addVehicleMotorBike(scanner, motorBikeManager, fileMotorBike);
                    break;
                case EXIT_ADD:
                    System.out.println("Đã thoát ra khỏi chương trình thêm phương tiện");
                    addVehicle = false;
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không phù hợp. Vui lòng chọn lại");
            }
        }

    }


    public static void functionDisplayVehicle(Scanner scanner)  {
        boolean displayVehicle = true;
        while (displayVehicle) {
            int choiceDisplay = getChoiceDisplayVehicle(scanner);
            switch (choiceDisplay) {
                case DISPLAY_VEHICLE_TRUCK:
                    displayTruck(fileTruck, truckManager);
                    break;
                case DISPLAY_VEHICLE_CAR:
                    displayCar(fileCar, carManager);
                    break;
                case DISPLAY_VEHICLE_MOTORBIKE:
                    displayMotorBike(fileMotorBike, motorBikeManager);
                    break;
                case EXIT_DISPLAY:
                    System.out.println("Đã thoát ra khỏi chương trình hiển thị phương tiện");
                    displayVehicle = false;
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không phù hợp. Vui lòng chọn lại");
            }
        }
    }

    public static void functionRemoveVehicle(Scanner scanner, File fileTruck, List<Truck> truckManager, List<Car> carManager, File fileCar, List<MotorBike> motorBikeManager) {
        boolean removeVehicle = true;
        while (removeVehicle) {
            int ChoiceRemove = getChoiceRemoveVehicle(scanner);
            switch (ChoiceRemove) {
                case REMOVE_VEHICLE_TRUCK :
                    removeVehicleTruck(scanner, fileTruck, truckManager);
                    break;
                case REMOVE_VEHICLE_CAR:
                    removeVehicleCar(scanner,  fileCar, carManager);
                    break;
                case REMOVE_VEHICLE_MOTORBIKE:
                    removeVehicleMotorBike(scanner, fileMotorBike, motorBikeManager);
                    break;
                case EXIT_REMOVE:
                    System.out.println("Đã thoát ra khỏi chương trình xóa phương tiện");
                    removeVehicle = false;
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không phù hợp. Vui lòng chọn lại");
            }
        }
    }
    public static void functionUpdateVehicle(Scanner scanner, File fileTruck, List<Truck> truckManager, List<Car> carManager, File fileCar, List<MotorBike> motorBikeManager){
        boolean isUpdateVehicle = true;
        while (isUpdateVehicle) {
            int ChoiceUpdate = getChoiceUpdateVehicle(scanner);
            switch (ChoiceUpdate) {
                case UPDATE_VEHICLE_TRUCK :
                    updateVehicleTruck(scanner, fileTruck, truckManager);
                    break;
                case UPDATE_VEHICLE_CAR:
                    updateVehicleCar(scanner,  fileCar, carManager);
                    break;
                case UPDATE_VEHICLE_MOTORBIKE:
                    updateVehicleMotorBike(scanner, fileMotorBike, motorBikeManager);
                    break;
                case EXIT_UPDATE:
                    System.out.println("Đã thoát ra khỏi chương trình cập nhâp phương tiện");
                    isUpdateVehicle = false;
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không phù hợp. Vui lòng chọn lại");
            }
        }
    }
    public static void functionSortVehicle(Scanner scanner)  {
        boolean sortVehicle = true;
        while (sortVehicle) {
            int choiceSort = getChoiceSortVehicle(scanner);
            switch (choiceSort) {
                case SORT_VEHICLE_TRUCK:
                    sortVehicleTruck(fileTruck, truckManager);
                    break;
                case SORT_VEHICLE_CAR:
                    sortVehicleCar(fileCar, carManager);
                    break;
                case SORT_VEHICLE_MOTORBIKE:
                    sortVehicleMotorBike(fileMotorBike, motorBikeManager);
                    break;
                case EXIT_SORT:
                    System.out.println("Đã thoát ra khỏi chương trình sắp xếp phương tiện");
                    sortVehicle = false;
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không phù hợp. Vui lòng chọn lại");
            }
        }
    }
}
