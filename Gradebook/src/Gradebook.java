/* Mohammad Raza
 * IB SL Computer Science P2 */

import java.util.Scanner; // import needed to create Scanner objects 
import java.util.InputMismatchException; // import needed for InputMismatchException if user enters an invalid choice

public class Gradebook
{
  private static String teacherName;
  private static String classSubject;
  private static String classPeriod;
  
  public Gradebook(String teacher, String subject, String period)
  { // all class variables are private for encapsulation
    teacher = teacherName;
    subject = classSubject;
    period = classPeriod;
  }

  
  public static void classInfo() /* Method Name: classInfo
                                  * Parameters: none
                                  * Pre-condition: none
                                  * Post-condition: The teacher name, subject, and class period are all initialized based on the user input
                                  * Activity: User enters the teacher name, class subject, and class period */
  {
    Scanner kb = new Scanner(System.in);
    System.out.println("\nLet start by getting some information about the class:\n");
    System.out.println("Enter the name of the teacher for this class:");
    teacherName = kb.nextLine();
    
    System.out.println("Enter the subject for this class:");
    classSubject = kb.nextLine();
    
    System.out.println("Enter the period of this class:");
    classPeriod = kb.nextLine();    
    kb.close();
  }
  
    public static int getNumStudents() /* Method Name: getNumStudents
                                        * Parameters: none
                                        * Pre-condition: none
                                        * Post-condition: the number of students in the class inputted by the user is returned
                                        * Activity: Asks user for total number of students in class, this value is then returned */
  {
    Scanner kbReader = new Scanner(System.in);
    int numStudents = 0;
    try{
    System.out.println("Please enter the total number of students in your class:");
     numStudents = kbReader.nextInt();
    }
    catch(InputMismatchException e)
    {
      System.out.println("Error: Please enter a valid integer");
    }
    kbReader.close();
    return numStudents;
  }
    // getter and setter methods:
    public static void setTeacherName(String name)
    {
      teacherName = name;
    }
    
    public static void setClassSubject(String subject)
    {
      classSubject = subject;
    }
    
    public static void setClassPeriod(String p)
    {
      classPeriod = p;
    }
    
    public static String getTeacherName()
    {
      return teacherName;
    }
    
    public static String getClassSubject()
    {
      return classSubject;
    }
    
    public static String getClassPeriod()
    {
      return classPeriod;
    }
}