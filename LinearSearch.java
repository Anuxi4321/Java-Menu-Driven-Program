import java.util.Scanner;

public class LinearSearch {

    static int linearSearch(int[] arr, int n, int val) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n\t\t\t\t\t\tEnter the size of the array:   ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int choice, val, index;
        clearScreen();

        System.out.println("\n\n\t\t\t ...      ...  ...       ... .........      ...       .....               .::.    ........      ...      ......            .:::.   ...     ...    "); 
        System.out.println("\t\t\t=***      ***- ***=     .***.+********:    .***:    .+*****+-:          :+%@@*-: -********.    :***:     ******+-:       :=#@@@*=:-***.    ***-"); 
        System.out.println("\t\t\t*@@@      @@@=.%@@%-    .@@@:%@@@@@@@@-    *@@@+    .#@@@@@@@%-        =@@@@@@@# +@@@@@@@@.    +@@@#     @@@@@@@@%-     +%@@@@@@@%*@@%:    @@@+");  
        System.out.println("\t\t\t*@@@      @@@=.%@@@#.   .@@@:%@@@@@@@@-    @@@@%:   .#@@@@@@@@%.       @@@@@@@@# +@@@@@@@@.   :#@@@%:    @@@@@@@@@%-   *@@@@@@@@@*+@@%:    @@@+"); 
        System.out.println("\t\t\t*@@@      @@@=.%@@@@-   .@@@:%@@#:::::    +@@@@@-   .#@@+::=@@@-      +@@%=::-@. +@@@:::::    =@@@@@*    @@@*::*@@@=  #@@@@#-::+@-=@@%:    @@@+");
        System.out.println("\t\t\t*@@@      @@@=.%@@@@@:  .@@@:%@@*         %@@@@@%.  .#@@=  :@@@*      @@@*       +@@@        .*@@@@@#    @@@+   @@@= :@@@@=       =@@%:    @@@+"); 
        System.out.println("\t\t\t*@@@      @@@=.%@@@@@*  .@@@:%@@#        -@@@*@@@.  .#@@=  :@@@+      *@@@+      +@@@        -@@@:@@@=   @@@+   @@@= %@@@+        =@@%:    @@@+");  
        System.out.println("\t\t\t*@@@      @@@=.%@@%@@@- .@@@:%@@%====-   *@@%.*@@*  .#@@+.:=@@@.       @@@@%-:   +@@@====-   =@@%.@@@+   @@@+.:=@@@= %@@#         =@@@+====@@@+"); 
        System.out.println("\t\t\t*@@@      @@@=.%@@*+@@@ .@@@:%@@@@@@@@  .#@@* =@@@  .#@@%#@@@@#        =%@@@@@-  +@@@@@@@@. .%@@= =@@%:  @@@%%@@@@#:.%@@#         =@@@@@@@@@@@+");
        System.out.println("\t\t\t*@@@      @@@=.%@@+:%@@*:@@@:%@@@@@@@@  =@@@. :%@@= .#@@@@@@@*.         :*@@@@@= +@@@@@@@@. -@@@:  @@@=  @@@@@@@@*- .%@@#         =@@@@@@@@@@@+"); 
        System.out.println("\t\t\t*@@@      @@@=.%@@+ =@@@*@@@:%@@%=---- .*@@@***%@@@ .#@@#@@@#:            :*@@@@=+@@@-----  %@@@#**@@@#. @@@@@@@@.   %@@#.        =@@@+----@@@+");  
        System.out.println("\t\t\t*@@@      @@@=.%@@+  #@@@@@@:%@@*      -@@@@@@@@@@@-.#@@=*@@@-              =@@@*+@@@       @@@@@@@@@@@: @@@+#@@@+   %@@@+        =@@%:    @@@+"); 
        System.out.println("\t\t\t*@@@      @@@=.%@@+   @@@@@@:%@@*      =@@@@@@@@@@@%.#@@= @@@@:       #+    .@@@*+@@@      #@@@@@@@@@@@* @@@+ %@@@=  .@@@@=       =@@%:    @@@+");
        System.out.println("\t\t\t*@@@      @@@=.%@@+   @@@@@@:%@@*      =@@@@@@@@@@@%.#@@= @@@@:       #+    .@@@*+@@@      #@@@@@@@@@@@* @@@+ %@@@=  .@@@@=       =@@%:    @@@+"); 
        System.out.println("\t\t\t*@@@@@@@@ @@@=.%@@+    %@@@@:%@@@@@@@@*@@@.     :@@@%#@@=  :@@@@.    #@@@@@@@@@%:+@@@@@@@@*@@@=     :@@@=@@@+  =@@@*.  %@@@@@@@@@*=@@%:    @@@+");  
        System.out.println("\t\t\t*@@@@@@@@ @@@=.%@@+    .@@@@:%@@@@@@@@@@@#.      %@@@%@@=   +@@@#.   +#@@@@@@@%= +@@@@@@@@@@@#       *@@@@@@+   *@@@+   +%@@@@@@@%+@@%:    @@@+"); 
        System.out.println("\t\t\t-++++++++ +++: =+=:     =+++.=+++++++++++:       -++==++:   .=++=.    .++*##*+-  :+++++++++++-       :++++++:    ++++.   :+*###++::=+=.    =++:");
        System.out.println("\t\t\t                                                                         .::                                                .:.                "); 
        System.out.println("\t\t\t\t\t\t==============================================================================\n");
        System.out.println("\t\t\t\t\t\t\t\t\tWhat is a Linear Search?\n");
        System.out.println("\t\t\t\t\t\tLinear search is also called as sequential search algorithm. It is the");
        System.out.println("\t\t\t\t\t\tsimplest searching algorithm. In Linear search, we simply traverse ");
        System.out.println("\t\t\t\t\t\tthe list completely and match each element of the list with the item ");
        System.out.println("\t\t\t\t\t\twhose location is to be found. If the match is found, then the location of");
        System.out.println("\t\t\t\t\t\tthe item is returned; otherwise, the algorithm returns NULL.\n");
        System.out.println("\t\t\t\t\t\t==============================================================================");

