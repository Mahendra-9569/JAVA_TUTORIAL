package Binary_Tree;
import java.util.ArrayList;

public class Lowest_Common_Ancestor {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node   createBST(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = createBST(root.left, data);
        }
        else{
           root.right =  createBST(root.right, data);
        }

        return root;
    }

    public static void addpath(Node root , ArrayList<Integer> path, int data){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.data == data){
            return;
        }
        addpath(root.left, path, data);
        addpath(root.right, path, data);
        path.remove(path.size() - 1);
    }

    public static int findancestor(ArrayList<Integer> path1, ArrayList<Integer> path2){
        int i = 0;
   
        for( i = 0; i<path1.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        return path1.get(i - 1);
    }
    public static void main(String[] args) {
        //                1
        //              /   \
        //             2     3
        //            / \   / \
        //           4   5 6   7
        Node root = null;
        int[] arr = {1,2,3,4,5,6,7};
        for(int i = 0; i < arr.length; i++){
            root = createBST(root, arr[i]);
        }
        
        ArrayList<Integer> path1 = new ArrayList<>();
        ArrayList<Integer> path2 = new ArrayList<>();
        addpath(root, path1, 4);
        addpath(root, path2, 6);
        int find = findancestor(path1, path2);
        System.out.println(find);


        
    }
    
}
