package sebone2;
import java.util.*;

public class seb {
	
public static void main(String args[])
	{

	Scanner sc= new Scanner(System.in);
	int n=	sc.nextInt();
	int c1,r=0;

	c1=n;
	while(n!=0)
	{

	r=r*10+n%10;
	n=n/10;

	}
	if(c1==r)
	System.out.println("Given No is Palindrome");
	else
	System.out.println("Given No Is Not Palindrome");
	}

	}


