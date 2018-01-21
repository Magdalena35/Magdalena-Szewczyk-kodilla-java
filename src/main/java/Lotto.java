import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        while (set.size() < 6) {
            set.add(scanner.nextInt());

        }
        System.out.println(set);
        HashSet<Integer> wylosowane = new HashSet<Integer>();
        Random random = new Random();
        while (wylosowane.size() < 6) {
            wylosowane.add(random.nextInt(50) + 1);

        }
        System.out.println(wylosowane);
        int licznik = 0;
        for (Integer liczba : set) {
            if (wylosowane.contains(liczba)) {
                licznik++;
            }

        }
        System.out.println(licznik);
    }
}

