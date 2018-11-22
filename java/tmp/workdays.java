public class workdays
{
	enum days
	{
		Tuesday,
		Monday,
		Sunday,    
		Wednesday, 
		Thursday, 
		Friday, 
		Saturday, 
	}                                       
	public static void main(String [] args)
	{
		for(days d:days.values())
		{
			if(d.equals(days.Sunday)||d.equals(days.Monday)||d.equals(days.Wednesday))
			{
				System.out.println(d+ " is the holiday");
			}
			else
			{
				System.out.println(d+ " is the working day");
			}
		}
	}

}

