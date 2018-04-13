package enums;

public class DayTest {
	
	public static void main(String[] args) {
		Day d1 = Day.MONDAY;
		System.out.println(""+d1.getAbbreviation()+" is weekday ? "+d1.isWeekday());
	}
}
