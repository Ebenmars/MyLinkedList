import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MyLinkedList linkedList = new MyLinkedList(3);

        linkedList.append(8);
        linkedList.append(7);
        linkedList.prepend(9);

        linkedList.viewHead();
        linkedList.viewTail();
        linkedList.viewLength();
        System.out.println(linkedList.removeFirst().value);



        linkedList.printList();



    }
}