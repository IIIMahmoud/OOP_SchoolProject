package school;

public class ProgrammingCourse extends Course {
	
	 public ProgrammingCourse(String courseName) {
	     super(courseName);
	 }

		 public void displayCourseDetails() {
		     System.out.println("This is a Programming course: " + getCourseName());
		 }
		}

