import org.w3c.dom.Node;

public class Test8 {
    public static void main(String[] args) {
        //二叉树
        int[] arr = {1,2,3,4,5,6,7};
        //先把数组的第一个元素作为二叉树的根节点
        Node root = new Node(arr[0]);
        //把根节点赋给一个临时变量
        Node temp = root;
        //把数组的第二个元素作为根节点的左子节点
        temp.left = new Node(arr[1]);
        //把数组的第三个元素作为根节点的右子节点
        temp.right = new Node(arr[2]);
        //把根节点的左子节点赋给临时变量
        temp = temp.left;
        //把数组的第四个元素作为根节点的左子节点
        temp.left = new Node(arr[3]);
        //把数组的第五个元素作为根节点的右子节点
        temp.right = new Node(arr[4]);
        //把根节点的右子节点赋给临时变量
        temp = root.right;
        //把数组的第六个元素作为根节点的左子节点
        temp.left = new Node(arr[5]);
        //把数组的第七个元素作为根节点的右子节点
        temp.right = new Node(arr[6]);

        //遍历栈
        System.out.println("前序遍历：");
        preOrder(root);
        System.out.println();
        System.out.println("中序遍历：");
        inOrder(root);
        System.out.println();
        System.out.println("后序遍历：");
        postOrder(root);



    }
}
