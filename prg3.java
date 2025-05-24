public class prg3 {
    private String name;
    private int id;
    private double salary;
    private String department;
    private String address;

    public prg3(String name, int id, double salary, String department , String address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.address=address;
   }
    public void dispay() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Address:"+ address);
    }
    public static void main(String[] args) {
        prg3 emp = new prg3("John Doe", 12345, 50000.0, "Engineering","Hubbali");
        emp.dispay();
    }
}

