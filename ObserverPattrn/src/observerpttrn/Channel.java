package observerpttrn;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
  private List<Subscriber>subs=new  ArrayList<>();
  public static String title;
  /* (non-Javadoc)
 * @see observerpttrn.Subject#subscribe(observerpttrn.Subscriber)
 */
@Override
public void subscribe(Subscriber sub) {
	  subs.add(sub);
  }
  /* (non-Javadoc)
 * @see observerpttrn.Subject#unsubscribe(observerpttrn.Observer)
 */
@Override
public void unsubscribe(Observer sub) {
	  subs.remove(sub);
  }
  /* (non-Javadoc)
 * @see observerpttrn.Subject#notifysubscribers()
 */
@Override
public void notifysubscribers() {
	 for(Observer sub:subs) {
		 sub.update();
	 }
  }
  /* (non-Javadoc)
 * @see observerpttrn.Subject#upload(java.lang.String)
 */
@Override
public void upload(String title) {
		this.title=title;
		notifysubscribers();

  }
}
