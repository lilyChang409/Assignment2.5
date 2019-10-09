import java.util.Scanner;
public class assignment4_7
{
public static void main (String[] args){
     String y="yes";
         String x="yes";
         int i;
         int e=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("how many D6 do you want to roll?");
    int b=sc.nextInt();
   System.out.println("How many sides do these dice have? ");
    int side=sc.nextInt();
    while((y.equals("yes"))&&b<11){
    for( i=0;i<b;i++){
    int d=rollDie(side);
    System.out.print(+d+" ");
    e=e+d;
    } y="no";
      System.out.println("");
    System.out.println("Total is" +" "+e);
    e=0;
}
 System.out.println("Try again? [yes, no]");
String c=sc.next();
while(c.equals("yes")&&x.equals("yes")){
        y="yes";
       System.out.println("how many D6 do you want to roll?");
    b=sc.nextInt();
     System.out.println("How many sides do these dice have? ");
      side=sc.nextInt();
      while((y.equals("yes"))&&b<11){
    for( i=0;i<b;i++){
    int d=rollDie(side);
    System.out.print(+d+" ");
    e=e+d;
    } y="no";
    System.out.println("");
     System.out.println("Total is" +" "+e);
    e=0;
System.out.println("Try again? [yes, no]");
 c=sc.next();
}
     }
System.out.println("ByeBye");
}
public static int rollDie(int side){
    return (int) (Math.random()*side)+1;
}
}







    



