package cn.edu.hzcu.cs.oop.caoxin;

import java.util.*;

class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}

public class Lab07T1 {
    public static <T extends Comparable<T>> ArrayList<T> sort(ArrayList<T> array) {
        int len = array.size();
        for (int i = 0; i < len - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < len; j++) {
                if (array.get(j).compareTo(array.get(minIdx)) < 0) {
                    minIdx = j;
                }
            }
            T temp = array.get(i);
            array.set(i, array.get(minIdx));
            array.set(minIdx, temp);
        }
        return array;
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1e5; i++) {
            array.add(random.nextInt());
        }

        ArrayList<Integer> iSort = new ArrayList<>(array);
        ArrayList<Integer> qSort = new ArrayList<>(array);

        StopWatch iSortWatch = new StopWatch();
        StopWatch qSortWatch = new StopWatch();

        qSortWatch.start();
        Collections.sort(qSort);
        qSortWatch.stop();

        iSortWatch.start();
        sort(iSort);
        iSortWatch.stop();
        System.out.println("Insert Sort time is: " + iSortWatch.getElapsedTime());
        System.out.println("Quick Sort time is: " + qSortWatch.getElapsedTime());
    }
}
