package Day6Practice;

import java.util.Scanner;

public class RiverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Lastdigit = 0;
        //int Riverse = 0;

        while (n>0){
            Lastdigit=n%10;
            System.out.print(Lastdigit);
           // Riverse=Riverse*10+Lastdigit;
            n=n/10;
        }
        //System.out.println(Lastdigit);
    }
}
