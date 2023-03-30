package observerpttrn;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {
	
	private String name;
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	private Channel channel=new Channel();
	/* (non-Javadoc)
	 * @see observerpttrn.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("assalamualaikum,"   +name+ ", new video uploaded," + channel.title);

  }
	/* (non-Javadoc)
	 * @see observerpttrn.Observer#SubscribeChannel(observerpttrn.Channel)
	 */
	@Override
	public void SubscribeChannel(Channel ch) {
		channel=ch;
	}
}
