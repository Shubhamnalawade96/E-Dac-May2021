import java.util.Scanner;
public class Program19
 {
      public static void main(String args[])
    {
        int num, quot, i=1, j;
        int bin[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number : ");
        num = scan.nextInt();
		
        quot = num;
		
        while(quot != 0)
        {
            bin[i++] = quot%2;
            quot = quot/2;
        }
		
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin[j]);
        }
        System.out.print(" ");
    }
}