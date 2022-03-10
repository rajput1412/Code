package sebone2;

public class acur {
	
	public static void getchar(String str, char val) {
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)==val) {
				
				count++;
			}
			System.out.println(val+":"+count);
		}
	}
	public static void main(String [] args){
		
		String str="I Love India";
		//getchar(str,'o');
	}

}
