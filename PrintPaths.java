import java.util.ArrayList;
public class PrintPaths {
    public static ArrayList<ArrayList<Integer>> printPaths(Node root,int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root,ans,arr,sum);
        return ans;
    }

    private static void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans, int sum) {
        if(sum == 0) {
            ArrayList<Integer> arr2 = new ArrayList<>();
            arr2.addAll(arr);
            ans.add(arr2);
        }
        if(root == null) return;
        arr.add(root.data);
        dfs(root.left,arr,ans,sum-root.data);
        dfs(root.right,arr,ans,sum-root.data);
        arr.remove(arr.size()-1);
    }
}
