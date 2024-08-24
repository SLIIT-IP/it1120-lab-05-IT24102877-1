import java.util.Scanner;
    public class IT24102877Lab5Q1{
        public static void main (String[] args){
             int num1,num2,num3;
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter the first integer :-");
             num1 = sc.nextInt();
             System.out.print("Enter the second integer :-");
             num2 = sc.nextInt();
             System.out.print("Enter the third integer :-");
             num3 = sc.nextInt();
             System.out.println();
            
        if(num1 < num2){
             System.out.println("The largest number is :-"+num2);
        }
        else{
            System.out.println("The smallest number is :-"+num2);
        }
        if(num2 < num3){
             System.out.println("The largest number is :-"+num3);
        }
        else{
            System.out.println("The smallest number is :-"+num3);
        }
        
        }
   }
        
        
        
        