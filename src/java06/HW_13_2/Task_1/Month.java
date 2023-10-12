package java06.HW_13_2.Task_1;

public class Month {
    private final String monthName;
    private final int daysAmount;
    private final int workingDaysAmount;

    public Month(String monthName, int daysAmount, int workingDaysAmount){
        this.monthName = monthName;
        this.daysAmount = daysAmount;
        this.workingDaysAmount = workingDaysAmount;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDaysAmount() {
        return daysAmount;
    }

    public int getWorkingDaysAmount() {
        return workingDaysAmount;
    }
}
