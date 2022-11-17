package com.xworkz.copy;

public class Apttitude {

	public static void main(String[] args) {
		
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print("$ ");
			}
			System.out.println();
		}

	




for(int i=1;i<=n;i++)
{
	for(int j=n-1;j>=i;j--) 
	{
		System.out.print(" ");
	}
	
	for(int k=1;k<=i;k++)
	{
		System.out.print(k+ " ");
	}
	System.out.println();
}





for(int i=1;i<=n;i++)
{
	for(int j=n-1;j>=i;j--) 
	{
		System.out.print(j);
	}
	
	for(int k=1;k<=i;k++)
	{
		System.out.print(k);
	}
	System.out.println();
}





for(int i=1;i<=n;i++)
{
	for(int j=n-1;j>=i;j--) 
	{
		System.out.print(i);
	}
	
	for(int k=1;k<=i;k++)
	{
		System.out.print(i);
	}
	System.out.println();
}





for(int i=1;i<=n;i++)
{
	for(int j=n-1;j>=i;j--) 
	{
		if(j==2) {
			System.out.print("manu");
		}else {
		System.out.print(j);
	}
	
	for(int k=1;k<=i;k++)
	{
		if(k==2) {
			System.out.print("manu");
		}else {
	}
		System.out.print(k);
	}
	System.out.println();
}

}
	






for(int i=n;i>=1;i--)
{
	for(int j=n-1;j>=i;j--) 
	{
		System.out.print(" ");
	}
	
	for(int k=1;k<=i;k++)
	{
		System.out.print("#");
	}
	System.out.println();
}
}
}


