package vivaq1;

import java.util.Scanner;

public class VivaQ1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter a number: "); 

        int num=input.nextInt(); 

        while(num<0){ 

            System.out.println(num+"  is not an Armstrong number because Armstrong Numbers are 	defined for positive integers only"); 

            System.out.print("Enter a number: "); 

            num=input.nextInt(); 

        } 

        input.close(); 

        int oriNum=num; //store the original number for comparison 

        int digit,sum=0,n=String.valueOf(oriNum).length(); 

        while(num>0){ 

            digit=num%10; //get the last digit of the number 

            num/=10; //remove the last digit 

            // Calculate the sum of each digit raised to the power of the number of digits 

            sum+=Math.pow(digit,n); 

        }  

        if(sum==oriNum){ 

            System.out.println(oriNum+" is an Armstrong number because sum of its digits raised to the nth power, "+sum+" is equal to "+oriNum); 

        }else{ 

            System.out.println(oriNum+" is not an Armstrong number because sum of its digits raised to the nth power, "+sum+" is  not equal to "+oriNum); 

        } 

    }
    
}
