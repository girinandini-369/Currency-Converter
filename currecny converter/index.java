import java.util.*;
public class index
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to Currency Converter");
    System.out.println("Enter amount in INR:");
    double amt=sc.nextDouble();
    System.out.println("Select currency to convert to: ");
    System.out.println("1.USD(US Dollar\n2.EUR(Euro)\n3.JPY(Japanese Yen)\n4.GBP(British Pound)\n5.AUD(Australlian Dollar)");
    int cur=sc.nextInt();
    double ans=0;
    switch (cur) {
        case 1:
         double ex1=0.012;
          ans=amt*ex1;
         System.out.println("Convert amount in USD:"+ans);
         break;

         case 2:
         double ex2=0.011;
         ans=amt*ex2;
         System.out.println("Convert amount in EUR:"+ans);
         break;

         case 3:
         double ex3=1.71;
         ans=amt*ex3;
         System.out.println("Convert amount in JPY:"+ans);
         break;

         case 4:
         double ex4=0.0094;
         ans=amt*ex4;
         System.out.println("Convert amount in GBP:"+ans);
         break;

         case 5:
         double ex5=0.018;
         ans=amt*ex5;
         System.out.println("Convert amount in AUD:"+ans);
         break;
    
        default:
            break;
    }
    sc.close();
}
}
