package com.epam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Stones {
    public void getStone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Count : ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }
        Collections.sort(array, Collections.reverseOrder());
        System.out.println(array);
        int[] stones = array.stream().mapToInt(Integer::intValue).toArray();
        for (int i =1 ; i<stones.length; i++) {
            if (stones[i-1] != 0) {
                int temp=stones[i-1]-stones[i];
                stones[i]=temp;
            }
        }
        System.out.println(stones[stones.length-1]);

    }
}
