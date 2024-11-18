public class HeatingSystem {
    private int temperature;
    private int maxTemperature;

    // Constructor
    public HeatingSystem(int maxTemperature) {
        this.temperature = 15; // Default temperature
        this.maxTemperature = maxTemperature;
    }

    // Increase temperature method
    public void increaseHeat() {
        if (this.temperature < this.maxTemperature) {
            this.temperature++;
        }
    }

    // Decrease temperature method
    public void decreaseHeat() {
        if (this.temperature > 0) {
            this.temperature--;
        }
    }

    // Get current temperature
    public int getTemperature() {
        return this.temperature;
    }

    // Set temperature
    public void setTemperature(int temperature) {
        if (temperature >= 0 && temperature <= this.maxTemperature) {
            this.temperature = temperature;
        }
    }

    // Get max temperature
    public int getMaxTemperature() {
        return this.maxTemperature;
    }

    // Main method for testing
    public static void main(String[] args) {
        HeatingSystem system = new HeatingSystem(30); // Max temperature set to 30
        System.out.println("Current temperature: " + system.getTemperature() + "°C");

        // Increase temperature
        system.increaseHeat();
        System.out.println("After increasing heat: " + system.getTemperature() + "°C");

        // Decrease temperature
        system.decreaseHeat();
        System.out.println("After decreasing heat: " + system.getTemperature() + "°C");

        // Set temperature directly
        system.setTemperature(25);
        System.out.println("After setting temperature: " + system.getTemperature() + "°C");

        // Attempt to set temperature beyond max
        system.setTemperature(40);
        System.out.println("Attempting to set beyond max: " + system.getTemperature() + "°C");
    }
}