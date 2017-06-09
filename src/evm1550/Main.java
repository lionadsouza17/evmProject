package evm1550;

public class Main
{

	public static void main(String[] args) 
	{		
		
		EVM evm = new EVM();
		evm.switchOn();
		
		evm.bu.candidScreen.addCandidate("A_candidate");
		evm.bu.candidScreen.addCandidate("B_candidate");
		evm.bu.candidScreen.addCandidate("C_candidate");
					
		evm.bu.candidScreen.displayCandidates();
		
		evm.cu.ballot.openVoting();
		
		evm.bu.candidButton.castVote(0);
		evm.bu.candidButton.castVote(0);
		evm.bu.candidButton.castVote(2);
		evm.bu.candidButton.castVote(1);
		evm.bu.candidButton.castVote(0);
		evm.cu.closeButton.closeVoting();
		evm.bu.candidButton.castVote(2);
		//evm.bu.candidButton.castVote(1);
		
		evm.cu.totalButton.getTotalVoters();
		
		evm.cu.resultButton.displayResult();
		
		evm.cu.clearButton.clearVoting();
		
	}

}
