
public class Lab03vst
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 100 Point Version\n");
      int milliseconds = 775894563;
      int start = milliseconds/1000;
      int hours = start/3600;
      int minutes = (start%3600)/60;
      int seconds = start%60;
      int remainder = milliseconds%1000;
      System.out.println("Starting milliseconds: " + milliseconds);
      System.out.println("Hours: " + hours);
      System.out.println("Minutes :" + minutes);
      System.out.println("Seconds :" + seconds);
      System.out.println("Milliseconds :" + remainder);
	}
}
