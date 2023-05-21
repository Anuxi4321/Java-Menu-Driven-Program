import java.util.Scanner;

class CircularLinkedListChar {
    Node head;

    public class Node {
        char data;
        Node next;

        Node(char d) {
            data = d;
            next = null;
        }
    }

    public void Traverse() {
        if (head == null) {
            System.out.println("\n\n\t\t\t\t\t\t ----------------------------------"); 
            System.out.println("\t\t\t\t\t\t|                                     |"); 
            System.out.println("\t\t\t\t\t\t|         LINKED LIST IS EMPTY        |");  
            System.out.println("\t\t\t\t\t\t|                                     |"); 
            System.out.println("\t\t\t\t\t\t --------------------------------------\n");
            return;
        }
        Node current = head;
        System.out.print("\n\n\t\t\t\t\t\t");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public void insertFront(char x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        newNode.next = head;
        head = newNode;
        last.next = head;
    }

    public void insertMiddle(char x, int pos) {
        if (pos == 1) {
            insertFront(x);
            return;
        }
        Node newNode = new Node(x);
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        if (temp.next == head) {
            System.out.println("\n\n\t\t\t\t\t\t ------------------------------------------"); 
            System.out.println("\t\t\t\t\t\t|                                             |"); 
            System.out.println("\t\t\t\t\t\t|         ERROR: POSITION OUT OF RANGE        |");  
            System.out.println("\t\t\t\t\t\t|                                             |"); 
            System.out.println("\t\t\t\t\t\t ----------------------------------------------\n");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void insertTail(char x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        last.next = newNode;
        newNode.next = head;
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
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        head = head.next;
        last.next = head;
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
        Node temp = head, prev = null;
        while (temp.next != head) {
            prev = temp;
            temp = temp.next;
        }
        if (prev == null) {
            head = null;
        } else {
            prev.next = head;
        }
    }

    public void deleteNode(char key) {
        if (head == null) {
            System.out.println("\n\n\t\t\t\t\t\t ------------------------------------------"); 
            System.out.println("\t\t\t\t\t\t|                                             |"); 
            System.out.println("\t\t\t\t\t\t|         LINKED LIST IS ALREADY EMPTY        |");  
            System.out.println("\t\t\t\t\t\t|                                             |"); 
            System.out.println("\t\t\t\t\t\t ----------------------------------------------\n");
            return;
        }
        Node temp = head, prev = null;
        while (temp.data != key && temp.next != head) {
            prev = temp;
            temp = temp.next;
        }
        if (temp.data != key) {
            System.out.println("\n\n\t\t\t\t\t\t ----------------------------------------------"); 
            System.out.println("\t\t\t\t\t\t|                                                 |"); 
            System.out.println("\t\t\t\t\t\t|         ELEMENT NOT FOUND IN LINKED LIST        |");  
            System.out.println("\t\t\t\t\t\t|                                                 |"); 
            System.out.println("\t\t\t\t\t\t --------------------------------------------------\n");
            return;
        }
        if (temp == head && temp.next == head) {
            head = null;
            return;
        }
        if (temp == head) {
            head = temp.next;
        }
        if (temp.next == head) {
            prev.next = head;
        } else {
            prev.next = temp.next;
        }
    }

    public boolean searchNode(char key) {
        Node current = head;
        do {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        } while (current != head);
        return false;
    }
    

    public static void main(String[] args) {
       CircularLinkedListChar list = new CircularLinkedListChar();
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
            System.out.println("\t\t\t\t\t\t\t\t\tWhat is a Circular Linked List?\n");
            System.out.println("\t\t\t\t\t\tCircular linked list are mostly used in task maintenance in operating systems.");
            System.out.println("\t\t\t\t\t\t. There are many examples where circular linked list are being used in computer ");
            System.out.println("\t\t\t\t\t\tscience including browser surfing where a record of pages visited in the past by ");
            System.out.println("\t\t\t\t\t\tthe user, is maintained in the form of circular linked lists and can be ");
            System.out.println("\t\t\t\t\t\taccessed again on clicking the previous button.   \n");
            System.out.println("\t\t\t\t\t\t==============================================================================");

        while (true) {
            System.out.println("\n\t\t\t\t\t\tBelow are the Basic Operations of a Linked List.");
            System.out.println("\t\t\t\t\t\tChoose an Option.\n");
            System.out.println("\n\t\t\t\t\t\t[A] Traverse");
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
                System.out.print("\n\t\t\t\t\t\tEnter the data to be inserted: ");
                data = sc.next().toUpperCase().charAt(0);
                clearScreen();
                System.out.println("\n\t\t\t\t\t\t --------------------------------");
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
                System.out.print("\n\t\t\t\t\t\tEnter the index where data is to be inserted: ");
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
                System.out.println("\n\t\t\t\t\t\t --------------------------------");
                System.out.println("\t\t\t\t\t\t|                                |");
                System.out.println("\t\t\t\t\t\t|            DELETE MENU         |");
                System.out.println("\t\t\t\t\t\t|                                |");
                System.out.println("\t\t\t\t\t\t --------------------------------");
                System.out.println("\n\t\t\t\t\t\t[A] Front");
                System.out.println("\t\t\t\t\t\t[B] Last");
                System.out.println("\t\t\t\t\t\t[C] Specific\n");
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
                System.out.print("\n\t\t\t\t\t\tEnter the data to be deleted: ");
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
                System.out.print("\n\t\t\t\t\t\tEnter the data to be searched: ");
                data = sc.next().toUpperCase().charAt(0);
                if (list.searchNode(data)) {
                    clearScreen();
                    System.out.println("\n\t\t\t\t\t\t ----------------------------");
                    System.out.println("\t\t\t\t\t\t|                            |");
                    System.out.println("\t\t\t\t\t\t|        Data found !        |");
                    System.out.println("\t\t\t\t\t\t|                            |");
                    System.out.println("\t\t\t\t\t\t ----------------------------");
                } else {
                    clearScreen();
                    System.out.println("\t\t\t\t\t\t ----------------------------");
                    System.out.println("\t\t\t\t\t\t|                            |");
                    System.out.println("\t\t\t\t\t\t|      Data not found :c     |");
                    System.out.println("\t\t\t\t\t\t|                            |");
                    System.out.println("\t\t\t\t\t\t ----------------------------");
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
  
    