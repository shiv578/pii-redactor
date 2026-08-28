import java.util.*;

public class Main {
    public static void  main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int input = obj.nextInt();
int binary = 0;
while(input > 0 ){
    int rem = input % 2;
    binary = binary * 10 + rem;
    input /= 2;
}
int ans = 0 ;
while(binary > 0 ){
int rem = binary % 10;
ans = ans * 10 + rem;
binary /= 10;
}


        System.out.println("Your binary no is: " + ans);
    }
}
