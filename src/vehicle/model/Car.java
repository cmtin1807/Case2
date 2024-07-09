package vehicle.model;

public class Car extends Vehicle {
    private String typeOfCar;
    private int numberOfSeats;

    public Car() {}
    public Car(String licensePlates, String company, int yearCreatOfVehicle, String owner, String typeOfCar, int numberOfSeats ) {
        super(licensePlates, company, yearCreatOfVehicle, owner);
        this.typeOfCar = typeOfCar;
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }
    public String getInforToFile(){
        return super.getInforToFile()+","+typeOfCar+","+numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlates='" + licensePlates + '\'' +
                ", company='" + company + '\'' +
                ", yearCreatOfVehicle=" + yearCreatOfVehicle +
                ", owner='" + owner + '\'' +
                ", typeOfCar='" + typeOfCar + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
