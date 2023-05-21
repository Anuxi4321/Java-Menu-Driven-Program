import java.util.Scanner;

class LinkedListQueue {
    static Node front, rear;
    
    static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    
    static void insert(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    
    static void delete() {
        if (front == null) {
            System.out.println("\n\n\t\t\t\t\t\t\t\t ------------------------"); 
            System.out.println("\t\t\t\t\t\t\t\t|                       |"); 
            System.out.println("\t\t\t\t\t\t\t\t|       UNDERFLOW!      |");  
            System.out.println("\t\t\t\t\t\t\t\t|                       |"); 
            System.out.println("\t\t\t\t\t\t\t\t ------------------------\n\n"); 
            return;
        }
        Node temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        temp.next = null;
    }
    
    static void display() {
        if (front == null) {
            System.out.println("\n\n\t\t\t\t\t\t\t\t ----------------------------"); 
            System.out.println("\t\t\t\t\t\t\t\t|                           |"); 
            System.out.println("\t\t\t\t\t\t\t\t|        EMPTY QUEUE !      |");  
            System.out.println("\t\t\t\t\t\t\t\t|                           |"); 
            System.out.println("\t\t\t\t\t\t\t\t ----------------------------\n\n");
            return;
        }
        Node temp = front;
        System.out.print("\n\n\t\t\t\t\t\t");
        while (temp != null) {
            System.out.print(" " +temp.data);
            temp = temp.next;
        }
        System.out.print("\n\n");
    }
    
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

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

        while (true) {
            System.out.println("\n\t\t\t\t\t\tBelow are the Basic Operations of a Queue.");
            System.out.println("\t\t\t\t\t\tChoose an Option.\n"); 
            System.out.println("\t\t\t\t\t\t[1] Insert");
            System.out.println("\t\t\t\t\t\t[2] Delete");
            System.out.println("\t\t\t\t\t\t[3] Display");
            System.out.println("\t\t\t\t\t\t[4] Go back to Menu");
            System.out.print("\n\t\t\t\t\t\tEnter your choice:  ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\tEnter value: ");
                    int value = sc.nextInt();
                    insert(value);
                    break;
                case 2:
                    clearScreen();
                    delete();
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
                clearScreen();
                System.out.println("\n\n\t\t\t\t\t\t\t -----------------------------------------"); 
                System.out.println("\t\t\t\t\t\t\t|                                         |"); 
                System.out.println("\t\t\t\t\t\t\t|       PLEASE ENTER A VALID CHOICE!      |");  
                System.out.println("\t\t\t\t\t\t\t|                                         |"); 
                System.out.println("\t\t\t\t\t\t\t -----------------------------------------\n\n");
                    break;
            }
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
}
