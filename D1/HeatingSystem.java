public class HeatingSystem {
    private int temperature;
    private int maxTemperature;
    private int minTemperature = 0; // Assuming a minimum temperature of 0°C

    // Default constructor
    public HeatingSystem() {
        this(30); // Default max temperature of 30°C
    }

    // Parameterized constructor for flexibility
    public HeatingSystem(int maxTemperature) {
        this.temperature = 15; // Default temperature
        this.maxTemperature = maxTemperature;
    }

    // Increase temperature method
    public void warmer() {
        if (this.temperature < this.maxTemperature) {
            this.temperature++;
        }
    }

    // Decrease temperature method
    public void colder() {
        if (this.temperature > this.minTemperature) {
            this.temperature--;
        }
    }

    // Get current temperature
    public int getTemperature() {
        return this.temperature;
    }

    // Set temperature
    public void setTemperature(int temperature) {
        if (temperature >= this.minTemperature && temperature <= this.maxTemperature) {
            this.temperature = temperature;
        }
    }

    // Set max temperature
    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    // Get max temperature
    public int getMaxTemperature() {
        return this.maxTemperature;
    }

}