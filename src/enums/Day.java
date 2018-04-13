package enums;

public enum Day {
	SUNDAY("Sun"),MONDAY("Mon"),TUESDAY("Tues"),
	WEDNESDAY("Wed"),THRUSDAY("Thrus"),FRIDAY("Fri"),
	SATURDAY("Sat");
	
	private String abbreaviation;
	
	private Day (String abbreviation) {
		this.abbreaviation=abbreviation;
	}
	
	/** get day abbreviation*/
	public String getAbbreviation() {
		return(abbreaviation);
	}
	
	public boolean isWeekend() {
		return(this == SATURDAY || this == SUNDAY);
	}
	
	public boolean isWeekday() {
		return(!isWeekend());
	}
}
