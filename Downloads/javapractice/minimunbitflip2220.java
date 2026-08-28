import java.util.*;
public class minimunbitflip2220 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();
System.out.print("Enter The goal: ");
int goal = scanner.nextInt();

//suppose the number is 10 and the goal is 7 ;  10 in binary is 1010  and 7 is 111;

//so 

int xor = number ^ goal; // now the xor is having no   0111  okey so how many bit change ot the number to achive the target 3 we njust have to 
// caluvat the change bit

// right now xor is having 0111; 
//      prevous value was 1010;
int count  = 0;
while( number != 0 || xor != 0){
    int n = number % 10 ;
    int x = xor % 10;
    if(n != x){
        count++;
    }
    number /= 10;
    goal /= 10;
}
System.out.println("Ans is " + count + "Bits");

    }
}
