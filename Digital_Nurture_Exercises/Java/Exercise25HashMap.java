import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();

        System.out.println("Enter student ID and name (type -1 to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            if (id == -1) break;
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            students.put(id, name);
        }

        System.out.print("Enter an ID to search: ");
        int searchId = sc.nextInt();
        String result = students.get(searchId);

        if (result != null) {
            System.out.println("Name: " + result);
        } else {
            System.out.println("Student not found.");
        }
    }
}
