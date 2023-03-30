package composite;

public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compose Entertainment = new Compose("Entertainment");
		Compose Videos = new Compose("Videos");
		Compose Movies = new Compose("Movies");
		Compose Software = new Compose("Software");
		
		InFolder_Leaf pani_pani = new InFolder_Leaf("Pani Pani.mp4", "mp4", "Opened");
		InFolder_Leaf baba_amar_ki_biye_hobe_na = new InFolder_Leaf("baba_amar_ki_biye_hobe_na.mp4", "mp4", "Opened");
		InFolder_Leaf eclipse = new InFolder_Leaf("Eclipse.exe", "exe", "Closed");
		InFolder_Leaf Mohanogor = new InFolder_Leaf("Mohanogor.mp4", "mp4", "Opened");
		
		Entertainment.addFolder(Videos);
		Entertainment.addFolder(Movies);
		Videos.addFolder(pani_pani);
		Videos.addFolder(baba_amar_ki_biye_hobe_na);
		Movies.addFolder(Mohanogor);
		Software.addFolder(eclipse);
		
		Entertainment.Screen();
		
		
		
		
		

	}

}
