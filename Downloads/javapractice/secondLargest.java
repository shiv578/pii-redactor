import java.util.*;
public class secondLargest {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums =  new ArrayList<>();
        System.out.print("Enter the size of the array:  ");
        int n = scanner.nextInt();

        for( int i = 0 ; i < n ; i++){
                  System.out.print("Now enter the value of  : " + i + " :- ");
    nums.add(scanner.nextInt());
        }
int temp = nums.get(0);
int second = 0;
        for(int i = 0 ;i <n ; i++){
if(nums.get(i) > temp){
    second = temp;
    temp = nums.get(i);
}
        }

         System.out.println("Larget element in this is : " + temp);
         System.out.println("And second largest element in this is:  " + second);



    }
}
