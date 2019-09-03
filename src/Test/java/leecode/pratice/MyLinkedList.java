package leecode.pratice;

/**
 * 设计链表的实现。您可以选择使用单链表或双链表。单链表中的节点应该具有两个属性：val 和 next。val 是当前节点的值，next 是指向下一个节点的指针/引用。如果要使用双向链表，则还需要一个属性 prev 以指示链表中的上一个节点。假设链表中的所有节点都是 0-index 的。
 * <p>
 * 在链表类中实现这些功能：
 * <p>
 * get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
 * addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
 * addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
 * addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
 * deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
 */
public class MyLinkedList {
    private static Node head = null;
    private static String link = "";

    public static void main(String[] args) throws Exception {
        //1.往节点里添加元素
        add("1");
        add("2");
        add("3");
        add("4");
        LinkPrint();
        insert(2, "33");
        LinkPrint();
    }

    private static void insert(int index, String data) throws Exception {
        //1.判断链表的头是否存在,不存在则抛出异常
        if (head == null) throw new Exception("No head exist!");

        //2.将链表头传给tmp
        Node tmp = head;
        int count = 1;
        //3.找到要插入的位置
        while (tmp.next != null) {
            if (index == ++count) {
                Node insert = new Node(data);
                //3.1进入此处说明已经找到要替换的添加节点的位置
                //3.2原来的指向传递给添加后的节点,让其指向它
                insert.next = tmp.next;
                //3.2更新节点
                tmp.next = insert;
            }
            tmp = tmp.next;
        }

    }

    /**
     * @param data
     */

    private static void add(String data) {
        //1.判断头元素是否为空
        if (head == null) {
            //1.1为空则创建头元素
            Node node = new Node(data);
            head = node;
            link = head.data;
        } else {
            //1.2不为空则将头元素放到临时对象中
            Node tmp = head;
            //1.3当下一个节点不存在时则添加节点
            while (tmp.next != null)
                tmp = tmp.next;
            //1.4经过while循环已经找到需求的节点
            tmp.next = new Node(data);
        }
    }

    /**
     * 创建方法LinkPrint用来打印链表中的元素
     */
    private static void LinkPrint() {
        //2.创建中间节点并将链表的头传递给它
        Node tmp = head;
        //3.判断下一个节点是否存在如果存在则将其中的data进行拼接
        while (tmp.next != null) {
            tmp = tmp.next;
            link += tmp.data;
        }
        //4.打印
        System.out.println(link);
        //5.将链表头指向link
        link = head.data;
    }

    public static class Node {
        //1.指向下一个节点
        Node next;
        //2.节点存储的数据
        String data;

        //3.方法
        public Node(String data) {
            this.data = data;
        }
    }
}
