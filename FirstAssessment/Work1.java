
/**
 * Write a description of class Work1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Work1
{
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of marks you want to input:");
        int number = input.nextInt();
        
    //edge case for 0 or necgative number
        if (number <= 0) {
            System.out.println("Invalid number of marks. Must be greater than 0.");
            input.close();
            return;
        }
        
        int [] marksList = new int[number]; 
        
        for(int i =0; i<number; i++){
            int mark;
            while(true){
                System.out.println("Enter a marks between 0 and 30");
                mark = input.nextInt();
                
                if(mark >= 0 && mark <= 30){
                    marksList[i] = mark;
                    break;
                }
                else{
                    System.out.println("Invalid marks. please try again");
                }
            }
        } 
        //display the entered marks in array
        System.out.println("\n Enter list of marks:");
        for(int i = 0; i<number; i++){
            System.out.println("Marks is:" + marksList[i]);
        }
        
        //find highest and lowest marks
        int highest = marksList[0];
        int lowest = marksList[0];
        for (int i=1; i< marksList.length; i++){
            if(marksList[i] > highest){
                highest = marksList[i];
            }
            
            if(marksList[i] < lowest){
                lowest = marksList[i];
            }
        }
        
    //display results
        System.out.println("Highest Marks is" + highest);
        System.out.println("lowest Marks is" + lowest);
        
        input.close();  
    }
    
    
    
    
}