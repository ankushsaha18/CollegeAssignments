package ClassWork2.class_1;

public class Main {

	public static void main(String[] args) {
		StudentLibrary sl=new StudentLibrary();
		Student s1=new Student("Ankush",51,"CSE");
		Student s2=new Student("Raj",21,"CSIT");
		Student s3=new Student("Rahul",52,"ECE");
		sl.addAStudent(s1);
		sl.addAStudent(s2);
		sl.addAStudent(s3);
		sl.displayAllStudents();
		sl.removeStudent(s2);
		sl.displayAllStudents();
		sl.searchAStudent(1);
	}

}
