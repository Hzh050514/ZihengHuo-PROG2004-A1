// Part 4 – Appointment class
public class Appointment {
    // Part 4 - Instance variables for patient details
    private String patientName;
    private String mobilePhone;
    // Part 4 - Instance variable for preferred time slot
    private String timeSlot;
    // Part 4 - The selected doctor (object of child class)
    private HealthProfessional selectedDoctor;

    // Part 4 - Default constructor
    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "Unknown";
        this.timeSlot = "Unknown";
        this.selectedDoctor = null;
    }

    // Part 4 - Second constructor that initialises all instance variables
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Part 4 - Method that prints all instance variables
    public void printAppointmentDetails() {
        System.out.println("=== Appointment Details ===");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor: " + selectedDoctor.getName());
        System.out.println("Doctor Type: " + selectedDoctor.getClass().getSimpleName());
        System.out.println("-----------------------------------");
    }

    // Getter methods - 这些在cancelBooking方法中会被使用
    public String getPatientName() {
        return patientName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    // Setter methods - 这些在未来的扩展中可能会用到
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
}