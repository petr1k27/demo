/*
Входные данные
В первой строке входного файла INPUT.TXT записано единственное число N – количество элементов целочисленного массива (1 ≤ N ≤ 100).
Вторая строка содержит N чисел, представляющих заданный массив.
Каждый элемент массива – натуральное число от 1 до 31. Все элементы массива разделены пробелом.

Выходные данные
В первую строку выходного файла OUTPUT.TXT нужно вывести числа, которые соответствуют дням месяцев, в которые Вася получил тройки,
а во второй строке соответственно расположить числа месяца, в которые Вася получил четверки.
В третьей строке нужно вывести «YES», если Вася может рассчитывать на четверку и «NO» в противном случае.
В каждой строчке числа следует выводить в том же порядке, в котором они идут во входных данных.
При выводе, числа отделяются пробелом.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String s = reader.readLine();
        String[] array = s.split(" ");
        int count_3 = 0;
        int count_4 = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(array[i]) % 2 != 0) {
                System.out.print(array[i] + " ");
                count_3++;
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(array[i]) % 2 == 0) {
                System.out.print(array[i] + " ");
                count_4++;
            }
        }

        if (count_3 > count_4) {
            System.out.print("\nNO");
        } else {
            System.out.print("\nYES");
        }
    }
}
