import java.util.Scanner;  

public class ArrayImpStack {  
public static void main(String[] args) {  
    int choice=0;  
    Scanner sc = new Scanner(System.in);  
    Stack s = new Stack();  
    
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

    while(choice != 4)  
    {  
        System.out.println("\n\t\t\t\t\t\tBelow are the Basic Operations of a Stack.");
        System.out.println("\t\t\t\t\t\tChoose an Option.\n"); 
        System.out.println("\t\t\t\t\t\t[1] Push");
        System.out.println("\t\t\t\t\t\t[2] Pop"); 
        System.out.println("\t\t\t\t\t\t[3] Show"); 
        System.out.println("\t\t\t\t\t\t[4] Go back to Menu");   
        System.out.print("\n\t\t\t\t\t\tEnter your choice: ");        
        choice = sc.nextInt();  
    switch(choice)  
        {  
            case 1:  
            {   
                Stack.clearScreen();
                s.push(sc);  
                break;  
            }  
            case 2:  
            {  
                Stack.clearScreen();
                s.pop();  
                break;  
            }  
            case 3:  
            {  
                Stack.clearScreen();
                s.display();  
                break;  
            }  
            case 4:   
            {  
                Stack.clearScreen();        
                Menu.main(args);
                sc.close();     
                System.exit(0);
                break;   
            }  
            default:  
            {  
                Stack.clearScreen();
                System.out.println("\n\t\t\t\t\t\t    -----------------------------------------"); 
                System.out.println("\t\t\t\t\t\t   |                                         |"); 
                System.out.println("\t\t\t\t\t\t   |       PLEASE ENTER A VALID CHOICE!      |");  
                System.out.println("\t\t\t\t\t\t   |                                         |"); 
                System.out.println("\t\t\t\t\t\t    -----------------------------------------");  
            }   
        };  
    }  
}  
} 

    class Stack   
{  
    int top;   
    int maxsize = 10;  
    int[] arr = new int[maxsize];  
           
    boolean isEmpty()  
    {  
        return (top < 0);  
    }  
    Stack()  
    {  
        top = -1;  
    }  


    boolean push (Scanner sc)  
    {  
        if(top == maxsize-1)  
        {  
            System.out.println("\n\t\t\t\t\t\t ------------------------"); 
            System.out.println("\t\t\t\t\t\t|                       |"); 
            System.out.println("\t\t\t\t\t\t|       OVERFLOW!       |");  
            System.out.println("\t\t\t\t\t\t|                       |"); 
            System.out.println("\t\t\t\t\t\t ------------------------");   
            return false;  
        }  
        else   
        {  
            System.out.println("\n\t\t\t\t\t\t -----------------------"); 
            System.out.println("\t\t\t\t\t\t|                       |"); 
            System.out.println("\t\t\t\t\t\t|          PUSH         |");  
            System.out.println("\t\t\t\t\t\t|                       |"); 
            System.out.println("\t\t\t\t\t\t -----------------------"); 

            System.out.print("\n\n\t\t\t\t\t\tEnter Value:  ");  
            int val = sc.nextInt();  
            top++;  
            arr[top]=val; 
            Stack.clearScreen(); 
            System.out.println("\n\t\t\t\t\t\t\t      -----------------------"); 
            System.out.println("\t\t\t\t\t\t\t     |                       |"); 
            System.out.println("\t\t\t\t\t\t\t     |      ITEM PUSHED!     |");  
            System.out.println("\t\t\t\t\t\t\t     |                       |"); 
            System.out.println("\t\t\t\t\t\t\t      -----------------------\n");  
            return true;  
        }  
    }  
    
    boolean pop ()  
    {  
        if (top == -1)  
        {  
            System.out.println("\n\t\t\t\t\t\t\t       ------------------------"); 
            System.out.println("\t\t\t\t\t\t\t     |                       |"); 
            System.out.println("\t\t\t\t\t\t\t     |       UNDERFLOW!      |");  
            System.out.println("\t\t\t\t\t\t\t     |                       |"); 
            System.out.println("\t\t\t\t\t\t\t       ------------------------\n\n");   
            return false;  
        }  
        else   
        {  
            top --;   
            System.out.println("\n\t\t\t\t\t\t\t      -----------------------"); 
            System.out.println("\t\t\t\t\t\t\t     |                       |"); 
            System.out.println("\t\t\t\t\t\t\t     |      ITEM POPPED!     |");  
            System.out.println("\t\t\t\t\t\t\t     |                       |"); 
            System.out.println("\t\t\t\t\t\t\t      -----------------------");  
            return true;  
        }  
    }  

    void display ()  
    {  
        System.out.print("\n\t\t\t\t\t\tPrinting stack elements .....  ");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.print(arr[i]);  
            System.out.print(","); 
        }  
        System.out.println("\n"); 
    }  

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
} 
    

