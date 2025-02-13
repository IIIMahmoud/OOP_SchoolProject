package school;

public class Student extends Person { // encapsulation 
	
	
		private String name;
		private int age;
	    private int studentId;
	    
	    public Student(String name, int age,int studentId) {
			super(name, age);
            this.studentId=studentId;
	    }

		public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public int getStudentId() {
	        return studentId;
	    }

	    public void setStudentId(int studentId) {
	        this.studentId = studentId;
	    }
	    @Override
	    public void displayRole() {
	        System.out.println("i'm a student");
	    }
	}


