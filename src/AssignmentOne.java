import java.util.ArrayList;
import java.util.Iterator;

public class AssignmentOne {

    private static final ArrayList<Appointment> appointments = new ArrayList<>();

    // 修复：移除 public 修饰符（Java 25 新特性）
    static void main(String[] args) {

        // Part 3 – Using classes and objects
        System.out.println("// Part 3 – Using classes and objects");

        // 创建三个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Smith", "Family Medicine", true, 25);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Johnson", "Primary Care", true, 30);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Brown", "General Practice", false, 15);

        // 创建两个专家对象
        Specialist specialist1 = new Specialist(201, "Dr. Wilson", "Cardiology",
                "Heart Surgery", 15, true);
        Specialist specialist2 = new Specialist(202, "Dr. Davis", "Radiology",
                "MRI Specialist", 10, true);

        // 打印所有医疗专业人员的详细信息
        gp1.printProfessionalDetails();
        gp2.printProfessionalDetails();
        gp3.printProfessionalDetails();
        specialist1.printProfessionalDetails();
        specialist2.printProfessionalDetails();

        System.out.println("---");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5 – Collection of appointments");

        // 创建预约
        createAppointment("John Doe", "0412345678", "09:00", gp1);
        createAppointment("Jane Smith", "0498765432", "10:30", gp2);
        createAppointment("Bob Wilson", "0432145698", "14:00", specialist1);
        createAppointment("Alice Brown", "0456789123", "11:15", specialist2);

        // 打印现有预约
        printExistingAppointments();

        // 取消一个预约
        cancelBooking("0498765432");

        // 再次打印现有预约以展示更新后的集合
        printExistingAppointments();

        System.out.println("---");
    }

    // 创建新预约并添加到ArrayList的方法
    public static void createAppointment(String patientName, String mobilePhone,
                                         String timeSlot, HealthProfessional doctor) {
        // 验证必需信息
        if (patientName == null || patientName.trim().isEmpty() ||
                mobilePhone == null || mobilePhone.trim().isEmpty() ||
                timeSlot == null || timeSlot.trim().isEmpty() ||
                doctor == null) {
            System.out.println("Error: All appointment details are required. Appointment not created.");
            return;
        }

        // 创建新预约
        Appointment newAppointment = new Appointment(patientName, mobilePhone, timeSlot, doctor);
        appointments.add(newAppointment);
        System.out.println("Appointment created successfully for " + patientName + " at " + timeSlot);
    }

    // 显示ArrayList中现有预约的方法
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }

        System.out.println("=== Existing Appointments ===");
        for (int i = 0; i < appointments.size(); i++) {
            System.out.println("Appointment #" + (i + 1) + ":");
            appointments.get(i).printAppointmentDetails();
        }
    }

    // 使用患者手机号取消预约的方法
    public static void cancelBooking(String mobilePhone) {
        if (mobilePhone == null || mobilePhone.trim().isEmpty()) {
            System.out.println("Error: Mobile phone number is required to cancel booking.");
            return;
        }

        Iterator<Appointment> iterator = appointments.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            Appointment appointment = iterator.next();
            if (appointment.getMobilePhone().equals(mobilePhone)) {
                iterator.remove();
                System.out.println("Appointment for mobile " + mobilePhone + " has been cancelled.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Error: No appointment found with mobile phone: " + mobilePhone);
        }
    }
}