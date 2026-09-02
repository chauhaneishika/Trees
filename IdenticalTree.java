public class IdenticalTree {
    boolean isIdentical(Node p, Node q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return isIdentical(p.left, q.left) && isIdentical(p.right,q.right);
    }
}
