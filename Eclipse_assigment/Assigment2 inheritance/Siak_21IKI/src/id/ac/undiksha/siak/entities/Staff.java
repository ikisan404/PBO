package id.ac.undiksha.siak.entities;

public class Staff extends Person {
	private String nip;
	private String unit;
	
	public Staff() {
		super();
		this.nip 			= "<invalid nip>";
		this.unit			= "<invalid unit>";
	}
	
	
	public Staff(String name, String address, boolean gender, String nip,String unit) {
		super(name, address, gender);
		// TODO Auto-generated constructor stub
		this.nip = nip;
		this.unit = unit;
	}

	
	
	public void printAll() {
		System.out.println("NIP: "			+ this.nip);
		System.out.println("Name: "			+ getName());
		System.out.println("Address: "		+ getAddress());
		System.out.println("Gender: "		+ (getGender() ? "Male":"Female"));
		System.out.println("unit: "	+ this.unit);
	}
	
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getUnit() {
		return unit;
	}
	public void setDepartment(String unit) {
		this.unit = unit;
	}
	
	
}