
public class leapyearchecker {
	
	public boolean isLeapyear(int x)
	{
		
			if(x%400==0 || (x%4==0 && x%100!=0))
			{
				return true;
			}
			return false;

	}

}
