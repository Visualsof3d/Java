import java.util.*;

public class DataTypes {
    public static void main(String[] args) {

        // Primitive Datatypes
        int num = 1;
        float num2 = 1.23f;
        boolean flag = false;
        String str = "ThisIsString";
        char ch = 'c';


        // Array
        int[] arr = new int[5];



        // Array but when you don't know the size
        ArrayList<Integer> array = new ArrayList<>();

        array.add(2);
        array.addFirst(1);
        array.addLast(3);
        System.out.println(array.size());
        System.out.println(array.contains(1)); // return true if present
        System.out.println(array.get(1)); // print -> 2




        // Map
        Map<Integer, Character> mpp = new HashMap<>();
        HashMap<Integer, Character> mpp2 = new HashMap<>();



        // Linked List
        LinkedList<Integer> list = new LinkedList<Integer>();



        // Stack
        Stack<Integer> st = new Stack<Integer>();



        // Queue
        Queue<Integer> que = new LinkedList<>();



        // Set
        Set<Integer> stt = new HashSet<Integer>();
    }
}