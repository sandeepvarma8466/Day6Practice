package Day6Practice;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter Any Number: ");
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int sum=0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                sum=sum+i;
            }
        }
        if (n==sum)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect number");
    }
}
