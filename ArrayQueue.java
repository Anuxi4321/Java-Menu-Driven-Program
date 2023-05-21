import java.util.Scanner;

public class ArrayQueue {
    private static final int MAXSIZE = 5;
    private int front = -1, rear = -1;
    private int[] queue = new int[MAXSIZE];

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        Scanner sc = new Scanner(System.in);
        int choice;


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
        System.out.println("\t\t\t\t\t\t\t\t\tWhat is a Queue?\n");
        System.out.println("\t\t\t\t\t\tA queue can be defined as an ordered list which enables insert");
        System.out.println("\t\t\t\t\t\toperations to be performed at one end called REAR and delete ");
        System.out.println("\t\t\t\t\t\toperations to be performed at another end called FRONT.  ");
        System.out.println("\n\t\t\t\t\t\tQueue is referred to be as First In First Out list. \n");
        System.out.println("\t\t\t\t\t\t=======================================================================");


        do {
            System.out.println("\n\t\t\t\t\t\tBelow are the Basic Operations of a Queue.");
            System.out.println("\t\t\t\t\t\tChoose an Option.\n"); 
            System.out.println("\t\t\t\t\t\t[1] Insert an element");
            System.out.println("\t\t\t\t\t\t[2] Delete an element");
            System.out.println("\t\t\t\t\t\t[3] Display the queue");
            System.out.println("\t\t\t\t\t\t[4] Exit\n");
            System.out.print("\t\t\t\t\t\tEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    clearScreen();
                    queue.insert();
                    break;
                case 2:
                    clearScreen();
                    queue.delete();
                    break;
                case 3:
                    clearScreen();  
                    queue.display();
                    break;
                case 4:
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
        } while (choice != 4);
    }

    public void insert() {
        int item;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t\t\t\t\t\tEnter the element: ");
        item = sc.nextInt();

        if (rear == MAXSIZE - 1) {
            System.out.println("\n\n\t\t\t\t\t\t ----------------------------"); 
            System.out.println("\t\t\t\t\t\t|                           |"); 
            System.out.println("\t\t\t\t\t\t|          OVERFLOW  !      |");  
            System.out.println("\t\t\t\t\t\t|                           |"); 
            System.out.println("\t\t\t\t\t\t ----------------------------\n");
            return;
        }
        if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
        } else {
            rear++;
        }

        queue[rear] = item;
            System.out.println("\n\n\t\t\t\t\t\t\t    ---------------------------"); 
            System.out.println("\t\t\t\t\t\t\t   |                           |"); 
            System.out.println("\t\t\t\t\t\t\t   |       VALUE INSERTED!     |");  
            System.out.println("\t\t\t\t\t\t\t   |                           |"); 
            System.out.println("\t\t\t\t\t\t\t    ---------------------------");
    }

    public void delete() {
        int item;
        if (front == -1 || front > rear) {
            System.out.println("\n\t\t\t\t\t\t ------------------------"); 
            System.out.println("\t\t\t\t\t\t|                       |"); 
            System.out.println("\t\t\t\t\t\t|       UNDERFLOW!      |");  
            System.out.println("\t\t\t\t\t\t|                       |"); 
            System.out.println("\t\t\t\t\t\t ------------------------\n\n"); 
            return;
        } else {
            item = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }

            System.out.println("\n\t\t\t\t\t\t\t    ---------------------------"); 
            System.out.println("\t\t\t\t\t\t\t   |                           |"); 
            System.out.println("\t\t\t\t\t\t\t   |       VALUE DELETED !     |");  
            System.out.println("\t\t\t\t\t\t\t   |                           |"); 
            System.out.println("\t\t\t\t\t\t\t    ---------------------------");
        }
    }

    public void display() {
        if (rear == -1) {
            System.out.println("\n\t\t\t\t\t\t\t    ---------------------------"); 
            System.out.println("\t\t\t\t\t\t\t   |                           |"); 
            System.out.println("\t\t\t\t\t\t\t   |        EMPTY QUEUE !      |");  
            System.out.println("\t\t\t\t\t\t\t   |                           |"); 
            System.out.println("\t\t\t\t\t\t\t    ---------------------------\n");
        } else {
            System.out.print("\n\t\t\t\t\t\tPrinting values...  ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i]);
                System.out.print(","); 
            }
            System.out.print("\n\n"); 
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
}
