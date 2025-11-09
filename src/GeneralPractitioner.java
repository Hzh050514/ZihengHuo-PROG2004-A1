// Part 2 – Child class (General Practitioner)
public class GeneralPractitioner extends HealthProfessional {
    // Part 2 - Another instance variable to differentiate between health professional types
    private boolean canPrescribeMedication;
    private int maxPatientsPerDay;

    // Part 2 - Default constructor
    public GeneralPractitioner() {
        super();
        this.canPrescribeMedication = true;
        this.maxPatientsPerDay = 20;
    }

    // Part 2 - Second constructor that initialises all instance variables
    public GeneralPractitioner(int id, String name, String specialization,
                               boolean canPrescribeMedication, int maxPatientsPerDay) {
        super(id, name, specialization);
        this.canPrescribeMedication = canPrescribeMedication;
        this.maxPatientsPerDay = maxPatientsPerDay;
    }

    // Part 2 - Method that prints health professional details including type
    public void printProfessionalDetails() {
        System.out.println("=== General Practitioner Details ===");
        System.out.println("Type: General Practitioner");
        super.printDetails();
        System.out.println("Can Prescribe Medication: " + canPrescribeMedication);
        System.out.println("Max Patients Per Day: " + maxPatientsPerDay);
        System.out.println("-----------------------------------");
    }

    // Getter and setter methods
    public boolean canPrescribeMedication() {
        return canPrescribeMedication;
    }

    public void setCanPrescribeMedication(boolean canPrescribeMedication) {
        this.canPrescribeMedication = canPrescribeMedication;
    }

    public int getMaxPatientsPerDay() {
        return maxPatientsPerDay;
    }

    public void setMaxPatientsPerDay(int maxPatientsPerDay) {
        this.maxPatientsPerDay = maxPatientsPerDay;
    }
}