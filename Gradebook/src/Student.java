/* Mohammad Raza
 * IB SL Computer Science P2 */

import java.util.Scanner; // import need to create a scanner object for user input
import java.util.InputMismatchException; // import needed to catch InputMismatchException
import java.io.FileNotFoundException; // import needed to catch FileNotFoundException
import java.io.IOException; // import needed to throw an IOException
import java.util.Arrays; // import needed to create arrays
import java.util.Comparator; // import needed to create a Comparator object
import java.io.PrintWriter; // import needed to create a PrintWriter object to write to a file
import java.io.FileWriter; // import needed to create a FileWriter object
import java.io.File; // import needed to create a new file

public class Student
{ // all class variables are private for encapsulation
  public String studentName; // variable to reference the name of each Student object
  private int studentID; // variable to reference the ID of each Student obejct
  public int grade1, grade2, grade3, grade4, grade5, grade6, grade7, grade8, grade9, grade10; // variables to reference to all of the grades of a student object
  
  public Student(String name, int iD, int gradeOne, int gradeTwo, int gradeThree, int gradeFour, int gradeFive, int gradeSix, int gradeSeven, int gradeEight, int gradeNine, int gradeTen) //Constructor for the Student object, 1 string and 9 ints
  {
    name = studentName;
    iD = studentID;
    gradeOne = grade1;
    gradeTwo = grade2;
    gradeThree = grade3;
    gradeFour = grade4;
    gradeFive = grade5;
    gradeSix = grade6;
    gradeSeven = grade7;
    gradeEight = grade8;
    gradeNine = grade9;
    gradeTen = grade10;
  }
  
  public String getName() /* Method Name: getName
                           * Parameters: none
                           * Pre-condition: none
                           * Post-condition: the student name of a student object is returned in lowercase
                           * Activity: Used to get and return the name of a student object */
  {
    return studentName.toLowerCase();
  }
    
  
  public static int printMenu()   /* Method Name: printMenu
                                   * Parameters: none
                                   * Pre-condition: none
                                   * Post-condition: all the menu options the user can enter are printed and user is asked for their choice
                                   * Activity: Prints out all menu options and returns the user's choice entered */
  {
    Scanner kbReader = new Scanner(System.in);
    int choice;
    System.out.println("\n\n");
    System.out.println("1. Create new Gradebook                 \t 2. Add a new student              ");
    System.out.println("3. Delete a student                     \t 4. Edit a student's grades/info        ");
    System.out.println("5. View Gradebook                       \t 6. Input previously entered grades from a file");
    System.out.println("7. Output grades to a file              \t 8. Search for a student           ");
    System.out.println("9. Find a student's highest grade       \t 10. Find the highest grade on an assignment");
    System.out.println("11. Find class average on assignment    \t 12. Get list of failing students");
    System.out.println("0. Exit the program");
    
    System.out.println("\n\nEnter your choice: ");
    choice = kbReader.nextInt();
    return choice;    
  }
  
