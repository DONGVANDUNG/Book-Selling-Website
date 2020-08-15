package Practice.bai52;

public class ParttimeEmployee extends Employee {
    static final long MEAL_ALLOWANCE = 0;
    private int totalWorkingShift;
    private long baseSalary;

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public long getWorkingCount() {
        return totalWorkingShift;
    }

    public ParttimeEmployee(String name, int age, String CMND, int totalWorkingShift, long baseSalary) {
        super(name, age, CMND);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    public ParttimeEmployee(int totalWorkingShift, long baseSalary) {
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    public int getTotalWorkingShift() {
        return totalWorkingShift;
    }

    public void setTotalWorkingShift(int totalWorkingShift) {
        this.totalWorkingShift = totalWorkingShift;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{ Name:" + getName() + ",Age:" + getAge() + ",CMND:" + getCMND()
                + ",TotalWorkingShift:" + getTotalWorkingShift() + ",Basesalary:" + getBaseSalary() + "}";
    }
}