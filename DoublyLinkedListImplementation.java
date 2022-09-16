class DoublyLinkedList {

    Node head;
    Node last;
    class Node {
        int data;
        Node next;
        Node previous;

        Node(int value) {
            data = value;
            next = null;
            previous = null;
        }
    }

     DoublyLinkedList insertElementAtTop(DoublyLinkedList myLinkedList, int data) {
        Node node = new Node(data);
        if(myLinkedList.head == null) {
            myLinkedList.head = node;
            myLinkedList.last = node;
        } else {
            node.next = myLinkedList.head;
            myLinkedList.head.previous = node;
            myLinkedList.head = node;
        }
        return myLinkedList;
     }

     DoublyLinkedList insertElementAtBottom(DoublyLinkedList myLinkedList, int data) {
        Node node = new Node(data);
        if(myLinkedList.head == null) {
            myLinkedList.head = node;
            myLinkedList.last = node;
        } else {
            node.previous = myLinkedList.last;
            myLinkedList.last.next = node;
            myLinkedList.last = node;
        }
        return myLinkedList;
     }

    DoublyLinkedList deleteElementFromTop(DoublyLinkedList myLinkedList) {
        if(myLinkedList.head == null) {
            System.out.println("Linked List is already empty");
        } else if(myLinkedList.head == myLinkedList.last) {
            myLinkedList.head = null;
            myLinkedList.last = null;
        } else {
            myLinkedList.head = myLinkedList.head.next;
            myLinkedList.head.previous = null;
        }
        return myLinkedList;
    }

    DoublyLinkedList deleteElementFromBottom(DoublyLinkedList myLinkedList) {
        if(myLinkedList.last == null) {
            System.out.print("Linked List is already empty.");
        } else if(myLinkedList.head == myLinkedList.last) {
            myLinkedList.head = null;
            myLinkedList.last = null;
        } else {
            myLinkedList.last = myLinkedList.last.previous;
            myLinkedList.last.next = null;
        }
        return myLinkedList;
    }

    void displayFromTop(DoublyLinkedList myLinkedList) {
        if(myLinkedList.head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node node = head;
            while(node.next != null) {
                System.out.print(node.data+ ", ");
                node = node.next;
            }
            System.out.println(node.data);
        }
    }

    void displayFromBottom(DoublyLinkedList myLinkedList) {
        if(myLinkedList.last == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node node = last;
            while(node.previous != null) {
                System.out.print(node.data+ ", ");
                node = node.previous;
            }
            System.out.print(node.data);
        }
    }
}
public class DoublyLinkedListImplementation {
    public static void main(String[] args) {
        DoublyLinkedList myLinkedList = new DoublyLinkedList();
        myLinkedList = myLinkedList.insertElementAtTop(myLinkedList, 6);
        myLinkedList = myLinkedList.insertElementAtTop(myLinkedList, 55);
        myLinkedList = myLinkedList.insertElementAtTop(myLinkedList, 5);
        myLinkedList = myLinkedList.insertElementAtTop(myLinkedList, 12);
        myLinkedList = myLinkedList.insertElementAtTop(myLinkedList, 9);
        myLinkedList.displayFromTop(myLinkedList);
        System.out.println();
        myLinkedList.displayFromBottom(myLinkedList);
        myLinkedList = myLinkedList.insertElementAtBottom(myLinkedList, 23);
        myLinkedList = myLinkedList.insertElementAtBottom(myLinkedList, 24);
        myLinkedList = myLinkedList.insertElementAtBottom(myLinkedList, 2);
        myLinkedList = myLinkedList.insertElementAtBottom(myLinkedList, 3);
        myLinkedList.displayFromTop(myLinkedList);
        System.out.println();
        myLinkedList.displayFromBottom(myLinkedList);
        myLinkedList = myLinkedList.deleteElementFromTop(myLinkedList);
        myLinkedList.displayFromTop(myLinkedList);
        System.out.println();
        myLinkedList.displayFromBottom(myLinkedList);
        myLinkedList = myLinkedList.deleteElementFromBottom(myLinkedList);
        myLinkedList.displayFromTop(myLinkedList);
        System.out.println();
        myLinkedList.displayFromBottom(myLinkedList);
    }
    
}
