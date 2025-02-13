package school;

public class Main {
	 public static void main(String[] args) {
	        //encapsulation
	        Student student = new Student("mohr",20,200031814);
	        student.setName("mohr");
	        student.setAge(20);
	        System.out.println("Student ID is: "+student.getStudentId());
	        student.setStudentId(200);
	        System.out.println("Student ID is: "+student.getStudentId());

	        System.out.println("Student Name: " + student.getName());

	        //inheritance
	        Teacher teacher = new Teacher("alaa",40,2144);
	        System.out.println("Teacher Name: " + teacher.getName());

	        //polymorphism
	        Person person1 = new Student("yousif",20,200031814);
	        Person person2 = new Teacher("alaa",40,2144);
	        person1.displayRole();
	       
	        System.out.println(person1.getName());
	        System.out.println(person1.getAge());
	      

	        person2.displayRole(); 
	        System.out.println("Student ID is: "+student.getStudentId());

	        //abstraction
	        Course mathCourse = new ProgrammingCourse ("Object Oriented Programming ");
	        mathCourse.displayCourseDetails(); 
	 }
}
