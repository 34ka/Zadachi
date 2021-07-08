package Zadachi;

/*
{
binarySearch(30)}

public int binarySearch(int [] massive, int foundNumver) {
1, 2, 3, 5, 6, 7, 8}

Надо брать половину массива если цифра нашлась в нём, то ищем индекс числа, если нету то идти во второй поиск.
Бинарный поиск или двоичный поиск
 */

public class SearchBinary {
    public int binarySearch(int massive[], int foundNumber) {

        int firstIndex = 0;
        int lastIndex = massive.length - 1;

        while (firstIndex <= lastIndex) {
            int mid = (firstIndex + lastIndex) / 2;
            if (massive[mid] == foundNumber) {
                return mid;
            } else if (massive[mid] < foundNumber) {
                firstIndex = mid + 1;
            } else if (massive[mid] > foundNumber) {
                lastIndex = mid - 1;
            }

        }
        return -100500;
    }

    public static void main(String[] args) {
        SearchBinary exp1 = new SearchBinary();
        int a = exp1.binarySearch(new int[]{1, 2, 3, 5, 6, 7, 8}, -1263475347);

        System.out.println(a);
    }

}


















