
package javaapplication6;
import java.util.Scanner;
import java.lang.String ;

public class JavaApplication6 {


    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("jepni emrin qe doni te beni uppercase");
String numer = sc.nextLine();
System.out.println("emri juaj upper case eshte ");

String  numer1 = numer.toUpperCase();
System.out.println(numer1);
  System.out.println("emri pas zv te shkronjes a me s eshte :");
 
   numer= numer.replace("a","s");
   System.out.println(numer);
   
    }}   
   


    
