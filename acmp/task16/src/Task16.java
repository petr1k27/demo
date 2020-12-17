/*
Лесенкой называется набор кубиков, в котором каждый более верхний слой содержит кубиков меньше, чем предыдущий.
Требуется написать программу, вычисляющую число лесенок, которое можно построить из N кубиков.

Входные данные
Во входном файле INPUT.TXT записано натуральное число N (1 ≤ N ≤ 100) – количество кубиков в лесенке.

Выходные данные
В выходной файл OUTPUT.TXT необходимо вывести число лесенок, которые можно построить из N кубиков.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task16 {
    
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        counter(1, n);
        System.out.println(count);

    }

    static void counter(int x, int y) {
        for (int i = x; i <= y; i++) {
            counter(i + 1, y - i);

        }
        if (y == 0) {
            count++;
        }

    }
}
