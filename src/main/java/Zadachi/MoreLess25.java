package Zadachi;

/*
https://acmp.ru/index.asp?main=tasks&str=%20&page=0&id_type=13
ЗАДАЧА №25
Больше-меньше
 */


public class MoreLess25 {
    public static void main(String[] args) {

        int a = -3;
        int b = -10;

        if(a>b) {
            System.out.println(">");
        } else if (a<b) {
            System.out.println("<");
        } else if (a==b) {
            System.out.println("=");
        }
    }
}
