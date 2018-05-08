package binarySearchListExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchListExample2 {
    public static void main(String[] args) {
        List<MyObj> list = Arrays.asList(new MyObj(2), new MyObj(1), new MyObj(4), new MyObj(3));

        Comparator<MyObj> comp = ((o1, o2) -> Integer.compare(o1.getI(), o2.getI()));
        list.sort(comp);
        int index = Collections.binarySearch(list, new MyObj(4), comp);
        System.out.println(index);

    }

    private static class MyObj {
        private int i;

        public MyObj(int i) {
            this.i = i;
        }

        public int getI() {
            return i;
        }
    }
}
