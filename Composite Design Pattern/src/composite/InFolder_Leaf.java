package composite;

public class InFolder_Leaf implements Components{
	String FileName;
	String FileType;
	String FileStatus;
	
	
	public InFolder_Leaf(String fileName, String fileType, String fileStatus) {
		super();
		FileName = fileName;
		FileType = fileType;
		FileStatus = fileStatus;
	}
	
	


	public String getFileName() {
		return FileName;
	}




	public void setFileName(String fileName) {
		FileName = fileName;
	}




	public String getFileType() {
		return FileType;
	}




	public void setFileType(String fileType) {
		FileType = fileType;
	}




	public String getFileStatus() {
		return FileStatus;
	}




	public void setFileStatus(String fileStatus) {
		FileStatus = fileStatus;
	}




	@Override
	public void Screen() {
		// TODO Auto-generated method stub
		System.out.println("In Folder: [ FileName: "+FileName+", FileType: "+FileType+", FileStatus:"+FileStatus+" ] ");
	}
	
	

}
