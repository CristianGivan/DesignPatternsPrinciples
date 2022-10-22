package learndesignpatterns.smarthome;

public class SmokeSensor extends Sensor{
    private int smokeVolume;
    private final int smokeThreshold;

    public SmokeSensor(String name, int smokeThreshold) {
        super(name);
        this.smokeThreshold = smokeThreshold;
    }

    public SmokeSensor (String name, String description, int smokeThreshold){
        super(name, description);
        this.smokeThreshold=smokeThreshold;
        this.smokeVolume=smokeThreshold+1;
    }
    @Override
    public boolean isSensorAlerted(){
        if (smokeVolume>smokeThreshold){
            return true;
        }
        return false;
    }
    public void setSmokeVolume (int smokeVolume){
        this.smokeVolume=smokeVolume;
        if (isSensorAlerted()){
            //todo a better activation mechanism
            System.out.println("Alert form " +this.getName());
        }
    }
    public int getSmokeVolume(){
        return this.smokeVolume;
    }

    public int getSmokeThreshold() {
        return smokeThreshold;
    }

}
