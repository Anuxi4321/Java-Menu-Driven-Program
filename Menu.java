import java.util.Scanner;

// Creator : Vincent Nick Y. Malazarte //
// Email: vincntnick@gmail.com //

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        
        try {
            while (isRunning) {
            System.out.println("\n\n\t\t\t\t\t\t  %@@    #@=   =@@@@@@@@@ @@*       :@@@@%    #@@@%    *@@.    *@@..@@@@@@:");
            System.out.println("\t\t\t\t\t\t -@@=   @@%   %@@*@@@@@@ @@*      @@@@@@@@ .@@@@@@@*  @@@#    @@@:.@@@@@@:");
            System.out.println("\t\t\t\t\t\t  @@%  .@@@   @@@+@@==== @@*     @@@@@*@@  @@@@+%@@@= @@@@   =@@@=.@@*===.");
            System.out.println("\t\t\t\t\t\t  @@@  =@@@.  @@*+@@     @@*    %@@%      @@@-    @@@ @@@@+  @@@@+.@@:");
            System.out.println("\t\t\t\t\t\t  +@@  @@@@+ =@@.+@@     @@*    @@@       @@@     +@@:@@@@@ .@@@@#.@@:");
            System.out.println("\t\t\t\t\t\t  .@@+ @@*@@ %@@ +@@@@@@ @@*    @@@       @@%     :@@+@@+@@.*@@@@%.@@@@@@");
            System.out.println("\t\t\t\t\t\t   @@%:@@.@@ @@% +@@@@@@ @@*    @@@       @@%     :@@*@@-@@#@@-%@@.@@@@@@");
            System.out.println("\t\t\t\t\t\t   %@@*@# @@-@@- +@@     @@*    @@@       @@@     *@@-@@.-@@@@ #@@.@@:");
            System.out.println("\t\t\t\t\t\t   :@@@@- #@@@@  +@@     @@*    #@@@      @@@=   .@@@-@@  @@@% *@@.@@:");
            System.out.println("\t\t\t\t\t\t    @@@@  :@@@@  +@@%%%% @@@%%%# @@@@@%@@  @@@@%@@@@--@@  %@@: +@@.@@%%%%:");
            System.out.println("\t\t\t\t\t\t    @@@@   @@@+  +@@@@@@ @@@@@@@  @@@@@@@@ .@@@@@@@= +@@  :@@  =@@:@@@@@@:");
            System.out.println("\t\t\t\t\t\t    =@@+   @@@   +@@@@@@ @@@@@@@    @@@@+    +@@@#   #@@   #+  :@@-@@@@@@:\n\n");
            System.out.println("\t\t\t\t\t\t\t -----------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t|                                                           |");
            System.out.println("\t\t\t\t\t\t\t|    Welcome to the DATA STRUCTURES Menu Driven Program!    |");
            System.out.println("\t\t\t\t\t\t\t|                                                           |");
            System.out.println("\t\t\t\t\t\t\t -----------------------------------------------------------\n");
            System.out.println("\t\t\t\t\t\t\t[1] Array");
            System.out.println("\t\t\t\t\t\t\t[2] Linked List");
            System.out.println("\t\t\t\t\t\t\t[3] Stack");
            System.out.println("\t\t\t\t\t\t\t[4] Queue");
            System.out.println("\t\t\t\t\t\t\t[5] Search");
            System.out.println("\t\t\t\t\t\t\t[6] Sort");
            System.out.println("\t\t\t\t\t\t\t[7] Trees");
            System.out.println("\t\t\t\t\t\t\t[8] Graph");
            System.out.println("\t\t\t\t\t\t\t[9] Exit\n");
            System.out.print("\t\t\t\t\t\tEnter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    clearScreen();        
                    Array.main(args);    
                    System.exit(0);      
                    break;
                case 2:
            clearScreen();
            System.out.println("\n\n\t\t\t\t\t\t\t\t -------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t|                                     |");
            System.out.println("\t\t\t\t\t\t\t\t|    You have selected Linked List    |");
            System.out.println("\t\t\t\t\t\t\t\t|                                     |");
            System.out.println("\t\t\t\t\t\t\t\t -------------------------------------\n");
            System.out.println("\t\t\t\t\t\t\t\tChoose one of the following options:\n");
            System.out.println("\t\t\t\t\t\t\t\t[1] Singly-Linked List");
            System.out.println("\t\t\t\t\t\t\t\t[2] Doubly-Linked List");
            System.out.println("\t\t\t\t\t\t\t\t[3] Circular Linked List");
            System.out.println("\t\t\t\t\t\t\t\t[4] Go back to Menu\n");
            System.out.print("\t\t\t\t\t\t\t\tEnter your Choice:  ");

            int LLChoice = scanner.nextInt();

            switch (LLChoice) {
                case 1:
                    clearScreen();
                    System.out.println("\n\n\t\t\t\t\t\t\t\tWhich type of data would you like to store in the Singly Linked List?\n");
                    System.out.println("\t\t\t\t\t\t\t\t[1] Integer");
                    System.out.println("\t\t\t\t\t\t\t\t[2] Character");
                    System.out.println("\t\t\t\t\t\t\t\t[3] Go back to Menu\n");
                    System.out.print("\t\t\t\t\t\t\t\tEnter your Choice: ");

                    int dataTypeChoice = scanner.nextInt();

                    if (dataTypeChoice == 1) {
                        clearScreen();
                        SinglyLinkedListInt.main(args);
                    } else if (dataTypeChoice == 2) {
                        clearScreen();
                        SinglyLinkedListChar.main(args);
                    } else if (dataTypeChoice == 3) {
                        clearScreen();        
                        Menu.main(args);    
                        System.exit(0); 
                    }else {
                        clearScreen();
                        System.out.println("\n\n\t\t\t\t\t\t\t\t ---------------------------------"); 
                        System.out.println("\t\t\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t\t\t|        INVALID CHOICE !        |");  
                        System.out.println("\t\t\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------\n");
                    }
                    break;

                case 2:
                    clearScreen();
                    System.out.println("\n\n\t\t\t\t\t\t\t\tWhich type of data would you like to store in the Doubly Linked List?\n");
                    System.out.println("\t\t\t\t\t\t\t\t[1] Integer");
                    System.out.println("\t\t\t\t\t\t\t\t[2] Character");
                    System.out.println("\t\t\t\t\t\t\t\t[3] Go back to Menu\n");
                    System.out.print("\t\t\t\t\t\t\t\tEnter your Choice: ");

                    dataTypeChoice = scanner.nextInt();
                    clearScreen();

                    if (dataTypeChoice == 1) {
                        clearScreen();
                        DoublyLinkedListInt.main(args);
                    } else if (dataTypeChoice == 2) {
                        clearScreen();
                        DoublyLinkedListChar.main(args);
                    } else if (dataTypeChoice == 3) {
                        clearScreen();        
                        Menu.main(args);    
                        System.exit(0);  
                    }else {
                        clearScreen();
                        System.out.println("\n\n\t\t\t\t\t\t\t\t ---------------------------------"); 
                        System.out.println("\t\t\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t\t\t|        INVALID CHOICE !        |");  
                        System.out.println("\t\t\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------\n");
                    }
                    break;

                case 3:
                    clearScreen();
                    System.out.println("\n\n\t\t\t\t\t\t\t\tWhich type of data would you like to store in the Circular Linked List?\n");
                    System.out.println("\t\t\t\t\t\t\t\t[1] Integer");
                    System.out.println("\t\t\t\t\t\t\t\t[2] Character");
                    System.out.println("\t\t\t\t\t\t\t\t[3] Go back to Menu\n");
                    System.out.print("\t\t\t\t\t\t\t\tEnter your Choice: ");

                    dataTypeChoice = scanner.nextInt();

                    if (dataTypeChoice == 1) {
                        clearScreen();
                        CircularLinkedListInt.main(args);
                    } else if (dataTypeChoice == 2) {
                        clearScreen();
                        CircularLinkedListChar.main(args);
                    } else if (dataTypeChoice == 3) {
                        clearScreen();        
                        Menu.main(args);    
                        System.exit(0);  
                    }else {
                        clearScreen();
                        System.out.println("\n\n\t\t\t\t\t\t\t\t ---------------------------------"); 
                        System.out.println("\t\t\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t\t\t|        INVALID CHOICE !        |");  
                        System.out.println("\t\t\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------\n");
                    }
                    break;

                case 4:
                    clearScreen();        
                    Menu.main(args);    
                    System.exit(0);      
                    break;
                default:
                    clearScreen();
                    System.out.println("\n\n\t\t\t\t\t\t\t\t ---------------------------------"); 
                        System.out.println("\t\t\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t\t\t|        INVALID CHOICE !        |");  
                        System.out.println("\t\t\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------\n");
                    break;
            }
            break;
                case 3:
                    clearScreen();
                    System.out.println("\n\n\t\t\t\t\t\t\t\t -------------------------------------");
                    System.out.println("\t\t\t\t\t\t\t\t|                                     |");
                    System.out.println("\t\t\t\t\t\t\t\t|       You have selected Stack       |");
                    System.out.println("\t\t\t\t\t\t\t\t|                                     |");
                    System.out.println("\t\t\t\t\t\t\t\t -------------------------------------\n");
                    System.out.println("\t\t\t\t\t\t\t\tChoose one of the following options:\n");
                    System.out.println("\t\t\t\t\t\t\t\t[1] Array Implementation of Stack");
                    System.out.println("\t\t\t\t\t\t\t\t[2] Linked List Implementation of Stack");
                    System.out.println("\t\t\t\t\t\t\t\t[3] Go Back To Menu\n");
                    System.out.print("\t\t\t\t\t\t\t\tEnter your choice: ");
                    int stackOption = scanner.nextInt();

                    switch(stackOption) {
                        case 1:
                        clearScreen();
                        ArrayImpStack.main(args);
                            break;
                        case 2:
                        clearScreen();
                        LinkedListImpStack.main(args);
                            break;
                        case 3:
                        clearScreen();        
                        Menu.main(args);    
                        System.exit(0); 
                            break;
                        default:
                            clearScreen();
                            System.out.println("\n\n\t\t\t\t\t\t\t\t ---------------------------------"); 
                            System.out.println("\t\t\t\t\t\t\t\t|                                |"); 
                            System.out.println("\t\t\t\t\t\t\t\t|        INVALID CHOICE !        |");  
                            System.out.println("\t\t\t\t\t\t\t\t|                                |"); 
                            System.out.println("\t\t\t\t\t\t\t\t ---------------------------------\n");
                            break;
                       }
               
                    break;   
                case 4:
                clearScreen();
                    System.out.println("\n\n\t\t\t\t\t\t\t\t -------------------------------------");
                    System.out.println("\t\t\t\t\t\t\t\t|                                     |");
                    System.out.println("\t\t\t\t\t\t\t\t|       You have selected Queue       |");
                    System.out.println("\t\t\t\t\t\t\t\t|                                     |");
                    System.out.println("\t\t\t\t\t\t\t\t -------------------------------------\n");
                    System.out.println("\t\t\t\t\t\t\t\tChoose one of the following options:\n");
                    System.out.println("\t\t\t\t\t\t\t\t[1] Array Representation of Queue");
                    System.out.println("\t\t\t\t\t\t\t\t[2] Linked List Implementation of Queue");
                    System.out.println("\t\t\t\t\t\t\t\t[3] Circular Queue (Array)");
                    System.out.println("\t\t\t\t\t\t\t\t[4] Double-Ended Queue");
                    System.out.println("\t\t\t\t\t\t\t\t[5] Priority Queue");
                    System.out.println("\t\t\t\t\t\t\t\t[6] Go Back to Menu\n");   
                    System.out.print("\t\t\t\t\t\t\t\tEnter your choice: ");
                    int QueueOption = scanner.nextInt();

                    switch(QueueOption) {
                        case 1:
                        clearScreen();
                        ArrayQueue.main(args);
                            break;
                        case 2:
                        clearScreen();
                        LinkedListQueue.main(args);
                            break;
                        case 3:
                        clearScreen();
                        CircularQueue.main(args);                     
                        break;
                        case 4:
                        clearScreen();
                        Dequeue.main(args);
                        break;
                        case 5:
                        clearScreen();
                        PriorityQueue.main(args);
                        break;
                        case 6:
                        clearScreen();        
                        Menu.main(args);    
                        System.exit(0); 
                        break;
                        default:
                        clearScreen();
                        System.out.println("\n\n\t\t\t\t\t\t\t\t ---------------------------------"); 
                        System.out.println("\t\t\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t\t\t|        INVALID CHOICE !        |");  
                        System.out.println("\t\t\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------\n");
                        break;
                    }           
                    break;   
                case 5:
                clearScreen();
                    System.out.println("\n\n\t\t\t\t\t\t\t\t --------------------------------------");
                    System.out.println("\t\t\t\t\t\t\t\t|                                      |");
                    System.out.println("\t\t\t\t\t\t\t\t|       You have selected Search       |");
                    System.out.println("\t\t\t\t\t\t\t\t|                                      |");
                    System.out.println("\t\t\t\t\t\t\t\t -------------------------------------\n");
                    System.out.println("\t\t\t\t\t\t\t\tChoose one of the following options:\n");
                    System.out.println("\t\t\t\t\t\t\t\t[1] Linear Search");
                    System.out.println("\t\t\t\t\t\t\t\t[2] Binary Search");
                    System.out.println("\t\t\t\t\t\t\t\t[3] Go Back to Menu\n");
                    System.out.print("\t\t\t\t\t\t\t\tEnter your choice: ");
                    int SearchOption = scanner.nextInt();

                    switch(SearchOption) {
                        case 1:
                        clearScreen();
                        LinearSearch.main(args);
                            break;
                        case 2:
                        clearScreen();
                        BinarySearch.main(args);
                            break;
                        case 3:
                        clearScreen();        
                        Menu.main(args);    
                        System.exit(0); 
                            break;
                    }
                        break;
                    case 6:
                    clearScreen();
                    Sorting.main(args);
                         break;
                    case 7:
                    clearScreen();
                    Trees.main(args);
                         break;
                    case 8:
                    clearScreen();
                    GraphData.main(args);
                         break;
                case 9:
                    clearScreen();
                        System.out.println("\n\n\t\t\t\t\t\t\t\t ------------------------------------------------------------"); 
                        System.out.println("\t\t\t\t\t\t\t\t|                                                           |"); 
                        System.out.println("\t\t\t\t\t\t\t\t|        THANK YOU FOR USING THE MENU DRIVEN PROGRAM        |");  
                        System.out.println("\t\t\t\t\t\t\t\t|                                                           |"); 
                        System.out.println("\t\t\t\t\t\t\t\t -----------------------------------------------------------\n");
                    isRunning = false;
                    clearScreen();
                    break;
                default:
                        System.out.println("\n\n\t\t\t\t\t\t\t\t ---------------------------------"); 
                        System.out.println("\t\t\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t\t\t|        INVALID CHOICE !        |");  
                        System.out.println("\t\t\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t\t\t ---------------------------------\n");
                    break;
            }
        }
    } finally {
        scanner.close();
    }
        
        
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
}
