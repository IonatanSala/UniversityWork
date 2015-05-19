
public class DataAccessPolicyManager {
	private int readerCount;
	private Semaphore mutex;
	private Semaphore wrt;

	public DataAccessPolicyManager() {
		readerCount = 0;
		mutex = new Semaphore(1);
		wrt = new Semaphore(1);
	}

	public void acquireReadLock() {
		mutex.acquire();
		++readerCount;
		if(readerCount == 1) wrt.acquire();	// the first reader
		mutex.release();
	}	

	public void releaseReadLock() {
		mutex.acquire();
		--readerCount;
		if(readerCount == 0) wrt.release();
		mutex.release();
	}

	public void acquireWriteLock() {
		wrt.acquire();
	}

	public void releaseWriteLock() {
		wrt.release();
	}
}