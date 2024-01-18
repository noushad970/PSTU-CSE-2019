import java.util.Scanner;

public class twelve_43
{
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string :");
    String str1=scanner.nextLine();
    str1.toLowerCase();
    char[] c1=str1.toCharArray();
    java.util.Arrays.sort(c1);
    String str2=new String(c1);
    //System.out.println(str2);
    int max=0;
    int j=1;
    char[] c=new char[1];
    for(int i=0;i<str2.length()-1;i++) {
    if(str2.charAt(i)==str2.charAt(i+1))
    {
        j++;
    }
    if(j>max) 
    {
        max=j;
        c[0]=str2.charAt(i);

    }
    if(str2.charAt(i)!=str2.charAt(i+1))
    {
        j=1;
    }
    }
    System.out.println("Max character: "+c[0]);
    System.out.println("Number of time: "+max);
    
}
}
