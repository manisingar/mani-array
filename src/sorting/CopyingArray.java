package sorting;

public class CopyingArray {

	public static void main(String[] args)
	{
		//COPY NUMBER IN ARRAY
		int a[]= {5,10,15,20,25};int j=0;
	while(j<a.length)
	{
		 int i=0;
		 int temp=a[i];
		while(i<a.length-1)
		{
	
		a[i]=a[i+1];
		i++;
		a[i]=temp;
			}
		//a[i]=temp;	
	j++;
	     System.out.println(a[i]);
	}}}

