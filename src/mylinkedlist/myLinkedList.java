package mylinkedlist;
import java.util.Scanner;
import java.util.Random;

public class myLinkedList {
   
    private Node head;



    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;   //Node temp trỏ đến địa chỉ Node Head để lấy toàn bộ dữ liệu của Node Head
        while (temp.next != null) {
            temp = temp.next;
        }
        // Sau lệnh này thì chương trình tìm được Node cuối cùng đó là temp
        temp.next = newNode;
    }
    public void addAny(int data, int index){
        Node newNode = new Node(data);
        if (index == 0) {
            addFirst(data);
            return;
        }
        else{
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;

            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }
    }
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myLinkedList linklist = new myLinkedList();
        int n;
        System.out.println("Moi nhap so phan tu cua mang");
        n = sc.nextInt();
        int[]array = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100);
        }

        linklist.addFirst(21);
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
