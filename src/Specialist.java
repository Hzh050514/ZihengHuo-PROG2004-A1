// Specialist.java
public class Specialist extends HealthProfessional {
    // 区分专家的额外变量
    private String specialityField;
    private int yearsOfExperience;
    private boolean requiresReferral;

    // 默认构造函数
    public Specialist() {
        super();
        this.specialityField = "Unknown";
        this.yearsOfExperience = 0;
        this.requiresReferral = true;
    }

    // 带参数的构造函数
    public Specialist(int id, String name, String specialization,
                      String specialityField, int yearsOfExperience, boolean requiresReferral) {
        super(id, name, specialization);
        this.specialityField = specialityField;
        this.yearsOfExperience = yearsOfExperience;
        this.requiresReferral = requiresReferral;
    }

    // 打印详细信息的方法
    public void printProfessionalDetails() {
        System.out.println("=== Specialist Details ===");
        System.out.println("Type: Specialist");
        super.printDetails();
        System.out.println("Speciality Field: " + specialityField);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Requires Referral: " + requiresReferral);
        System.out.println("-----------------------------------");
    }

    // Getter 和 Setter 方法
    public String getSpecialityField() { return specialityField; }
    public void setSpecialityField(String specialityField) {
        this.specialityField = specialityField;
    }

    public int getYearsOfExperience() { return yearsOfExperience; }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean requiresReferral() { return requiresReferral; }
    public void setRequiresReferral(boolean requiresReferral) {
        this.requiresReferral = requiresReferral;
    }
}