package vehicle.util;



import vehicle.model.Car;
import vehicle.model.MotorBike;
import vehicle.model.Truck;

import java.io.*;
import java.util.List;


public class ReadAndWrite {
    public static void loadFileTruck(File fileTruck, List<Truck> truckManager) {
        try {
            truckManager.clear();
            BufferedReader readerFileTruck = new BufferedReader(new FileReader(fileTruck));
            String lineTruck;
            while ((lineTruck = readerFileTruck.readLine()) != null) {
                String[] dataTruck = lineTruck.split(",");
                truckManager.add(new Truck(dataTruck[0], dataTruck[1], Integer.parseInt(dataTruck[2]), dataTruck[3], Integer.parseInt(dataTruck[4])));
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileTruck);
        }
        catch (IOException e) {
            System.err.println("Error reading file: " + fileTruck);
        }
    }

    public static void loadFileCar(File fileCar, List<Car> carManager) {
        try {
            carManager.clear();
            BufferedReader readerFileCar = new BufferedReader(new FileReader(fileCar));
            String lineCar;
            while ((lineCar = readerFileCar.readLine()) != null) {
                String[] dataCar = lineCar.split(",");
                carManager.add(new Car(dataCar[0], dataCar[1], Integer.parseInt(dataCar[2]), dataCar[3], dataCar[4], Integer.parseInt(dataCar[5])));
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileCar);
        }
        catch (IOException e) {
            System.err.println("Error reading file: " + fileCar);
        }
    }
    public static void loadFileMotorBike(File fileMotorBike, List<MotorBike> motorBikeManager) {
        try {
            motorBikeManager.clear();
            BufferedReader readerFileMotorBike = new BufferedReader(new FileReader(fileMotorBike));
            String lineMotorBike;
            while ((lineMotorBike = readerFileMotorBike.readLine()) != null) {
                String[] dataMotorBike = lineMotorBike.split(",");
                motorBikeManager.add(new MotorBike(dataMotorBike[0], dataMotorBike[1], Integer.parseInt(dataMotorBike[2]), dataMotorBike[3], Integer.parseInt(dataMotorBike[4])));
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileMotorBike);
        }
        catch (IOException e) {
            System.err.println("Error reading file: " + fileMotorBike);
        }
    }
    public static void writeFileTruckAddTruck(File fileTruck, Truck truck) {
        try {
            FileWriter writerTruck = new FileWriter(fileTruck, true);
            BufferedWriter bufferedWriterTruck = new BufferedWriter(writerTruck);
            String write = truck.getInforToFile();
            bufferedWriterTruck.write(write);
            bufferedWriterTruck.newLine();
            bufferedWriterTruck.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileTruck);
        }
        catch (IOException e) {
            System.err.println("Error writing file: " + fileTruck);
        }
    }
    public static void writeFileCarAddCar(File fileCar, Car car) {
        try {
            FileWriter writerCar = new FileWriter(fileCar, true);
            BufferedWriter bufferedWriterCar = new BufferedWriter(writerCar);
            String write = car.getInforToFile();
            bufferedWriterCar.write(write);
            bufferedWriterCar.newLine();
            bufferedWriterCar.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileCar);
        }
        catch (IOException e) {
            System.err.println("Error writing file: " + fileCar);
        }
    }
    public static void writeFileMotorBikeAddMotorBike(File fileMotorBike, MotorBike motorBike) {
        try {
            FileWriter writerMotorBike = new FileWriter(fileMotorBike, true);
            BufferedWriter bufferedWriterMotorBike = new BufferedWriter(writerMotorBike);
            String write = motorBike.getInforToFile();
            bufferedWriterMotorBike.write(write);
            bufferedWriterMotorBike.newLine();
            bufferedWriterMotorBike.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileMotorBike);
        }
        catch (IOException e) {
            System.err.println("Error writing file: " + fileMotorBike);
        }
    }
    public static void writeFileTruck(File fileTruck, List<Truck> truckManager) {
        try (BufferedWriter bufferedWriterTruck = new BufferedWriter(new FileWriter(fileTruck))) {
            for (Truck truck : truckManager) {
                bufferedWriterTruck.write(truck.getInforToFile());
                bufferedWriterTruck.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFileCar(File fileCar, List<Car> carManager) {
        try (BufferedWriter bufferedWriterCar = new BufferedWriter(new FileWriter(fileCar))) {
            for (Car car : carManager) {
                bufferedWriterCar.write(car.getInforToFile());
                bufferedWriterCar.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFileMotorBike(File fileTruck, List<MotorBike> motorBikeManager) {
        try (BufferedWriter bufferedWriterMotorBike = new BufferedWriter(new FileWriter(fileTruck))) {
            for (MotorBike motorBike : motorBikeManager) {
                bufferedWriterMotorBike.write(motorBike.getInforToFile());
                bufferedWriterMotorBike.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

