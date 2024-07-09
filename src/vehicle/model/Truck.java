package vehicle.model;

public class Truck extends Vehicle {
    private int weight;
    public Truck(){}
    public Truck(String licensePlates, String company, int yearCreatOfVehicle, String owner, int weight) {
        super(licensePlates, company, yearCreatOfVehicle, owner);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String getInforToFile() {
        return super.getInforToFile()+","+weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "licensePlates='" + licensePlates + '\'' +
                ", company='" + company + '\'' +
                ", yearCreatOfVehicle=" + yearCreatOfVehicle +
                ", owner='" + owner + '\'' +
                ", weight=" + weight +
                '}';
    }
}