        do {
            
            System.out.println("\n\t\t\t\t\t\tBelow are the Basic Operations of a Linear Search.");
            System.out.println("\t\t\t\t\t\tChoose an Option.\n");
            System.out.println("\t\t\t\t\t\t[1] Search");
            System.out.println("\t\t\t\t\t\t[2] Insert");
            System.out.println("\t\t\t\t\t\t[3] Delete");
            System.out.println("\t\t\t\t\t\t[4] Display");
            System.out.println("\t\t\t\t\t\t[5] Go back to Menu\n");
            System.out.print("\t\t\t\t\t\tEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\tInput the value to be searched: ");
                    val = sc.nextInt();
                    int result = linearSearch(arr, n, val);
                    if (result == -1) {
                        clearScreen();
                        System.out.println("\n\n\t\t\t\t\t\t --------------------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                            |"); 
                        System.out.println("\t\t\t\t\t\t|       ELEMENT NOT FOUND IN THE ARRAY       |");  
                        System.out.println("\t\t\t\t\t\t|                                            |"); 
                        System.out.println("\t\t\t\t\t\t --------------------------------------------\n");
                    } else {
                        clearScreen();
                        System.out.println("\n\t\t\t\t\t\t ---------------------------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                                  |"); 
                        System.out.println("\t\t\t\t\t\t|       ELEMENT FOUND AT INDEX " + result + " IN THE ARRAY      |");  
                        System.out.println("\t\t\t\t\t\t|                                                  |"); 
                        System.out.println("\t\t\t\t\t\t -------------------------------------------------\n");
                    }
                    break;

                case 2:
                    if (n == arr.length) {
                        clearScreen();
                        System.out.println("\n\n\t\t\t\t\t\t ---------------------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                            |"); 
                        System.out.println("\t\t\t\t\t\t|        ARRAY IS FULL, CANNOT ADD MORE      |");  
                        System.out.println("\t\t\t\t\t\t|                                            |"); 
                        System.out.println("\t\t\t\t\t\t -------------------------------------------\n");
                    } else {
                        clearScreen();
                        System.out.print("\n\n\t\t\t\t\t\tEnter the value to be added: ");
                        val = sc.nextInt();
                        arr[n++] = val;
                        System.out.println("\n\n\t\t\t\t\t\t --------------------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                            |"); 
                        System.out.println("\t\t\t\t\t\t|            ELEMENT ADDED TO ARRAY !        |");  
                        System.out.println("\t\t\t\t\t\t|                                            |"); 
                        System.out.println("\t\t\t\t\t\t --------------------------------------------\n");
                    }
                    break;

                case 3:
                    if (n == 0) {
                        clearScreen();
                        System.out.println("\n\n\t\t\t\t\t\t ---------------------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                            |"); 
                        System.out.println("\t\t\t\t\t\t|        ARRAY IS EMPTY, CANNOT DELETE       |");  
                        System.out.println("\t\t\t\t\t\t|                                            |"); 
                        System.out.println("\t\t\t\t\t\t -------------------------------------------\n");
                    } else {
                        clearScreen();
                        System.out.print("\n\n\t\t\t\t\t\tEnter the index of the element to be deleted (0 to " + (n-1) + "): ");
                        index = sc.nextInt();
                        if (index < 0 || index >= n) {
                            clearScreen();
                            System.out.println("\n\n\t\t\t\t\t\t ---------------------------------------------------"); 
                            System.out.println("\t\t\t\t\t\t|                                                  |"); 
                            System.out.println("\t\t\t\t\t\t|            INVALID INDEX, DELETION FAILED        |");  
                            System.out.println("\t\t\t\t\t\t|                                                  |"); 
                            System.out.println("\t\t\t\t\t\t --------------------------------------------------\n");
                        } else {
                            clearScreen();
                            for (int i = index; i < n-1; i++) {
                                arr[i] = arr[i+1];
                            }
                            n--;
                            System.out.println("\n\n\t\t\t\t\t\t --------------------------------------------"); 
                            System.out.println("\t\t\t\t\t\t|                                            |"); 
                            System.out.println("\t\t\t\t\t\t|          ELEMENT DELETED FROM ARRAY        |");  
                            System.out.println("\t\t\t\t\t\t|                                            |"); 
                            System.out.println("\t\t\t\t\t\t --------------------------------------------\n");
                        }
                    }
                    break;

                case 4:
                    clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\tThe elements of the array are - ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println("\n\n");
                    break;

                case 5:
                    clearScreen();        
                    Menu.main(args);
                    sc.close();     
                    System.exit(0);
                    break;

                default:
                    System.out.println("\n\n\t\t\t\t\t\t ---------------------------------"); 
                    System.out.println("\t\t\t\t\t\t|                                |"); 
                    System.out.println("\t\t\t\t\t\t|        INVALID CHOICE !        |");  
                    System.out.println("\t\t\t\t\t\t|                                |"); 
                    System.out.println("\t\t\t\t\t\t ---------------------------------\n");
            }
        } while (choice != 5);
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
}
