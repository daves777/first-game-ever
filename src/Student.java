import java.util.Random;

public class Student {
    String firstName;
    String lastName;
    int age;
    double gpa;
    
    Student(String informedFirstName, String informedLastName, int informedAge, double informedGpa)
    {
        firstName = informedFirstName;
        lastName = informedLastName;  
        age = informedAge;
        this.semesterGPA();
    }
    
    double getInfo()
    {
        return gpa;
    } 
    
    double semesterGPA()
    {
        Random r = new Random();
        double randomGPA = 4.0 * r.nextDouble();
        randomGPA = Math.round(randomGPA * 100.0) / 100.0;
        gpa = randomGPA;
        return randomGPA;
    }
}
