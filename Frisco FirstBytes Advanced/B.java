import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        while(len != 0) {
            in.nextLine();
            String[] people = new String[len];
            for(int i = 0; i < len; i++) {
                people[i] = in.nextLine();
            }

            for(int i = 0; i < len; i++) {
                for(int x = i + 1; x < len; x++) {
                    if(people[i].charAt(0) > people[x].charAt(0) || (people[i].charAt(0) == people[x].charAt(0) && people[i].charAt(1) > people[x].charAt(1))) {
                        String tmp = people[i];
                        people[i] = people[x];
                        people[x] = tmp;
                    }
                }
            }

            for(String s : people) {
                System.out.println(s);
            }
            System.out.println();

            len = in.nextInt();
        }
    }
}
