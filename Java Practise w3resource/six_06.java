import java.util.Scanner;

import javax.sound.midi.Soundbank;

import org.xml.sax.SAXException;

public class six_06 {
    public static void main(String[] args) {
        int[] a={1,3,4,5,7,8,9};
        int[] b = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i]<<1;
        }
        System.out.println("The original array is : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");       
         }
         System.out.println();
         System.out.println("The left shifted array is:");
         for(int i=0;i<a.length;i++)
        {
            System.out.print(b[i]+" ");       
         }
    }
}
