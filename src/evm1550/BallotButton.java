package evm1550;

public class BallotButton extends Button
{
	public void openVoting()
	{
		//CandidateButton cb = new CandidateButton();
		CandidateButton.setVotingOpen(true);
	}
}
