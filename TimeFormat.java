// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String ampm;
		//מקרה צהריים
		if(hours == 12){
			ampm = "PM";
		}
		//מקרה חצות
		if (hours == 0) {
			ampm = "AM";
		}
		//מקרה ערב
		if(hours>12){
			ampm = "PM";
			hours = hours - 12;
		}
		else{
			ampm = "AM";
		}
		//הדפסה
		if (minutes < 10) {
			System.out.println(hours + ":0" + minutes + ampm);
		}
		else{
			System.out.println(hours + ":" + minutes+ ampm);
		}
	}
}