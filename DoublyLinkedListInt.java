import java.util.Scanner;

public class DoublyLinkedListInt {
  Node head;

  public class Node {
    int data;
    Node prev;
    Node next;
    Node(int d) {
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

  public void insertFront(int x) {
    Node newNode = new Node(x);
    newNode.next = head;
    newNode.prev = null;
    if (head != null) {
      head.prev = newNode;
    }
    head = newNode;
  }

  public void insertMiddle(int x, int pos) {
    Node newNode = new Node(x);
    if (pos == 1) {
      newNode.next = head;
      newNode.prev = null;
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

  public void insertTail(int x) {
    Node newNode = new Node(x);
    newNode.next = null;
    if (head == null) {
      newNode.prev = null;
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

public void deleteNode(int key) {
    Node temp = head;
    if (temp != null && temp.data == key) {
        head = temp.next;
        head.prev = null;
        return;
    }
    while (temp != null && temp.data != key) {
        temp = temp.next;
    }
    if (temp == null) {
        return;
    }
    if (temp.next != null) {
        temp.next.prev = temp.prev;
    }
    temp.prev.next = temp.next;
}

public boolean searchNode(int key) {
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
    DoublyLinkedListInt list = new DoublyLinkedListInt();
    list.head = null;
    list.insertFront(3);
    list.insertFront(2);
    list.insertFront(1);
  
    int choice, choice2, choice3, data, index;
    Scanner sc = new Scanner(System.in);

    System.out.println("\n\n\t\t\t ::::         ::::  :::::        ::::: .::::       .::::: :::::::::::: .::::::.               .::::        :::::       -+++-.   ::::::::::::::. ");
            System.out.println("\n\n\t\t\t:@@@@:       -@@@@: %@@@@:       #@@@% -@@@@-     .@@@@@+ @@@@@@@@@@@@ +@@@@@@@@#-            *@@@%        %@@@%     =@@@@@@@#: @@@@@@@@@@@@@@+  ");
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
          System.out.println("\t\t\t\t\t\t[3] Last");
          System.out.print("\t\t\t\t\t\tInput on where you want your data to be inserted:  ");
          choice2 = sc.nextInt();
          clearScreen();
            switch (choice2) {
              case 1:
                list.insertFront(data);
                list.Traverse();
                break;
              case 2:
                System.out.print("\n\n\t\t\t\t\t\tEnter the index where data is to be inserted: ");
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
              System.out.print("\n\n\t\t\t\t\t\tEnter the data to be deleted: ");
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
  