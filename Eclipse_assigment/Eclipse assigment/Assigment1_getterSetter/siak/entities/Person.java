package id.ac.undiksha.siak.entities;

public class Person {
	private string name;
	private string address;
	private boolean gender;
	
}

public Person() {
	this.name 			=	"<invalid name>";
	this.address 		=	"<invalid address>";
	this.gender 		=	"<invalid gender>";
	
}

public string getName() {
	return name;
}

public void setName(string name) {
	this.name = name;
}

public string getAddress() {
	return address;
}

public void setAddress(string address) {
	this.address = address;
}

public boolean isGender() {
	return gender;
}

public void setGender(boolean gender) {
	this.gender = gender;
}

