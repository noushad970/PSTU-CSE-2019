public class seven_12 {
    public static void main(String[] args) {
        int signedNumber1 = -10;
        int signedNumber2 = 5;

        long unsignedNumber1 = 0xFFFFFFFFL & signedNumber1; 
        long unsignedNumber2 = 0xFFFFFFFFL & signedNumber2; 

        
        if (signedNumber1 < signedNumber2) {
            System.out.println(signedNumber1 + " is less than " + signedNumber2);
        } else if (signedNumber1 > signedNumber2) {
            System.out.println(signedNumber1 + " is greater than " + signedNumber2);
        } else {
            System.out.println(signedNumber1 + " is equal to " + signedNumber2);
        }

        if (unsignedNumber1 < unsignedNumber2) {
            System.out.println(unsignedNumber1 + " is less than " + unsignedNumber2);
        } else if (unsignedNumber1 > unsignedNumber2) {
            System.out.println(unsignedNumber1 + " is greater than " + unsignedNumber2);
        } else {
            System.out.println(unsignedNumber1 + " is equal to " + unsignedNumber2);
        }
    }
}
