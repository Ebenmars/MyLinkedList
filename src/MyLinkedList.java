import org.w3c.dom.Node;

public class  MyLinkedList{
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    MyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value);
            if(temp != null){
                System.out.print("-> ");
            }
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head " + head.value);
    }
    public void getTail(){
        System.out.println("Tail " + tail.value);
    }
    public void getLength(){
        System.out.println("Length " + length);
    }

}


