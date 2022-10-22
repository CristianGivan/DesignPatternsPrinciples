package learndesignpatterns.smarthome;

public abstract class Sensor {
    private final String name;
    private String description;

    public Sensor(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Sensor(String name) {
        this.name = name;
    }

    public abstract boolean isSensorAlerted();

    public String getName(){
        return this.name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
