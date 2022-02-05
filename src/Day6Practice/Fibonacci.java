package Day6Practice;

import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int lastnum = 1;
        int secondlast =0;
        int sum=0;
        System.out.print(secondlast + "\t" +lastnum +"\t");
        while (sum < range ){
            sum = lastnum + secondlast;
            if (sum < range){
                System.out.print(sum +"\t");
                secondlast=lastnum;
                lastnum=sum;
            }else
                break;
        }

    }
}
