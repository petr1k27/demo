/*
Входные данные
В единственной строке входного файла INPUT.TXT записано одно натуральное число А, оканчивающееся на цифру 5, не превышающее 4*105.

Выходные данные
В выходной файл OUTPUT.TXT выведите одно натуральное число - A2 без лидирующих нулей.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        if (x == 5) {
            System.out.println(25);
        } else {
            x /= 10;
            x *= x + 1;
            System.out.println(x + "25");
        }
    }
}
