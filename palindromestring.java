package sebone2;

public class palindromestring {
	boolean ispalidrome(char [] s,int l,int r)
	{
  		if(l>=r)
  			return true;
  		if(s[l]!=s[r])
  			return false;
  		return ispalindrome(s,l+1,r-1);
	}
	
	
	
	
	
	public static void main(String args[]){
		char s[]="aba";
		int l,r;
		
		ispalidrome(s,0,2);
		
		if(ispalidrome( s , l, r))
			System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrome");
		
	}
		

}
