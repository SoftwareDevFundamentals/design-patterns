package bo.usfx.structural.adapter;

public class MovableAdapterImpl implements MovableAdapter {

    private Movable mphCar;

    public MovableAdapterImpl(Movable mphCar) {
        this.mphCar = mphCar;
    }

    // KmH
    @Override
    public double getSpeed() {
        return convertMphToKmh(mphCar.getSpeed());
    }

    private double convertMphToKmh(double mph) {
        return mph * 1.7;
    }
}
