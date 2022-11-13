package pack;

public class ListRealize {
    private Element head;
    private Element tail;

    static private int count;
    public ListRealize() {
        head = null;
        tail = null;
        count = 0;
    }

    public void insertFirst(String str) {
        Element newNode = new Element();

        if (count == 0) {
            newNode.str = str;
            head = newNode;
            tail = head;
            tail.next = head;
            head.prev = tail;
            head.next = tail;
            tail.prev = head;
        }
        else {
            newNode.str = str;
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            head = newNode;
            tail.next = head;
        }
        count += 1;
    }

    public void insertLast(String str) {
        Element newNode = new Element();

        if (count == 0) {
            newNode.str = str;
            head = newNode;
            tail = head;
            tail.next = head;
            head.prev = tail;
            head.next = tail;
            tail.prev = head;
        }
        newNode.str = str;
        newNode.prev = tail;
        newNode.next = head;
        tail.next = newNode;
        head.prev = newNode;
        tail = newNode;
        count += 1;
    }

    public void deleteLast() {
        tail.prev.next = head;
        head.prev = tail.prev;
        tail.next = null;
        tail.str = null;
        tail.prev = null;
        tail = head.prev;
        count -= 1;
    }

    public void toString(String comment) {
        Element current = head;
        if (count == 1) {
            head.printNodeData();
        }
        else {
            current.printNodeData();
            current = current.next;
            while (current != tail.next) {
                current.printNodeData();
                current = current.next;
            }
        }
        System.out.print(" - " + comment);
        System.out.println();
    }

    public void printList() {
        Element current = head;
        if (count == 1) {
            head.printNodeData();
        }
        else {
            current.printNodeData();
            current = current.next;
            while (current != tail.next) {
                current.printNodeData();
                current = current.next;
            }
        }
        System.out.println();
    }

    public void insertSort(String str) {
        insertLast(str);
        sort();
    }

    public void sort() {
        String buffer;
        for (int i = 0; i < getCount(); i++) {
            Element current = head;
            for (int j = 0; j < getCount() - 1; j++) {
                if (current.str.length() > current.next.str.length()) {
                    buffer = current.str;
                    current.str = current.next.str;
                    current.next.str = buffer;
                }

                if (current.str.length() == current.next.str.length() && current.needSwap()) {
                    buffer = current.str;
                    current.str = current.next.str;
                    current.next.str = buffer;
                }

                current = current.next;
            }
        }
    }

    public void printHead() {
        head.printNodeData();
    }

    public void printTail() {
        tail.printNodeData();
    }
    public int getCount() {
        return count;
    }

}
