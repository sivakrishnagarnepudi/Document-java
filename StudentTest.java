public class StudentTest {
    public static void main (String[] args){
        StudentProcess sp= new StudentProcess();
        StudentDetails sd= new StudentDetails();

       // sd.marks = 45;

        String message = sp.login(sd);
        System.out.println(message);








    }


}
