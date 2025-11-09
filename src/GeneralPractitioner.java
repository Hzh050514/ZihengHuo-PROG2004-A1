// GeneralPractitioner.java
public class GeneralPractitioner extends HealthProfessional {
    // 区分全科医生和其他医疗专业人员的额外变量
    private boolean canPrescribeMedication;
    private int maxPatientsPerDay;

    // 默认构造函数
    public GeneralPractitioner() {
        super();
        this.canPrescribeMedication = true;
        this.maxPatientsPerDay = 20;
    }

    // 带参数的构造函数
    public GeneralPractitioner(int id, String name, String specialization,
                               boolean canPrescribeMedication, int maxPatientsPerDay) {
        super(id, name, specialization);
        this.canPrescribeMedication = canPrescribeMedication;
        this.maxPatientsPerDay = maxPatientsPerDay;
    }

    // 打印详细信息的方法
    public void printProfessionalDetails() {
        System.out.println("=== General Practitioner Details ===");
        System.out.println("Type: General Practitioner");
        super.printDetails();
        System.out.println("Can Prescribe Medication: " + canPrescribeMedication);
        System.out.println("Max Patients Per Day: " + maxPatientsPerDay);
        System.out.println("-----------------------------------");
    }

    // Getter 和 Setter 方法
    public boolean canPrescribeMedication() { return canPrescribeMedication; }
    public void setCanPrescribeMedication(boolean canPrescribeMedication) {
        this.canPrescribeMedication = canPrescribeMedication;
    }

    public int getMaxPatientsPerDay() { return maxPatientsPerDay; }
    public void setMaxPatientsPerDay(int maxPatientsPerDay) {
        this.maxPatientsPerDay = maxPatientsPerDay;
    }
}
