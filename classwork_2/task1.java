package classwork_2;

import java.util.Scanner;

public class task1 {
    public static void ShowString(String a, String b, int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sb.append(a);
            } else {
                sb.append(b);
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        // Дано четное число N (>0) и символы c1 и c2.
        // Написать метод, который вернет строку длины N, которая состоит из
        // чередующихся символов c1 и c2, начиная с c1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите N: ");
        int N = sc.nextInt();
        sc.close();
        ShowString("c1", "c2", N);
        
    }
}
