package Arrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(30);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(300);
        numbers.insert(40);
        numbers.print();
        numbers.insertAt(2,5);
        numbers.print();
    }
}

