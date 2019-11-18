import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHome {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileInputStream(".idea/file"))) {
            while (scanner.hasNextLine()) {
                strings.add(scanner.nextLine());
            }
            System.out.println("Список строк " + strings);

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка! Файл не найден");
        }

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Исходный список " + numbers);

        try {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    numbers.remove(i);
                    i--;
                }
            }
            System.out.println("Список, после удаления четных чисел " + numbers);

            ArrayList<Integer> uniqueNumbers = new ArrayList<>();

            for (Integer n : numbers) {
                if (!uniqueNumbers.contains(n)) {
                    uniqueNumbers.add(n);
                }
            }
            System.out.print("Список, содержащий уникальные числа " + uniqueNumbers);

        } catch (NullPointerException e) {
            System.out.println("Ошибка! Значения списка не должны = null");
        }
    }
}
