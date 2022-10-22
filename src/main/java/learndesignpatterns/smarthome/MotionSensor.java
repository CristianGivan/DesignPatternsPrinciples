package learndesignpatterns.smarthome;

public class MotionSensor extends Sensor {
    private int distanceLevel;
    private final int distanceThreshold;

    public MotionSensor(String name, int distanceThreshold) {
        super(name);
        this.distanceThreshold = distanceThreshold;
    }

    public MotionSensor(String name, String description, int distanceThreshold) {
        super(name, description);
        this.distanceThreshold = distanceThreshold;
        this.distanceLevel = distanceThreshold + 1;
    }


    @Override
    public boolean isSensorAlerted() {
        if (distanceLevel < distanceThreshold) {
            return true;
        }
        return false;
    }

    public int getDistanceLevel() {
        return distanceLevel;
    }

    public void setDistanceLevel(int distanceLevel) {
        this.distanceLevel = distanceLevel;
        if (isSensorAlerted()) {
            //todo a better activation mechanism
            System.out.println("Alert form " + this.getName());
        }
    }

    public int getDistanceThreshold() {
        return distanceThreshold;
    }
}
