public class StudentNode
{
  private static String studentName;
  private static double grade;
  private static StudentNode nextNode;
  public static String nameArray[];
  public static double gradeArray[];
  private static StudentNode headNode = null;
  private static StudentNode tailNode = null; 
  
    public StudentNode(String name, double finalGrade, StudentNode sn) // Constructor to create a new Student Node
    {
      studentName = name;
      grade = finalGrade;
      nextNode = sn;
    }
    
    public static void getNames(Student[] array) /* Method Name: getNames
                                                  * Parameters: Student array[]
                                                  * Pre-condition: A Student array has been passed as an arugment
                                                  * Post-condition: the names of the Student objects are stored into a new String array[]
                                                  * Activity: Stores the name of each student into a String array */
    {
      nameArray = new String[array.length];
      for(int x = 0; x < array.length; x++)
      {
        nameArray[x] = array[x].studentName;
       // System.out.println(nameArray[x]);
      }
    }
    
    public static void getFinalGrade(Student[] array) /* Method Name: getFinalGrade
                                                       * Parameters: Student array [] 
                                                       * Pre-condition: A Student array has been passed as an arugment
                                                       * Post-condition: the grades of the Student objects are stored into a new double array[]
                                                       * Activity: Stores the final grades of each student into a double array */
    {
      gradeArray = new double[array.length];
      for(int g = 0; g < array.length; g++)
      {
        double total = ((array[g].grade1 + array[g].grade2 + array[g].grade3 + array[g].grade4 + array[g].grade5 + array[g].grade6 + array[g].grade7 + array[g].grade8 + array[g].grade9 + array[g].grade10)); 
        double average = Math.round(total / 10);
        gradeArray[g] = average;
       // System.out.println(gradeArray[g]);
      }
    }
      
     public static void append() /* Method Name: append
                                  * Parameters: none
                                  * Pre-condition: none
                                  * Post-condition: the new node is appended to the tail of the linked list
                                  * Activity: adds new Student nodes to the tail of a linked list */
     {
        for (int x = 0; x < gradeArray.length; x++) {
            if (gradeArray[x] < 70) {

                String name = nameArray[x];
                double grade = gradeArray[x];
                StudentNode newNode = new StudentNode(name, grade, null);
                if (headNode == null) // check to see if there are any nodes
                {
                    headNode = newNode;
                } else {
                    tailNode.nextNode = newNode; // update the old tailNode
                }
                tailNode = newNode; // specify a new tailNode
            }
        }
    }
     

 public static void printList() /* Method Name: printList
                                 * Parameters: none
                                 * Pre-condition: none
                                 * Post-condition: prints out the nodes in the linked list
                                 * Activity: prints out linked list */
  {
   StudentNode currentNode = headNode;
   System.out.println();
   System.out.println("Here is a list of student who are failing the class:\n");
   do
   {
     System.out.println("Name: " + currentNode.studentName + "\t\t\t" + "Grade: " + currentNode.grade);
     currentNode = currentNode.nextNode;
   }
   while(currentNode != null);
}
}
      
  

     

    
    