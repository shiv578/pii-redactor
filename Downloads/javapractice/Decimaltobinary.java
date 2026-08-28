
import java.util.*;
public class Decimaltobinary {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your no: ");
        int input = scanner.nextInt();
        int power = 0;
int ans = 0;
        while(input > 0){
            int rem = input % 10;
          ans +=(int) (Math.pow(2,power) * rem);
          input /= 10;
          power++;

        }
            System.out.println("Biary form is " + ans);
scanner.close();
    }

}
