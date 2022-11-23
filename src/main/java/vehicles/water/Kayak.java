package vehicles.water;
import vehicles.IWaterVehicle;

public final class Kayak implements IWaterVehicle {
    
    private String hullType;


   
    public Kayak(String hullType) {
        this.hullType = hullType;
    }
    
    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }


    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public long getInventory() {
        return 0;
    }

    @Override
    public void setPrice(float price) {

    }

    @Override
    public void setInventory(long amount) {

    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void addInventory(long amount) {

    }

    @Override
    public void removeInventory(long amount) throws Exception {

    }

    @Override
    public float getWeight() {
        return 0;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public void setWeight(float weight) {

    }

    @Override
    public void setMaxSpeed(int speed) {

    }
}
