
public class Date {
	   private int day, month, year;
	    private static final int ULTIMO_MES = 12;

	    public Date(int day, int month, int year) {
	        this.day = day;
	        this.month = month;
	        this.year = year;
	    }

	    public Date(String d){
	        String[] date = d.split("-");
	        this.day = Integer.parseInt(date[0]);
	        this.month = Integer.parseInt(date[1]);
	        this.year = Integer.parseInt(date[2]);
	        validDate(day, month, year);
	    }

	    public int getDay() {
	        return day;
	    }

	    public int getMonth() {
	        return month;
	    }

	    public int getYear() {
	        return year;
	    }

	    public String toString(){
	        return day + "-" + month + "-" + year;
	    }

	    private boolean validDate(int day, int month, int year) {
	        if (year < 0 || month < 1 || month > 12 || day < 1 || day > daysInMonth(month)) return false;
	        return true;
	    }

	    private int daysInMonth(int month) {
	        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
	            return 31;
	        }
	        if (month == 2) {
	            return 28;
	        }
	        return 30;
	    }

	    public Date nextDay(){
	        int nextDay = day + 1;
	        int nextMonth = month;
	        int nextYear = year;
	        if ( nextDay > daysInMonth(month)) {
	            nextDay = 1;
	            nextMonth++;
	            if(nextMonth > ULTIMO_MES){
	                nextMonth = 1;
	                nextYear++;
	            }
	        }
	        return new Date(nextDay,nextMonth,nextYear);
	    }
}
