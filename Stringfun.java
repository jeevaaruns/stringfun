import java.util.Scanner;

public class Stringfun{
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the no.of Characters in your String : ");
        int n = scn.nextInt();
        
        System.out.println("Enter the String : ");
        scn.nextLine();
        String original = scn.nextLine();
        
        System.out.println("Original String : " + original);
        
        String reverse = new StringBuilder(original).reverse().toString();
        
        System.out.println("Reversed String : " + reverse);
        
        System.out.println("Concatenated String " + original + "(" + reverse +")");
        
        
    }
}

