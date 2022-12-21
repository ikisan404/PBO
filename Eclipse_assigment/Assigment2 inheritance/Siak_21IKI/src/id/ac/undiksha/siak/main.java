package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.*;
public class main {
	
	public static void main(String[] args) {
	//todo Auto generated method stub
//		System.out.print("Hello World");
		
		
//		Student std2 = new Student(
//		"123456",
//		"Budi",
//		"Singaraja",
//		true,
//		"Computer Science",
//		"Informatics",
//		"FTK"
//				);
////		Lecturer std3 = new Lecturer(
////		"11112",
////		"Bayu",
////		"Denpasar",
////		true,
////		"English",
////		"Informatics",
////		"FBS"
////		);
////		
////		std3.printAll();
//		std2.printAllInfo();
		/*
		 * Person prs1 new Person();
		 * prs1.setName("Adi");
		 * System.out.printIn(prs1.getName();
		 */
		
//		System.out.println(stdl.getName());
		Student std3 = new Student(
		"Agus","Banyuning",true, "2115101002","Ilkom",
		"TI", "FTK"
				);
		
		std3.printAllInfo();
		
		Staff stf1 = new Staff(
		"Mahayasa","Singaraja", false, "190023232", "unit1"
				);
		stf1.printAll();
		
		//Person std4 = new Person();
		
		Lecturer lec1 = new Lecturer(
		"Agung","Sukasada", true, "19231231", "Hukum","FHIS"
				);
		
		lec1.printAll();
}
}
