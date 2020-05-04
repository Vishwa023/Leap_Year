
public class leapyearchecker {
	
	public boolean isLeapyear(int x)
	{
		
			if(x%400==0)
			{
				return true;
			}
			else if(x%4==0)
			{
				return true;
			}
			return false;

	}

}
