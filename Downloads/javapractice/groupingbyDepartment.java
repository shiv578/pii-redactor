import java.util.*;
import java.util.stream.Collectors;

class student {

    String name, dept;

    student(String name, String dept) {
        this.name = name;
        this.dept = dept;
//write a program to partion the element by even and odd

        // tell me why you are overrifing the toString =
    }

    public String toString() {
        return name + "-->>>" + dept;
    }
}

public class groupingbyDepartment {

    public static void main(String args[]) {
        ArrayList<student> li = new ArrayList<>();

        li.add(new student("Shivam", "cse"));
        li.add(new student("satyam", "cse"));

        li.add(new student("ritik", "ece"));
        li.add(new student("vikash", "ece"));
        li.add(new student("abijit", "cse"));
            Map<String, List<student>> grouped = li.stream()
                .collect(Collectors.groupingBy(s -> s.dept));
        System.out.println(grouped);
    }
}
