import java.util.*;
class Node
{
    int key;
    int value;
    Node next;
    Node prev;
    Node(int key,int value)
    {
        this.key=key;
        this.value=value;
        next=null;
        prev=null;
    }
}
class LRUCache {
    int capacity;
    HashMap<Integer,Node> map;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        map=new HashMap<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        
        Node newnode=map.get(key);
        remove(newnode);
        add(newnode);
        return newnode.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node node=map.get(key);
            remove(node);
        }
        Node node=new Node(key,value);
        map.put(key,node);
        add(node);
        if(capacity<map.size())
        {
            Node n=tail.prev;
            remove(n);
            map.remove(n.key);

        }
    }
    public void remove(Node node)
    {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
    public void add(Node node)
    {
        Node n=head.next;
        head.next=node;
        node.prev=head;
        node.next=n;
        n.prev=node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */