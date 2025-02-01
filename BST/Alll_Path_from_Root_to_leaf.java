package BST;

import java.util.ArrayList;

public class Alll_Path_from_Root_to_leaf {
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

    public static void print(ArrayList<Integer> path){
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i) + " ->");
        }
        System.out.println();
    }

    public static void  printPath(Node root, ArrayList<Integer> path){
        path.add(root.data);
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            print(path);
            
        }
        printPath(root.left, path );
        printPath(root.right, path );

        path.remove(path.size() - 1);
        
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

    
        printPath(root, new ArrayList<>());
    }
    
}