  public static Student[] inputStudents(int num) /* Method Name: inputStudents
                                                  * Parameters: int numOfStudents
                                                  * Pre-condition: the number of students must be passed in the method call
                                                  * Post-condition: An array of student objects is created and returned
                                                  * Activity: User is asked to enter all the info and grades of all the students */
  {
    Scanner kbReader = new Scanner(System.in);
    Student sArray[] = new Student[num];
    int counter = 1;
    for(int x = 0; x < num; x++)
    {
      String name = "";
      int id = 0, gradeOne = 0, gradeTwo = 0, gradeThree = 0, gradeFour = 0, gradeFive = 0, gradeSix = 0, gradeSeven = 0, gradeEight = 0, gradeNine = 0, gradeTen = 0;
      sArray[x] = new Student(name, id, gradeOne, gradeTwo, gradeThree, gradeFour, gradeFive, gradeSix, gradeSeven, gradeEight, gradeNine, gradeTen);
      
      System.out.println("Enter the full name of Student #" + (x+1) + " (last name followed by first name):");
       if(counter != 1)
      {
      kbReader.nextLine();
      }
      sArray[x].studentName = kbReader.nextLine();
      counter++;
     

      System.out.println("Enter the Student ID for: " + sArray[x].studentName);
      sArray[x].studentID = kbReader.nextInt();
      
      boolean loop = true;  
      while(loop)
      {
        try
        {
          System.out.println("\nEnter Grade #1 for: " + sArray[x].studentName);
          int temp = kbReader.nextInt();
          if(temp >= 0 && temp <= 100)
           {
            sArray[x].grade1 = temp;
            loop = false;
          }
      else
      {
        System.out.println("\nError: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("\nInvalid entry, please enter a valid grade between 0-100");
      kbReader.nextLine();
    }
      } 
      
      boolean loop2 = true;  
      while(loop2)
      {
        try
        {
          System.out.println("Enter Grade #2 for: " + sArray[x].studentName);
          int temp2 = kbReader.nextInt();
          if(temp2 >= 0 && temp2 <= 100)
           {
            sArray[x].grade2 = temp2;
            loop2 = false;
          }
      else
      {
        System.out.println("\nError: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("\nInvalid entry, please enter a valid grade between 0-100");
      kbReader.nextLine();
    }
      }
      
      boolean loop3 = true;  
      while(loop3)
      {
        try
        {
          System.out.println("Enter Grade #3 for: " + sArray[x].studentName);
          int temp3 = kbReader.nextInt();
          if(temp3 >= 0 && temp3 <= 100)
           {
            sArray[x].grade3 = temp3;
            loop3 = false;
          }
      else
      {
        System.out.println("\nError: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("\nInvalid entry, please enter a valid grade between 0-100");
      kbReader.nextLine();
    }
      }
      
      boolean loop4 = true;  
      while(loop4)
      {
        try
        {
          System.out.println("Enter Grade #4 for: " + sArray[x].studentName);
          int temp4 = kbReader.nextInt();
          if(temp4 >= 0 && temp4 <= 100)
           {
            sArray[x].grade4 = temp4;
            loop4 = false;
          }
      else
      {
        System.out.println("\nError: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("\nInvalid entry, please enter a valid grade between 0-100");
      kbReader.nextLine();
    }
      }
       boolean loop5 = true;  
      while(loop5)
      {
        try
        {
          System.out.println("Enter Grade #5 for: " + sArray[x].studentName);
          int temp5 = kbReader.nextInt();
          if(temp5 >= 0 && temp5 <= 100)
           {
            sArray[x].grade5 = temp5;
            loop5 = false;
          }
      else
      {
        System.out.println("\nError: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("\nInvalid entry, please enter a valid grade between 0-100");
      kbReader.nextLine();
    }
      }
      
      boolean loop6 = true;  
      while(loop6)
      {
        try
        {
          System.out.println("Enter Grade #6 for: " + sArray[x].studentName);
          int temp6 = kbReader.nextInt();
          if(temp6 >= 0 && temp6 <= 100)
           {
            sArray[x].grade6 = temp6;
            loop6 = false;
          }
      else
      {
        System.out.println("\nError: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("\nInvalid entry, please enter a valid grade between 0-100");
      kbReader.nextLine();
    }
      }
      
      boolean loop7 = true;  
      while(loop7)
      {
        try
        {
          System.out.println("Enter Grade #7 for: " + sArray[x].studentName);
          int temp7 = kbReader.nextInt();
          if(temp7 >= 0 && temp7 <= 100)
           {
            sArray[x].grade7 = temp7;
            loop7 = false;
          }
      else
      {
        System.out.println("\nError: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("\nInvalid entry, please enter a valid grade between 0-100");
      kbReader.nextLine();
    }
      }
      
       boolean loop8 = true;  
      while(loop8)
      {
        try
        {
          System.out.println("Enter Grade #8 for: " + sArray[x].studentName);
          int temp8 = kbReader.nextInt();
          if(temp8 >= 0 && temp8 <= 100)
           {
            sArray[x].grade8 = temp8;
            loop8 = false;
          }
      else
      {
        System.out.println("\nError: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("\nInvalid entry, please enter a valid grade between 0-100");
      kbReader.nextLine();
    }
      }
      
      boolean loop9 = true;  
      while(loop9)
      {
        try
        {
          System.out.println("Enter Grade #9 for: " + sArray[x].studentName);
          int temp9 = kbReader.nextInt();
          if(temp9 >= 0 && temp9 <= 100)
           {
            sArray[x].grade9 = temp9;
            loop9 = false;
          }
      else
      {
        System.out.println("\nError: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("\nInvalid entry, please enter a valid grade between 0-100");
      kbReader.nextLine();
    }
      }
      
      boolean loop10 = true;  
      while(loop10)
      {
        try
        {
          System.out.println("Enter Grade #10 for: " + sArray[x].studentName);
          int temp10 = kbReader.nextInt();
          if(temp10 >= 0 && temp10 <= 100)
           {
            sArray[x].grade10 = temp10;
            loop10 = false;
          }
      else
      {
        System.out.println("\nError: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("\nInvalid entry, please enter a valid grade between 0-100");
      kbReader.nextLine();
    }
      }
    }
   return sArray;
  }
  
  public static void printGrades(Student a[]) /* Method Name: printGrades
                                               * Parameters: Student array[]
                                               * Pre-condition: a Student array must be passed to the method
                                               * Post-condition: The student array is sorted and printed out
                                               * Activity: Prints out the gradebook */
  {
    try
    {
      Arrays.sort(a, Student.StudentNameComparator);
    System.out.println("\nHere is the gradebook for " + Gradebook.getTeacherName() + "'s Period " + Gradebook.getClassPeriod() + " " + Gradebook.getClassSubject() + " class: \n\n");
    System.out.printf("%-25s %8s %55s\n\n", "Student Name", "Student ID", "Grades");
    for(int i = 0; i < a.length; i++)
    {      
      double total = ((a[i].grade1 + a[i].grade2 + a[i].grade3 + a[i].grade4 + a[i].grade5 + a[i].grade6 + a[i].grade7 + a[i].grade8 + a[i].grade9 + a[i].grade10)); 
      double average = Math.round(total / 10);     
      System.out.printf("%-25s %8s %17s %8s %8s %8s %8s %8s %8s %8s %8s %8s %25s\n", a[i].studentName, a[i].studentID, a[i].grade1, a[i].grade2, a[i].grade3, a[i].grade4, a[i].grade5, a[i].grade6, a[i].grade7, a[i].grade8, a[i].grade9, a[i].grade10, "Final Grade: " + average);
    }
    System.out.println("\n\n");
    }
    catch(NullPointerException e)
    {
      System.out.println("\nError: The gradebook is empty, create a new gradebook to view grades");
    }
    
  }
    
    public static Student[] addStudent(Student a[]) /* Method Name: addStudent
                                                     * Parameters: Student array[]
                                                     * Pre-condition: a Student array must be passed to the method
                                                     * Post-condition: A new array is created and returned with the size increased by one and the new Student object is added
                                                     * Activity: Copies the old array into the new one and asks user to input the grades/info of the new student */
    {
      Student updatedArray[] = null;
      Scanner input = new Scanner(System.in);
      try{
      updatedArray = Arrays.copyOf(a, a.length + 1);
      
      String name = "";
      int id = 0, gradeOne = 0, gradeTwo = 0, gradeThree = 0, gradeFour = 0, gradeFive = 0, gradeSix = 0, gradeSeven = 0, gradeEight = 0, gradeNine = 0, gradeTen = 0;
      updatedArray[a.length] = new Student(name, id, gradeOne, gradeTwo, gradeThree, gradeFour, gradeFive, gradeSix, gradeSeven, gradeEight, gradeNine, gradeTen);
      
      System.out.println("Enter the name of the new student:");
      updatedArray[a.length].studentName = input.nextLine();
      
      System.out.println("Enter the ID for: " + updatedArray[a.length].studentName);
      updatedArray[a.length].studentID = input.nextInt();
   
      
      boolean loopA = true;  
      while(loopA)
      {
        try
        {
          System.out.println("Enter Grade #1 for: " +  updatedArray[a.length].studentName);
          int tempA = input.nextInt();
          if(tempA >= 0 && tempA <= 100)
           {
            updatedArray[a.length].grade1 = tempA;
            loopA = false;
          }
      else
      {
        System.out.println("Error: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("Invalid entry, please enter a valid grade between 0-100\n");
      input.nextLine();
    }
      }
      
      boolean loopB = true;  
      while(loopB)
      {
        try
        {
          System.out.println("Enter Grade #2 for: " +  updatedArray[a.length].studentName);
          int tempB = input.nextInt();
          if(tempB >= 0 && tempB <= 100)
           {
            updatedArray[a.length].grade2 = tempB;
            loopB = false;
          }
      else
      {
        System.out.println("Error: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("Invalid entry, please enter a valid grade between 0-100\n");
      input.nextLine();
    }
      }
      
      boolean loopC = true;  
      while(loopC)
      {
        try
        {
          System.out.println("Enter Grade #3 for: " +  updatedArray[a.length].studentName);
          int tempC = input.nextInt();
          if(tempC >= 0 && tempC <= 100)
           {
            updatedArray[a.length].grade3 = tempC;
            loopC = false;
          }
      else
      {
        System.out.println("Error: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("Invalid entry, please enter a valid grade between 0-100\n");
      input.nextLine();
    }
      }
      
      boolean loopD = true;  
      while(loopD)
      {
        try
        {
          System.out.println("Enter Grade #4 for: " +  updatedArray[a.length].studentName);
          int tempD = input.nextInt();
          if(tempD >= 0 && tempD <= 100)
           {
            updatedArray[a.length].grade4 = tempD;
            loopD = false;
          }
      else
      {
        System.out.println("Error: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("Invalid entry, please enter a valid grade between 0-100\n");
      input.nextLine();
    }
      }
      
      boolean loopE = true;  
      while(loopE)
      {
        try
        {
          System.out.println("Enter Grade #5 for: " +  updatedArray[a.length].studentName);
          int tempE = input.nextInt();
          if(tempE >= 0 && tempE <= 100)
           {
            updatedArray[a.length].grade5 = tempE;
            loopE = false;
          }
      else
      {
        System.out.println("Error: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("Invalid entry, please enter a valid grade between 0-100\n");
      input.nextLine();
    }
      }
      
      boolean loopF = true;  
      while(loopF)
      {
        try
        {
          System.out.println("Enter Grade #6 for: " +  updatedArray[a.length].studentName);
          int tempF = input.nextInt();
          if(tempF >= 0 && tempF <= 100)
           {
            updatedArray[a.length].grade6 = tempF;
            loopF = false;
          }
      else
      {
        System.out.println("Error: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("Invalid entry, please enter a valid grade between 0-100\n");
      input.nextLine();
    }
      }
      
      boolean loopG = true;  
      while(loopG)
      {
        try
        {
          System.out.println("Enter Grade #7 for: " +  updatedArray[a.length].studentName);
          int tempG = input.nextInt();
          if(tempG >= 0 && tempG <= 100)
           {
            updatedArray[a.length].grade7 = tempG;
            loopG = false;
          }
      else
      {
        System.out.println("Error: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("Invalid entry, please enter a valid grade between 0-100\n");
      input.nextLine();
    }
      }
      
      boolean loopH = true;  
      while(loopH)
      {
        try
        {
          System.out.println("Enter Grade #8 for: " +  updatedArray[a.length].studentName);
          int tempH = input.nextInt();
          if(tempH >= 0 && tempH <= 100)
           {
            updatedArray[a.length].grade8 = tempH;
            loopH = false;
          }
      else
      {
        System.out.println("Error: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("Invalid entry, please enter a valid grade between 0-100\n");
      input.nextLine();
    }
      }
      
      boolean loopI = true;  
      while(loopI)
      {
        try
        {
          System.out.println("Enter Grade #9 for: " +  updatedArray[a.length].studentName);
          int tempI = input.nextInt();
          if(tempI >= 0 && tempI <= 100)
           {
            updatedArray[a.length].grade9 = tempI;
            loopI = false;
          }
      else
      {
        System.out.println("Error: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("Invalid entry, please enter a valid grade between 0-100\n");
      input.nextLine();
    }
      }
      
      boolean loopJ = true;  
      while(loopJ)
      {
        try
        {
          System.out.println("Enter Grade #10 for: " +  updatedArray[a.length].studentName);
          int tempJ = input.nextInt();
          if(tempJ >= 0 && tempJ <= 100)
           {
            updatedArray[a.length].grade10 = tempJ;
            loopJ = false;
          }
      else
      {
        System.out.println("Error: Please enter a valid grade between 0-100:");
      }
        }
        catch(InputMismatchException e)
    {
      System.out.println("Invalid entry, please enter a valid grade between 0-100\n");
      input.nextLine();
    }
      }
      Student.printGrades(updatedArray);
      }
       catch(NullPointerException e)
      {
        System.out.println("\nError: A new gradebook must be created before adding a new student");
      }
       input.close();
      return updatedArray;                                   
    }
    
    public static int getStudentToDelete(Student arr[]) /* Method Name: getStudentToDelete
                                                         * Parameters: Student array[]
                                                         * Pre-condition: a Student array must be passed to the method
                                                         * Post-condition: The target/ student to be deleted is returned
                                                         * Activity: User asked to enter which student they would like to delete */
    {
      Scanner kbReader = new Scanner(System.in);
      int target = 0;
      try{
        System.out.println();
      for(int z = 1; z < arr.length + 1; z++)
      {
        System.out.println("Student #" + z + ": " + arr[z-1].studentName);
      }
      System.out.println("\nPlease enter the # of the Student you would like to delete:");
       target = kbReader.nextInt();
      kbReader.close();
      }
      catch(NullPointerException e)
      {
        System.out.println("\nError: No student can be deleted because gradebook is empty");
      }    
      return target;
   }
    
      public static Student[] deleteStudent(Student array[], int target) /* Method Name: deleteStudent
                                                                          * Parameters: Student array[], int target
                                                                          * Pre-condition: a Student array and the target must be passed to the method
                                                                          * Post-condition: A new array is created and returned with the size decreased by one and the target is deleted from the array
                                                                          * Activity: Deletes a student from the gradebook */
    {
        Student newArr[] = null;
        try{
       newArr = new Student[array.length - 1];
      
      int k = 0;
      for(int i = 0; i < array.length; i++)
      {
        if((i + 1) != target)
        {
          String name = "";
      int id = 0, gradeOne = 0, gradeTwo = 0, gradeThree = 0, gradeFour = 0, gradeFive = 0, gradeSix = 0, gradeSeven = 0, gradeEight = 0, gradeNine = 0, gradeTen = 0;
      newArr[k] = new Student(name, id, gradeOne, gradeTwo, gradeThree, gradeFour, gradeFive, gradeSix, gradeSeven, gradeEight, gradeNine, gradeTen);
          newArr[k].studentName = array[i].studentName;
          newArr[k].studentID = array[i].studentID;
          newArr[k].grade1 = array[i].grade1;
          newArr[k].grade2 = array[i].grade2;
          newArr[k].grade3 = array[i].grade3;
          newArr[k].grade4 = array[i].grade4;
          newArr[k].grade5 = array[i].grade5;
          newArr[k].grade6 = array[i].grade6;
          newArr[k].grade7 = array[i].grade7;
          newArr[k].grade8 = array[i].grade8;
          newArr[k].grade9 = array[i].grade9;
          newArr[k].grade10 = array[i].grade10;
          k++;
        }
      }
      Student.printGrades(newArr);
    }
       catch(NullPointerException e)
       {}
      return newArr;
      }
      
        
      public static Comparator <Student> StudentNameComparator = new Comparator<Student>() // Comparator used to sort the array of objects based on the name
      {
        public int compare(Student student1, Student student2)
        {
          String studentName1 = student1.getName();
          String studentName2 = student2.getName();
          
          return studentName1.compareTo(studentName2);
        }
      };
      

      public static int search(Student array[]) /* Method Name: search
                                                  * Parameters: Student array[]
                                                  * Pre-condition: a Student array must be passed to the method
                                                  * Post-condition: The student that was search for grades are printed, or an error message is printed if the student was not found
                                                  * Activity: Searching for a student that the user enters */
      {
        Scanner kbReader = new Scanner(System.in);
        int lowerBound = 0, upperBound = array.length - 1;
        boolean targetFound = false;
       System.out.println("Please enter the full name (last name followed by first name) of the Student you would like to search for:");
      String target = kbReader.nextLine();
        while(lowerBound <= upperBound)
        {
      int m = lowerBound + (upperBound - lowerBound) / 2; 
      int res = target.compareToIgnoreCase(StudentNode.nameArray[m]);
      if(res == 0)
        return m;
      if(res > 0)
        lowerBound = m + 1;
        else 
        upperBound = m -1;
        }
        return -1;
      }
      
      public static void printSearch(int k, Student array[])
      {
        if(k == -1)
        {
          System.out.println("\nError: Student not found\n");
        }
        else {
          System.out.println("\nHere are the grades for: " + array[k].studentName + "\n");
            double total = ((array[k].grade1 + array[k].grade2 + array[k].grade3 + array[k].grade4 + array[k].grade5 + array[k].grade6 + array[k].grade7 + array[k].grade8 + array[k].grade9 + array[k].grade10)); 
            double average = Math.round(total / 10);     
            System.out.printf("%-25s %8s %17s %8s %8s %8s %8s %8s %8s %8s %8s %8s %25s\n", array[k].studentName, array[k].studentID, array[k].grade1, array[k].grade2, array[k].grade3, array[k].grade4, array[k].grade5, array[k].grade6, array[k].grade7, array[k].grade8, array[k].grade9, array[k].grade10, "Final Grade: " + average);
          
        }
        
        
      }
      
      
      /*  for(int g = 0; g < array.length; g++)
        {
          if(array[g].studentName.toLowerCase().equalsIgnoreCase(target))
          {
            System.out.println("\nHere are the grades for: " + array[g].studentName + "\n");
            double total = ((array[g].grade1 + array[g].grade2 + array[g].grade3 + array[g].grade4 + array[g].grade5 + array[g].grade6 + array[g].grade7 + array[g].grade8 + array[g].grade9 + array[g].grade10)); 
            double average = Math.round(total / 10);     
            System.out.printf("%-25s %8s %17s %8s %8s %8s %8s %8s %8s %8s %8s %8s %25s\n", array[g].studentName, array[g].studentID, array[g].grade1, array[g].grade2, array[g].grade3, array[g].grade4, array[g].grade5, array[g].grade6, array[g].grade7, array[g].grade8, array[g].grade9, array[g].grade10, "Final Grade: " + average);
            loop = false;
            targetFound = true;
            break;
          }
        }
        if(targetFound == false)
          {
            System.out.println("\nError: Student not found\n");
          }
        }
        }
      catch(NullPointerException e)
      {
        System.out.println("\nError: Student cannot be searched for because gradebook is empty");
      } 
        kbReader.close();
      }*/
      
      
      public static void studentHighest(Student array[]) /* Method Name: studentHighest
                                                          * Parameters: Student array[]
                                                          * Pre-condition: a Student array must be passed to the method
                                                          * Post-condition: The student's highest grade is printed
                                                          * Activity: Finding and printing a students highest grade*/
      {
        Scanner kbReader = new Scanner(System.in);
        try{
          System.out.println();
          for(int z = 1; z < array.length + 1; z++)
        {
          System.out.println("Student #" + z + ": " + array[z-1].studentName);
        }
        System.out.println("\nPlease enter the # of the Student you would like the highest grade for:");
        int target = kbReader.nextInt();
        
        int max = 0;
        
        if(array[target-1].grade1 > max)
        {
          max = array[target-1].grade1;
        }
        
          if(array[target - 1].grade2 > max)
          {
            max = array[target - 1].grade2;
          }
          
           if(array[target -1].grade3 > max)
          {
            max = array[target - 1].grade3;
          }
          
           if(array[target -1].grade4 > max)
          {
            max = array[target - 1].grade4;
          }
          
           if(array[target -1].grade5 > max)
          {
            max = array[target - 1].grade5;
          }
          
           if(array[target -1].grade6 > max)
          {
            max = array[target - 1].grade6;
          }
          
           if(array[target -1].grade7 > max)
          {
            max = array[target - 1].grade7;
          }
          
           if(array[target -1].grade8 > max)
          {
            max = array[target - 1].grade8;
          }
          
           if(array[target -1].grade9 > max)
          {
            max = array[target - 1].grade9;
          }
          
           if(array[target -1].grade10 > max)
          {
            max = array[target - 1].grade10;
          }
          System.out.println("The highest grade for " + array[target-1].studentName + " is: " + max);
          kbReader.close();
        }
        catch(NullPointerException e)
        {
          System.out.println("\nError: Gradebook is empty");
        }
      }
      
      public static void assignmentHighest(Student array[]) /* Method Name: assignmentHighest
                                                             * Parameters: Student array[]
                                                             * Pre-condition: a Student array must be passed to the method
                                                             * Post-condition: The highest grade on the assignment that the user entered is printed
                                                             * Activity: Finding the highest grade on an assignment */
      {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Enter the assignment number(1-10) you would like the highest grade for: ");
        int choice = kbReader.nextInt();
        int max = 0;
        try{
        switch(choice)
        {
          case 1:
            for(int x = 0; x < array.length; x++)
          {
              if(array[x].grade1 > max)
            {
              max = array[x].grade1;
            }
          }
            System.out.println("\nThe highest grade on assignment #" + choice + " was a " + max);
            break;
            
          case 2:
             for(int x = 0; x < array.length; x++)
          {
              if(array[x].grade2 > max)
            {
              max = array[x].grade2;
            }
          }
           System.out.println("\nThe highest grade on assignment #" + choice + " was a " + max);
            break;
            
          case 3:
             for(int x = 0; x < array.length; x++)
          {
              if(array[x].grade3 > max)
            {
              max = array[x].grade3;
            }
          }
            System.out.println("\nThe highest grade on assignment #" + choice + " was a " + max);
            break;
          
          case 4:
             for(int x = 0; x < array.length; x++)
          {
              if(array[x].grade4 > max)
            {
              max = array[x].grade4;
            }
          }
            System.out.println("\nThe highest grade on assignment #" + choice + " was a " + max);
            break;
            
          case 5:
             for(int x = 0; x < array.length; x++)
          {
              if(array[x].grade5 > max)
            {
              max = array[x].grade5;
            }
          }
            System.out.println("\nThe highest grade on assignment #" + choice + " was a " + max);
            break;
            
          case 6:
             for(int x = 0; x < array.length; x++)
          {
              if(array[x].grade6 > max)
            {
              max = array[x].grade6;
            }
          }
           System.out.println("\nThe highest grade on assignment #" + choice + " was a " + max);
            break;
            
          case 7:
             for(int x = 0; x < array.length; x++)
          {
              if(array[x].grade7 > max)
            {
              max = array[x].grade7;
            }
          }
           System.out.println("\nThe highest grade on assignment #" + choice + " was a " + max);
            break;
            
          case 8:
             for(int x = 0; x < array.length; x++)
          {
              if(array[x].grade8 > max)
            {
              max = array[x].grade8;
            }
          }
            System.out.println("\nThe highest grade on assignment #" + choice + " was a " + max);
            break;
            
          case 9:
             for(int x = 0; x < array.length; x++)
          {
              if(array[x].grade9 > max)
            {
              max = array[x].grade9;
            }
          }
            System.out.println("\nThe highest grade on assignment #" + choice + " was a " + max);
            break;
            
          case 10:
             for(int x = 0; x < array.length; x++)
          {
              if(array[x].grade10 > max)
            {
              max = array[x].grade10;
            }
          }
           System.out.println("\nThe highest grade on assignment #" + choice + " was a " + max);
            break;
            
          default:
            System.out.println("Error: Enter a valid menu option 1-10");
        }
        kbReader.close();
        }
        catch(NullPointerException e)
        {
          System.out.println("\nError: Gradebook is empty");
        }
      }
      
      public static Student[] editStudent(Student array[]) /* Method Name: editStudent
                                                            * Parameters: Student array[]
                                                            * Pre-condition: a Student array must be passed to the method
                                                            * Post-condition: The value the user edited is updated in the array and the updated array with the edited student is returned
                                                            * Activity: allowing user to edir the name, id, or grades of a student */
      {
        Scanner kbReader = new Scanner(System.in);
        System.out.println();
        try{
        for(int z = 1; z < array.length + 1; z++)
        {
          System.out.println("Student #" + z + ": " + array[z-1].studentName);
        }
        System.out.println("\nPlease enter the # of the Student you would like to edit:");
        
        int target = kbReader.nextInt();
        
        System.out.println("\n\nOption #1: Edit Student Name ");
        System.out.println("Option #2: Edit Student ID ");
        System.out.println("Option #3: Edit Student Grade 1 ");
        System.out.println("Option #4: Edit Student Grade 2 ");
        System.out.println("Option #5: Edit Student Grade 3 ");
        System.out.println("Option #6: Edit Student Grade 4 ");
        System.out.println("Option #7: Edit Student Grade 5 ");
        System.out.println("Option #8: Edit Student Grade 6 ");
        System.out.println("Option #9: Edit Student Grade 7 ");
        System.out.println("Option #10: Edit Student Grade 8 ");
        System.out.println("Option #11: Edit Student Grade 9 ");
        System.out.println("Option #12: Edit Student Grade 10\n ");
        
        System.out.println("Enter the menu option number you would like to edit: ");
        int menuOption = kbReader.nextInt();
        kbReader.nextLine();
        
        switch(menuOption)
        {
          case 1:
          System.out.println("Enter the new name for the student:");
          String newName = kbReader.nextLine();
          array[target-1].studentName = newName;
          break;
          
          case 2:
            System.out.println("Enter the new ID for the student:");
            int newID = kbReader.nextInt();
            array[target-1].studentID = newID;
            break;
            
          case 3:
            System.out.println("Enter the new Grade #1 for the student:");
            int newGrade1 = kbReader.nextInt();
            array[target-1].grade1 = newGrade1;
            break;
            
          case 4:
            System.out.println("Enter the new Grade #2 for the student:");
            int newGrade2 = kbReader.nextInt();
            array[target-1].grade2 = newGrade2;
            break;
            
          case 5:
            System.out.println("Enter the new Grade #3 for the student:");
            int newGrade3 = kbReader.nextInt();
            array[target-1].grade3 = newGrade3;
            break;
            
          case 6:
            System.out.println("Enter the new Grade #4 for the student:");
            int newGrade4 = kbReader.nextInt();
            array[target-1].grade4 = newGrade4;
            break;
            
          case 7:
            System.out.println("Enter the new Grade #5 for the student:");
            int newGrade5 = kbReader.nextInt();
            array[target-1].grade5 = newGrade5;
            break;
            
          case 8:
            System.out.println("Enter the new Grade #6 for the student:");
            int newGrade6 = kbReader.nextInt();
            array[target-1].grade6 = newGrade6;
            break;
            
          case 9:
            System.out.println("Enter the new Grade #7 for the student:");
            int newGrade7 = kbReader.nextInt();
            array[target-1].grade7 = newGrade7;
            break;
            
          case 10:
            System.out.println("Enter the new Grade #8 for the student:");
            int newGrade8 = kbReader.nextInt();
            array[target-1].grade8 = newGrade8;
            break;
            
          case 11:
            System.out.println("Enter the new Grade #9 for the student:");
            int newGrade9 = kbReader.nextInt();
            array[target-1].grade9 = newGrade9;
            break;
            
          case 12:
            System.out.println("Enter the new Grade #10 for the student:");
            int newGrade10 = kbReader.nextInt();
            array[target-1].grade10 = newGrade10;
            break;
            
          default:
            System.out.println("Error: Enter a valid menu option 1-12");
        }
        Student.printGrades(array);
        }
        catch(NullPointerException e){
          System.out.println("Error: No student to be edited because gradebook is empty");}
        kbReader.close();
        return array;
      }
      
      public static void outputToFile(Student array[]) throws IOException /* Method Name: outputToFile
                                                                           * Parameters: Student array[]
                                                                           * Pre-condition: a Student array must be passed to the method, IOException thrown
                                                                           * Post-condition: A new file is created with the gradebook, teacher, subject and period all outputted to it
                                                                           * Activity: Outputs gradebook, teacher name, subject, and class period to a text file*/
      {
        PrintWriter pw = null;
        Scanner kbReader = new Scanner(System.in);
        try{
         System.out.println("\nPlease enter the name of the Output file you would like to create: ");
         String output = kbReader.nextLine();
         
         FileWriter fw = new FileWriter(output); 
         pw = new PrintWriter(fw);
         
         pw.println(array.length);
         pw.println(Gradebook.getTeacherName());
         pw.println(Gradebook.getClassSubject());
         pw.println(Gradebook.getClassPeriod());
         
         System.out.println("Here is what has been outputted to the file:\n");
         System.out.println(array.length);
         System.out.println(Gradebook.getTeacherName());
         System.out.println(Gradebook.getClassSubject());
         System.out.println(Gradebook.getClassPeriod());
         
         for(int x = 0; x < array.length; x++)
         {
           double total = ((array[x].grade1 + array[x].grade2 + array[x].grade3 + array[x].grade4 + array[x].grade5 + array[x].grade6 + array[x].grade7 + array[x].grade8 + array[x].grade9 + array[x].grade10)); 
           double average = Math.round(total / 10);    
           pw.println(array[x].studentName + ", " + array[x].studentID + ", " + array[x].grade1 + ", " + array[x].grade2 + ", " + array[x].grade3 + ", " + array[x].grade4 + ", " + array[x].grade5 + ", " + array[x].grade6 + ", " + array[x].grade7 + ", " + array[x].grade8 +  ", " + array[x].grade9 + ", " + array[x].grade10 + ", " + " Final Grade: " + average);
           System.out.println(array[x].studentName + ", " + array[x].studentID + ", " + array[x].grade1 + ", " + array[x].grade2 + ", " + array[x].grade3 + ", " + array[x].grade4 + ", " + array[x].grade5 + ", " + array[x].grade6 + ", " + array[x].grade7 + ", " + array[x].grade8 + ", " + array[x].grade9 + ", " + array[x].grade10 + ", " + " Final Grade: " + average);
         }
        }
      
        catch(NullPointerException e){
          System.out.println("\nError: Create a gradebook first in order to output it to a file");
        }
         pw.close();
      }
      
      public static Student[] inputGrades() throws IOException /* Method Name: inputGrade
                                                                * Parameters: none
                                                                * Pre-condition: The file must exist, IOException thrown
                                                                * Post-condition:The file containing the gradebook is inputted into a Student array and the teacher name, class subject and period are all set to the corresponding variables
                                                                * Activity:inputs gradebook from a text file into Student object array and corresponding class variables */
      {
         Student array[] = null;
        try
        {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Please enter the Input file: "); 
        String file = kbReader.nextLine();
        
        File temp = new File(file);
          Scanner sf = new Scanner(new File(file));
          int counter = 0;
          int index = 0;
          sf.useDelimiter(", ");
          String teacher = "", subject = "", period = "";
          String numStudents = "";

          
          while(sf.hasNext())
          {
            if(counter == 0)
            {
              numStudents = sf.nextLine();
              int num = Integer.parseInt(numStudents);
              array = new Student[num];
              for(int x = 0; x < array.length; x++)
            {
              String name = "";
              int id = 0, gradeOne = 0, gradeTwo = 0, gradeThree = 0, gradeFour = 0, gradeFive = 0, gradeSix = 0, gradeSeven = 0, gradeEight = 0, gradeNine = 0, gradeTen = 0;
              array[x] = new Student(name, id, gradeOne, gradeTwo, gradeThree, gradeFour, gradeFive, gradeSix, gradeSeven, gradeEight, gradeNine, gradeTen);
            }
              counter++;
            }
            
            else if(counter == 1)
            {
              teacher = sf.nextLine();
              Gradebook.setTeacherName(teacher);
              counter++;
            }
            
            else if(counter == 2)
            {
              subject = sf.nextLine();
              Gradebook.setClassSubject(subject);
              counter++;
            }
            
            else if(counter == 3)
            {
              period = sf.nextLine();
              Gradebook.setClassPeriod(period);
              counter++;
            }
            else
            {
              array[index].studentName = sf.next();
              array[index].studentID = sf.nextInt();
              array[index].grade1 = sf.nextInt();
              array[index].grade2 = sf.nextInt();
              array[index].grade3 = sf.nextInt();
              array[index].grade4 = sf.nextInt();
              array[index].grade5 = sf.nextInt();
              array[index].grade6 = sf.nextInt();
              array[index].grade7 = sf.nextInt();
              array[index].grade8 = sf.nextInt();
              array[index].grade9 = sf.nextInt();
              array[index].grade10 = sf.nextInt();
              sf.nextLine();
              index++;         
            }
        }
        }
        catch(FileNotFoundException e)
        {
          System.out.println("\nError: File not found");
        }
    try{ 
    Arrays.sort(array, Student.StudentNameComparator);
    System.out.println("\nHere is the gradebook for " + Gradebook.getTeacherName() + "'s Period " + Gradebook.getClassPeriod() + " " + Gradebook.getClassSubject() + " class: \n\n");
    System.out.printf("%-25s %8s %55s\n\n", "Student Name", "Student ID", "Grades");
    for(int i = 0; i < array.length; i++)
    {      
      double total = ((array[i].grade1 + array[i].grade2 + array[i].grade3 + array[i].grade4 + array[i].grade5 + array[i].grade6 + array[i].grade7 + array[i].grade8 + array[i].grade9 + array[i].grade10)); 
      double average = Math.round(total / 10);     
      System.out.printf("%-25s %8s %17s %8s %8s %8s %8s %8s %8s %8s %8s %8s %25s\n", array[i].studentName, array[i].studentID, array[i].grade1, array[i].grade2, array[i].grade3, array[i].grade4, array[i].grade5, array[i].grade6, array[i].grade7, array[i].grade8, array[i].grade9, array[i].grade10, "Final Grade: " + average);
        
    }
    }
    catch(NullPointerException e){}
    return array;
}
      public static void assignmentAvg(Student array[]) /* Method Name: assignmentAvg
                                                         * Parameters: Student array[]
                                                         * Pre-condition: Student array must be passed as an argument, array cannot be empty/null
                                                         * Post-condition: The class average score for the assignment # entered by user is printed out
                                                         * Activity:Finding the class average score on an assignment */
      {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Enter the assignment number (0-10) you would like the class average for: ");
        int num = kbReader.nextInt();
        int total = 0; 
        double avg = 0;
        try{
        switch(num)
        {
          case 1:
            for(int x = 0; x < array.length; x++)
          {
            total += array[x].grade1;
          }
             avg = Math.round(total / array.length);
            System.out.println("The class average for assignment #" + num + " is: " + avg);
            break;
                
         case 2:
            for(int x = 0; x < array.length; x++)
          {
            total += array[x].grade2;
          }
             avg = Math.round(total / array.length);
            System.out.println("The class average for assignment #" + num + " is: " + avg);
            break;
        
        case 3:
            for(int x = 0; x < array.length; x++)
          {
            total += array[x].grade3;
          }
             avg = Math.round(total / array.length);
            System.out.println("The class average for assignment #" + num + " is: " + avg);
            break;
        
          case 4:
            for(int x = 0; x < array.length; x++)
          {
            total += array[x].grade4;
          }
             avg = Math.round(total / array.length);
            System.out.println("The class average for assignment #" + num + " is: " + avg);
            break;
        

       case 5:
            for(int x = 0; x < array.length; x++)
          {
            total += array[x].grade5;
          }
             avg = Math.round(total / array.length);
            System.out.println("The class average for assignment #" + num + " is: " + avg);
            break;
        
        case 6:
            for(int x = 0; x < array.length; x++)
          {
            total += array[x].grade6;
          }
             avg = Math.round(total / array.length);
            System.out.println("The class average for assignment #" + num + " is: " + avg);
            break;
        
        case 7:
            for(int x = 0; x < array.length; x++)
          {
            total += array[x].grade7;
          }
             avg = Math.round(total / array.length);
            System.out.println("The class average for assignment #" + num + " is: " + avg);
            break;
        
       case 8:
            for(int x = 0; x < array.length; x++)
          {
            total += array[x].grade8;
          }
             avg = Math.round(total / array.length);
            System.out.println("The class average for assignment #" + num + " is: " + avg);
            break;
        
       case 9:
            for(int x = 0; x < array.length; x++)
          {
            total += array[x].grade9;
          }
             avg = Math.round(total / array.length);
            System.out.println("The class average for assignment #" + num + " is: " + avg);
            break;
        
         case 10:
            for(int x = 0; x < array.length; x++)
          {
            total += array[x].grade10;
          }
             avg = Math.round(total / array.length);
            System.out.println("The class average for assignment #" + num + " is: " + avg);
            break;
          
          default:
            System.out.println("Please enter a valid choice 1-10");
        }
        }
        catch(NullPointerException e){
          System.out.println("\nError: Cannot find class average because gradebook is empty");}
      } 
}

