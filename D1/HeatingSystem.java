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

    // Main method for testing
    public static void main(String[] args) {
        HeatingSystem system = new HeatingSystem(); // Using default constructor
        System.out.println("Current temperature: " + system.getTemperature() + "°C");

        // Increase temperature
        system.warmer();
        System.out.println("After increasing heat: " + system.getTemperature() + "°C");

        // Decrease temperature
        system.colder();
        System.out.println("After decreasing heat: " + system.getTemperature() + "°C");

        // Set temperature directly
        system.setTemperature(25);
        System.out.println("After setting temperature: " + system.getTemperature() + "°C");

        // Attempt to set temperature beyond max
        system.setTemperature(40);
        System.out.println("Attempting to set beyond max: " + system.getTemperature() + "°C");
    }
}