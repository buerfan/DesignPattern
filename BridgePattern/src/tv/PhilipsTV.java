package tv;

import remote.Remote;

public class PhilipsTV extends TV{

Remote remoteType;
	
	

	public PhilipsTV(Remote r) {
		super(r);
		this.remoteType = r;
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Phillips TV is ON: ");
		remoteType.on();
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Phillips TV is OFF: ");
		remoteType.off();
	}
}
