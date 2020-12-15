/*
Главный вождь племени Абба не умеет считать.
В обмен на одну из его земель вождь другого племени предложил ему выбрать одну из трех куч с золотыми монетами.
Но вождю племени Абба хочется получить наибольшее количество золотых монет. Помогите вождю сделать правильный выбор!

Входные данные
В первой строке входного файла INPUT.TXT записаны три натуральных числа через пробел. Каждое из чисел не превышает 10100. Числа записаны без ведущих нулей.

Выходные данные
В выходной файл OUTPUT.TXT нужно вывести одно целое число — максимальное количество монет, которые может взять вождь.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Task7 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] str = s.split(" ");

        BigInteger one = new BigInteger(str[0]);
        BigInteger two = new BigInteger(str[1]);
        BigInteger three = new BigInteger(str[2]);

        if (one.compareTo(two) == 1) {
            if (one.compareTo(three) == 1) {
                System.out.println(one.toString());
            } else System.out.println(three.toString());
        } else if (two.compareTo(three) == 1) {
            System.out.println(two.toString());
        } else System.out.println(three.toString());
    }
}
