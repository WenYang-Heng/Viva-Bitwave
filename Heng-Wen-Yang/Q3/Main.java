import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.next();
        boolean isInputValid = true;

        //check whether it is a binary number
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) != '0' && binary.charAt(i) != '1' && binary.charAt(i) != '.') { //changed from || to &&
                System.out.println("You've entered the wrong binary format.");
                isInputValid = false;
                break;
            }
        }

        //moved the method out of the loop, for efficiency
        //for example: if input is 1001, there are 4 digits,
        // in your previous implementation, the statement if(i == binary.length()-1) is executed 4 times, 4 comparisons made
        // imagine if the binary is long, how many times the statement is executed?
        //if this is outside, only 1 comparison is needed instead of 4
        if(isInputValid)
            ToDecimal(binary); //proceed to change to decimal
    }
    private static void ToDecimal (String binary1) {
        double decimal = 0;
        int point = binary1.indexOf('.');
        int binaryIntLength = binary1.length();

        //check if there is decimal point
        if(point > 1){
            for(int i = point + 1; i < binaryIntLength; i++){
                decimal += (binary1.charAt(i) - '0') * Math.pow(2, -(i - point)); //
            }
            binaryIntLength = point; // since we know the index of the decimal point, we can assign it to the variable for calculations before the decimal point
        }

        //calculates integer part of binary
        for(int i = 0; binaryIntLength > 0; i++, binaryIntLength--){
            decimal += (binary1.charAt(i) - '0') * Math.pow(2, binaryIntLength - 1);
        }

        System.out.println("Binary number " + binary1 + " is equivalent to " + decimal + " in decimal");
    }
}
