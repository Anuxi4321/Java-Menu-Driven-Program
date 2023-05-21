import java.util.Scanner;

public class BinarySearch {  
    
    static int binarySearch(int a[], int beg, int end, int val)    
    {    
        int mid;    
        if(end >= beg)     
        {  
            mid = (beg + end)/2;    
            if(a[mid] == val)    
            {    
                return mid; 
            }    
            else if(a[mid] < val)     
            {  
                return binarySearch(a, mid+1, end, val);    
            }    
            else    
            {  
                return binarySearch(a, beg, mid-1, val);    
            }    
        }    
        return -1;    
    }
    
    static int[] insertElement(int[] a, int pos, int val) {
        int n = a.length;
        int[] newArr = new int[n+1];
        
        for(int i=0, j=0; i<n+1; i++) {
            if(i == pos) {
                newArr[i] = val;
            } else {
                newArr[i] = a[j++];
            }
        }
        
        return newArr;
    }
    
    static int[] deleteElement(int[] a, int pos) {
        int n = a.length;
        int[] newArr = new int[n-1];
        
        for(int i=0, j=0; i<n-1; i++) {
            if(i == pos) {
                j++;
            }
            newArr[i] = a[j++];
        }
        
        return newArr;
    }
    
    static void displayArray(int[] a) {
        int n = a.length;
        System.out.print("\n\t\t\t\t\t\tArray: ");
        for(int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {  
        int a[] = {8, 10, 22, 27, 37, 44, 49, 55, 69}; 
        int n = a.length; 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n\t\t\t+%%%%#=-:  -%%#.+%%#.    :%%%     :%%#.    *%%%%%#-:  *%%#-    .*%%%:     .+@@@#-: %%%%%%%%+     *%%+    .*%%%%%+-.      .-#@@@%+- %%%:   .*%%-    "); 
        System.out.println("\t\t\t*@@@@@@@#: =@@%.*@@@+    -@@@     %@@@-    *@@@@@@@@= :@@@#.   +@@@=     .#@@@@@@% @@@@@@@@*    -@@@#.   .#@@@@@@@%:    =#@@@@@@@@.@@@-   .#@@="); 
        System.out.println("\t\t\t*@@@%@@@@* =@@%.*@@@@-   -@@@    .@@@@%    *@@@@@@@@@- -@@@=  :@@@%      %@@@@@@@- @@@@@@@@*    +@@@@=   .#@@@@@@@@%   *@@@@@@@@@*.@@@-   .#@@=  ");  
        System.out.println("\t\t\t*@@#  #@@* =@@%.*@@@@#.  -@@@    #@@@@@.   *@@#  .@@@=  %@@@. @@@@      .@@@.  :#: @@@-        :%@@@@+   .#@@-  +@@@: -@@@@%:  -%: @@@-   .#@@= "); 
        System.out.println("\t\t\t*@@#  #@@* =@@%.*@@@@@=  -@@@   .%@@@@@#   *@@#   @@@+  .%@@%=@@@-      .@@@:      @@@-        =@@@@@@:  .#@@-  =@@@- #@@@=        @@@-   .#@@= "); 
        System.out.println("\t\t\t*@@#  #@@* =@@%.*@@@@@=  -@@@   .%@@@@@#   *@@#   @@@+  .%@@%=@@@-      .@@@:      @@@-        =@@@@@@:  .#@@-  =@@@- #@@@=        @@@-   .#@@= ");  
        System.out.println("\t\t\t*@@@%@@@*  =@@%.*@@%+@@% -@@@   *@@#.*@@*  *@@%-+#@@@=    *@@@@#.        =@@@@#=   @@@%####-  :@@@ :@@@. .#@@=-*%@@% =@@@:         @@@%###%@@@=  "); 
        System.out.println("\t\t\t*@@@@@@@@- =@@%.*@@%:%@@#-@@@  -@@@. +@@%  *@@@@@@@@*     .#@@@+          =@@@@@%. @@@@@@@@-  *@@+ .@@@: .#@@@@@@@@. +@@@          @@@@@@@@@@@= "); 
        System.out.println("\t\t\t*@@@##%@@@==@@%.*@@% =@@@+@@@  +@@@::=@@@= *@@@@@@@*       *@@#            .*%@@@% @@@%####-  @@@=::*@@% .#@@@@@@%.  =@@@:         @@@%###%@@@=  ");  
        System.out.println("\t\t\t*@@#  .%@@#+@@%.*@@%  #@@@@@@ .%@@@@@@@@@# *@@%*@@@-       *@@#              .*@@@-@@@=      +@@@@@@@@@@..#@@+@@@*   =@@@*         @@@-   :#@@= "); 
        System.out.println("\t\t\t*@@#   +@@@*@@%.*@@%  .@@@@@@ -@@@@@@@@@@%-*@@#.#@@@-      *@@#          =    :@@@+@@@-      @@@@@@@@@@@#.#@@--@@@#  .#@@@=        @@@-   .#@@="); 
        System.out.println("\t\t\t*@@#   %@@%*@@%.*@@%   -@@@@@ %@@@@@@@@@@@+*@@# .%@@%:     *@@#         *@#.  -@@@-@@@-     =@@@@@@@@@@@@:#@@- =@@@*  =@@@@#:  :%: @@@-   .#@@= ");  
        System.out.println("\t\t\t*@@@*#@@@@+=@@%.*@@%    %@@@@.@@@:     *@@#%@@#  =@@@*.    *@@#        .@@@@@@@@@@ @@@@@@@@*%@@*     :%@@##@@- .*@@@=  *@@@@@@@@@* @@@-   .#@@= "); 
        System.out.println("\t\t\t*@@@@@@@@%:=@@%.*@@%    .%@@@*@@#.      @@@@@@#   +@@@*    *@@#        =#@@@@@@@@+ @@@@@@@@%@@@=      *@@@%@@-  :%@@%:  +%@@@@@@@@.@@@-   .#@@="); 
        System.out.println("\t\t\t*@@@@@%+-: -%@#.+@@#     =@@@@@@-       #@@@@@#    =@@@*   *@@#         .-*@@@@*:  %@@@@@@@@@@#.      -%@@%@@-   :%@@#:  .-#@@@@+- @@%:   .#@@- \n");  
        System.out.println("\t\t\t\t\t\t=======================================================================\n");
        System.out.println("\t\t\t\t\t\t\t\t\tWhat is a Binary Search?\n");
        System.out.println("\t\t\t\t\t\tBinary search is the search technique that works efficiently on ");
        System.out.println("\t\t\t\t\t\tsorted lists. Hence, to search an element into some list using ");
        System.out.println("\t\t\t\t\t\tthe binary search technique, we must ensure that the list is ");
        System.out.println("\t\t\t\t\t\tsorted. \n");
        System.out.println("\t\t\t\t\t\t=======================================================================");


        while(true) {
            System.out.println("\n\t\t\t\t\t\tBelow are the Basic Operations of a Binary Search.");
            System.out.println("\t\t\t\t\t\tChoose an Option.\n"); 
            System.out.println("\t\t\t\t\t\t [1] Search");
            System.out.println("\t\t\t\t\t\t [2] Insert");
            System.out.println("\t\t\t\t\t\t [3] Delete");
            System.out.println("\t\t\t\t\t\t [4] Display");
            System.out.println("\t\t\t\t\t\t [5] Go back to Menu\n");
            System.out.print("\t\t\t\t\t\t Enter your choice: ");
            
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    clearScreen();  
                    System.out.print("\n\t\t\t\t\t\tEnter element to search: ");
                    int val = sc.nextInt();
                    int res = binarySearch(a, 0, n-1, val); 
                    if (res == -1) {
                        clearScreen();  
                        System.out.println("\n\t\t\t\t\t\t ----------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                 |"); 
                        System.out.println("\t\t\t\t\t\t|       ELEMENT NOT FOUND !       |");  
                        System.out.println("\t\t\t\t\t\t|                                 |"); 
                        System.out.println("\t\t\t\t\t\t ----------------------------------\n");
                    } else {
                        clearScreen();  
                        System.out.println("\n\t\t\t\t\t\t --------------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                      |"); 
                        System.out.println("\t\t\t\t\t\t|       ELEMENT FOUND AT INDEX " + res + "       |");  
                        System.out.println("\t\t\t\t\t\t|                                      |"); 
                        System.out.println("\t\t\t\t\t\t --------------------------------------\n");
                    }
                    break;
                case 2:
                clearScreen();  
                    System.out.print("\n\t\t\t\t\t\tEnter element to insert: ");
                    int newVal = sc.nextInt();
                    System.out.print("\n\t\t\t\t\t\tEnter position to insert: ");
                    int pos = sc.nextInt();
                    if(pos < 0 || pos > n) {
                        clearScreen();  
                        System.out.println("\n\t\t\t\t\t\t ---------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t|       INVALID POSITION !       |");  
                        System.out.println("\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t ---------------------------------\n");
                    } else {
                        clearScreen();  
                        a = insertElement(a, pos, newVal);
                        n++;
                        System.out.println("\n\t\t\t\t\t\t ---------------------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                            |"); 
                        System.out.println("\t\t\t\t\t\t|       ELEMENT INSERTED SUCCESSFULLY !      |");  
                        System.out.println("\t\t\t\t\t\t|                                            |"); 
                        System.out.println("\t\t\t\t\t\t -------------------------------------------\n\n");
                        displayArray(a);
                    }
                    break;
                case 3:
                    clearScreen();  
                    System.out.print("\n\t\t\t\t\t\tEnter position to delete: ");
                    int delPos = sc.nextInt();
                    if(delPos < 0 || delPos >= n) {
                        clearScreen();  
                        System.out.println("\n\t\t\t\t\t\t ---------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t|       INVALID POSITION !       |");  
                        System.out.println("\t\t\t\t\t\t|                                |"); 
                        System.out.println("\t\t\t\t\t\t ---------------------------------\n");
                    } else {
                        clearScreen();  
                        a = deleteElement(a, delPos);
                        n--;
                        System.out.println("\n\t\t\t\t\t\t ---------------------------------------------"); 
                        System.out.println("\t\t\t\t\t\t|                                            |"); 
                        System.out.println("\t\t\t\t\t\t|        ELEMENT DELETED SUCCESSFULLY !      |");  
                        System.out.println("\t\t\t\t\t\t|                                            |"); 
                        System.out.println("\t\t\t\t\t\t -------------------------------------------\n");
                        displayArray(a);
                    }
                    break;
                case 4:
                    clearScreen();  
                    displayArray(a);
                    break;
                case 5:
                    clearScreen();        
                    Menu.main(args);
                    sc.close();     
                    System.exit(0);
                    break;
                default:
                        System.out.println("\n\t\t\t\t\t\t ---------------------------------"); 
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
    
