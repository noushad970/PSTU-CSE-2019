import java.util.Scanner;

public class six_21 {
   public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int r,c;
    System.out.println("Enter raw: ");
    r=s.nextInt();
    System.out.println("Enter colom: ");
    c=s.nextInt();
    int[][] a= new int[r][c];
    System.out.println("Enter total "+r*c+"value's:");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        a[i][j]=s.nextInt();
    }
    System.out.println("Enter the number you find:");
    int n1=s.nextInt();
    int ans=0;
    int rw,col;
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
       {
        if(a[i][j]==n1)
        {
            rw=i;
            col=j;
            ans++;
            break;
        }
       }
    }
    if(ans>0)
    System.out.println(n1+" is found ");
    else 
    System.out.println("Not found");
    
    
   } 
}
