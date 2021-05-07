package pelindrome;

public class PelindromeFunction {

	
	public static int pelindrome(int number) {
		int sum=0;
		int product=1;
		int pelindrome=0;
		int temp=number;
		int index=1;
		
		while(temp>0) {
			
		int  temp1=temp%10;
		   pelindrome=pelindrome+temp1*index;
			sum=sum+temp1;
			product=product*temp1;
		
		index=index*10;
		temp=temp/10;
				}
		
	if(number==pelindrome) {
		return sum;
	}else {
		return product;
	}
		
		
	}
	public static void main(String[] args) {
		int number=123;
		System.out.println(pelindrome(number));
	}
	
	
}
