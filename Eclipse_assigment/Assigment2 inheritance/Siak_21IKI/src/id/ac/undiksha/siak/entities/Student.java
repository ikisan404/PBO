package id.ac.undiksha.siak.entities;

public class Student extends Person {
	private String nim;
	private String studyprogram;
	private String department;
	private String faculty;
	           
	public Student() {
		super();
		this.nim = "<ivalid nim>";
		this.studyprogram = "<ivalid studyProgram>";
		this.department = "<ivalid department>";
		this.faculty = "<ivalid faculty>";
	}
	public void printAllInfo() {
		System.out.println("NIM: " 			+ this.nim);
		System.out.println("Name: " 		+ getName());
		System.out.println("Address: " 		+ getAddress());
		System.out.println("StudyProgram: " + this.studyprogram);
		System.out.println("Department: " 	+ this.department);
		System.out.println("Faculty: " 		+ this.faculty);
		System.out.println("Gender: " +(getGender() ? "Male" : "Female"));
	}


	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}

	

	public Student(String name, String address, boolean gender, String nim, 
			String studyprogram, String department, String faculty) {
		super(name, address, gender);
		// TODO Auto-generated constructor stub
		this.nim = nim;
		this.studyprogram = studyprogram;
		this.department = department;
		this.faculty = faculty;
	}


	
	
	
	
	public String getStudyProgram() {
		return studyprogram;
	}
	public void setStudyProgram(String studyProgram) {
		this.studyprogram = studyProgram;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

}
