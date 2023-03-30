package composite;

import java.util.*;


public class Compose implements Components{
	
	String FolderName;
	List<Components> folders = new ArrayList<>();

	
	public Compose(String FolderName) {
		super();
		this.FolderName = FolderName;
	}
	
	


	public String getFolderName() {
		return FolderName;
	}




	public void setFolderName(String FolderName) {
		this.FolderName = FolderName;
	}
	
	public void addFolder(Components com) {
		folders.add(com);
	}
	public void removeFolder(Components com) {
		folders.remove(com);
		
	}




	@Override
	public void Screen() {
		// TODO Auto-generated method stub
		System.out.println("Folder: "+FolderName);
		for(Components c: folders) {
			c.Screen();
		}
		System.out.println("---------------------------------------");
	}
	

}
