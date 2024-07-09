package vehicle.model;

public abstract class Vehicle {
    protected String licensePlates;
    protected String company;
    protected int yearCreatOfVehicle;
    protected String owner;

    public Vehicle() {
    }

    public Vehicle(String licensePlates, String company, int yearCreatOfVehicle, String owner) {
        this.licensePlates = licensePlates;
        this.company = company;
        this.yearCreatOfVehicle = yearCreatOfVehicle;
        this.owner = owner;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYearCreatOfVehicle() {
        return yearCreatOfVehicle;
    }

    public void setYearCreatOfVehicle(int yearCreatOfVehicle) {
        this.yearCreatOfVehicle = yearCreatOfVehicle;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getInforToFile(){
        return licensePlates+","+company + "," + yearCreatOfVehicle + "," + owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlates='" + licensePlates + '\'' +
                ", company='" + company + '\'' +
                ", yearCreatOfVehicle=" + yearCreatOfVehicle +
                ", owner='" + owner + '\'' +
                '}';
    }
}
