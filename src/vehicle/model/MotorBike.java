package vehicle.model;

public class MotorBike extends Vehicle {
    private int wattage;
    public MotorBike() {}

    public MotorBike(String licensePlates, String company, int yearCreatOfVehicle, String owner, int wattage) {
        super(licensePlates, company, yearCreatOfVehicle, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }
    public String getInforToFile(){
        return super.getInforToFile()+","+wattage;
    }


    @Override
    public String toString() {
        return "MotorBike{" +
                "licensePlates='" + licensePlates + '\'' +
                ", company='" + company + '\'' +
                ", yearCreatOfVehicle=" + yearCreatOfVehicle +
                ", owner='" + owner + '\'' +
                ", wattage=" + wattage +
                '}';
    }
}
