public class Main {
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