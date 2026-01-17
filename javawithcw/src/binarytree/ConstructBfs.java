package binarytree;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructBfs {
    public static class TreeNode{
        int val;
        TreeNode RightNode;
        TreeNode LeftNode;
        public TreeNode(int val){
            this.val = val;
        }
    }
    public static TreeNode ConstructBFS(String[] arr){
        int n = arr.length;
        if(arr[0]==null || arr.length==0) return null;
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> pq = new LinkedList<>();
        pq.add(root);
        int i = 1;
        while(i<n){
            TreeNode temp = pq.remove();
            if(i<n && !arr[i].equals("")){
                int l = Integer.parseInt(arr[i]);
                TreeNode left = new TreeNode(l);
                temp.LeftNode = left;
                pq.add(left);
            }
            i++;
            if(i<n && !arr[i].equals("")){
                int r = Integer.parseInt(arr[i]);
                TreeNode right = new TreeNode(r);
                temp.RightNode = right;
                pq.add(right);
            }
            i++;
        }
        return root;
    }
    public static void BFS(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> pq = new LinkedList<>();
        pq.add(root);
        while(!pq.isEmpty()){
            TreeNode temp = pq.peek();
            if(temp.LeftNode!=null){
                TreeNode left = temp.LeftNode;
                pq.add(left);
            }
            if(temp.RightNode!=null){
                TreeNode right = temp.RightNode;
                pq.add(right);
            }
            System.out.print(pq.remove().val+" ");
        }
    }

    public static void main(String[] args) {
        String[] str = {"1","2","3","4","5","6","7","8","9","","10","","11","12","","13","14","","","","","","","15"};
        TreeNode root = ConstructBFS(str);
        BFS(root);
    }
}
