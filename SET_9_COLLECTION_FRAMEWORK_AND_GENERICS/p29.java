import java.util.*;

public class p29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Enter 5 marks:");
        for(int i = 0; i < 5; i++) {
            marks.add(sc.nextInt());
        }

        System.out.println("Marks:");
        for(int m : marks) {
            System.out.println(m);
        }

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}
