package vehicle.controller;


import java.util.Scanner;

import static vehicle.controller.MenuVehicle.*;
import static vehicle.service.FactoryVehicle.*;
import static vehicle.template.DisplayProgram.displayMenu;
import static vehicle.util.IViewMenu.*;
import static vehicle.util.ReadAndWrite.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loadFileTruck(fileTruck, truckManager);
        loadFileCar(fileCar, carManager);
        loadFileMotorBike(fileMotorBike, motorBikeManager);
        while (true) {
            int choice = displayMenu(scanner);
            switch (choice) {
                case ADD_VEHICLE:
                    functionAddVehicle(scanner);
                    break;
                case SHOW_VEHICLE :
                    functionDisplayVehicle(scanner);
                    break;
                case REMOVE_VEHICLE:
                    functionRemoveVehicle(scanner, fileTruck, truckManager, carManager, fileCar, motorBikeManager);
                    break;
                case UPDATE_VEHICLE:
                    functionUpdateVehicle(scanner, fileTruck, truckManager, carManager, fileCar, motorBikeManager);
                    break;
                case SORT_VEHICLE:
                    functionSortVehicle(scanner);
                    break;
                case EXIT:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }




}
