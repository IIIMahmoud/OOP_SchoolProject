package school;

abstract class Course {//abstraction
	 private String courseName;

	 public Course(String courseName) {
	     this.courseName = courseName;
	 }

	 // abstrac method (no implementation)
	 public abstract void displayCourseDetails();

	 // concrete method
	 public String getCourseName() {
	     return courseName;
	 }
}


