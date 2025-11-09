/**
 * Part 1 – Base class for all health professionals
 * This abstract class defines common attributes and behaviors for all health professionals
 * Serves as the root of the inheritance hierarchy for the appointment system
 */
// Part 1 – Base class
public class HealthProfessional {
    // Part 1 - Required instance variables: ID and name as specified in requirements
    private int id;          // Unique identifier for the health professional
    private String name;     // Full name of the health professional

    // Part 1 - Another instance variable relevant to describe basic information
    private String specialization; // General area of medical practice

    /**
     * Part 1 - Default constructor
     * Initializes instance variables with default values
     * Ensures object can be created without parameters
     */
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialization = "General";
    }

    /**
     * Part 1 - Parameterized constructor that initializes all instance variables
     * Allows creation of HealthProfessional objects with specific attributes
     *
     * @param id the unique identifier for the health professional
     * @param name the full name of the health professional
     * @param specialization the general area of medical practice
     */
    public HealthProfessional(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    /**
     * Part 1 - Method that prints all instance variables
     * Displays the current state of the object in readable format
     * Can be overridden by child classes to include additional information
     */
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }

    // Getter methods provide controlled access to private instance variables
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    // Setter methods allow modification of instance variables with validation potential
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}