package BeanPackage;

import java.util.ArrayList;

import Bean.Student;

public class StudentImplementation {
	public static void main(String[] S) {
		StudentImplementation StudentRole = new StudentImplementation();

		ArrayList<Subject> SubjectList1 = new ArrayList<Subject>();
		Subject subject1 = new Subject("Botany", 35, 70, 90);
		Subject subject2 = new Subject("Chemistry", 50, 40, 60);
		Subject subject3 = new Subject("FluidMechanics", 30, 40, 50);
		Subject subject4 = new Subject("MoralScience", 50, 60, 70);
		Subject subject5 = new Subject("Zoology", 60, 50, 70);

		SubjectList1.add(subject1);
		SubjectList1.add(subject2);
		SubjectList1.add(subject3);
		SubjectList1.add(subject4);
		SubjectList1.add(subject5);

		ArrayList<Subject> SubjectList2 = new ArrayList<Subject>();
		Subject subject11 = new Subject("Evs", 60, 80, 90);
		Subject subject12 = new Subject("PP", 40, 70, 50);
		Subject subject13 = new Subject("Dynamics", 88, 40, 30);
		Subject subject14 = new Subject("Automobile", 70, 60, 50);
		Subject subject15 = new Subject("SolidMechs", 70, 60, 50);

		SubjectList2.add(subject11);
		SubjectList2.add(subject12);
		SubjectList2.add(subject13);
		SubjectList2.add(subject14);
		SubjectList2.add(subject15);

		ArrayList<Subject> SubjectList3 = new ArrayList<Subject>();
		Subject subject21 = new Subject("PPe", 80, 70, 50);
		Subject subject22 = new Subject("TQm", 80, 70, 50);
		Subject subject23 = new Subject("PPC", 50, 40, 60);
		Subject subject24 = new Subject("Thermal", 50, 70, 90);
		Subject subject25 = new Subject("Dynamics", 70, 50, 50);

		SubjectList3.add(subject21);
		SubjectList3.add(subject22);
		SubjectList3.add(subject23);
		SubjectList3.add(subject24);
		SubjectList3.add(subject25);

		ArrayList<Subject> SubjectList4 = new ArrayList<Subject>();
		Subject subject31 = new Subject("MM", 40, 60, 50);
		Subject subject32 = new Subject(" EM", 40, 50, 60);
		Subject subject33 = new Subject("EE", 50, 60, 70);
		Subject subject34 = new Subject("DME", 30, 50, 60);
		Subject subject35 = new Subject(" POM", 80, 70, 60);

		SubjectList4.add(subject31);
		SubjectList4.add(subject32);
		SubjectList4.add(subject33);
		SubjectList4.add(subject34);
		SubjectList4.add(subject35);

		ArrayList<Subject> SubjectList5 = new ArrayList<>();
		Subject subject41 = new Subject("KOM", 60, 70, 80);
		Subject subject42 = new Subject("HMT", 50, 70, 60);
		Subject subject43 = new Subject(" NanoEngg", 50, 60, 70);
		Subject subject44 = new Subject("EDC", 60, 40, 60);
		Subject subject45 = new Subject("CIM ", 40, 50, 60);

		SubjectList5.add(subject41);
		SubjectList5.add(subject42);
		SubjectList5.add(subject43);
		SubjectList5.add(subject44);
		SubjectList5.add(subject45);

		ArrayList<BeanPackage.Student> studentList = new ArrayList<BeanPackage.Student>();
		BeanPackage.Student student1 = new BeanPackage.Student(null, 0, 0, 0);
		
		

		

	}

}
