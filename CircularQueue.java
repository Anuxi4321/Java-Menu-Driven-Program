import java.util.Scanner;

public class CircularQueue {
    static final int MAX_SIZE = 6;
    int[] queue = new int[MAX_SIZE];
    int front = -1;
    int rear = -1;

    void enqueue(int element) {
        if (front == -1 && rear == -1) {
            front = 0;
            rear = 0;
            queue[rear] = element;
            clearScreen();
            System.out.println("\n\n\t\t\t\t\t\t\t -------------------------------"); 
            System.out.println("\t\t\t\t\t\t\t|                              |"); 
            System.out.println("\t\t\t\t\t\t\t|       ELEMENT INSERTED!      |");  
            System.out.println("\t\t\t\t\t\t\t|                              |"); 
            System.out.println("\t\t\t\t\t\t\t -------------------------------");
        } else if ((rear + 1) % MAX_SIZE == front) {
            System.out.println("\n\n\t\t\t\t\t\t\t ------------------------------"); 
            System.out.println("\t\t\t\t\t\t\t|                             |"); 
            System.out.println("\t\t\t\t\t\t\t|       QUEUE OVERFLOW!       |");  
            System.out.println("\t\t\t\t\t\t\t|                             |"); 
            System.out.println("\t\t\t\t\t\t\t ------------------------------");
        } else {
            rear = (rear + 1) % MAX_SIZE;
            queue[rear] = element;
            clearScreen();
            System.out.println("\n\n\t\t\t\t\t\t\t -------------------------------"); 
            System.out.println("\t\t\t\t\t\t\t|                              |"); 
            System.out.println("\t\t\t\t\t\t\t|       ELEMENT INSERTED!      |");  
            System.out.println("\t\t\t\t\t\t\t|                              |"); 
            System.out.println("\t\t\t\t\t\t\t -------------------------------");
        }
    }

    int dequeue() {
        int element = -1;
        if (front == -1 && rear == -1) {
            System.out.println("\n\n\t\t\t\t\t\t\t -------------------------------"); 
            System.out.println("\t\t\t\t\t\t\t|                              |"); 
            System.out.println("\t\t\t\t\t\t\t|       QUEUE UNDERFLOW!       |");  
            System.out.println("\t\t\t\t\t\t\t|                              |"); 
            System.out.println("\t\t\t\t\t\t\t -------------------------------");
        } else if (front == rear) {
            element = queue[front];
            System.out.println("\n\n\t\t\t\t\t\t\t ------------------------------------"); 
            System.out.println("\t\t\t\t\t\t\t|                                    |"); 
            System.out.println("\t\t\t\t\t\t\t|       DEQUEUED ELEMENT ->  "+ element + "      |");  
            System.out.println("\t\t\t\t\t\t\t|                                    |"); 
            System.out.println("\t\t\t\t\t\t\t ------------------------------------");
            front = -1;
            rear = -1;
        } else {
            element = queue[front];
            System.out.println("\n\n\t\t\t\t\t\t\t ------------------------------------"); 
            System.out.println("\t\t\t\t\t\t\t|                                    |"); 
            System.out.println("\t\t\t\t\t\t\t|       DEQUEUED ELEMENT ->   "+ element + "     |");  
            System.out.println("\t\t\t\t\t\t\t|                                    |"); 
            System.out.println("\t\t\t\t\t\t\t ------------------------------------");
            front = (front + 1) % MAX_SIZE;
        }
        return element;
    }

    void display() {
        int i = front;
        if (front == -1 && rear == -1) {
            System.out.println("\n\n\t\t\t\t\t\tQueue is empty..");
        } else {
            System.out.print("\n\n\t\t\t\t\t\tElements in a Queue are : ");
            while (i != rear) {
                System.out.print(queue[i] + ", ");
                i = (i + 1) % MAX_SIZE;
            }
            System.out.print(queue[rear]);
            System.out.print("\n\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue queue = new CircularQueue();

        int choice = 1, x;

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

        while (choice < 4 && choice != 0) {
            System.out.println("\n\t\t\t\t\t\tBelow are the Basic Operations of a Circular Queue.");
            System.out.println("\t\t\t\t\t\tChoose an Option.\n"); 
            System.out.println("\n\t\t\t\t\t\t[1] Insert an element");
            System.out.println("\t\t\t\t\t\t[2] Delete an element");
            System.out.println("\t\t\t\t\t\t[3] Display the element");
            System.out.println("\t\t\t\t\t\t[4] Go Back to Menu\n");
            System.out.print("\t\t\t\t\t\tEnter your choice:  ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    clearScreen();
                    System.out.print("\n\t\t\t\t\t\tEnter the element which is to be inserted:  ");
                    x = sc.nextInt();
                    queue.enqueue(x);
                    break;

                case 2:
                    clearScreen();
                    queue.dequeue();
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
                    System.out.println("\n\n\t\t\t\t\t\t --------------------------------");
                    System.out.println("\t\t\t\t\t\t|                               |");
                    System.out.println("\t\t\t\t\t\t|        INVALID CHOICE !       |");
                    System.out.println("\t\t\t\t\t\t|                               |");
                    System.out.println("\t\t\t\t\t\t --------------------------------");
                    break;
            }
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
}
