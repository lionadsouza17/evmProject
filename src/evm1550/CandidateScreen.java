package evm1550;

import java.util.ArrayList;

public class CandidateScreen
{
	static ArrayList<Candidate> candidates = new ArrayList<Candidate>();
	
	public CandidateScreen()
	{
		
	}
	
	public void addCandidate(String string)
	{
		candidates.add(new Candidate(string));
	}
	
	public ArrayList<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(ArrayList<Candidate> candidates) {
		this.candidates = candidates;
	}

	public void displayCandidates()
	{
		System.out.print("\n");
		System.out.println("************************************");
		System.out.println("Candidates Standing for the election are:- ");
		for (Candidate candidate : candidates)
		{
			System.out.println(candidate.getName()+" "+candidates.indexOf(candidate));
		}
		System.out.println("************************************");
		
		System.out.println("To vote press the corresponding value");
		System.out.print("\n");
	}
}
