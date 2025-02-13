package school;

public class Teacher extends Person  {//inheritance 
	  private int teacherId;
	  private String name;
	  private int age;
      
	    

	    //super class constractor
	    public Teacher(String name, int age,int teacherId) {
		super(name, age);
		this.teacherId=teacherId;
	}




		public int getTeacherId() {
		return teacherId;
	}
		   @Override
		public void displayRole() {
	        System.out.println("i'm a teacher");
	    }
}

  