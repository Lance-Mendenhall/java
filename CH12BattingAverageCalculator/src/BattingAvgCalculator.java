
public class BattingAvgCalculator {

	int[] stats = new int[5];
	int numAtBats;

	
	public BattingAvgCalculator()
	{
		for (int i : stats)
		{
			stats[i] = 0;
		}
		numAtBats = 0;
	}
	
	public void addToStats(int index)
	{
		stats[index]++;
	}
	
	public void setAtBats(int atBats)
	{
		numAtBats = atBats;
	}
	
	public double getBattingAverage()
	{
		
		int howManyHits = 0;
		
		for (int i = 1; i < stats.length; i++)
		{
			if(stats[i] > 0 )
			{
				howManyHits += stats[i];
			}
		}
		
		double ba = (double)howManyHits/(double)numAtBats;
		
		return ba;
	}
	
	public double getSluggingPercentage()
	{
		double result = 0.0;
		
		int howManyBases = 0;
		
		for (int i = 1; i < stats.length; i++)
		{
			
			howManyBases += stats[i]*i;
		
		}
		
		result = (double)howManyBases/(double)numAtBats;

		return result;
	}
	
}
