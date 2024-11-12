import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней");
        int rasxod = scanner.nextInt();

        int size = rasxod;
        int array [] = new int[size];

        for (int i = 0; i < size; i++) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Введите расходы");
            int value = scanner2.nextInt();
            array[i] = value;
        }

        System.out.print (Arrays.toString(array));
            System.out.print ("Сумма" + array[i]);
        }
    }
}
