package bgu.spl.mics.application.services;

import bgu.spl.mics.MicroService;
import bgu.spl.mics.application.messages.BombDestroyerEvent;
import bgu.spl.mics.application.messages.DeactivationEvent;
import bgu.spl.mics.application.messages.TerminationBroadcast;

/**
 * R2D2Microservices is in charge of the handling {@link DeactivationEvent}.
 * This class may not hold references for objects which it is not responsible for:
 * {@link DeactivationEvent}.
 *
 * You can add private fields and public methods to this class.
 * You MAY change constructor signatures and even add new public constructors.
 */
public class R2D2Microservice extends MicroService {

	private long duration;

	public R2D2Microservice(long duration) {
        super("R2D2");
        this.duration = duration;
    }

    @Override
    protected void initialize() {
    	subscribeEvent(DeactivationEvent.class, (t)->{
    		try {
				Thread.sleep(duration);
			} catch (InterruptedException e) {
				throw e;
			}
    		complete(t, true);
    		diary.setR2D2Deactivate(System.currentTimeMillis());
    	});
    	
    	subscribeBroadcast(TerminationBroadcast.class, (t)->{
    		diary.setR2D2Terminate(System.currentTimeMillis());
    		terminate();
    		});
    }
}
