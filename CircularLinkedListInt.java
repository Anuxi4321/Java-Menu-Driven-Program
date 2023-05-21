import java.util.Scanner;

class CircularLinkedListInt {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void Traverse() {
        if (head == null) {
            System.out.println("\n\n\t\t\t\t\t\t -------------------------------------"); 
            System.out.println("\t\t\t\t\t\t|                                     |"); 
            System.out.println("\t\t\t\t\t\t|         LINKED LIST IS EMPTY        |");  
            System.out.println("\t\t\t\t\t\t|                                     |"); 
            System.out.println("\t\t\t\t\t\t -------------------------------------\n");
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

    public void insertFront(int x) {
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

    public void insertMiddle(int x, int pos) {
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

    public void insertTail(int x) {
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
            System.out.println("\n\n\t\t\t\t\t\t ------------------------------------------------"); 
            System.out.println("\t\t\t\t\t\t|                                             |"); 
            System.out.println("\t\t\t\t\t\t|         LINKED LIST IS ALREADY EMPTY        |");  
            System.out.println("\t\t\t\t\t\t|                                             |"); 
            System.out.println("\t\t\t\t\t\t --------------------------------------------\n");
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

    public void deleteNode(int key) {
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

    public boolean searchNode(int key) {
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
        CircularLinkedListInt list = new CircularLinkedListInt();
        list.head = null;
        list.insertFront(3);
        list.insertFront(2);
        list.insertFront(1);
      
        int choice, choice2, choice3, data, index;
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
            System.out.println("\t\t\t\t\t\t[1] Traverse");
            System.out.println("\t\t\t\t\t\t[2] Insert");
            System.out.println("\t\t\t\t\t\t[3] Delete");
            System.out.println("\t\t\t\t\t\t[4] Search");
            System.out.println("\t\t\t\t\t\t[5] Go Back to Menu\n");
            System.out.print("\t\t\t\t\t\tEnter your choice: ");
          choice = sc.nextInt();
          switch (choice) {
            case 1:
              clearScreen();
              list.Traverse();
              break;
            case 2:
              clearScreen();
              System.out.print("\n\n\t\t\t\t\t\tEnter the data to be inserted: ");
              data = sc.nextInt();
              clearScreen();
              System.out.println("\n\n\t\t\t\t\t\t ----------------------------------");
                System.out.println("\t\t\t\t\t\t|                                  |");
                System.out.println("\t\t\t\t\t\t|           INSERT MENU            |");
                System.out.println("\t\t\t\t\t\t|                                  |");
                System.out.println("\t\t\t\t\t\t ----------------------------------\n");
                System.out.println("\t\t\t\t\t\t[1] Front");
                System.out.println("\t\t\t\t\t\t[2] Middle");
                System.out.println("\t\t\t\t\t\t[3] Last\n");
                System.out.print("\t\t\t\t\t\tInput on where you want your data to be inserted: ");
              choice2 = sc.nextInt();
              clearScreen();
                switch (choice2) {
                  case 1:
                    list.insertFront(data);
                    list.Traverse();
                    break;
                  case 2:
                    System.out.print("\n\t\t\t\t\t\tEnter the index where data is to be inserted: ");
                    index = sc.nextInt();
                    clearScreen();
                    list.insertMiddle(data, index);
                    list.Traverse();
                    break;
                  case 3:
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
            case 3:
            clearScreen();
            System.out.println("\n\n\t\t\t\t\t\t --------------------------------");
            System.out.println("\t\t\t\t\t\t|                                |");
            System.out.println("\t\t\t\t\t\t|           DELETE MENU          |");
            System.out.println("\t\t\t\t\t\t|                                |");
            System.out.println("\t\t\t\t\t\t --------------------------------");
            System.out.println("\t\t\t\t\t\t[1] Front");
            System.out.println("\t\t\t\t\t\t[2] Last");
            System.out.println("\t\t\t\t\t\t[3] Specific");
            System.out.print("\t\t\t\t\t\tInput which part you want your data to be deleted:  ");
            choice3 = sc.nextInt();
            clearScreen();
              switch (choice3) {
                case 1:
                  list.deleteFront();
                  clearScreen();
                  list.Traverse();
                  break;
                case 2:
                  list.deleteLast();
                  clearScreen();
                  list.Traverse();
                  break;
                case 3:
                  System.out.print("\n\t\t\t\t\t\tEnter the data to be deleted: ");
                  data = sc.nextInt();
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
            case 4:
              clearScreen();
              System.out.print("\n\n\t\t\t\t\t\tEnter the data to be searched: ");
              data = sc.nextInt();
              if (list.searchNode(data)) {
                clearScreen();
                System.out.println("\n\n\t\t\t\t\t\t -----------------------------");
                System.out.println("\t\t\t\t\t\t|                            |");
                System.out.println("\t\t\t\t\t\t|        Data found !        |");
                System.out.println("\t\t\t\t\t\t|                            |");
                System.out.println("\t\t\t\t\t\t -----------------------------");
              } else {
                clearScreen();
                System.out.println("\t\t\t\t\t\t ----------------------------");
                System.out.println("\t\t\t\t\t\t|                            |");
                System.out.println("\t\t\t\t\t\t|      Data not found :c     |");
                System.out.println("\t\t\t\t\t\t|                            |");
                System.out.println("\t\t\t\t\t\t ----------------------------");
              }
              
              break;
            case 5:
                clearScreen();        
                Menu.main(args);
                sc.close();     
                System.exit(0);  
            default:
              clearScreen();
                System.out.println("\n\n\t\t\t\t\t\t ---------------------------------"); 
                System.out.println("\t\t\t\t\t\t|                                |"); 
                System.out.println("\t\t\t\t\t\t|        INVALID CHOICE !        |");  
                System.out.println("\t\t\t\t\t\t|                                |"); 
                System.out.println("\t\t\t\t\t\t ---------------------------------\n");
          }
        }
          
      }
      
      public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
      }
             