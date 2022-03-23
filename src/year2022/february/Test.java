package year2022.february;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @create 2022-02-16 17:40
 */
public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<int[]> list = new ArrayList<>();

        while (n > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int[] e = new int[]{a, b};
            list.add(e);
            n--;
        }

        for(int i = 0; i < list.size() - 1; i++){
            for(int j = 0; j < list.size() - 1 - i; j++){
                if(list.get(j)[1] > list.get(j+1)[1]){
                    int[] temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j + 1, temp);
                }
            }
        }

        int i = 0;
        int count = 0;
        for(int j = 1; j < list.size(); j++){
            int[] ints = list.get(i);
            int[] ints1 = list.get(j);
            if(ints1[0] < ints[1]){
                count++;
            }else{
                i = j;
            }
        }

        System.out.println(count);


    }
}
