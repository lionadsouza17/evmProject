package evm1550;

public class TotalButton extends Button
{
	//CU cu = new CU();
	int count;
	
	public void getTotalVoters()
	{
		System.out.println("\n");
		System.out.println("*************************");
		System.out.println("Number of ppl voted:");
		for (Candidate candid : CU.map.keySet())
		{
			count += CU.map.get(candid);
		}
		System.out.println(count);
		
		System.out.println("*************************");
		System.out.println("\n");
	}
}
