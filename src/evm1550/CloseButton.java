package evm1550;

public class CloseButton extends Button
{

	public void closeVoting()
	{
		//CandidateButton cb = new CandidateButton();
		CandidateButton.setVotingOpen(false);
	}
	
}
