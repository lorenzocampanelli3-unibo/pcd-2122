package pcd.lab04.monitors.barrier;

/*
 * Barrier - to be implemented
 */
public class FakeBarrier implements Barrier {

	private int nParticipants;
	private int nHits;
	
	public FakeBarrier(int nParticipants) {
		this.nParticipants = nParticipants;
		this.nHits = 0;
	}
	
	@Override
//	public synchronized void hitAndWaitAll() throws InterruptedException {	
//		nHits++;
//		if (nHits == nParticipants) {
//			notifyAll();
//		}
//		else {
//			while (nHits < nParticipants) {
//				wait();
//			}
//		}
//	}

	public synchronized void hitAndWaitAll() throws InterruptedException {	
		nHits++;
		while (nHits < nParticipants) {
			wait();
		}
		notifyAll();
	}
	
}
