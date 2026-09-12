import java.util.ArrayList;
import java.util.Stack;
class Node {
    int data;
    Node left,right;
}

public class Preorder {
public ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            Node top = st.pop();
            ans.add(top.data);
            if(top.right != null) st.push(top.right);
            if(top.left != null) st.push(top.left);
        }
        return ans;
    }
}
// public class Preorder {
//     public void dfs(Node root, ArrayList<Integer> ans) {
//         if(root == null) return;
//         ans.add(root.data);
//         dfs(root.left, ans);
//         dfs(root.right, ans);
//     }
//     public ArrayList<Integer> preorder(Node root) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         dfs(root, ans);
//         return ans;
//     }
// }
