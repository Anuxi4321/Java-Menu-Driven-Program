import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int[] ArrayList = {1, 3, 5, 7, 8};
        int n = 5;
        Scanner sc = new Scanner(System.in);

            System.out.println("\n\n\t\t\t\t\t\t       =++:     :+++++-.    :+++++=.         .++=    -++=.     .+++-   ");
            System.out.println("\t\t\t\t\t\t      @@@#.    +@@@@@@@@:  +@@@@@@@@-      .#@@@.   =@@@#    .@@@%      ");  
            System.out.println("\t\t\t\t\t\t      @@@#.    +@@@@@@@@:  +@@@@@@@@-      .#@@@.   =@@@#    .@@@%      ");  
            System.out.println("\t\t\t\t\t\t     %@@@@*    +@@@==*@@@# +@@@===%@@%     *@@@@@    .@@@%: +@@@*     ");  
            System.out.println("\t\t\t\t\t\t     =@@@@@@.   +@@@  .#@@% +@@@   *@@%.    @@@@@@=    :@@@#-@@@#.    "); 
            System.out.println("\t\t\t\t\t\t    #@@@#@@+   +@@@   #@@% +@@@   *@@%.   +@@#%@@%     =@@@@@@@=     ");
            System.out.println("\t\t\t\t\t\t   :%@@=-@@@   +@@@ .=%@@# +@@@...#@@%    @@@+=@@@-    .%@@@@@*     ");
            System.out.println("\t\t\t\t\t\t   +@@@ :%@@-  +@@@#%@@@@: +@@@#%@@@@+   -@@@- %@@*     :%@@@%          ");
            System.out.println("\t\t\t\t\t\t  :#@@*  +@@@  +@@@@@@@#=  +@@@@@@@%+    #@@#  +@@%:     +@@@-       ");
            System.out.println("\t\t\t\t\t\t  -@@@#**%@@@- +@@@@@@@:   +@@@*@@@=    -@@@@**#@@@+     =@@@         ");
            System.out.println("\t\t\t\t\t\t  -@@@#**%@@@- +@@@@@@@:   +@@@*@@@=    -@@@@**#@@@+     =@@@         ");
            System.out.println("\t\t\t\t\t\t :@@@@@@@@@@@%.+@@@ =@@@*  +@@@ -@@@@  .#@@@@@@@@@@@-    =@@@      ");
            System.out.println("\t\t\t\t\t\t =@@@******@@@*+@@@ .*@@@= +@@@  =@@@%.=@@@******@@@+    =@@@          ");
            System.out.println("\t\t\t\t\t\t @@@=      %@@#*@@@  :%@@@-+@@@   +@@@**@@%      =@@@:   =@@@        ");
            System.out.println("\t\t\t\t\t\t-@@@:      -@@@@@@@   :@@@%%@@@   .%@@@@@@-      .@@@=   =@@@      ");
            System.out.println("\t\t\t\t\t\t.:::        :::::::    .:::::::    .::::::        :::.   .:::     \n\n");
            System.out.println("\t\t\t\t\t\t=======================================================================\n");
            System.out.println("\t\t\t\t\t\t\t\t\tWhat is an Array?\n");
            System.out.println("\t\t\t\t\t\tArray is a container which can hold a fix number of items and");
            System.out.println("\t\t\t\t\t\tthese items should be of the same type. Most of the data");
            System.out.println("\t\t\t\t\t\tstructures make use of arrays to implement their algorithms.\n");
            System.out.println("\t\t\t\t\t\t=======================================================================\n");

        int choice = 0;
        do {
            
            System.out.println("\n\t\t\t\t\t\tBelow are the Basic Operations of an Array.");
            System.out.println("\t\t\t\t\t\tChoose an Option.\n");
            System.out.println("\t\t\t\t\t\t[1] Traverse");
            System.out.println("\t\t\t\t\t\t[2] Insert");
            System.out.println("\t\t\t\t\t\t[3] Delete");
            System.out.println("\t\t\t\t\t\t[4] Search");
            System.out.println("\t\t\t\t\t\t[5] Update");
            System.out.println("\t\t\t\t\t\t[6] Go Back to Menu\n");
            System.out.print("\t\t\t\t\t\tEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    clearScreen();                    
                    System.out.println("\n\n\t\t\t\t\t\t --------------------------------------------"); 
                    System.out.println("\t\t\t\t\t\t|                                             |"); 
                    System.out.println("\t\t\t\t\t\t|          THE ORIGINAL ARRAY ELEMENTS        |");  
                    System.out.println("\t\t\t\t\t\t|                                             |"); 
                    System.out.println("\t\t\t\t\t\t --------------------------------------------\n");
                    for (int i = 0; i < n; i++) {
                        System.out.printf("\t\t\t\t\t\t\t\tArray[%d] = %d \n", i, ArrayList[i]);
                    }
                    break;
                case 2:
                    clearScreen();
                    if (n < ArrayList.length) {
                        System.out.print("\t\t\t\t\t\t\tEnter the value to insert: ");
                        int item = sc.nextInt();
                        System.out.print("\t\t\t\t\t\t\tEnter the index to insert the value at: ");
                        int k = sc.nextInt();
                        for (int i = n - 1; i >= k; i--) {
                            ArrayList[i + 1] = ArrayList[i];
                        }
                        ArrayList[k] = item;
                        n++;
                        System.out.println("\n\n\t\t\t\t\t\t\t    ---------------------------"); 
                        System.out.println("\t\t\t\t\t\t\t   |                           |"); 
                        System.out.println("\t\t\t\t\t\t\t   |       VALUE INSERTED!     |");  
                        System.out.println("\t\t\t\t\t\t\t   |                           |"); 
                        System.out.println("\t\t\t\t\t\t\t    ---------------------------");
                    } else {
                        System.out.println("\n\n\t\t\t\t\t\t ---------------------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                             |"); 
                        System.out.println("\t\t\t\t\t\t|       ARRAY IS FULL!! INSERTION FAILED      |");  
                        System.out.println("\t\t\t\t\t\t|                                             |"); 
                        System.out.println("\t\t\t\t\t\t ---------------------------------------------\n");
                    }
                    break;
                case 3:
                    clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\tEnter the index of the element to delete: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < n) {
                        for (int i = index; i < n - 1; i++) {
                            ArrayList[i] = ArrayList[i + 1];
                        }
                        n--;
                        clearScreen();
                        System.out.println("\n\n\t\t\t\t\t\t ---------------------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                             |"); 
                        System.out.println("\t\t\t\t\t\t|       ELEMENT DELETED SUCCESSFULLY !!       |");  
                        System.out.println("\t\t\t\t\t\t|                                             |"); 
                        System.out.println("\t\t\t\t\t\t ---------------------------------------------");
                    } else {
                        clearScreen();
                        System.out.println("\n\n\t\t\t\t\t\t -----------------------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                               |"); 
                        System.out.println("\t\t\t\t\t\t|       DELETION FAILED!! INVALID INDEX :c      |");  
                        System.out.println("\t\t\t\t\t\t|                                               |"); 
                        System.out.println("\t\t\t\t\t\t -----------------------------------------------");
                    }
                    break;
                case 4:
                    clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\tEnter the value to search for: ");
                    int value = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (ArrayList[i] == value) {
                            clearScreen();
                            System.out.printf("\n\n\t\t\t\t\t\t\tValue %d found at index %d.\n", value, i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        clearScreen();
                        System.out.printf("\n\n\t\t\t\t\t\t\tValue %d not found in the array.\n", value);
                    }
                    break;
                case 5:
                    clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\tEnter the index of the element to update: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < n) {
                        System.out.print("\n\n\t\t\t\t\t\t\tEnter the new value: ");
                        int newValue = sc.nextInt();
                        ArrayList[idx] = newValue;
                        System.out.println("\n\n\t\t\t\t\t\t ------------------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                             |"); 
                        System.out.println("\t\t\t\t\t\t|       ELEMENT UPDATED SUCCESSFULLY !!       |");  
                        System.out.println("\t\t\t\t\t\t|                                             |"); 
                        System.out.println("\t\t\t\t\t\t --------------------------------------------\n");
                    } else {
                        System.out.println("\n\n\t\t\t\t\t\t -----------------------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                               |"); 
                        System.out.println("\t\t\t\t\t\t|        UPDATE FAILED!! INVALID INDEX :c       |");  
                        System.out.println("\t\t\t\t\t\t|                                               |"); 
                        System.out.println("\t\t\t\t\t\t -----------------------------------------------\n");
                    }
                    break;
                case 6:
                    clearScreen();        
                    Menu.main(args);
                    sc.close();     
                    System.exit(0);
                    break;
                    default:
                    clearScreen();
                    System.out.println("\n\t\t\t\t\t\t    -----------------------------------------"); 
                    System.out.println("\t\t\t\t\t\t   |                                         |"); 
                    System.out.println("\t\t\t\t\t\t   |       PLEASE ENTER A VALID CHOICE!      |");  
                    System.out.println("\t\t\t\t\t\t   |                                         |"); 
                    System.out.println("\t\t\t\t\t\t    -----------------------------------------\n\n"); 
                    break;
            }
        } while (choice != 6);
    
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
       System.out.flush();
}
}
