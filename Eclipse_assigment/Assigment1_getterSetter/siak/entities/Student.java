package id.ac.undiksha.siak.entities;

public class Student extends Person {
	private String nim;
	private String studyprogram;
	private String department;
	private String faculty;
	           
	/*public Student() {
		this.name = "<ivalid name>";
		this.address = "<ivalid address>";
		this.nim = "<ivalid nim>";
		this.studyprogram = "<ivalid studyProgram>";
		this.department = "<ivalid department>";
		this.faculty = "<ivalid faculty>";
	}
	public void printAllInfo() {
		System.out.println("NIM: " 			+ this.nim);
		System.out.println("Name: " 		+ this.name);
		System.out.println("Address: " 		+ this.address);
		System.out.println("StudyProgram: " + this.studyprogram);
		System.out.println("Department: " 	+ this.department);
		System.out.println("Faculty: " 		+ this.faculty);
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getAddress() {
		return address;
	}
	public Student(String nim, String name, String address, Boolean gender, String studyprogram, String department,
			String faculty) {
		super();
		this.nim = nim;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.studyprogram = studyprogram;
		this.department = department;
		this.faculty = faculty;
	}*/
	
	public Student(String nim, String studyProgram, String department, String Faculty) {
		super();
		
		
	}
	
	
	
	public void printAllInfo() {
		System.out.printIn
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
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
