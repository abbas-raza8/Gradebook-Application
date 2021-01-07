/* Mohammad Raza
 * IB HL Computer Science P6 */

import java.util.Scanner; // import need to create a Scanner object for user input
import java.util.Arrays; // import needed to create an array
import java.util.InputMismatchException; // import needed for InputMismatchException if user enters an invalid menu choice
import java.io.IOException; // import needed for IOException when dealing with files
public class Tester
{
public static void main(String[] args) throws IOException /* IOExecption thrown since files are being used * Method Name: main
                                                                                                           * Parameters: String array
                                                                                                           * Pre-condition: none
                                                                                                           * Post-condition: none
                                                                                                           * Activity: Used to call all other methods */
                                                                                                                
{

  Scanner kbReader = new Scanner (System.in);
  boolean loop = true; // loop variable will become false if user enter 0 as menu option which will then exit the program
  int choice = 0; // variable used to direct user through menu options
  Student array[] = null; // Student object array that is modified throughout the running of the program
  String names [] = null;
  double grades [] = null;
  System.out.printf("%50s", "Welcome to the Gradebook Program!");
  while(loop){
  do // do-while loop used to make sure that the program will run at least once
  {
    try
    {
    choice = Student.printMenu();
    
    int numStudents;
    
    switch(choice)
    {   
      case 0: // Menu Option 0: Exit the program
        System.out.println("\nThank you for using the Gradebook Program, have a nice day.");
        return;
        
      case 1: // Menu Option 1: Create a new gradebook
        Gradebook.classInfo();
        numStudents = Gradebook.getNumStudents();
        array = Student.inputStudents(numStudents);
        Student.printGrades(array);
        break;
        
      case 2: // Menu Option 2: Add a new student
        array = Student.addStudent(array);
        break;
        
      case 3: // Menu Option 3: Delete a student
        int target = Student.getStudentToDelete(array);
        array = Student.deleteStudent(array, target);
        break;
        
      case 4: // Menu Option 4: Edit a student's grades/info
        Student.editStudent(array);
        break;
        
      case 5: // Menu Option 5: View/Print out gradebook
        Student.printGrades(array);
        break;
        
      case 6: // Menu option 6: Input grades from file
        array = Student.inputGrades();
        break;
        
      case 7: // Menu Option 7: output grades to a file
        Student.outputToFile(array);
        break;
        
      case 8: // Menu option 8: Search for a student
        StudentNode.getNames(array);
        int key = Student.search(array);
        Student.printSearch(key, array);
        break;
        
      case 9: // Menu option 9: Find student's highest grade
        Student.studentHighest(array);
        break;
        
      case 10: // Menu option 10: FInd highest grade on assignment
        Student.assignmentHighest(array);
        break;
        
      case 11: // Menu option 11: Find class average for assignment
        Student.assignmentAvg(array);
        break;
        
      case 12: 
        StudentNode.getNames(array);
        StudentNode.getFinalGrade(array);
        StudentNode.append();
        StudentNode.printList();
        break;
        
      default: // default for if user enters invalid option number     
        System.out.println("\nInvalid choice, please enter a menu option number 0-11");
    }
 
}
    catch(InputMismatchException e) // try-catch for InputMismatchException, if users enters something other than an integer then the error message will be displayed
    {
      System.out.println("Error: Invalid input, please enter a menu option number 0-11");
    }
  }
  while(choice != 0); // exit the loop if user input is 0
  loop = false;
 }
}
}
