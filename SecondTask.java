class Teacher {
   String designation = "Teacher";
   String collegeName = "Beginnersbook";
   public void does(){
	System.out.println("Teaching");
   }
   public void eat()
   {
      System.out.println("Human is eating");
   }
}

public class PhysicsTeacher extends Teacher{
   String mainSubject = "Physics";
   public void eat(){
      System.out.println("Boy is eating");
   }
   public static void main(String args[]){
	PhysicsTeacher obj = new PhysicsTeacher();
	
	obj.eat();
	
	System.out.println(obj.collegeName);
	System.out.println(obj.designation);
	System.out.println(obj.mainSubject);
	obj.does();
   }
}