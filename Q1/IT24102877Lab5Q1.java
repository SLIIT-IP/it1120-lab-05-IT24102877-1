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
            
             int smallest = num1;
             int largest = num1;
        
       
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        if (num3 > largest) {
            largest = num3;
        }
             System.out.println("The smallest number is "+ smallest);
             System.out.println("The largest number is "+ largest);
        
        }
   }
        
        
        
        