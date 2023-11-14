package vivaq3;

import java.util.Scanner;

public class VivaQ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a binary number: "); 
        String binary = sc.next();  //create object named binary 
        boolean isInputValid = true; 
 
        //check whether it is a binary number 
        //Program will end when user entered the wrong binary format 
        for (int i = 0; i < binary.length(); i++) { 
            if (binary.charAt(i) != '0' && binary.charAt(i) != '1' && binary.charAt(i) != '.') { 
                System.out.println("You've entered the wrong binary format."); 
                isInputValid = false; 
                break; //exit from the FORloop 
            } 
        } 
        
        if(isInputValid) 
            ToDecimal(binary); //proceed to change to decimal by passing the binary string
    }
    private static void ToDecimal (String binary1) {
        double decimal = 0; 
        int point = binary1.indexOf('.');  

         //find the index of the first occurrence of a specified substring '.' within the string. 
        int binaryIntLength = binary1.length(); 

        //check if there is decimal point (if there is no decimal point, point = -1) 
        //calculate the binary after the decimal point 
        if(point >= 1){ 
            for(int i = point + 1; i < binaryIntLength; i++){ 
                decimal += (binary1.charAt(i) - '0') * Math.pow(2, -(i - point)); 
                //calculate the binary point by using the power method from the math class 
            } 
            binaryIntLength = point; 
            // since we know the index of the decimal point, we can assign it to the variable for calculations before the decimal point 
        } 
 
        //calculates integer part of binary 
        for(int i = 0; binaryIntLength > 0; i++, binaryIntLength--){ 
            decimal += (binary1.charAt(i) - '0') * Math.pow(2, binaryIntLength - 1); 
            //This part calculates 2 raised to the power of binaryIntLength - 1 
        } 
 
        System.out.println("Binary number " + binary1 + " is equivalent to " + decimal + " in decimal");

    }
    
}
