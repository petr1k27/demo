/*
Входные данные
Во входном файле INPUT.TXT записаны три натуральных числа A, B и C через пробел. Числа A и B ≤ 102, а C ≤ 106.

Выходные данные
В выходной файл нужно вывести YES в том случае, если A*B=C и вывести NO в противном случае.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] array = s.split(" ");
        if (Integer.parseInt(array[0]) * Integer.parseInt(array[1]) == Integer.parseInt(array[2])) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
