package myPackage.datastructure;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}
    TreeNode(int val){ this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p== null && q ==null)
            return true;

        if(p != null && q != null){
            return (p.val == q.val && isSameTree(p.left,q.left) &&isSameTree(p.right,q.right));
        }
        return false;
    }
}
