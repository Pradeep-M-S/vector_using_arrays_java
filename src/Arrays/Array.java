package Arrays;

import java.util.ArrayList;

public class Array {
    private int[] items;
    private int count = 0;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (count == items.length) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }


    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item) {
                return i;
            }
        throw new IllegalArgumentException();
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++)
            if (max < items[i])
                max = items[i];

        return max;
    }

    public ArrayList<Integer> intersect(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++)
            for (int j = 0; j < arr.length; j++)
                if (items[i] == arr[j])
                    list.add(items[i]);

        return list;
    }

    public void reverse() {
        int temp;
        for (int k = 0; k < count / 2; k++) {
            int j = count - k - 1;
            temp = items[k];
            items[k] = items[j];
            items[j] = temp;
        }
    }

    public void print() {
        for (var i = 0; i < count; i++) {
            System.out.print(items[i]+ " " );
        }
        System.out.println();
    }

    public void insertAt(int index, int value) {
        if (index < 0) System.out.println("Negative index encountered");
        if(count != items.length) {
            for (int i = count; i >= index; i--) {
                items[i+ 1] = items[i];
            }
            items[index] = value;
            count++;
        }
    }

}
