package stringConversion;

public class StringConversion {


	String[] array = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
					 "Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Twenty-One","Twenty-Two","Twenty-Three","Twenty-Four","Twenty-Five",
					 "Twenty-Six","Twenty-Seven","Twenty-Eight","Twenty-Nine","Thirty","Thirty-One","Thirty-Two","Thirty-Three","Thirty-Four","Thirty-Five",
					 "Thirty-Six","Thirty-Seven","Thirty-Eight","Thirty-Nine","Forty","Forty-One","Forty-Two","Forty-Three","Forty-Four","Forty-Five",
					 "Forty-Six","Forty-Seven","Forty-Eight","Forty-Nine","Fifty","Fifty-One","Fifty-Two","Fifty-Three","Fifty-Four","Fifty-Five",
					 "Fifty-Six","Fifty-Seven","Fifty-Eight","Fifty-Nine","Sixty"};
	public void convertToString(int hour,int minutes) {
			if (minutes < 0 || minutes > array.length - 1 || hour > 24 || hour < 0) {
				System.out.println("You do not know time,You are an Olodo!!");	
			}
			else if(minutes == 00 & hour == 0) {
				System.out.println("Its midnight");
			}
			else if(minutes == 00) {
				System.out.println("Its " + hour + " O'clock");
			}
			else if(hour == 0) {
				System.out.println("Its " + minutes + " minutes past midnight");
			}
			else if (hour > 12) {
				System.out.println("Its " + array[hour]  + ":" +  array[minutes] + " PM");
			}
			else if (hour < 12) {
				System.out.println("Its " + array[hour]  + ":" +  array[minutes] + " AM");
			}
			else {
				System.out.print("Its " + array[hour]  + ":" +  array[minutes]);
			}
	}
}
