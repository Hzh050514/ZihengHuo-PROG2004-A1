// HealthProfessional.java
public class HealthProfessional {
    // 必需实例变量
    private int id;
    private String name;
    private String specialization; // 另一个相关的基本信息变量

    // 默认构造函数
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialization = "General";
    }

    // 带参数的构造函数
    public HealthProfessional(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }

    // Getter 和 Setter 方法
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
}