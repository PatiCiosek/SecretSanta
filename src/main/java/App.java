import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("pls enter your full name to join");
          String name;

        do{
            System.out.println("input name");
            name = sc.nextLine();
            names.add(name);
            System.out.println("do you want to add another one?");
        } while (!Objects.equals(sc.nextLine(), "no"));

        System.out.println(names);
    }
}
