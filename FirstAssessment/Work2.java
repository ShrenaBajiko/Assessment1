
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
        System.out.println("Enter a number of marks you want to input:");
        int number = input.nextInt();
        double [] marksList = new double[number]; 
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
        //display the marks in array
        System.out.println("\n Enter list of marks:");
        for(int i = 0; i<number; i++){
            System.out.println("Marks is:" + marksList[i]);
        }
        
        
        double mean = totalMean(marksList, number);
        double variance = totalVariance(marksList, number, mean);

        System.out.println("Mean = " + mean);
        System.out.println("Variance = " + variance);

                
        
        
        
        
        
    }
    
    public static double totalMean(double[] marksList, int number) {
         double sum = 0;
         for(int i = 0; i< number; i++){
            sum = sum + marksList[i];
        }
        double mean = sum / number;
        //System.out.println("The mean of all marks is" + mean);
        return mean;
    }
    
    public static double totalVariance(double[] marksList, int number, double mean) {
        double sqrt = 0;
       
         for(int i = 0; i< number; i++){
            double diff = marksList[i] - mean;
            sqrt += diff * diff;
        }
        System.out.println("The square differnce is" + sqrt);
        
        double var = sqrt / number; //variance of all marks
        
        return var;

    }
}