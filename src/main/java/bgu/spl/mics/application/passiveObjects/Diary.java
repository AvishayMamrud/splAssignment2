package bgu.spl.mics.application.passiveObjects;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Passive data-object representing a Diary - in which the flow of the battle is recorded.
 * We are going to compare your recordings with the expected recordings, and make sure that your output makes sense.
 * <p>
 * Do not add to this class nothing but a single constructor, getters and setters.
 */
public class Diary {
	
	private static Diary instance = null;//the Diary need to be Singleton but not ThreadSafe
	private AtomicInteger totalAttacks;
	private long HanSoloFinish;
	private long C3POFinish;
	private long R2D2Deactivate;
	private long LeiaTerminate;
	private long HanSoloTerminate;
	private long C3POTerminate;
	private long R2D2Terminate;
	private long LandoTerminate;
	
	private Diary() {
		totalAttacks=new AtomicInteger(0);
		HanSoloFinish=0;
		C3POFinish=0;
		R2D2Deactivate=0;
		LeiaTerminate=0;
		HanSoloTerminate=0;
		C3POTerminate=0;
		R2D2Terminate=0;
		LandoTerminate=0;
	}
	
	public static Diary getInstance() {
		if (instance == null)
			instance = new Diary();
		return instance;
	}
	
	//Getters and Setters
	public AtomicInteger getTotalAttacks() {
		return totalAttacks;
	}
	public void setTotalAttacks(AtomicInteger totalAttacks) {
		this.totalAttacks = totalAttacks;
	}
	public long getHanSoloFinish() {
		return HanSoloFinish;
	}
	public void setHanSoloFinish(long hanSoloFinish) {
		HanSoloFinish = hanSoloFinish;
	}
	public long getC3POFinish() {
		return C3POFinish;
	}
	public void setC3POFinish(long c3poFinish) {
		C3POFinish = c3poFinish;
	}
	public long getR2D2Deactivate() {
		return R2D2Deactivate;
	}
	public void setR2D2Deactivate(long r2d2Deactivate) {
		R2D2Deactivate = r2d2Deactivate;
	}
	public long getLeiaTerminate() {
		return LeiaTerminate;
	}
	public void setLeiaTerminate(long leiaTerminate) {
		LeiaTerminate = leiaTerminate;
	}
	public long getHanSoloTerminate() {
		return HanSoloTerminate;
	}
	public void setHanSoloTerminate(long hanSoloTerminate) {
		HanSoloTerminate = hanSoloTerminate;
	}
	public long getC3POTerminate() {
		return C3POTerminate;
	}
	public void setC3POTerminate(long c3poTerminate) {
		C3POTerminate = c3poTerminate;
	}
	public long getR2D2Terminate() {
		return R2D2Terminate;
	}
	public void setR2D2Terminate(long r2d2Terminate) {
		R2D2Terminate = r2d2Terminate;
	}
	public long getLandoTerminate() {
		return LandoTerminate;
	}
	public void setLandoTerminate(long landoTerminate) {
		LandoTerminate = landoTerminate;
	}

	public void incrementTotalAttacks() {
		totalAttacks.getAndIncrement();
	}

	public void resetNumberAttacks() {
		totalAttacks= new AtomicInteger(0);
	}
	
}
