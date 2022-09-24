package EDALAB1.Ejercicio1;

import java.util.Scanner;

class Josefo_Tesoro {

    public static int Josefo(int n) {
        Node firstNode = new Node(1);
        Node prevNode = firstNode;
        for (int i = 2; i <= n; i++) {
            Node currentNode = new Node(i);
            currentNode.prev = prevNode;
            prevNode.next = currentNode;
            prevNode = currentNode;
        }
        firstNode.prev = prevNode;
        prevNode.next = firstNode;

        Node currentNode = prevNode;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                currentNode = currentNode.next;
            }
            currentNode.eliminacion();
        }
        return currentNode.next.num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, ganador;
        n = sc.nextInt();
        ganador = Josefo(n);
        System.out.println("Ganador es: " + ganador);

    }
}

class Node {

    int num;
    Node next = null;
    Node prev = null;

    public Node(int num) {
        this.num = num;
    }

    public void eliminacion() {
        prev.next = next;
        next.prev = prev;
    }
}

