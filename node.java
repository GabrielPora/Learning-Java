
public class LinkedList {
    public Node head;

    public void LinkedList (int item) {
        head = new Node(item);
    }

    public void prepend (int value) {
        Node newHead = new Node(value)
        newHead.next = head;
        head = newHead;
    }

    public int size() {
        int i = 0;
        Node tmp;
        tmp = head;
        while (tmp != null) {
            i++;
            tmp = tmp.next;
        }
        return i;
    }
}

public class Node {
    public Node next;
    public int value;

    public Node (int value) {
        value = value;
    }
}

public class Main {
    public static void main (String[] args) {
        LinkedList list = new LinkedList(10);
        list.prepend(5);
        list.prepend(21);
        System.out.println("what are int the nodes "+list.LinkedList()+ " number of nodes " + list.size());
    }
}