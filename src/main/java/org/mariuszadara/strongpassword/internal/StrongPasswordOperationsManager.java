package org.mariuszadara.strongpassword.internal;

import java.util.List;

interface StrongPasswordOperationsManager {

	boolean done();
	
	boolean hasCandidates();
			
	List<String> peekCandidates(int count);
	
	void submitValidCandidates(List<String> candidates); 
	
	boolean acquireSession();
	
	default boolean acquireSession(boolean blockUntilAcquired) {
		if (!blockUntilAcquired) {
			return acquireSession();
		}
		while (!acquireSession()) {
			try {
				Thread.sleep(2);
			}
			catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return false;
			}
		}
		
		return true;
	}
	
	void releaseSession();
}
