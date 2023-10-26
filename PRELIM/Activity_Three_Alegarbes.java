import java.util.Scanner;

 public class Activity_Three_Alegarbes{
 
    final static double C1Price = 109.00;
    final static double C2Price = 153.00;
    final static double C3Price = 250.00;
    final static double C4Price = 499.00;
    final static double C5Price = 699.00;
    final static double pesoDollar = 56.00;
 
 public static void main(String[] args){
  System.out.println("Menu Selection");
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Selected Orders: ");
   int numberofC1 = sc.nextInt();
   
   System.out.println("Selected Orders: ");
   int numberofC2 = sc.nextInt();
   
   System.out.println("Selected Orders: ");
   int numberofC3 = sc.nextInt();
   
   System.out.println("Selected Orders: ");
   int numberofC4 = sc.nextInt();
   
   System.out.println("Selected Orders: ");
   int numberofC5 = sc.nextInt();
   
   System.out.println("C1 Total Price: "+numberofC1);
   System.out.println("C2 Total Price: "+numberofC2);
   System.out.println("C3 Total Price: "+numberofC3);
   System.out.println("C4 Total Price: "+numberofC4);
   System.out.println("C5 Total Price: "+numberofC5);
   
   double C1Price = numberofC1Price *C1Price;             
        }
}