package learndesignpatterns.smarthome;

import java.util.ArrayList;
import java.util.List;

public class SensorSystem {
    private List<Sensor> sensors;

    public SensorSystem() {
        sensors = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    public void removeSensor(Sensor sensor) {
        sensors.remove(sensor);
    }
    public void checkSensors(){
        for (Sensor sensor:sensors){
            if (sensor.isSensorAlerted()==true){
                System.out.println("Sensor "+sensor.getName()+" is sending an alarm!");
            }
        }
    }
}
