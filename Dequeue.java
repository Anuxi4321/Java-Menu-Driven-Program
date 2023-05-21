import java.util.Scanner;

public class Dequeue {
    static final int SIZE = 5;
    static int[] deque = new int[SIZE];
    static int front = -1, rear = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;

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
        System.out.println("\t\t\t\t\t\t\t\t\tWhat is a Dequeue?\n");
        System.out.println("\t\t\t\t\t\tThe deque stands for Double Ended Queue. Deque is a linear data ");
        System.out.println("\t\t\t\t\t\tstructure where the insertion and deletion operations are performed  ");
        System.out.println("\t\t\t\t\t\tfrom both ends. We can say that deque is a generalized version of the ");
        System.out.println("\t\t\t\t\t\tqueue.\n");
        System.out.println("\t\t\t\t\t\t=======================================================================");

        do {
            System.out.println("\n\t\t\t\t\t\tBelow are the Basic Operations of a Dequeue.");
            System.out.println("\t\t\t\t\t\tChoose an Option.\n"); 
            System.out.println("\t\t\t\t\t\t[1] Insert(Front)");
            System.out.println("\t\t\t\t\t\t[2] Insert(Back)");
            System.out.println("\t\t\t\t\t\t[3] Delete(Front)");
            System.out.println("\t\t\t\t\t\t[4] Delete(Back)");
            System.out.println("\t\t\t\t\t\t[5] Display Elements");
            System.out.println("\t\t\t\t\t\t[6] Go Back to Menu\n");
            System.out.print("\t\t\t\t\t\tEnter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    clearScreen();  
                    System.out.println("\n\n\t\t\t\t\t\t -----------------------------------"); 
                    System.out.println("\t\t\t\t\t\t|                                  |"); 
                    System.out.println("\t\t\t\t\t\t|        INSERTION AT FRONT        |");  
                    System.out.println("\t\t\t\t\t\t|                                  |"); 
                    System.out.println("\t\t\t\t\t\t -----------------------------------\n");
                    System.out.print("\t\t\t\t\t\tEnter the Element you want to insert:  ");
                    value = sc.nextInt();
                    insert_front(value);
                    break;
                case 2:
                    clearScreen();  
                    System.out.println("\n\n\t\t\t\t\t\t -----------------------------------"); 
                    System.out.println("\t\t\t\t\t\t|                                  |"); 
                    System.out.println("\t\t\t\t\t\t|         INSERTION AT BACK        |");  
                    System.out.println("\t\t\t\t\t\t|                                  |"); 
                    System.out.println("\t\t\t\t\t\t -----------------------------------\n");
                    System.out.print("\t\t\t\t\t\tEnter the Element you want to insert:  ");
                    value = sc.nextInt();
                    insert_rear(value);
                    break;
                case 3:
                    clearScreen();  
                    delete_front();
                    break;
                case 4:
                    clearScreen();  
                    delete_rear();
                    break;
                case 5:
                    clearScreen();      
                    display();
                    break;
                case 6:
                    clearScreen();        
                    Menu.main(args);
                    sc.close();     
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\n\t\t\t\t\t\t --------------------------------");
                    System.out.println("\t\t\t\t\t\t|                               |");
                    System.out.println("\t\t\t\t\t\t|        INVALID CHOICE !       |");
                    System.out.println("\t\t\t\t\t\t|                               |");
                    System.out.println("\t\t\t\t\t\t --------------------------------");
            }
        } while (choice != 6);
        sc.close();
    }

    static void insert_front(int x) {
        if ((front == 0 && rear == SIZE - 1) || (front == rear + 1)) {
            System.out.println("\n\n\t\t\t\t\t\t -----------------------------");
            System.out.println("\t\t\t\t\t\t|                            |");
            System.out.println("\t\t\t\t\t\t|          OVERFLOW !        |");
            System.out.println("\t\t\t\t\t\t|                            |");
            System.out.println("\t\t\t\t\t\t -----------------------------");
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
            deque[front] = x;
        } else if (front == 0) {
            front = SIZE - 1;
            deque[front] = x;
        } else {
            front = front - 1;
            deque[front] = x;
        }
        clearScreen();
        System.out.println("\n\n\t\t\t\t\t\tElement " + x + " inserted at the front successfully!\n");
    }

    static void insert_rear(int x) {
        if ((front == 0 && rear == SIZE - 1) || (front == rear + 1)) {
            
            System.out.println("\n\n\t\t\t\t\t\t -----------------------------");
            System.out.println("\t\t\t\t\t\t|                            |");
            System.out.println("\t\t\t\t\t\t|          OVERFLOW !        |");
            System.out.println("\t\t\t\t\t\t|                            |");
            System.out.println("\t\t\t\t\t\t -----------------------------");
        } else if (front == -1 && rear == -1) {
            rear = 0;
            deque[rear] = x;
        } else if (rear == SIZE - 1) {
            rear = 0;
            deque[rear] = x;
        } else {
            rear++;
            deque[rear] = x;
        }
        clearScreen();
        System.out.println("\n\n\t\t\t\t\t\tElement " + x + " inserted at the back successfully!\n");
    }

    static void display() {
        if (front == -1 && rear == -1) {
            System.out.println("\n\n\t\t\t\t\t\t ---------------------------------------");
            System.out.println("\t\t\t\t\t\t|                                      |");
            System.out.println("\t\t\t\t\t\t|           DEQUEUE IS EMPTY :C        |");
            System.out.println("\t\t\t\t\t\t|                                      |");
            System.out.println("\t\t\t\t\t\t ---------------------------------------\n");
            return;
        }
        int i = front;
        System.out.print("\n\n\t\t\t\t\t\tElements in deque are: ");
        while (i != rear) {
            System.out.print(deque[i] + " ");
            i = (i + 1) % SIZE;
        }
        System.out.print(deque[rear]);
        System.out.println();
    }

    static void delete_rear() {
        if (front == -1 && rear == -1) {
            System.out.println("\n\n\t\t\t\t\t\t ---------------------------------------");
            System.out.println("\t\t\t\t\t\t|                                      |");
            System.out.println("\t\t\t\t\t\t|           DEQUEUE IS EMPTY :C        |");
            System.out.println("\t\t\t\t\t\t|                                      |");
            System.out.println("\t\t\t\t\t\t ---------------------------------------\n");
            return;
        } else if (front == rear) {
            System.out.println("\n\n\t\t\t\t\t\tElement " + deque[rear] + " deleted from back successfully!\n");
            front = rear = -1;
        } else if (rear == 0) {
            System.out.println("\n\n\t\t\t\t\t\tElement " + deque[rear] + " deleted from back successfully!\n");
            rear = SIZE - 1;
        } else {
            System.out.println("\n\n\t\t\t\t\t\tElement " + deque[rear] + " deleted from back successfully!\n");
            rear--;
        }
    }
    static void delete_front() {
        if (front == -1 && rear == -1) {
            System.out.println("\n\n\t\t\t\t\t\t -----------------------------");
            System.out.println("\t\t\t\t\t\t|                            |");
            System.out.println("\t\t\t\t\t\t|         UNDERFLOW !        |");
            System.out.println("\t\t\t\t\t\t|                            |");
            System.out.println("\t\t\t\t\t\t -----------------------------");
        } else if (front == rear) {
        System.out.println("\n\n\t\t\t\t\t\tElement " + deque[front] + " deleted from front successfully!\n");
        front = rear = -1;
        } else if (front == SIZE - 1) {
        System.out.println("\n\n\t\t\t\t\t\tElement " + deque[front] + " deleted from front successfully!\n");
        front = 0;
        } else {
        System.out.println("\n\n\t\t\t\t\t\tElement " + deque[front] + " deleted from front successfully!\n");
        front++;
        }
        }
        public static void clearScreen() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
          }
    }

