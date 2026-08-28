import java.util.*;
public class SwapNumberwithouttemp {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
System.out.print("enter A ");
int a = scanner.nextInt();
System.out.println("Enter no b: ");
int b = scanner.nextInt();

a =  a + b;
b = a - b;
a = a - b ;

System.out.println("No afte swapping are: \n" + "value of A: " + a + "\nVAlue of b: " + b);

    }
}
