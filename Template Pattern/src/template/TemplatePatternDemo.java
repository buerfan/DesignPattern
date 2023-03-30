package template;

public class TemplatePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game game1 = new Cricket();
		game1.playTemplate();
		
		System.out.println("-----------------");
		
		Game game2 = new Football();
	    game2.playTemplate();
	}

}
