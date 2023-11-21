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

    public void append(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
           tail.next = newNode;
           tail = newNode;
        }
        length++;
    }

    public void prepend(int value){
        //create new node
        Node newNode = new Node(value);
        //store the current head
        Node currentHead = head;
        //if the length is 0 make the new node the head
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        //else the head is now the new node and the next node is the old head
        else{
            head = newNode;
            newNode.next = currentHead;
        }
        length++;

    }

    public Node removeLast(){
        //create new pointers
        Node pre = head;
        Node temp = head;

        //if there are no nodes return null
        if (length == 0){
            return null;
        }

        //while the temporary head pointer is not null
        //make the pre node equal temp and move to the next node
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        //we are at the second last element now
        tail = pre;
        //set the pointer to null
        tail.next = null;
        length--;

        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node removeFirst(){
        Node oldHead = head;
        //if the length is 0 return null
        if(length == 0){
            return null;
        }
        // if head.next is not equal to null make the second node the head
        else if(head.next != null){
            head = head.next;
        }
        length--;
        if (length == 0) {
            tail = null;
        }
        return oldHead;
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


    public void viewHead(){
        System.out.println("Head " + head.value);
    }
    public void viewTail(){
        System.out.println("Tail " + tail.value);
    }
    public void viewLength(){
        System.out.println("Length " + length);
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

}


