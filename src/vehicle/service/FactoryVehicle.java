package vehicle.service;



import vehicle.model.Car;
import vehicle.model.MotorBike;
import vehicle.model.Truck;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import static vehicle.service.CarManager.*;
import static vehicle.service.MotorBikeManager.*;
import static vehicle.service.TruckManager.*;
import static vehicle.template.DisplayProgram.*;
import static vehicle.util.IViewAddVehicle.*;
import static vehicle.util.IViewDisplayVehicle.*;
import static vehicle.util.IViewRemoveVehicle.*;
import static vehicle.util.IViewUpdateVehicle.*;


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
