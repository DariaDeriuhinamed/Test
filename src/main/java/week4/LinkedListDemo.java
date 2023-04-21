package week4;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // create a linked list
        LinkedList<String> li = new LinkedList<String>();

        //add elements
        li.add("C");
        li.add("G");
        li.add("E");
        li.add("B");
        li.add("D");
        li.add("F");
        li.addLast("Z");
        li.addFirst("A");
        li.add(1, "A2");

        System.out.println("Original contents of li: " + li);

        //Remove elements from the linked list
        li.remove("F");
        li.remove(2);

        System.out.println("Contents of li after deletion: " + li);

        //Remove first and last elements
        li.removeFirst();
        li.removeLast();

        System.out.println("Contents after deleting first and last: " + li);

        //Get and set a value
        String val = li.get(2);
        li.set(2, val + " Changed");

        System.out.println("li after changes: " + li);
    }
}
