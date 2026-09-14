import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {

    public ArrayList<Integer> inorder(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();

        Node curr = root;

        while (!st.isEmpty() || curr != null) {

            if (curr != null) {

                if (curr.left != null) {
                    st.push(curr);
                    curr = curr.left;
                } 
                else {
                    ans.add(curr.data);
                    curr = curr.right;
                }

            } else { // curr == null

                Node top = st.pop();
                ans.add(top.data);
                curr = top.right;
            }
        }

        return ans;
    }
}
