import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class Person{
    private String name;
    private String dob;
    private int age;
    public Person(String name,String dob)throws ParseException{
        this.name=name;
        this.dob=new SimpleDateFormat("dd-MM-yyyy").parse(dob);
        this.age=calculateAge();
    }
    private int calculateAge(){
        Date today=new Date();
        long ageInMillis=today.getTime()-dob.getTime();
        return(int)(ageInMillis/(1000L*60*60*24*365));
    }
    public void displayPersonDetails(){
        System.out.println("Name:"+name);
        System.out.println("Date of Birth:"+new SimpleDateFormat("dd-MM-yyyy").format(dob));
        System.out.println("Age:"+age);
    }
    public static void main(String[] args){
        Person person=new Person("Alice","10-11-1999");
        student.displayPersonDetails();
    }
}