package EDALAB1.Ejercicio3;

public class LinkedList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static public void push(int d) {

        Node new_node = new Node(d);

        new_node.next = head;

        head = new_node;
    }

    public static boolean Detector(Node head) {
        if (head == null) {
            return false;
        }
        Node s = head;
        Node f = head;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {

        LinkedList llist = new LinkedList();

        llist.push(9);
        llist.push(4);
        llist.push(11);
        llist.push(16);
        llist.push(99);
        llist.push(32);
        
        //Crear un ciclo:
        LinkedList.head.next.next.next.next = LinkedList.head;

        if (Detector(head)) {
            System.out.println("ciclo encointrado");
        } else {
            System.out.println("No hay ciclo");
        }
    }
}
