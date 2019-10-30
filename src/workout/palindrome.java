package workout;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*int	a=n%10;
	int reverse1=reverse+a;System.out.println(reverse1);
	n=n/10;
	int b=n%10;
	int reverse2=reverse1+b;System.out.println(reverse2);
	n=n/10;
	int c=n%10;
	int reverse3=reverse2+c;System.out.println(reverse3);*/
	
 int n=153;
 int  temp=n;
 int reverse=0;
 while(n>0)
 {
 
 reverse=reverse*10+n%10;
 System.out.println(reverse);
 n=n/10;

 }
 if(temp==reverse)
 {
	 System.out.println("palindrom");
 } else if(reverse!=0)
 {
	 System.out.println("not palindrom");
 }
	}
}
