import java.util.Scanner;

public class Seven_Dwarves {

	public static void main(String[] args) {
		int n1,n2,n3,n4,n5,n6,n7,n8,n9,sum;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Num 1 : ");
		n1 = scan.nextInt();
		System.out.print("Enter Num 2 : ");
		n2 = scan.nextInt();
		System.out.print("Enter Num 3 : ");
		n3 = scan.nextInt();
		System.out.print("Enter Num 4 : ");
		n4 = scan.nextInt();
		System.out.print("Enter Num 5 : ");
		n5 = scan.nextInt();
		System.out.print("Enter Num 6 : ");
		n6 = scan.nextInt();
		System.out.print("Enter Num 7 : ");
		n7 = scan.nextInt();
		System.out.print("Enter Num 8 : ");
		n8 = scan.nextInt();
		System.out.print("Enter Num 9 : ");
		n9 = scan.nextInt();
		sum = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9;
		
		if(sum-(n9+n8)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n7);
			}
		else if(sum-(n9+n7)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n8);
			}
		else if(sum-(n9+n6)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5+"\n"+n7+"\n"+n8);
			}
		else if(sum-(n9+n5)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n6+"\n"+n7+"\n"+n8);
			}
		else if(sum-(n9+n4)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n5+"\n"+n6+"\n"+n7+"\n"+n8);
			}
		else if(sum-(n9+n3)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n7+"\n"+n8);
			}
		else if(sum-(n9+n2)==100)
			{
				System.out.println(n1+"\n"+n3+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n7+"\n"+n8);
			}
		else if(sum-(n9+n1)==100)
			{
				System.out.println(n2+"\n"+n3+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n7+"\n"+n8);
			}
		else if(sum-(n8+n7)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n9);
			}
		else if(sum-(n8+n6)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n8+n5)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n6+"\n"+n7+"\n"+n9);
			}
		else if(sum-(n8+n4)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n5+"\n"+n6+"\n"+n7+"\n"+n9);
			}
		else if(sum-(n8+n3)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n7+"\n"+n9);
			}
		else if(sum-(n8+n2)==100)
			{
				System.out.println(n1+"\n"+n3+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n7+"\n"+n9);
			}
		else if(sum-(n8+n1)==100)
			{
				System.out.println(n2+"\n"+n3+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n7+"\n"+n9);
			}
		else if(sum-(n7+n6)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n7+n5)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n6+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n7+n4)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n5+"\n"+n6+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n7+n3)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n7+n2)==100)
			{
				System.out.println(n1+"\n"+n3+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n7+n1)==100)
			{
				System.out.println(n2+"\n"+n3+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n6+n5)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n6+n4)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n5+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n6+n3)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n4+"\n"+n5+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n6+n2)==100)
			{
				System.out.println(n1+"\n"+n3+"\n"+n4+"\n"+n5+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n6+n1)==100)
			{
				System.out.println(n2+"\n"+n3+"\n"+n4+"\n"+n5+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n5+n4)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n6+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n5+n3)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n4+"\n"+n6+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n5+n2)==100)
			{
				System.out.println(n1+"\n"+n3+"\n"+n4+"\n"+n6+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n5+n1)==100)
			{
				System.out.println(n2+"\n"+n3+"\n"+n4+"\n"+n6+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n4+n3)==100)
			{
				System.out.println(n1+"\n"+n2+"\n"+n5+"\n"+n6+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n4+n2)==100)
			{
				System.out.println(n1+"\n"+n3+"\n"+n5+"\n"+n6+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n4+n1)==100)
			{
				System.out.println(n2+"\n"+n3+"\n"+n5+"\n"+n6+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n3+n2)==100)
			{
				System.out.println(n1+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n3+n1)==100)
			{
				System.out.println(n2+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else if(sum-(n2+n1)==100)
			{
				System.out.println(n3+"\n"+n4+"\n"+n5+"\n"+n6+"\n"+n7+"\n"+n8+"\n"+n9);
			}
		else
			{
				System.out.println("Error");
			}

	}

}
