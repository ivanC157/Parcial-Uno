
package temperatura;

import java.util.Scanner;


public class Temperatura {

    public static int C; 
    public static double F , K, R;        
    public static void main(String[] args) {
      Scanner ac = new Scanner(System.in);  
      
      do{
        System.out.println("Dame los grados Centigrados: ");
        C=ac.nextInt();
      }while(C<-273 || C>1000);
      
       F=(int)(C*33.8); 
       K=(int)(C*274.15);
       R=(int)(C*0.80);
        
       System.out.println("Fahrenheit: " + F + " " + "Kelvin: " + K + " " + "Reaumur: " + R);
       
       
       
       
    }
    
}
