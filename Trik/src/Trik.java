import java.util.Scanner;

public class Trik {

	public static void main(String[] args) {
		int l=1,c=0,r=0,t,n;
		String swap;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input : ");
		swap = scan.next();
		for(n=0;n<swap.length();n++)
		{
			if(swap.charAt(n) == 'A' || swap.charAt(n) == 'a')
				{
					t=l;l=c;c=t;
				}
			else if(swap.charAt(n) == 'B' || swap.charAt(n) == 'b')
				{
					t=c;c=r;r=t;
				}
			else
				{
					t=l;l=r;r=t;
				}
		}
		
		if(r == 1) 
			System.out.println("Coin Right glass");
		else if(c == 1) 
			System.out.println("Coin Center glass");
		else 	
			System.out.println("Coin Left glass");
	}

}
