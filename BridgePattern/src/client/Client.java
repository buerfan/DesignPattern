package client;

import remote.RemoteTypeOne;
import remote.RemoteTypeTwo;
import tv.PhilipsTV;
import tv.SonyTV;
import tv.TV;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV sonyTVRemoteOne = new SonyTV(new RemoteTypeOne());
		sonyTVRemoteOne.on();
		
//		System.out.println();
//		
		sonyTVRemoteOne.off();
//		
//		System.out.println();
//		
//		TV sonyTVRemoteTwo = new SonyTV(new RemoteTypeTwo());
//		sonyTVRemoteTwo.on();
//		
//		System.out.println();
//		
		TV phillipsTVRemoteTwo = new PhilipsTV(new RemoteTypeTwo());
//
		phillipsTVRemoteTwo.on();
		System.out.println();
//		
//		phillipsTVRemoteTwo.off();
//		System.out.println();
	}

}
