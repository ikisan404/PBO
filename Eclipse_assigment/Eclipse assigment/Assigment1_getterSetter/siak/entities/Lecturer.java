package id.ac.undiksha.siak.entities;

public class Lecturer {
	private String nip;
	private String name;
	private String address;
	private boolean gender;
	private String department;
	private String faculty;
	
	public Lecturer(String nip, String name, String address, boolean gender, String department,
			String faculty) {
		super();
		this.nip = nip;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.department = department;
		this.faculty = faculty;
	}
	
	public Lecturer() {
		this.nip 			= "<invalid nip>";
		this.name 			= "<invalid name>";
		this.address 		= "<invalid address>";
		this.department 	= "<invalid department>";
		this.faculty 		= "<invalid faculty>";
	}

	public void printAll() {
		System.out.println("NIM: "			+ this.nip);
		System.out.println("Name: "			+ this.name);
		System.out.println("Address: "		+ this.address);
		System.out.println("Gender: "		+ (gender ? "Male":"Female"));
		System.out.println("Department: "	+ this.department);
		System.out.println("Faculty: "		+ this.faculty);
	}

	public String getNip() {
		return nip;
	}



	public void setNip(String nip) {
		this.nip = nip;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public boolean isGender() {
		return gender;
	}



	public void setGender(boolean gender) {
		this.gender = gender;
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
