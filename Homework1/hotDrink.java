package JAVAOOP.Homework1;

public class hotDrink extends drink{

    private int temperature;

    public hotDrink(String type, int volume, int temperature) {
        super(type, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", getType(), getVolume(), getTemperature());
    }



    



}
