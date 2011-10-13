
public class Student {
	
	
	private String name;
	private String matrNr;
	
	
	public Student(String name, String matrNr) {
		
		
		this.name = name;
		this.matrNr = matrNr;
		
	}
	
	public String getStudent() {
		
		return this.name + " " + matrNr;
		
	}
	

}
