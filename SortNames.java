import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String name;

        System.out.println("Enter names (type 'done' when finished):");
        while (!(name = scanner.nextLine()).equalsIgnoreCase("done")) {
            names.add(name);
        }

        System.out.print("Order (A/D): ");
        String order = scanner.nextLine().trim();

        Collections.sort(names, order.equalsIgnoreCase("D") ? Collections.reverseOrder() : null);
        
        names.forEach(System.out::println);
        scanner.close();
    }
}