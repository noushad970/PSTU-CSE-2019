import java.util.Scanner;
public class twelve_12 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String x1=s.nextLine();
        System.out.println("Enter the 2nd string: ");
        String x2=s.nextLine();
        boolean ans=true;
        int j=x2.length()-1;
        for(int i=x1.length()-1;i>=0;i--) {
            if(j==-1) {
                break;
            }
            if(x1.charAt(i)!=x2.charAt(j)) {
                ans=false;
            }
            j--;
            
        }
        System.out.println(ans);
    
}
}
