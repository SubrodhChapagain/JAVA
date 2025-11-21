

public class Mathoperator
{
    public static void main (String[]args){
        
         System.out.println("1.ARITHMATIC");
         System.out.println();
         
        int a= 10;
        int b= 5;
        int sum = a+b;
        int sub = a-b;
         float div = a/b;
         int rem = a%b;
         int mul = a*b;
         System.out.println("sum is "+sum);
         System.out.println("substraction is "+sub);
         System.out.println("division "+div);
         System.out.println("reminder is "+rem);
         System.out.println("multiplication is "+mul);
         
         System.out.println();
         System.out.println("2.UNARY");
         System.out.println();
         int x= 5;
          System.out.println("pre increment"+ ++x);
          System.out.println(x);
          System.out.println("post increment"+ x++);
          System.out.println(x);
          System.out.println();
          
          System.out.println("3.ASSIGNMENT");
          System.out.println();
          int s=4;
          int f = 5;
          int c = s+f; // here "=" is assignment operator.
          System.out.println();
          
          System.out.println("4.RELATIONAL");
          System.out.println();
          System.out.println(a>b); // a=10 and b=5
          System.out.println(a>=b);
          System.out.println(a<b);
          System.out.println(a<=b);
          System.out.println(a!=b);
          System.out.println(a==b);
          System.out.println(a==a);
          System.out.println();
          
          System.out.println("5.TERNARY");
          System.out.println();
          String n = (a>b)? "A IS GREATER": "B IS GREATER";
          System.out.println(n);
          
          
          
          
          
          
         
         
         
         
    
    
    }
}