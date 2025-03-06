package ClassWork2.class_1;

import java.util.ArrayList;

public class StudentLibrary {
	private ArrayList<Student> students;

	public StudentLibrary() {
		super();
		this.students = new ArrayList<Student>();
	}

	public void addAStudent(Student s) {
		this.students.add(s);
		System.out.println("Student added.");
	}

	public void searchAStudent(int roll) {
		for(Student s : students){
			if(s.getRoll() == roll){
				System.out.println("Student " + s + " found");
				return;
			}
		}
		System.out.println("Student not found");
	}

	public void displayAllStudents() {
		if (students.isEmpty()) {
			System.out.println("No student record found");
		} else {
			System.out.println("Students are ---");
			for (Student stu : students) {
				System.out.println(stu);
			}
		}

	}
	public void removeStudent (Student s) {
		if(students.remove(s)) {
			System.out.println("Student is removed");
		}
		else {
			System.out.println("No such student found");
		}
	}

}
