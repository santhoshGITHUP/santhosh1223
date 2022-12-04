package eccapsulation;

public class StudentDerails {

	public static void main(String[] args) {
         Student s= new Student();
         s.setName("santhosh");
         s.setMaek(80);
         s.setPhonenumber(99427454);
         s.setscore(67);
         
          String nmae = s.getNmae();
          System.out.println("Student name is: "+nmae);
          int mark = s.getMark();
          System.out.println("Student mark is: "+mark);
          long phoneNumber = s.getPhoneNumber();
          System.out.println("Student PhineNumber is: "+phoneNumber);
          float score = s.getScore();
          System.out.println("Student score is: "+score);
	}

}
