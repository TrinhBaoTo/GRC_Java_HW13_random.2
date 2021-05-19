// Trinh To, CS141, Fall 2019, Section A
// Programming Assignment Random Number #2, 

// This program's behavior is ask the user what size walk 
   // they want to know about, then run the method with that
   // number 10,000 (ten thousand) times, and find the average
   // number of steps.  Then print out that number.
   
import java.util.Scanner;
import java.util.*;


public class random2
{//open class
   public static void main(String[] args)
   {//open main
    
      Scanner input = new Scanner(System.in);//scanning for user input
      
      System.out.print("What size walk do you want to test?  ");
      int n = input.nextInt(); //input for n 
      
      System.out.println(" ");
      
      double sum=0.0;//declare sum
      
      int count=0;//declare count
     
      for(int i=1;i<10000;i++){//for loop 10000
         sum += randomWalk(n);//calculate the sum
         count++;//count
      }
      
      double ave=sum/count;//calculate find the average number of steps
      
      System.out.printf("For a walk of size %d, after 10,000 tries,\non average it took %.2f steps to get there.",n,ave);
              
   }//end main
   
   public static int randomWalk(int x)
   { //open method
      int position=0;
      
      Random inde = new Random();
      
      int id = inde.nextInt(3)-1;
      //random from -1 to 1
      
      int steps=0;
      //declare steps
      
      while ((position<x) && (position>-x)){
      //while loop till it reach x or -x
         while (id==0){
         // does not increase or decrease 0
            id = inde.nextInt(3)-1;
         }
         
         position=position+id;
         //update position
        
         id = inde.nextInt(3)-1;
         //update new id (+1 or -1) 
         steps=steps+1;
         //count steps
      }   
      
      return steps;         
   }//end method
   
}//end class