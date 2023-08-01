package LL;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();//so when we create a new linked list a head, tail and size will be initialized.
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(15);
        list.insert(44,2);
//        list.display();
//        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
    }
}
