

import java.util.*;
public class sortArray {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums =  new ArrayList<>();
        System.out.print("Enter the size of the array:  ");
        int n = scanner.nextInt();


        for( int i = 0 ; i < n  ; i++){
                  System.out.print("Now enter the value of  : " + i + " :- ");
    nums.add(scanner.nextInt());
        }
Collections.sort(nums);
for( int i = 0 ; i < n ; i++){
    System.out.print(nums.get(i));
}


    }
}
