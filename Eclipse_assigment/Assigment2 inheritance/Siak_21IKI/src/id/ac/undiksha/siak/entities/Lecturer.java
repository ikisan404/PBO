package id.ac.undiksha.siak.entities;

public class Lecturer extends Person {
	private String nip;
	private String department;
	private String faculty;
	
	
	public Lecturer() {
		this.nip 			= "<invalid nip>";
		this.department 	= "<invalid department>";
		this.faculty 		= "<invalid faculty>";
	}
	

	public Lecturer(String name, String address, boolean gender,
			String nip, String department, String faculty) {
		super(name, address, gender);
		// TODO Auto-generated constructor stub
		this.nip = nip;
		this.department = department;
		this.faculty = faculty;
	}


	public void printAll() {
		System.out.println("NIM: "			+ this.nip);
		System.out.println("Name: "			+ getName());
		System.out.println("Address: "		+ getAddress());
		System.out.println("Gender: "		+ (getGender() ? "Male":"Female"));
		System.out.println("Department: "	+ this.department);
		System.out.println("Faculty: "		+ this.faculty);
	}

	public String getNip() {
		return nip;
	}



	public void setNip(String nip) {
		this.nip = nip;
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
