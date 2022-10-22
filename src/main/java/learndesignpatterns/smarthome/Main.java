package learndesignpatterns.smarthome;

public class Main {
    public static void main(String[] args) {
        SensorSystem sensorSystem=new SensorSystem();
        Sensor sensorM1 = null;
        Sensor sensorS1=null;
        try{
            sensorM1 = SensorFectory.createSensor(SensorType.MovingSensor, "M1", "MovingSensor", 10);
            sensorSystem.addSensor(sensorM1);
        }catch (InvalidSensor m){
            System.out.println(m);
        }
        try{
            sensorS1 = SensorFectory.createSensor(SensorType.SmokeSensor, "S1", "SmokeSensor", 20);
            sensorSystem.addSensor(sensorS1);
        }catch (InvalidSensor m){
            System.out.println(m);
        }


        ((MotionSensor) sensorM1).setDistanceLevel(5);
    }
}
