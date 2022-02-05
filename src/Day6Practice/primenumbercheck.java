package Day6Practice;

import java.util.Scanner;

/**
 * number greaterthan 1
 * number has only 2 factors 1&itself
 */
public class primenumbercheck {
    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i=1;i<=n;i++){
            if (n % i == 0)
                count++;
                if (count>2)
                    break;
            }
            if (count==2) {
                System.out.println("It's Prime");
            }else
                System.out.println("not prime number:");
    }
}
