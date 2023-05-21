import java.util.Scanner;

public class LinkedListImpStack {
    static Node head = null;

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\t\t\t\t\t\t       ::.                                       .::.                     ");
        System.out.println("\t\t\t\t\t\t     :=@@@+::.============:    :===:          .:=#@@%+:: -===.    .-===:   ");
        System.out.println("\t\t\t\t\t\t    =@@@@@@@%+@@@@@@@@@@@@+    =@@@*:        :#@@@@@@@@@:#@@@:   .#@@@#.    ");
        System.out.println("\t\t\t\t\t\t   =@@@@@@@@@#@@@@@@@@@@@@+   :#@@@@+      .=%@@@@@@@@@@:#@@@:   *@@@%.     ");
        System.out.println("\t\t\t\t\t\t  .@@@@***#@#.***#@@@@#***=   =@@@@@*.     =@@@@@%#*#%@*.#@@@:  =@@@%:      ");
        System.out.println("\t\t\t\t\t\t  .@@@#   .+=    .#@@#:      .*@@@@@@=    :#@@@#*-   =*: #@@@: -%@@@=    ");
        System.out.println("\t\t\t\t\t\t  :@@@#          .#@@#:      -@@@@@@@+    *@@@#:         #@@@:-%@@@*     ");
        System.out.println("\t\t\t\t\t\t  .@@@@=-        .#@@#:      +@@@*#@@#:  -%@@@=          #@@@+%@@@*.    ");
        System.out.println("\t\t\t\t\t\t   *@@@@%=-      .#@@#:     :#@@#:=@@@=  +@@@%:          #@@@@@@@*.      ");
        System.out.println("\t\t\t\t\t\t   .*@@@@@%=:    .#@@#:     =@@@+ -%@@*. +@@@+           #@@@@@@@:         ");
        System.out.println("\t\t\t\t\t\t    .+#@@@@@#:   .#@@#:    .*@@%- .+@@@= +@@@+           #@@@@@@@*.         ");
        System.out.println("\t\t\t\t\t\t      :=*@@@@*   .#@@#:    -@@@%*++#@@@+ +@@@%:          #@@@#@@@@*.      ");
        System.out.println("\t\t\t\t\t\t        .+@@@%:  .#@@#:    +@@@@@@@@@@@%--%@@@=          #@@@-#@@@@*        ");
        System.out.println("\t\t\t\t\t\t   =     :@@@%-  .#@@#:   :%@@@@@@@@@@@@=.*@@@#:         #@@@::%@@@@+     ");
        System.out.println("\t\t\t\t\t\t  +@*-   -@@@%:  .#@@#:   =@@@@@@@@@@@@@#:-%@@@#*:   -*: #@@@: :%@@@@=            ");
        System.out.println("\t\t\t\t\t\t .@@@%***%@@@#   .#@@#:  :#@@%+------*@@@= +@@@@@%***%@*.#@@@:  :%@@@%:      ");
        System.out.println("\t\t\t\t\t\t *@@@@@@@@@@@=   .#@@#:  -@@@*.      +@@@+ .+@@@@@@@@@@@:#@@@:   :%@@@%:    ");
        System.out.println("\t\t\t\t\t\t :=@@@@@@@@%=.   .#@@#: .+@@@+       :#@@%- .:#@@@@@@@@@:#@@@:    -@@@@%.   ");
        System.out.println("\t\t\t\t\t\t :=@@@@@@@@%=.   .#@@#: .+@@@+       :#@@%- .:#@@@@@@@@@:#@@@:    -@@@@%.   ");
        System.out.println("\t\t\t\t\t\t     .:::.                                       .::..                     \n\n");
        System.out.println("\t\t\t\t\t\t=======================================================================\n");
        System.out.println("\t\t\t\t\t\t\t\t\tWhat is an Stack?\n");
        System.out.println("\t\t\t\t\t\tA stack is an abstract data type that holds an ordered, linear sequence");
        System.out.println("\t\t\t\t\t\tof items. In contrast to a queue, a stack is a last in, first out (LIFO)");
        System.out.println("\t\t\t\t\t\tstructure. A real-life example is a stack of plates: you can only take a ");
        System.out.println("\t\t\t\t\t\tplate from the top of the stack, and you can only add a plate to the");
        System.out.println("\t\t\t\t\t\ttop of the stack.\n");
        System.out.println("\t\t\t\t\t\t=======================================================================\n"); 

