package Zadachi;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class SearchAscendingTXT {
    public static int[] sortirovka(int [] massive) {
        for(int i = massive.length - 1; i > 0; i --) {
            for (int a = 0; a < i; a ++)
            {
                if( massive[a] > massive[a + 1]) {
                    int b = massive[a];
                    massive[a] = massive[a + 1];
                    massive[a + 1] = b;
                }
            }
        }
        return massive;
    }


        public static void main(String[] args) throws IOException{
            new SearchAscendingTXT().run();
        }
        PrintWriter pw;
        Scanner sc;
        public void run() throws IOException{
            sc = new Scanner(new File("input.txt"));
            //Читаем из файла строку
            String abc = sc.nextLine();
            //Форматируем эту строку в массив чисел
            int[] arr = Arrays.stream(abc.split(", ")).mapToInt(Integer::parseInt).toArray();
            //Создаём объект класса Example2
            SearchAscendingTXT mas = new SearchAscendingTXT();
            //подставляем в этот объект отформатированный массив из чисел в метод sortirovka
            mas.sortirovka(arr);// получаем на выходе отсортированный по возрастанию численный массив, из файла txt.


            pw = new PrintWriter(new File("output.txt"));
               for (int i = 0; i < arr.length; i++) {
                   pw.print((arr[i]));
                    if (i < arr.length - 1) {
                        pw.print(", ");
                    }
                }
            pw.close();
    }
}
