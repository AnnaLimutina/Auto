package java06.HW_13_2.Task_1;

public class MonthUtils {
    public static class Month {
        private final String monthName;
        private final int daysAmount;
        private final int workingDaysAmount;

        private Month(String monthName, int daysAmount, int workingDaysAmount){
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
    static final Month JANUARY = new Month("January", 31, 22);
    static final Month FEBRUARY = new Month("February", 28, 20);
    static final Month MARCH = new Month("March", 31, 23);
    static final Month APRIL = new Month("April", 30, 20);
    static final Month MAY = new Month("May", 31, 23);
    static final Month JUNE = new Month("June", 30, 22);
    static final Month JULY = new Month("July", 31, 21);
    static final Month AUGUST = new Month("August", 31, 23);
    static final Month SEPTEMBER = new Month("September", 30, 21);
    static final Month OCTOBER = new Month("October", 31, 22);
    static final Month NOVEMBER = new Month("November", 30, 22);
    static final Month DECEMBER = new Month("December", 31, 21);

    public final static Month[] QUARTER_1 = new Month[] {JANUARY, FEBRUARY, MARCH};
    public final static Month[] QUARTER_2 = new Month[] {APRIL, MAY, JUNE};
    public final static Month[] QUARTER_3 = new Month[] {JULY, AUGUST, SEPTEMBER};
    public final static Month[] QUARTER_4 = new Month[] {OCTOBER, NOVEMBER, DECEMBER};
    public static Month[] getYearQuarter(int numberOfQuarter){
        if (numberOfQuarter == 1){
            return QUARTER_1;
        } else if (numberOfQuarter == 2){
            return  QUARTER_2;
        } else if (numberOfQuarter == 3) {
            return QUARTER_3;
        } else if (numberOfQuarter == 4) {
            return QUARTER_4;
        } else return null;
    }

}
