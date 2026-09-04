import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
    }
}

class Pair {
    Node node;
    int level;
    Pair(Node node, int level) {
        this.node = node;
        this.level = level;
    }
}

public class LevelOrder {
    public static void main(String[] args) {
        Node a = new Node(3); //root
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        //levelOrder(a);
        levelOrderLineWise(a);
        kthLevel(a,0,2);
    }
    // private static void levelOrder(Node root) {
    //     Queue<Node> q = new LinkedList<>();
    //     q.add(root);
    //     while(!q.isEmpty()) {
    //         Node front = q.remove();
    //         System.out.print(front.val+" ");
    //         if(front.left!=null) q.add(front.left);
    //         if(front.right!=null) q.add(front.right);
    //     }
    //     System.out.println();
    // }
    private static void levelOrderLineWise(Node root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int currentLevel = 0;
        while(!q.isEmpty()) {
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;
            if(front.level != currentLevel) {
                currentLevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left!=null) q.add(new Pair(front.node.left, front.level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right, front.level+1));
        }
        System.out.println();
    }
    private static void kthLevel(Node root,int level,int k) {
        if(root == null) return;
        if(level == k) {
            System.out.print(root.val+" ");
        }
        kthLevel(root.left,level+1,k);
        kthLevel(root.right,level+1,k);
    }
}