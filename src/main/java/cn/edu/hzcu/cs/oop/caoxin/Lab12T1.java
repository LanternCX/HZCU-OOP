package cn.edu.hzcu.cs.oop.caoxin;

class Queue {
    private int[] element;
    private int size;
    public Queue() {
        element = new int[8];
    }
    public void enqueue(int v) {
        if (size >= element.length) {
            int[] newElement = new int[element.length * 2];
            System.arraycopy(element, 0, newElement, 0, element.length);
            element = newElement;
        }
        element[size++] = v;
    }
    public int dequeue() {
        int v = element[0];
        for (int i = 1; i < size; i++) element[i - 1] = element[i];
        size--;
        return v;
    }
    public boolean empty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
}

public class Lab12T1 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i <= 20; i++)
            queue.enqueue(i);

        while (!queue.empty())
            System.out.print(queue.dequeue() + " ");
    }
}
