/*
Требуется сложить два целых числа А и В.

Входные данные
В единственной строке входного файла INPUT.TXT записаны два натуральных числа через пробел. Значения чисел не превышают 109.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел А и В.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Task1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] arr = s.split(" ");
        System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
    }
}