/*  1 
    2 3 
    4 5 6 
    7 8 9 10 
    11 12 13 14 15  */
package k;
import java.util.Scanner;
public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		int c=1;
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(c+" ");
				c++;
			}
		System.out.print("\n");
		}
	}
}