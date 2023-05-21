import java.util.Scanner;  

class SinglyLinkedListInt {
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
        Node current = head;
        System.out.print("\n\n\t\t\t\t\t\t\t      ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void insertFront(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    public void insertMiddle(int x, int pos) {
        Node newNode = new Node(x);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            newNode.next = temp.next;
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
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
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
      while (temp.next.next != null) {
          temp = temp.next;
      }
      temp.next = null;
  }

    public void deleteNode(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        prev.next = temp.next;
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
  SinglyLinkedListInt list = new SinglyLinkedListInt();
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
            System.out.println("\t\t\t\t\t\t\t\t\tWhat is a Singly Linked List?\n");
            System.out.println("\t\t\t\t\t\tA singly linked list is a type of linked list that is unidirectional, that");
            System.out.println("\t\t\t\t\t\tis, it can be traversed in only one direction from head to the last");
            System.out.println("\t\t\t\t\t\tnode (tail).\n");
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
        System.out.println("\n\n\t\t\t\t\t\t\tLinked list Elements");     
        list.Traverse();
        
        break;
      case 2:
        clearScreen();
        System.out.print("\n\n\t\t\t\t\t\tEnter the data to be inserted: ");
        data = sc.nextInt();
        clearScreen();
        System.out.println("\n\n\t\t\t\t\t\t --------------------------------");
        System.out.println("\t\t\t\t\t\t|                                |");
        System.out.println("\t\t\t\t\t\t|           INSERT MENU          |");
        System.out.println("\t\t\t\t\t\t|                                |");
        System.out.println("\t\t\t\t\t\t --------------------------------\n");
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
            clearScreen();
            list.deleteFront();
            list.Traverse();
            break;
          case 2:
          clearScreen();
            list.deleteLast();
            list.Traverse();
            break;
          case 3:
            clearScreen();
            System.out.print("\n\n\t\t\t\t\t\tEnter the data to be deleted: ");
            data = sc.nextInt();
            list.deleteNode(data);
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
          System.out.println("\n\n\t\t\t\t\t\t ----------------------------");
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
