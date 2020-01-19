
package srednjavrednosttribroja;

import java.util.Scanner;

public class SrednjaVrednostTriBroja {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b,c;
        double prosek;
        System.out.println("Uneste tri broja: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        prosek = (a +b +c)/3.0;
        
        System.out.println("Srednja vrednost tri broja je: "+ prosek);
         
    }
    
}
