import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num;
//
//        //the following loop validates if an integer is entered, ensures that the integer must be even and greater than 2
//        do {
//            System.out.printf("Enter an even integer: ");
//            if(input.hasNextInt()){
//                num = input.nextInt();
//                if(num <= 2){
//                    System.out.println("\nPlease enter a number that is greater than 2");
//                }
//                else if(num % 2 != 0){
//                    System.out.println("\nInvalid! Please enter an even integer!");
//                }
//                else{
//                    break;
//                }
//            }
//            else{
//                System.out.println("\nInvalid! Please enter an integer.");
//            }
//            input.nextLine();
//            System.out.println();
//        }while (true);
//        input.close();
//
//        findPrimes(num);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your desired row: ");
        int row = sc.nextInt();
        sc.close();

        //nestedloop
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){ //Print stars required of each row
                System.out.print("*");
            }
            System.out.println(); //Move to the next line after printing stars of each row
        }

    }

//    public static void findPrimes(int num){
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        System.out.printf("Prime numbers before %d:%n", num);
//        boolean satisfy = false;
//        for(int i = 2; i < num; i++){
//            if(isPrime(i)) {
//                System.out.printf("%d ", i);
//                list.add(i);
//            }
//        }
//        System.out.println();
//        for(int i = 0; i < list.size(); i++){
//            int temp = num - list.get(i);
//            for(int j = i; j < list.size(); j++){
//                if(temp == list.get(j)){
//                    System.out.printf("%d + %d = %d%n", list.get(i), temp, num);
//                    satisfy = true;
//                }
//            }
//        }
//
//        System.out.printf("The given number %d", num);
//        if(satisfy){
//            System.out.printf(" satisfies the Goldbach's Conjecture%n");
//        }
//        else{
//            System.out.printf(" does not satisfy the Goldbach's Conjecture%n");
//        }
//    }
//
//    public static boolean isPrime(int num){
//        for(int i = 2; i < num; i++){
//            if(num % i == 0) return false;
//        }
//        return true;
//    }

}
