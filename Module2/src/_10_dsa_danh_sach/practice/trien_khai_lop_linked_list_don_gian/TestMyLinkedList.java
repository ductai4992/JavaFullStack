package _10_dsa_danh_sach.practice.trien_khai_lop_linked_list_don_gian;

    public class TestMyLinkedList {
        public static void main(String[] args) {
            System.out.println("Test");
            MyLinkedList ll = new MyLinkedList(10);
            ll.addFirst(11);
            ll.addFirst(12);
            ll.addFirst(13);

            ll.add(4,9);
            ll.add(4,9);
            ll.printList();
        }
    }
