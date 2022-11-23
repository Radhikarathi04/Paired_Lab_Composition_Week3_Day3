package vehicles.water;

import vehicles.IMotorised;
import vehicles.IWaterVehicle;

public final class SpeedBoat implements IWaterVehicle, IMotorised {
    private int hp;
    private int fuel;
    private String hullType;
    private IMotorised baseMotor;

    public SpeedBoat(int hp, int fuel, String hullType, IMotorised baseMotor) {
        this.hp = hp;
        this.fuel = fuel;
        this.hullType = hullType;
        this.baseMotor = baseMotor;
    }


    @Override
    public void startEngine() {
        System.out.println("Start");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop");
    }

    @Override
    public int getHp() {
        return this.baseMotor.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.baseMotor.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.baseMotor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.baseMotor.setFuel(fuel);
    }

    @Override
    public String getHullType() {
        return this.hullType;
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