        while (choice != 4) {
            System.out.println("\n\t\t\t\t\t\tBelow are the Basic Operations of a Stack.");
            System.out.println("\t\t\t\t\t\tChoose an Option.\n"); 
            System.out.println("\t\t\t\t\t\t[1] Push");
            System.out.println("\t\t\t\t\t\t[2] Pop");
            System.out.println("\t\t\t\t\t\t[3] Show");
            System.out.println("\t\t\t\t\t\t[4] Go Back to Menu\n");
            System.out.print("\t\t\t\t\t\tEnter your choice:  ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    clearScreen();
                    push();
                    break;
                case 2:
                    clearScreen();
                    pop();
                    break;
                case 3:
                    clearScreen();
                    display();
                    break;
                case 4:
                    clearScreen();        
                    Menu.main(args);
                    sc.close();     
                    System.exit(0);   
                    break;
                default:
                System.out.println("\n\n\t\t\t\t\t\t -----------------------------------------"); 
                System.out.println("\t\t\t\t\t\t|                                         |"); 
                System.out.println("\t\t\t\t\t\t|       PLEASE ENTER A VALID CHOICE!      |");  
                System.out.println("\t\t\t\t\t\t|                                         |"); 
                System.out.println("\t\t\t\t\t\t -----------------------------------------\n\n");  
            }
        }
    }

    static void push() {
        int val;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n\t\t\t\t\t\tEnter the value:  ");
        val = sc.nextInt();
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
            clearScreen();
            System.out.println("\n\n\t\t\t\t\t\t\t ------------------------"); 
            System.out.println("\t\t\t\t\t\t\t|                       |"); 
            System.out.println("\t\t\t\t\t\t\t|      ITEM PUSHED!     |");  
            System.out.println("\t\t\t\t\t\t\t|                       |"); 
            System.out.println("\t\t\t\t\t\t\t ------------------------\n\n");  
    }

    static void pop() {
        if (head == null) {
            System.out.println("\n\n\t\t\t\t\t\t\t ------------------------"); 
            System.out.println("\t\t\t\t\t\t\t|                       |"); 
            System.out.println("\t\t\t\t\t\t\t|       UNDERFLOW!      |");  
            System.out.println("\t\t\t\t\t\t\t|                       |"); 
            System.out.println("\t\t\t\t\t\t\t ------------------------\n\n"); 
            return;
        }
        int item = head.val;
        head = head.next;
        System.out.println("\n\n\t\t\t\t\t\t\t ------------------------"); 
            System.out.println("\t\t\t\t\t\t\t|                       |"); 
            System.out.println("\t\t\t\t\t\t\t|      ITEM POPPED!     |");  
            System.out.println("\t\t\t\t\t\t\t|                       |"); 
            System.out.println("\t\t\t\t\t\t\t ------------------------\n\n");  
    }

    static void display() {
        if (head == null) {
            System.out.println("\n\n\t\t\t\t\t\t\t ---------------------------"); 
            System.out.println("\t\t\t\t\t\t\t|                          |"); 
            System.out.println("\t\t\t\t\t\t\t|      STACK IS EMPTY!     |");  
            System.out.println("\t\t\t\t\t\t\t|                          |"); 
            System.out.println("\t\t\t\t\t\t\t ---------------------------\n\n");  
            return;
        }
        Node current = head;
        System.out.print("\n\n\t\t\t\t\t\tPrinting Stack elements:  ");
        while (current != null) {
            System.out.print(current.val);
            System.out.print(","); 
            current = current.next;
        }
        System.out.print("\n\n"); 
    }
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
}
