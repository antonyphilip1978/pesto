package com.pest.store.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.pest.store.model.Candidate;

public final class CandidatesUtil {

	private CandidatesUtil() {
	}

	/**
	 * 
	 * Method to help us get dummy data
	 * 
	 * @return list of candidates
	 */
	public static List<Candidate> getCandidates() {

		String[] skills = {"java", "c#", "c++", "golang"};  
        Set<String> set1 = new HashSet<String>();    
        set1.addAll(Arrays.asList(skills));    

		Candidate a1 = new Candidate("John", 2, set1);
		Candidate a2 = new Candidate("David", 1, set1);
		Candidate a3 = new Candidate("Diana", 4, set1);
		Candidate a4 = new Candidate("June", 2, set1);
		Candidate a5 = new Candidate("April", 3, set1);

		List<Candidate> candidateList = new ArrayList<>();
		candidateList.add(a1);
		candidateList.add(a2);
		candidateList.add(a3);
		candidateList.add(a4);
		candidateList.add(a5);

		return candidateList;
	}
}