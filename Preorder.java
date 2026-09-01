import java.util.ArrayList;
class Node {
    int data;
    Node left,right;
}
public class Preorder {
    public void dfs(Node root, ArrayList<Integer> ans) {
        if(root == null) return;
        ans.add(root.data);
        dfs(root.left, ans);
        dfs(root.right, ans);
    }
    public ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }
}
