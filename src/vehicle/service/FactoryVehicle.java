package vehicle.service;



import vehicle.model.Car;
import vehicle.model.MotorBike;
import vehicle.model.Truck;


import java.io.File;

import java.util.ArrayList;
import java.util.List;



public class FactoryVehicle {
    public static String linkFileTruck = "src/vehicle/data/xeTai.csv";
    public static String linkFileCar = "src/vehicle/data/oto.csv";
    public static String linkFileMotorBike = "src/vehicle/data/xeMay.csv";

    public static List<Truck> truckManager = new ArrayList<>();
    public static List<Car> carManager = new ArrayList<>();
    public static List<MotorBike> motorBikeManager = new ArrayList<>();
    public static File fileTruck = new File(linkFileTruck);
    public static File fileCar = new File(linkFileCar);
    public static File fileMotorBike = new File(linkFileMotorBike);


}
