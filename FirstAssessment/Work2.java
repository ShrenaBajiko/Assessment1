
/**
 * Write a description of class Work2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Work2
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number a marks a user want to input:");
        int number = input.nextInt();
        int [] marksList = new int[number]; 
        for(int i =0; i<number; i++){
            int mark;
            while(true){
                System.out.println("Enter a marks that lies in between 0 and 30");
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
        //display the marks in array
        System.out.println("\n Enter list of marks:");
        for(int i = 0; i<number; i++){
            System.out.println("Marks is:" + marksList[i]);
        }
        
        
        double sum = 0.0;
        double sqrt = 0.0;
        double diff = 0.0;
        double var = 0.0;
        
        for(int i = 0; i< number; i++){
            sum = sum + marksList[i];
        }
        double mean = sum / number;
        System.out.println("The mean of all marks is" + mean);
        
        
         for(int i = 0; i< number; i++){
            diff = marksList[i] - mean;
            sqrt += diff * diff;
        }
        System.out.println("The square differnce is" + sqrt);
        
        
        
        
        
        
      
        
    
    }
    
}