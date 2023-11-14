package vivaq2;

import java.util.Scanner;

public class VivaQ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your desired row: ");//Prompt user to enter row 
        int row = sc.nextInt();//User input
        
        while (row <=0){ 

            System.out.print("You have entered an invalid number.Please enter only positive number.\n"); 

            System.out.print("Enter your desired row: ") ;//Prompt user to enter row  

            row = sc.nextInt();//User input 

        } 
        sc.close();
        
        //nestedloop
        for(int i = 1; i <= row; i++){//Outside loop to ensure row wanted is completely printed
            for(int j = 1; j <= i; j++){ //Inner loop to print stars required for each row 
                System.out.print("*"); //Print star
            }
        System.out.println(); //Move to the next line after printing stars of each row
        }

    }
    
}
