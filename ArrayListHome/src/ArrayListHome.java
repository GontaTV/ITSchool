import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHome {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(new FileInputStream(".idea/file"));

        while (scanner.hasNext()) {
            numbers.add(scanner.nextInt());
        }

        System.out.print("Исходный список " + numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }

        System.out.println();
        System.out.print("Список, после удаления четных чисел " + numbers);

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();

        for (Integer n : numbers) {
            if (uniqueNumbers.indexOf(n) == -1) {
                uniqueNumbers.add(n);
            }
        }

        System.out.println();
        System.out.print("Список, содержащий уникальные числа " + uniqueNumbers);
    }
}
