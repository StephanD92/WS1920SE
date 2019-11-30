package Tabelllen;

import java.util.ArrayList;

import ErweiterungenStudent.Student;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> liste = new ArrayList<Student>();
		Student hannes = new Student("hannes", "dreyer", "03.05.2000", 123, 321);
		liste.add(new Student("hannes", "dreyer", "03.05.2000", 123, 321));
		liste.add(new Student("dreyer", "hannes", "03.05.2000", 321, 123));
		StudentView view = new StudentView(liste);
	}

}
