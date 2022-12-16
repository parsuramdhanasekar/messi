package Bean;

import java.util.ArrayList;
                
public class Student {
	public Student(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] S) {
		ArrayList<Students> Student = new ArrayList<>();

		Students s1 = new Students(1, "Messi");
		Students s2 = new Students(2, "Thiago");
		Students s3 = new Students(3, "Haaland");
		Students s4 = new Students(4, "Neymar");
		Student.add(s1);
		Student.add(s2);
		Student.add(s3);
		Student.add(s4);
		for (Students student : Student) {
			if (student.getName().startsWith("T")) {
				System.out.println(student.getId() + " " + student.getName());
			}

		}

	}

}
