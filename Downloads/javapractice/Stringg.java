import java.util.ArrayList;

class Stringg {
    public static void main(String args[]) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(6);
        li.add(4);
        li.add(0);

        li.add(7);
        li.add(8);
        long k = li.stream().filter(x -> x % 2 == 0).sorted().count();
        System.err.println(k);
    }

}