/*
Требуется посчитать сумму целых чисел, расположенных между числами 1 и N включительно.

Входные данные
В единственной строке входного файла INPUT.TXT записано единственное целое число N, не превышающее по абсолютной величине 104.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел, расположенных между 1 и N включительно.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int result = 0;
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        System.out.println(result);
    }
}