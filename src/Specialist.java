// Part 2 – Child class (Specialist)
public class Specialist extends HealthProfessional {
    // Part 2 - Instance variables to differentiate from General Practitioner
    private String specialityField;
    private int yearsOfExperience;
    private boolean requiresReferral;

    // Part 2 - Default constructor
    public Specialist() {
        super();
        this.specialityField = "Unknown";
        this.yearsOfExperience = 0;
        this.requiresReferral = true;
    }

    // Part 2 - Second constructor that initialises all instance variables
    public Specialist(int id, String name, String specialization,
                      String specialityField, int yearsOfExperience, boolean requiresReferral) {
        super(id, name, specialization);
        this.specialityField = specialityField;
        this.yearsOfExperience = yearsOfExperience;
        this.requiresReferral = requiresReferral;
    }

    // Part 2 - Method that prints health professional details including type
    public void printProfessionalDetails() {
        System.out.println("=== Specialist Details ===");
        System.out.println("Type: Specialist");
        super.printDetails();
        System.out.println("Speciality Field: " + specialityField);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Requires Referral: " + requiresReferral);
        System.out.println("-----------------------------------");
    }

    // Getter and setter methods
    public String getSpecialityField() {
        return specialityField;
    }

    public void setSpecialityField(String specialityField) {
        this.specialityField = specialityField;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean requiresReferral() {
        return requiresReferral;
    }

    public void setRequiresReferral(boolean requiresReferral) {
        this.requiresReferral = requiresReferral;
    }
}