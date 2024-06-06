import java.util.*;

public class CodSoft_Task_2 {
    public static void main(String args[])
    {
        //try block...
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("");

            System.out.println("---------------S T U D E N T   G R A D E   C A L C U L A T O R---------------");
            //Program takes the total number of subjects as input from the user. 
            System.out.println("Enter the total number of subjects: ");
            int n = sc.nextInt();
            
            //Array of all the marks obtained by the student is created.
            int MARKS[] = new int[n];
   
            System.out.println("Enter the marks of all the subjects: ");
            for(int i = 0; i < n; i++)
            {
                MARKS[i] = sc.nextInt();
                
                //If marks entered by the user is greater than 100, then the program terminates.
                if(MARKS[i] > 100)
                {
                    System.out.println("Invalid Input...");
                    System.exit(0);//Program terminates at this point.
                }
            }
            
            //Displaying the array.
            System.out.println("The marks obtained in each subjects are: ");
            for(int i = 0; i < n; i++)
            {
                System.out.print(MARKS[i] + " ");
            }

            int total = 0;//Counts the total marks obtained by the student.
            
            for(int i = 0; i < n; i++)
            {
                total += MARKS[i];
            }
            System.out.println("\nThe total marks obtained by the student in all the subjects is: " + total);

            double average = 0.0d;//Calculates the average marks obtained by the student.
            average = (double)(total / n);
            System.out.println("The average percentage obtained by the student is: " + average);

            //Grade checking condition...
            if(average >= 90.0 && average <= 100.0)
            {
                System.out.println("Grade - Outstanding(O)");
            }
            else if(average >= 80.0 && average < 90.0)
            {
                System.out.println("Grade - Excellent(E)");
            }
            else if(average >= 70.0 && average < 80.0)
            {
                System.out.println("Grade - Very Good(A)");
            }
            else if(average >= 60.0 && average < 70.0)
            {
                System.out.println("Grade - Good(B)");
            }
            else if(average >= 50.0 && average < 60.0)
            {
                System.out.println("Grade - Average(C)");
            }
            else if(average >= 40.0 && average < 50.0)
            {
                System.out.println("Grade - Below Average(D)");
            }
            else if(average < 40.0)
            {
                System.out.println("Grade - Fail(F)");
            }
            else
            {
                System.out.println("INVALID GRADE...");
            }//Corresponding grade is printed...
        }catch(ArrayIndexOutOfBoundsException e){//Exception Block...
            System.out.println("Exception caught in the catch block...");
        }
    }
}
