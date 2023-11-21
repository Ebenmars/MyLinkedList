import org.junit.Assert;
import org.junit.Test;

public class LinkedListTests {

    @Test
    public void testAppend(){
        MyLinkedList linkedList = new MyLinkedList(3);
        linkedList.append(4);
//        Assert.assertEquals(linkedList.theHead().value,3);
    }

    @Test
    public void testRemoveLast(){
        MyLinkedList linkedList = new MyLinkedList(3);
        linkedList.append(4);
        Assert.assertEquals(linkedList.removeLast().value,4);
    }

    @Test
    public void testPrepend(){
        MyLinkedList linkedList = new MyLinkedList(3);
        linkedList.append(4);
        linkedList.prepend(7);
        Assert.assertEquals(linkedList.getHead().value,7);
    }

    @Test
    public void testRemoveFirst(){
        MyLinkedList linkedList = new MyLinkedList(3);
        linkedList.append(4);
        Assert.assertEquals( linkedList.removeFirst().value,3);
    }

}
