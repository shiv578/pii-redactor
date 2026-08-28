

import java.util.*;
public class removeDuplicatefromsortedarray {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums =  new ArrayList<>();
        System.out.print("Enter the size of the array:  ");
        int n = scanner.nextInt();

        TreeSet<Integer> s = new TreeSet<>();

        for( int i = 0 ; i < n  ; i++){
                  System.out.print("Now enter the value of  : " + i + " :- ");
    nums.add(scanner.nextInt());
        }
//suppose array element are 1  1 +2 2 3 3 4 5;   out put should be 12345
for(int i = 0 ; i <n; i++){
    s.add(nums.get(i));
}
    System.out.print("Here is your array " );

for(int x : s){
    System.out.print( x + " ");
}
    }
}
