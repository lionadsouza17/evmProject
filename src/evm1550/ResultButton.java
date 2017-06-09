package evm1550;

public class ResultButton extends Button 
{

	public void displayResult()
	{
		System.out.println("\n");
		System.out.println("*************************");
		System.out.println("Election Result:");
		for (Candidate candid : CU.map.keySet())
		{
			System.out.println(candid.getName()+" "+CU.map.get(candid));
		}

		System.out.println("*************************");
		System.out.println("\n");
	}
}
