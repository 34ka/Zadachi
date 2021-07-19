package Zadachi;

/*
https://acmp.ru/index.asp?main=tasks&str=%20&page=0&id_type=13
ЗАДАЧА 8
Арифметика

Во входном файле INPUT.TXT записаны три натуральных числа A, B и C через пробел. Числа A и B , а C.

В выходной файл нужно вывести YES в том случае, если A*B=C и вывести NO в противном случае.
 */

public class Arithmetic8 {
    static int a = 2;
    static int b = 2;
    static int c = -251511512;

    public static void main(String[] args) {
        if (a * b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
