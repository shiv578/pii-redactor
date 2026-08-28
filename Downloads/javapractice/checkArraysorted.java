import java.util.*;
public class checkArraysorted {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums =  new ArrayList<>();
        System.out.print("Enter the size of the array:  ");
        int n = scanner.nextInt();

        for( int i = 0 ; i < n  ; i++){
                  System.out.print("Now enter the value of  : " + i + " :- ");
    nums.add(scanner.nextInt());
        }

        for(int i = 1 ;i <n ; i++){
if(nums.get(i - 1) > nums.get(i)){
    System.out.print("UNsorted");
    return;


            }
}
        

       System.out.println("Sorted");


    }
}
