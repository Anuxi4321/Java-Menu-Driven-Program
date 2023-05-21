import java.util.Scanner;

public class DoublyLinkedListChar {
    Node head;

    public class Node {
        char data;
        Node prev;
        Node next;

        Node(char d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    public void Traverse() {
        Node current = head;
        System.out.print("\n\n\t\t\t\t\t\t");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void insertFront(char x) {
        Node newNode = new Node(x);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertMiddle(char x, int pos) {
        Node newNode = new Node(x);
        if (pos == 1) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            newNode.next = temp.next;
            newNode.prev = temp;
            if (temp.next != null) {
                temp.next.prev = newNode;
            }
            temp.next = newNode;
        } else {
            System.out.println("\n\n\t\t\t\t\t\t ------------------------------------------"); 
            System.out.println("\t\t\t\t\t\t|                                             |"); 
            System.out.println("\t\t\t\t\t\t|         ERROR: POSITION OUT OF RANGE        |");  
            System.out.println("\t\t\t\t\t\t|                                             |"); 
            System.out.println("\t\t\t\t\t\t ----------------------------------------------\n");
        }
    }

    public void insertTail(char x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void deleteFront() {
        if (head == null) {
            System.out.println("\n\n\t\t\t\t\t\t ------------------------------------------"); 
            System.out.println("\t\t\t\t\t\t|                                             |"); 
            System.out.println("\t\t\t\t\t\t|         LINKED LIST IS ALREADY EMPTY        |");  
            System.out.println("\t\t\t\t\t\t|                                             |"); 
            System.out.println("\t\t\t\t\t\t ----------------------------------------------\n");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("\n\n\t\t\t\t\t\t ------------------------------------------"); 
            System.out.println("\t\t\t\t\t\t|                                             |"); 
            System.out.println("\t\t\t\t\t\t|         LINKED LIST IS ALREADY EMPTY        |");  
            System.out.println("\t\t\t\t\t\t|                                             |"); 
            System.out.println("\t\t\t\t\t\t ----------------------------------------------\n");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    public void deleteNode(char key) {
        Node temp = head;
        if (temp != null && temp.data == key) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    public boolean searchNode(char key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        DoublyLinkedListChar list = new DoublyLinkedListChar();
        list.head = null;
        list.insertFront('C');
        list.insertFront('B');
        list.insertFront('A');

        char choice, choice2, choice3, data;
        int index;
        Scanner sc = new Scanner(System.in);

            System.out.println("\n\n\t\t\t ::::         ::::  :::::        ::::: .::::       .::::: :::::::::::: .::::::.               .::::        :::::       -+++-.   ::::::::::::::. ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@@:       #@@@% -@@@@-     .@@@@@+ @@@@@@@@@@@@ +@@@@@@@@#-            *@@@%        %@@@%     =@@@@@@@#: @@@@@@@@@@@@@@+  ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@@@       #@@@% -@@@@-     %@@@@%  @@@@@@@@@@@@ +@@@@@@@@@@@:          *@@@%        %@@@%    #@@@@@@@@@@*@@@@@@@@@@@@@@+ ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@@@+      #@@@% -@@@@-    #@@@@%   @@@@@@@@@@@@ +@@@@@@@@@@@@=         *@@@%        %@@@%   +@@@@@@@@@@@.@@@@@@@@@@@@@@+  ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@@@@:     #@@@% -@@@@-   +@@@@%.   @@@@@%%%%%%% +@@@@@@@@@@@@@=        *@@@%        %@@@%   @@@@@#*#@@@* #%%%%@@@@@%%%%= ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@@@@:     #@@@% -@@@@-   +@@@@%.   @@@@@%%%%%%% +@@@@@@@@@@@@@=        *@@@%        %@@@%   @@@@@#*#@@@* #%%%%@@@@@%%%%= ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@@@@@=    #@@@% -@@@@- -@@@@@:     @@@@@        +@@@@    .@@@@@@       *@@@%        %@@@%  +@@@@.            .@@@@*     ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@@@@@@.   #@@@% -@@@@-.@@@@@=      @@@@@        +@@@@     :@@@@@:      *@@@%        %@@@%  =@@@@*            .@@@@*    ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@@@@@@#   #@@@% -@@@@=@@@@@+       @@@@@        +@@@@      #@@@@=      *@@@%        %@@@%  .@@@@@%:          .@@@@*    ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@%+@@@@=  #@@@% -@@@@@@@@@#        @@@@@@@@@@@# +@@@@      :@@@@*      *@@@%        %@@@%   +@@@@@@@=        .@@@@* ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@% #@@@@  #@@@% -@@@@@@@@@.        @@@@@@@@@@@# +@@@@      .@@@@%      *@@@%        %@@@%    *@@@@@@@%-      .@@@@*  ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@% #@@@@  #@@@% -@@@@@@@@@.        @@@@@@@@@@@# +@@@@      .@@@@%      *@@@%        %@@@%    *@@@@@@@%-      .@@@@*  ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@%  +@@@@:#@@@% -@@@@@@@@@@+       @@@@@@@@@@@# +@@@@      .@@@@#      *@@@%        %@@@%       +@@@@@@@-    .@@@@*     ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@%   @@@@@%@@@% -@@@@-@@@@@@=      @@@@@......  +@@@@      *@@@@=      *@@@%        %@@@%         =@@@@@@.   .@@@@*  ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@%   :@@@@@@@@% -@@@@- %@@@@@-     @@@@@        +@@@@     .@@@@@-      *@@@%        %@@@%          :@@@@@:   .@@@@*  ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@%   :@@@@@@@@% -@@@@- %@@@@@-     @@@@@        +@@@@     .@@@@@-      *@@@%        %@@@%          :@@@@@:   .@@@@*  ");
            System.out.println("\t\t\t:@@@@:       -@@@@: %@@@%     @@@@@@@% -@@@@-  :@@@@@@.   @@@@@        +@@@@   .@@@@@@:       *@@@%        %@@@%  #@@.    .@@@@@:   .@@@@*   ");
            System.out.println("\t\t\t:@@@@%######--@@@@: %@@@%     -@@@@@@% -@@@@-   -@@@@@%   @@@@@####### +@@@@##%@@@@@@#        *@@@@####### %@@@% :@@@@%*+#@@@@@@.   .@@@@*     ");
            System.out.println("\t\t\t:@@@@@@@@@@@=-@@@@: %@@@%      #@@@@@% -@@@@-    +@@@@@%  @@@@@@@@@@@@ +@@@@@@@@@@@@*         *@@@@@@@@@@@ %@@@%.@@@@@@@@@@@@@@+    .@@@@*  ");
            System.out.println("\t\t\t:@@@@@@@@@@@=-@@@@: %@@@%       @@@@@% -@@@@-     *@@@@@# @@@@@@@@@@@@ +@@@@@@@@@@@+          *@@@@@@@@@@@ %@@@% #@@@@@@@@@@@@#     .@@@@*   ");
            System.out.println("\t\t\t:@@@@@@@@@@@=-@@@@: %@@@%       =@@@@% -@@@@-      #@@@@@*@@@@@@@@@@@@ +@@@@@@@@@*.           *@@@@@@@@@@@ %@@@%  .#@@@@@@@@@+      .@@@@*  ");
            System.out.println("\t\t\t:@@@@@@@@@@@=-@@@@: %@@@%       =@@@@% -@@@@-      #@@@@@*@@@@@@@@@@@@ +@@@@@@@@@*.           *@@@@@@@@@@@ %@@@%  .#@@@@@@@@@+      .@@@@*  \n");
            System.out.println("\t\t\t\t\t\t==============================================================================\n");
            System.out.println("\t\t\t\t\t\t\t\t\tWhat is a Doubly Linked List?\n");
            System.out.println("\t\t\t\t\t\tDoubly linked list is a complex type of linked list in which a node contains a");
            System.out.println("\t\t\t\t\t\tpointer to the previous as well as the next node in the sequence. ");
            System.out.println("\n\t\t\t\t\t\tTherefore, in a doubly linked list, a node consists of three parts: ");
            System.out.println("\t\t\t\t\t\tnode data, pointer to the next node in sequence (next pointer) ,");
            System.out.println("\t\t\t\t\t\tpointer to the previous node (previous pointer). \n");
            System.out.println("\t\t\t\t\t\t==============================================================================");


        while (true) {
            System.out.println("\n\t\t\t\t\t\tBelow are the Basic Operations of a Binary Search.");
            System.out.println("\t\t\t\t\t\tChoose an Option.\n");
            System.out.println("\t\t\t\t\t\t[A] Traverse");
            System.out.println("\t\t\t\t\t\t[B] Insert");
            System.out.println("\t\t\t\t\t\t[C] Delete");
            System.out.println("\t\t\t\t\t\t[D] Search");
            System.out.println("\t\t\t\t\t\t[E] Go Back to Menu\n");
            System.out.print("\t\t\t\t\t\tEnter your choice: ");
            choice = sc.next().toUpperCase().charAt(0);
            switch (choice) {
            case 'A':
                clearScreen();
                list.Traverse();
                break;
            case 'B':
                clearScreen();
                System.out.print("\n\n\t\t\t\t\t\tEnter the data to be inserted: ");
                data = sc.next().toUpperCase().charAt(0);
                clearScreen();
                System.out.println("\n\n\t\t\t\t\t\t --------------------------------");
                System.out.println("\t\t\t\t\t\t|                                |");
                System.out.println("\t\t\t\t\t\t|          INSERT MENU           |");
                System.out.println("\t\t\t\t\t\t|                                |");
                System.out.println("\t\t\t\t\t\t --------------------------------");
                System.out.println("\t\t\t\t\t\t[A] Front");
                System.out.println("\t\t\t\t\t\t[B] Middle");
                System.out.println("\t\t\t\t\t\t[C] Last");
                System.out.print("\t\t\t\t\t\tInput on where you want your data to be inserted: ");
                choice2 = sc.next().toUpperCase().charAt(0);
                clearScreen();
                switch (choice2) {
            case 'A':
                list.insertFront(data);
                list.Traverse();
                break;
            case 'B':
                System.out.print("\n\n\t\t\t\t\t\tEnter the index where data is to be inserted: ");
                index = sc.nextInt();
                clearScreen();
                list.insertMiddle(data, index);
                list.Traverse();
                break;
            case 'C':
                list.insertTail(data);
                list.Traverse();
                break;
            default:
                clearScreen();
                System.out.println("\n\n\t\t\t\t\t\t ---------------------------------"); 
                System.out.println("\t\t\t\t\t\t|                                |"); 
                System.out.println("\t\t\t\t\t\t|        INVALID CHOICE !        |");  
                System.out.println("\t\t\t\t\t\t|                                |"); 
                System.out.println("\t\t\t\t\t\t ---------------------------------\n");
                }
                break;
            case 'C':
                clearScreen();
                System.out.println("\n\n\t\t\t\t\t\t --------------------------------");
                System.out.println("\t\t\t\t\t\t|                                |");
                System.out.println("\t\t\t\t\t\t|           DELETE MENU          |");
                System.out.println("\t\t\t\t\t\t|                                |");
                System.out.println("\t\t\t\t\t\t --------------------------------");
                System.out.println("\t\t\t\t\t\t[A] Front");
                System.out.println("\t\t\t\t\t\t[B] Last");
                System.out.println("\t\t\t\t\t\t[C] Specific");
                System.out.print("\t\t\t\t\t\tInput which part you want your data to be deleted: ");
                choice3 = sc.next().toUpperCase().charAt(0);
                clearScreen();
            switch (choice3) {
            case 'A':
                list.deleteFront();
                clearScreen();
                list.Traverse();
                break;
            case 'B':
                list.deleteLast();
                clearScreen();
                list.Traverse();
                break;
            case 'C':
                System.out.print("\n\n\t\t\t\t\t\tEnter the data to be deleted: ");
                data = sc.next().toUpperCase().charAt(0);
                list.deleteNode(data);
                clearScreen();
                list.Traverse();
                break;
            default:
                clearScreen();
                System.out.println("\n\n\t\t\t\t\t\t ---------------------------------"); 
                System.out.println("\t\t\t\t\t\t|                                |"); 
                System.out.println("\t\t\t\t\t\t|        INVALID CHOICE !        |");  
                System.out.println("\t\t\t\t\t\t|                                |"); 
                System.out.println("\t\t\t\t\t\t ---------------------------------\n");
                }
                break;
            case 'D':
                clearScreen();
                System.out.print("\n\n\t\t\t\t\t\tEnter the data to be searched: ");
                data = sc.next().toUpperCase().charAt(0);
                if (list.searchNode(data)) {
                    System.out.println("\n\n\t\t\t\t\t\t -----------------------------");
                    System.out.println("\t\t\t\t\t\t|                            |");
                    System.out.println("\t\t\t\t\t\t|        Data found !        |");
                    System.out.println("\t\t\t\t\t\t|                            |");
                    System.out.println("\t\t\t\t\t\t -----------------------------");
                } else {
                    System.out.println("\n\n\t\t\t\t\t\t-----------------------------");
                    System.out.println("\t\t\t\t\t\t|                            |");
                    System.out.println("\t\t\t\t\t\t|      Data not found :c     |");
                    System.out.println("\t\t\t\t\t\t|                            |");
                    System.out.println("\t\t\t\t\t\t-----------------------------");
                }
                break;
            case 'E':
                    clearScreen();        
                    Menu.main(args);
                    sc.close();     
                    System.exit(0); 
                break;
            default:
                clearScreen();
                System.out.println("\n\n\t\t\t\t\t\t ---------------------------------"); 
                System.out.println("\t\t\t\t\t\t|                                |"); 
                System.out.println("\t\t\t\t\t\t|        INVALID CHOICE !        |");  
                System.out.println("\t\t\t\t\t\t|                                |"); 
                System.out.println("\t\t\t\t\t\t ---------------------------------\n");
                break;
            }
        }
    }
            public static void clearScreen() {
             System.out.print("\033[H\033[2J");
            System.out.flush();
  }
}
  

