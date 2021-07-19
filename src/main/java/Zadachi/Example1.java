package Zadachi;

import java.util.*;
import java.io.*;

/*
https://acmp.ru/index.asp?main=tasks&str=%20&page=0&id_type=13
ЗАДАЧА 1
A+B
 */

public class Example1 {



        public static void main(String[] argv) throws IOException{
            new Example1().run();
        }
        PrintWriter pw;
        Scanner sc;
        public void run() throws IOException{
            sc = new Scanner(new File("input.txt"));
            int a=sc.nextInt(), b=sc.nextInt();
            pw = new PrintWriter(new File("output.txt"));
            pw.print(a+b);
            pw.close();



    }
}
