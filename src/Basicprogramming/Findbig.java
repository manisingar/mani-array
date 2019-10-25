package Basicprogramming;

public class Findbig {

	public static void main(String[] args) {
		// Find biggest element in array
		int temp1=0,temp2=0;
		int a[]= {32,56,78,65,89,76};
	int i=0;
	while(i<a.length-1)
		if(a[i]>temp1)
		{
			temp1=temp2;
			a[i]=temp2;
		}else if(a[i]>temp2)
		{
			a[i]=temp2;
		}
		

	}

}
