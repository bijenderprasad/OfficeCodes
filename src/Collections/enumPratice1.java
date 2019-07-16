package Collections;

enum Day {
SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY;
	
}

//Enum are public  static final by default
public class enumPratice1 {
	static Day day;
	
	enumPratice1 (Day day){
		this.day = day;
	}
	public static void main(String[] args) 
    { 
		String str = "MONDAY";
		enumPratice1 test = new enumPratice1 (Day.valueOf(str));
		test.dayIsLike();
		System.out.println();
		
    } 
	
public static void dayIsLike() {
	
	switch (day)
	{
	case MONDAY:
		System.out.println("Mondays are bad.");
		break;
		
	case TUESDAY:
		System.out.println("Tuesday are bad.");
		break;
		
	case WEDNESDAY:
		System.out.println("Wednesday are bad.");
		break;
		
	default:
		System.out.println("please choose correct day");
		break;
	}
	
}



}