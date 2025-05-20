import java.util.Scanner;

public class five_4 {
 public static void main(String[] args) {
    
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the length of array: ");
    int n=s.nextInt();
    int[] a= new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();
    }
    int x=0;
    for(int i=0;i<n;i++)
    {
        if(a[i]==10)
        x++;
    }
    if(a.length<2)
    System.out.println("False");
    else if(a[0]==10 || a[a.length-1]==10)
    System.out.println("True");
    else
    System.out.println("False");
 }   
}
