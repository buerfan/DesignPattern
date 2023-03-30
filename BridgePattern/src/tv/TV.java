package tv;

import remote.Remote;

public abstract class TV {

	Remote remote;

	public TV(Remote remote) {
		super();
		this.remote = remote;
	}
	
	public abstract void on();
	public abstract void off();
}
