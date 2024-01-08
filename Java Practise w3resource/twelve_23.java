import java.util.Scanner;

public class twelve_23
{
    
    public static void main(String[] args) {
    Scanner S= new Scanner(System.in);
    System.out.println("Enter 1st string :");
    String str1 = S.nextLine();
    System.out.println("Enter 2nd string :");
    String str2 = S.nextLine();
    System.out.println("Enter 1st string starting index:");
    int f1=S.nextInt();
    System.out.println("Enter 1st string ending position index:");
    int l1=S.nextInt();
    System.out.println("Enter 2nd string starting index:");
    int f2=S.nextInt();
    System.out.println("Enter 2nd string ending position index:");
    int l2=S.nextInt();
    if(Math.abs(l1-f1)!=Math.abs(l2-f2))
    {
     System.out.println("str1["+f1+"-"+l1+"] == "+"str2["+f2+"-"+l2+"]?"+"false");
   
    
    }
    else{
    boolean answer =true;
    int j=f2;
    for(int i=f1;i<=l1;i++){
        
        if(str1.charAt(i)!=str2.charAt(j)){
            answer=false;
            break;
        }
        j++;
    }
    System.out.println("str1["+f1+"-"+l1+"] == "+"str2["+f2+"-"+l2+"]? "+answer);
    }
    
}
}