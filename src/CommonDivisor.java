import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two positive integers to find their greatest common divisor: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int commonDivisor = 1;


        for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                commonDivisor = i;
            }

        }
        System.out.println("Common divisor of " + num1 + " and " + num2 + " is : " + commonDivisor);
    }

}
