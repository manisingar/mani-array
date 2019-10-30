package sorting;

public class Reversenumber {

	public static void main(String[] args) {
		//REVERSE NUMBER IN ARRAY(right)
		int a[]= {22,4,67,89,11,56};
		int i=a.length-1;
		int temp=a[i];
		while(i>0)
		{
		
		a[i]=a[i-1];
		System.out.println(a[i]);
		i--;
		}
		a[i]=temp;
		System.out.println(a[i]);
		

	}

}