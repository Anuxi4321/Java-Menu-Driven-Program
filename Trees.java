import java.util.Scanner;

class Node {
    int data;
    Node leftChild;
    Node rightChild;

    public Node(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}

public class Trees {
    Node root = null;
    Scanner sc = new Scanner(System.in);

    void insertElement(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (data < node.data) {
                node.leftChild = insert(node.leftChild, data);
            } else {
                node.rightChild = insert(node.rightChild, data);
            }
        }
        return node;
    }

    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.leftChild);
            System.out.print(node.data + " ");
            inorderTraversal(node.rightChild);
        }
    }

    void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.leftChild);
            preOrderTraversal(node.rightChild);
        }
    }

    void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.leftChild);
            postOrderTraversal(node.rightChild);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        Trees tree = new Trees();
 
        System.out.println("\n\n\t\t\t           .:.                                                                                                                         .+##-          ");
        System.out.println("\t\t\t         +@@@@@+                                                                                                                      *@@@@@%-        ");
        System.out.println("\t\t\t        *@@@@@@@#                   :******************==*********++-.        -*************** .***************.                     *@@@@@@@@:       ");
        System.out.println("\t\t\t       -@@@@@@@@@=                  =@@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@#.      +@@@@@@@@@@@@@@@ .@@@@@@@@@@@@@@@:                    -@@@@@@@@@%       ");
        System.out.println("\t\t\t       %@@@@@@@@@@                  =@@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@-     +@@@@@@@@@@@@@@@ .@@@@@@@@@@@@@@@:                    *@@@@@@@@@@       ");
        System.out.println("\t\t\t       @@@@@@@@@@@.                 =@@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@=    +@@@@@@@@@@@@@@@ .@@@@@@@@@@@@@@@:                    #@@@@@@@@@@:      ");
        System.out.println("\t\t\t       @@@@@@@@@@@.                 =@@@@@@@@@@@@@@@@@@*#@@@@@@@@@@@@@@@@%    +@@@@@@@@@@@@@@@ .@@@@@@@@@@@@@@@:                    #@@@@@@@@@@:   ");
        System.out.println("\t\t\t       @@@@@@@@@@@                  -######@@@@@@######+#@@@@@+--=*@@@@@@@-   +@@@@@%######### .@@@@@@#########.                    *@@@@@@@@@@       ");
        System.out.println("\t\t\t       #@@@@@@@@@#                         @@@@@@.      #@@@@@-    -@@@@@@%   +@@@@@-          .@@@@@@                              :@@@@@@@@@%       ");
        System.out.println("\t\t\t        @@@@@@@@@:                         @@@@@@.      #@@@@@-     #@@@@@@   +@@@@@-          .@@@@@@                               +@@@@@@@@        ");
        System.out.println("\t\t\t        .%@@@@@@:                          @@@@@@.      #@@@@@-     +@@@@@@   +@@@@@-          .@@@@@@                                =@@@@@%.        ");
        System.out.println("\t\t\t          =###=.                           @@@@@@.      #@@@@@-     +@@@@@%   +@@@@@-          .@@@@@@                  =%@@@*:        .-==:          ");
        System.out.println("\t\t\t                      :--.                 @@@@@@.      #@@@@@-     @@@@@@#   +@@@@@-          .@@@@@@                 *@@@@@@@-                      ");
        System.out.println("\t\t\t                    .@@@@@%.               @@@@@@.      #@@@@@-    *@@@@@@:   +@@@@@@@@@@@@@@- .@@@@@@@@@@@@@@%       =@@@@@@@@@                      ");
        System.out.println("\t\t\t                   :@@@@@@@@.              @@@@@@.      #@@@@@%%%@@@@@@@@%    +@@@@@@@@@@@@@@- .@@@@@@@@@@@@@@%       @@@@@@@@@@*                     ");
        System.out.println("\t\t\t                  .@@@@@@@@@%              @@@@@@.      #@@@@@@@@@@@@@@@@:    +@@@@@@@@@@@@@@- .@@@@@@@@@@@@@@%      :@@@@@@@@@@%                  ");
        System.out.println("\t\t\t                  =@@@@@@@@@@              @@@@@@.      #@@@@@@@@@@@@@@@-     +@@@@@@@@@@@@@@- .@@@@@@@@@@@@@@%      =@@@@@@@@@@%                     ");
        System.out.println("\t\t\t                  *@@@@@@@@@@=             @@@@@@.      #@@@@@@@@@@@@@#.      +@@@@@@@@@@@@@@- .@@@@@@@@@@@@@@%      :@@@@@@@@@@%                     ");
        System.out.println("\t\t\t                  *@@@@@@@@@@*             @@@@@@.      #@@@@@@@@@@@@+        +@@@@@*++++++++. .@@@@@@++++++++=       @@@@@@@@@@*                     ");
        System.out.println("\t\t\t                  +@@@@@@@@@@:             @@@@@@.      #@@@@@-#@@@@@@:       +@@@@@-          .@@@@@@                =@@@@@@@@%                      ");
        System.out.println("\t\t\t                  :@@@@@@@@@@              @@@@@@.      #@@@@@-.@@@@@@@.      +@@@@@-          .@@@@@@                 +@@@@@@@:                      ");
        System.out.println("\t\t\t                   *@@@@@@@@+              @@@@@@.      #@@@@@- :@@@@@@@.     +@@@@@-          .@@@@@@                  -#%@%*.                       ");
        System.out.println("\t\t\t                    #@@@@@@+               @@@@@@.      #@@@@@-  +@@@@@@#     +@@@@@-          .@@@@@@                                                ");
        System.out.println("\t\t\t                     :#@@*.                @@@@@@.      #@@@@@-   %@@@@@@#    +@@@@@=          .@@@@@@                                                ");
        System.out.println("\t\t\t         :%@@@%-                           @@@@@@.      #@@@@@-    %@@@@@@+   +@@@@@@@@@@@@@@@ .@@@@@@@@@@@@@@@:                      .#@@@%=         ");
        System.out.println("\t\t\t        =@@@@@@@+                          @@@@@@.      #@@@@@-    :@@@@@@@-  +@@@@@@@@@@@@@@@ .@@@@@@@@@@@@@@@:                     :@@@@@@@*        ");
        System.out.println("\t\t\t       :@@@@@@@@@-                         @@@@@@.      #@@@@@-     -@@@@@@@: +@@@@@@@@@@@@@@@ .@@@@@@@@@@@@@@@:                    .@@@@@@@@@+       ");
        System.out.println("\t\t\t       %@@@@@@@@@%                         @@@@@@.      #@@@@@-      *@@@@@@@.+@@@@@@@@@@@@@@@ .@@@@@@@@@@@@@@@:                    =@@@@@@@@@@       ");
        System.out.println("\t\t\t       @@@@@@@@@@@                         @@@@@@.      #@@@@@-       @@@@@@@%*@@@@@@@@@@@@@@@ .@@@@@@@@@@@@@@@:                    #@@@@@@@@@@.      ");
        System.out.println("\t\t\t       @@@@@@@@@@@.                        ::::::       ::::::         :::::::::::::::::::::::  :::::::::::::::                     #@@@@@@@@@@.      ");
        System.out.println("\t\t\t       @@@@@@@@@@@                                                                                                                  #@@@@@@@@@@.      ");
        System.out.println("\t\t\t       #@@@@@@@@@%                                                                                                                  =@@@@@@@@@@   ");
        System.out.println("\t\t\t       .@@@@@@@@@:                                                                                                                  .@@@@@@@@@+       ");
        System.out.println("\t\t\t        -@@@@@@@=                                                                                                                    .@@@@@@@*        ");
        System.out.println("\t\t\t         .*@@@#:                                                                                                                      .+@@@%-         \n\n");
        System.out.println("\t\t\t\t\t\t\t==============================================================================\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\tWhat is Tree Data Structure?\n");
        System.out.println("\t\t\t\t\t\t\tA tree data structure is defined as a collection of objects or entities known");
        System.out.println("\t\t\t\t\t\t\tas nodes that are linked together to represent or simulate hierarchy.\n");
        System.out.println("\t\t\t\t\t\t\tA tree data structure is a non-linear data structure because it does not");
        System.out.println("\t\t\t\t\t\t\tstore in a sequential manner. It is a hierarchical structure as elements ");
        System.out.println("\t\t\t\t\t\t\tin a Tree are arranged in multiple levels.\n");
        System.out.println("\t\t\t\t\t\t\t==============================================================================");
        
        int choice;
        do {
            System.out.println("\n\t\t\t\t\t\t\tBelow are the Different Operations of Tree Data Structure.");
            System.out.println("\t\t\t\t\t\t\tChoose an Option.\n");
            System.out.println("\t\t\t\t\t\t\tBinary Tree Traversal Program");
            System.out.println("\t\t\t\t\t\t\t[1] Insert an Element");
            System.out.println("\t\t\t\t\t\t\t[2] In-order Traversal");
            System.out.println("\t\t\t\t\t\t\t[3] Pre-order Traversal");
            System.out.println("\t\t\t\t\t\t\t[4] Post-order Traversal");
            System.out.println("\t\t\t\t\t\t\t[5] Go back to Menu");
            System.out.print("\n\t\t\t\t\t\t\tEnter your choice: ");
            choice = tree.sc.nextInt();

            switch (choice) {
                case 1:
                    tree.clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\t\tEnter the element to insert: ");
                    int element = tree.sc.nextInt();
                    tree.insertElement(element);
                    System.out.println("\n\n\t\t\t\t\t\t\t\t ---------------------------------------");
                    System.out.println("\t\t\t\t\t\t\t\t|                                      |");
                    System.out.println("\t\t\t\t\t\t\t\t|            ELEMENT INSERTED !        |");
                    System.out.println("\t\t\t\t\t\t\t\t|                                      |");
                    System.out.println("\t\t\t\t\t\t\t\t ---------------------------------------\n");
                    break;
                case 2:
                    tree.clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\t\tIn-order traversal: ");
                    tree.inorderTraversal(tree.root);
                    System.out.println();
                    break;
                case 3:
                    tree.clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\t\tPre-order traversal: ");
                    tree.preOrderTraversal(tree.root); 
                    System.out.println();
                    break;
                case 4:
                    tree.clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\t\tPost-order traversal: ");
                    tree.postOrderTraversal(tree.root);
                    System.out.println();
                    break;
                case 5:
                    tree.clearScreen();
                    Menu.main(args);
                    tree.sc.close();
                    System.exit(0);
                    break;
                default:
                tree.clearScreen();
                System.out.println("\n\n\t\t\t\t\t\t ---------------------------------"); 
                System.out.println("\t\t\t\t\t\t|                                |"); 
                System.out.println("\t\t\t\t\t\t|        INVALID CHOICE !        |");  
                System.out.println("\t\t\t\t\t\t|                                |"); 
                System.out.println("\t\t\t\t\t\t ---------------------------------\n");
                    break;
            }
        } while (choice != 5);
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
