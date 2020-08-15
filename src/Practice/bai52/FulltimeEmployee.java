package Practice.bai52;

public class FulltimeEmployee extends Employee {
    private int totalWorkingDays;
    private long dailySalary;
    static final long MEAL_ALLOWANCE = 2000000;

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return totalWorkingDays;
    }

    @Override
    public long getWorkingCount() {
        return dailySalary;
    }

    public FulltimeEmployee(String name, int age, String CMND, int totalWorkingDays, long dailySalary) {
        super(name, age, CMND);
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

    public FulltimeEmployee(int totalWorkingDays, long dailySalary) {
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public long getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(long dailySalary) {
        this.dailySalary = dailySalary;
    }

    @Override
    public String toString() {
        return "FulltimeEmployee{ Name:" + getName() + ",Age:" + getAge() + ",CMND:" + getCMND()
                + ",TotalWorkingDay:" + getTotalWorkingDays() + ",DailySalary:" + getDailySalary() + "}";
    }
}
