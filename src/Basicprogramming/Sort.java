package Basicprogramming;

public class Sort {

	public static void main(String[] args) {
	
		int a[]= {12,56,10,9,76,82};

	
	 int i=0; 
		while(i<a.length-1) 
	{    
			int temp=a[i];
			if(a[i+1]<a[i])
			{
				
				
				a[i]=a[i+1];
				System.out.println(a[i]);
				a[i+1]=temp;
				System.out.println(a[i+1]);
				
				//System.out.println(a[i]);
			}
		      i++;
		      //System.out.println(a[i+1]);
		}
		
    

}}
