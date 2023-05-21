import java.util.Scanner;

public class PriorityQueue {

    int[] heap;
    int size;
    
    public PriorityQueue() {
        heap = new int[40];
        size = -1;
    }
    
    int parent(int i) {
        return (i - 1) / 2;
    }
    
    int leftChild(int i) {
        return i * 2 + 1;
    }
    
    int rightChild(int i) {
        return i * 2 + 2;
    }
    
    public int getMax() {
        return heap[0];
    }
    
    public int getMin() {
        return heap[size];
    }
    
    void moveUp(int i) {
        while (i > 0) {
            if (heap[parent(i)] < heap[i]) {
                int temp = heap[parent(i)];
                heap[parent(i)] = heap[i];
                heap[i] = temp;
            }
            i = parent(i);
        }
    }
    
    void moveDown(int k) {
        int index = k;
        int left = leftChild(k);
        if (left <= size && heap[left] > heap[index]) {
            index = left;
        }
        int right = rightChild(k);
        if (right <= size && heap[right] > heap[index]) {
            index = right;
        }
        if (k != index) {
            int temp = heap[index];
            heap[index] = heap[k];
            heap[k] = temp;
            moveDown(index);
        }
    }
    
    public void insert(int p) {
        clearScreen();
        size++;
        heap[size] = p;
        moveUp(size);
    }
    
    public void delete(int i) {
        clearScreen();
        heap[i] = heap[0] + 1;
        moveDown(0);
        removeMax();
    }
    
