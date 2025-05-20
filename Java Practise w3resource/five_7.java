import java.util.Scanner;
public class five_7 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
    
    int[][] a= new int[2][3];
    for(int i=0;i<2;i++)
    {
    for(int j=0;j<3;j++)
    a[i][j]=s.nextInt();    
    }
    System.out.println("["+a[0][0]+","+a[1][2]+"]");
    }
    
}
