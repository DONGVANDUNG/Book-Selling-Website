package Practice.bai52;

public abstract class Employee {
    private String name;
    private int age;
    private String CMND;

    public Employee(String name, int age, String CMND) {
        this.name = name;
        this.age = age;
        this.CMND = CMND;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }
    public abstract long getMealAllowance();
    public abstract long getSalaryRate();
    public abstract long getWorkingCount();
    public long calculateSalary(){
        long salary=getSalaryRate()*getWorkingCount()+getMealAllowance();
        return salary;
    }
}
