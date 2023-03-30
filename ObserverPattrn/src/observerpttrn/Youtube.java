package observerpttrn;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Channel ch1=new Channel();
          Channel ch2=new Channel();
          Channel ch3=new Channel();
          
     //     ch1.setcName("ch1");
     //     ch2.setcName("ch2");
     //     ch3.setcName("ch3");

          
          Subscriber s1=new Subscriber("tanni");
          Subscriber s2=new Subscriber("moon");
          Subscriber s3=new Subscriber("tanvir");
          ch1.subscribe(s1);
          ch1.subscribe(s2);
          ch1.subscribe(s3);
          ch2.subscribe(s2);
          ch3.subscribe(s3);
          s1.SubscribeChannel(ch1);
          s2.SubscribeChannel(ch1);
          s3.SubscribeChannel(ch1);
          s2.SubscribeChannel(ch2);
          s3.SubscribeChannel(ch3);
          
          
      //    System.out.println(ch2.subs);
          
          ch1.upload("Moon has uploaded a new video");
          ch2.upload("Moon has shared a new song");
          ch3.upload("Moon is done");
          
	}
}

