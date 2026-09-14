import java.util.ArrayList;
public class TreeBoundayTraversal {
    ArrayList<Integer> boundayTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(root.data);
        if(root.left == null && root.right == null) return ans;
        leftBoundary(root.left,ans);
        leafNodes(root,ans);
        rightBoundary(root.right,ans);
        return ans;
    }
    void leftBoundary(Node root, ArrayList<Integer> ans) {
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        ans.add(root.data);
        if(root.left != null) leftBoundary(root.left,ans);
        else leftBoundary(root.right,ans);
    }
    void leafNodes(Node root, ArrayList<Integer> ans){
        if(root == null) return;
        if(root.left == null && root.right == null) ans.add(root.data);
        leafNodes(root.left,ans);
        leafNodes(root.right,ans);
    }
    void rightBoundary(Node root, ArrayList<Integer> ans) {
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        if(root.left != null) rightBoundary(root.left,ans);
        else rightBoundary(root.right,ans);
        ans.add(root.data);
    }
}
