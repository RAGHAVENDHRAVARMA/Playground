import java.util.*;
public class Main
{
	public static void left_rotate(int arr_size,int a[],int rotations)
	{
	    int first=1;
	    int last;
	    if(arr_size%2==0)
	    {
	        last=arr_size-1;
	    }
	    else
	    {
	        last=arr_size-2;
	    }
	    for(int r=1;r<=rotations;r++)
	    {
	        int temp=a[first];
	        for(int i=3;i<arr_size;i=i+2)
	        {
	            a[i-2]=a[i];
	        }
	        a[last]=temp;
	 
	    }
	}
	public static void right_rotate(int arr_size,int a[],int rotations)
	{
	    int first_r=0;
	    int last_r;
	    if(arr_size%2==1)
	    {
	        last_r=arr_size-1;
	    }
	    else
	    {
	        last_r=arr_size-2;
	        
	    }
	    for(int r1=1;r1<=rotations;r1++)
	    {
	        int temp=a[last_r];
	        for(int index=(last_r-2);index>=0;index=index-2)
	        {
	            a[index+2]=a[index];
	        }
	        a[first_r]=temp;
	    }
	    
	}
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int index = 0; index < (arr_size); index++)
        {
            arr[index] = in.nextInt();
        }
        int rotations= in.nextInt();
        left_rotate(arr_size, arr, rotations);
        right_rotate(arr_size, arr, rotations);
    
    for(int index = 0; index < (arr_size ); index++)
        {
            System.out.print(arr[index]+" ");
        }
   
}
}
