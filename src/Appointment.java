// Appointment.java
public class Appointment {
    // 患者详情
    private String patientName;
    private String mobilePhone;

    // 预约时间
    private String timeSlot;

    // 选择的医生（使用基类类型实现多态）
    private HealthProfessional selectedDoctor;

    // 默认构造函数
    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "Unknown";
        this.timeSlot = "Unknown";
        this.selectedDoctor = null;
    }

    // 带参数的构造函数
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // 打印所有实例变量的方法
    public void printAppointmentDetails() {
        System.out.println("=== Appointment Details ===");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor: " + selectedDoctor.getName());
        System.out.println("Doctor Type: " + selectedDoctor.getClass().getSimpleName());
        System.out.println("-----------------------------------");
    }

    // Getter 和 Setter 方法
    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }

    public String getMobilePhone() { return mobilePhone; }
    public void setMobilePhone(String mobilePhone) { this.mobilePhone = mobilePhone; }

    public String getTimeSlot() { return timeSlot; }
    public void setTimeSlot(String timeSlot) { this.timeSlot = timeSlot; }

    public HealthProfessional getSelectedDoctor() { return selectedDoctor; }
    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
}