package com.sample;
enum Life{
	PrimaryClass("Pandhari",2001),
	MiddleSchool("Pandhari",2003),
	HighSchool("Mangsa",2004);
	
	private String village;
	private int year;
	
	Life(String village, int yr){
		this.village=village;
		year=yr;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public int getYear() {
		return year;
	}


	
	
}
enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	
//	Day(){
//		System.out.println("Default Constructor "+this);
//	}
}

public class EnumTest {
	static Day day;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumTest.day=Day.FRIDAY;
		
		for (Day day1 : Day.values()) {
			System.out.println(day1.ordinal());
			System.out.println(day1.name());
		}
		
		switch (day) {
		case MONDAY:
			System.out.println("working day");
			break;
		case TUESDAY:
			System.out.println("Hanuman day");
			break;
		default:
			System.out.println("defalt");
			break;
		}
		Life.PrimaryClass.setVillage("Umari");
		System.out.println(Life.PrimaryClass.getVillage());
	}

}
