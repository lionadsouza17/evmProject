package evm1550;

public class CandidateLamp extends Lamp
{
	CandidateScreen candidScreen = new CandidateScreen();
	
	public CandidateLamp()
	{
		
	}
	
	public void on(int index)
	{
		System.out.print("##--"+candidScreen.getCandidates().get(index).getName()+"--##\n");
	}
}
