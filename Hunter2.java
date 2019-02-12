import java.util.*;
import java.io.*;
 class Hunter2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n<=0)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		int arr[]=new int[n];
		int i=0;
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		quicksort(arr,0,n-1);
		int num=0;
		for (i=n-1;i>=0;i--)
			num=(num*10)+arr[i];
		System.out.println(num);
	}
	public static void quicksort(int arr[],int l,int m)
	{
		if(l<m)
		{
		int q=partition(arr,l,m);
		quicksort(arr,l,q-1);
		quicksort(arr,q+1,m);
	}
}
	public static int partition(int arr[],int l,int m)
	{
		int i=l-1;
		int pivot=arr[m];
		for (int j=l;j<m;j++)
			{
				
				if(arr[j]<pivot)
				{
					i++;
					swap(arr,i,j);
				}

			}
			swap(arr,i+1,m);
			return i+1;

	}
	public static void swap(int arr[],int x,int y)
	{
		int t=arr[x];
		arr[x]=arr[y];
		arr[y]=t;
	}
}