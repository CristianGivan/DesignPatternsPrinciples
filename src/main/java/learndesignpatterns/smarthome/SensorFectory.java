package learndesignpatterns.smarthome;

public class SensorFectory {

    public static Sensor createSensor(SensorType type, String name, String description, int threshold) throws InvalidSensor{
        switch (type){
            case MovingSensor:
                return new MotionSensor(name, description, threshold);
            case SmokeSensor:
                return new SmokeSensor(name, description, threshold);
            default:
                throw new InvalidSensor("Sensor was not been created!");
        }
    }
}
