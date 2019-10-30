package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// every iteration find the smallest element
		//smallest element moved to the first position
		int a[]= {22,4,67,89,11,56};int j=0;
	while(j<a.length-1)
	{
		int i=0;
		
		while(i<a.length-1)
		{
			if(a[i+1]<a[i])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				}
			i++;
			}
		j++;
		}
	for (int k=0;k<a.length;k++)
	{
	System.out.println(a[k]);	
	}

}}
