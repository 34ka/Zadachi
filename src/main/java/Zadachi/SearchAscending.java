package Zadachi;

/*
Условие. Есть массив целых цисел int, размерность 10-15.
Моя задача  написать метод или функцию, которая отсортирует массив в порядке возрастания
int [] massive = new int [] {12, 3 0, 111, 535, 6,}
public int[] sort(int[] massive) {
}
открыть пузырковый алгоритм и посмотреть

 */

public class SearchAscending {
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

    public static void main(String[] args) {
        SearchAscending mas = new SearchAscending();
        int [] massive = new int [] {12, 30, 111, 535, 6, 124, 3455, 3, 1, 5679876, 53525, 35, 15, 35, 79};
        mas.sortirovka(massive);

            for (int i = 0; i < 15; i++) {
                System.out.print(massive[i]);
                if (i < 14) {
                    System.out.print(", ");
                }

            }
    }

}