    public void removeMax() {
        int r = heap[0];
        heap[0] = heap[size];
        size--;
        moveDown(0);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue pq = new PriorityQueue();
        int choice = 0;

        System.out.println("\n\n\t\t\t\t\t\t          ....                                                                 ");
        System.out.println("\t\t\t\t\t\t       .:*@@@#-.    .+++-     :+++-:+++++++++=:=++=.    -+++:.=+++++++++        ");  
        System.out.println("\t\t\t\t\t\t      -%@@@@@@@%=.  -@@@*     =@@@+-%@@@@@@@@*=#@@*.    +@@@-:%@@@@@@@@@.    ");  
        System.out.println("\t\t\t\t\t\t     -@@@@@@@@@@@*. -@@@*     =@@@+-%@@@@@@@@*=#@@*.    +@@@-:%@@@@@@@@@.      ");  
        System.out.println("\t\t\t\t\t\t    -@@@@@###%@@@@* -@@@*     =@@@+-%@@%#####==#@@*.    +@@@-:%@@@######.    ");
        System.out.println("\t\t\t\t\t\t   .@@@@%*. .=#@@@%--@@@*     =@@@+-%@@+      :#@@*.    +@@@-:%@@#.         ");
        System.out.println("\t\t\t\t\t\t   -@@@@=     .#@@@#-@@@*     =@@@+-%@@+      :#@@*.    +@@@-:%@@#.         ");  
        System.out.println("\t\t\t\t\t\t  .%@@@#       :@@@#=@@@*     =@@@+-%@@*..... :#@@*.    +@@@-:%@@#:....     ");  
        System.out.println("\t\t\t\t\t\t  .@@@@-       :@@@%*@@@*     =@@@+-%@@%+++++::#@@*.    +@@@-:%@@%*++++:      ");  
        System.out.println("\t\t\t\t\t\t  .@@@%        :@@@@%@@@*     =@@@+-%@@@@@@@@=:#@@*.    +@@@-:%@@@@@@@@=       ");
        System.out.println("\t\t\t\t\t\t  .@@@%.       :@@@@#@@@*     =@@@+-%@@@@@@@@=:#@@*.    +@@@-:%@@@@@@@@=  ");
        System.out.println("\t\t\t\t\t\t  .@@@@-       :@@@%*@@@*     =@@@+-%@@#+++++::#@@*.    *@@@-:%@@%+++++:   ");  
        System.out.println("\t\t\t\t\t\t  .@@@@-       :@@@%*@@@*     =@@@+-%@@#+++++::#@@*.    *@@@-:%@@%+++++:   ");  
        System.out.println("\t\t\t\t\t\t   -@@@@=     :#@@@#-@@@%-   .+@@@+-%@@+      :#@@@-    #@@@:.%@@#.       ");  
        System.out.println("\t\t\t\t\t\t   .%@@@%+=--+#@@@%-:%@@@#=::*%@@@=-%@@+       *@@@#-::+%@@@:.%@@#.       ");
        System.out.println("\t\t\t\t\t\t    -@@@@@%%%@@@@@=  =@@@@%#%@@@@#:-%@@%*****=.+@@@@%##@@@@%:.%@@@******    ");
        System.out.println("\t\t\t\t\t\t    -@@@@@%%%@@@@@=  =@@@@%#%@@@@#:-%@@%*****=.+@@@@%##@@@@%:.%@@@******    ");
        System.out.println("\t\t\t\t\t\t      -#@@@@@@@%-.    :*@@@@@@@%=. -%@@@@@@@@*. :#@@@@@@@@=  .%@@@@@@@@@.   ");
        System.out.println("\t\t\t\t\t\t       .-*@@@@%+..=+   .:=***+-:   .::::::::::   .:=***+-:    ::::::::::     ");
        System.out.println("\t\t\t\t\t\t       .-*@@@@%+..=+   .:=***+-:   .::::::::::   .:=***+-:    ::::::::::     ");
        System.out.println("\t\t\t\t\t\t       .-*@@@@%+..=+   .:=***+-:   .::::::::::   .:=***+-:    ::::::::::     ");
        System.out.println("\t\t\t\t\t\t       -*...-#@@@@@#.                                                        ");
        System.out.println("\t\t\t\t\t\t             ..-#*-.                                                          \n");
        System.out.println("\t\t\t\t\t\t=======================================================================\n");
        System.out.println("\t\t\t\t\t\t\t\t\tWhat is a Priority Queue?\n");
        System.out.println("\t\t\t\t\t\tA priority queue is an abstract data type that behaves similarly to ");
        System.out.println("\t\t\t\t\t\tthe normal queue except that each element has some priority, ");
        System.out.println("\t\t\t\t\t\ti.e., the element with the highest priority would come first in a ");
        System.out.println("\t\t\t\t\t\tpriority queue. The priority of the elements in a priority queue ");
        System.out.println("\t\t\t\t\t\twill determine the order in which elements are removed from the ");
        System.out.println("\t\t\t\t\t\tpriority queue.");
        System.out.println("\n\t\t\t\t\t\tQueue is referred to be as First In First Out list. \n");
        System.out.println("\t\t\t\t\t\t=======================================================================");

        do {
            System.out.println("\n\t\t\t\t\t\tBelow are the Basic Operations of a Priority Queue.");
            System.out.println("\t\t\t\t\t\tChoose an Option.\n"); 
            System.out.println("\t\t\t\t\t\t[1] Insert");
            System.out.println("\t\t\t\t\t\t[2] Delete");
            System.out.println("\t\t\t\t\t\t[3] Maximum element");
            System.out.println("\t\t\t\t\t\t[4] Minimum element");
            System.out.println("\t\t\t\t\t\t[5] Display");
            System.out.println("\t\t\t\t\t\t[6] Go Back to Menu\n");
            System.out.print("\t\t\t\t\t\tEnter your choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\tEnter the element to be inserted: ");
                    int element = sc.nextInt();
                    pq.insert(element);
                    break;
                case 2:
                    clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\tEnter the index of the element to be deleted: ");
                    int index = sc.nextInt();
                    pq.delete(index);
                    break;
                case 3:
                    clearScreen();
                    int max = pq.getMax();
                    System.out.println("\n\n\t\t\t\t\t\tThe Element with the HIGHEST priority is: " + max + "\n\n");
                    break;
                case 4:
                    clearScreen();
                    int min = pq.getMin();
                    System.out.println("\n\n\t\t\t\t\t\tThe element with the LOWEST priority is: " + min + "\n\n");
                    break;
                case 5:
                    clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\tElements in priority queue: ");
                    for (int i = 0; i <= pq.size; i++) {
                        System.out.print(pq.heap[i] + " ");
                    }
                    System.out.println("\n\n");
                    break;
                case 6:
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
                    break;
            }
        } while (choice != 6);
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
}
