import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    public Graph(int v) {
        vertices = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public void BFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (int neighbor : adjacencyList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            if (!visited[currentVertex]) {
                visited[currentVertex] = true;
                System.out.print(currentVertex + " ");

                for (int neighbor : adjacencyList[currentVertex]) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}

public class GraphData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\n\t\t\t\t\t\t\tEnter the number of Vertices: ");
        int vertices = scanner.nextInt();
        Graph graph = new Graph(vertices);

        System.out.println("\n\n\t\t\t             .-*####+-.            ............                        .......             .............            .......           .......      "); 
        System.out.println("\t\t\t          .=%@@@@@@@@@@%=.        -@@@@@@@@@@@@@@#=:                   @@@@@@@=            %@@@@@@@@@@@@@@*=:      .@@@@@@@=          #@@@@@@*   "); 
        System.out.println("\t\t\t         =%@@@@@@@@@@@@@@@+       -@@@@@@@@@@@@@@@@@#.                =@@@@@@@#            %@@@@@@@@@@@@@@@@@#.    .@@@@@@@=          #@@@@@@*     ");  
        System.out.println("\t\t\t       .*@@@@@@@@@@@@@@@@@@%:     -@@@@@@@@@@@@@@@@@@@-               %@@@@@@@@.           %@@@@@@@@@@@@@@@@@@@-   .@@@@@@@=          #@@@@@@*    "); 
        System.out.println("\t\t\t      :%@@@@@@@@@@@@@@@@@@@@@:    -@@@@@@@@@@@@@@@@@@@@:             :@@@@@@@@@*           %@@@@@@@@@@@@@@@@@@@@-  .@@@@@@@=          #@@@@@@*  "); 
        System.out.println("\t\t\t     .%@@@@@@@@@@@@@@@@@@@@@@@:   -@@@@@@@@@@@@@@@@@@@@@             +@@@@@@@@@@.          %@@@@@@@@@@@@@@@@@@@@@. .@@@@@@@=          #@@@@@@* ");  
        System.out.println("\t\t\t     .%@@@@@@@@@@@@@@@@@@@@@@@:   -@@@@@@@@@@@@@@@@@@@@@             +@@@@@@@@@@.          %@@@@@@@@@@@@@@@@@@@@@. .@@@@@@@=          #@@@@@@* "); 
        System.out.println("\t\t\t    +@@@@@@@@@%+    :*%@@@@@%     -@@@@@@@     +@@@@@@@@*           =@@@@@@@@@@@#          %@@@@@@=     *@@@@@@@@% .@@@@@@@=          #@@@@@@* ");  
        System.out.println("\t\t\t   .@@@@@@@@@+.       .*@@@@.     -@@@@@@@      =@@@@@@@%.          %@@@@@@@@@@@@:         %@@@@@@=      :@@@@@@@@..@@@@@@@=          #@@@@@@*   "); 
        System.out.println("\t\t\t   .@@@@@@@@@+.       .*@@@@.     -@@@@@@@      =@@@@@@@%.          %@@@@@@@@@@@@:         %@@@@@@=      :@@@@@@@@..@@@@@@@=          #@@@@@@*  "); 
        System.out.println("\t\t\t  :@@@@@@@@*             *:       -@@@@@@@       #@@@@@@@.         *@@@@@@@@@@@@@@.        %@@@@@@=       =@@@@@@@:.@@@@@@@=          #@@@@@@*  ");  
        System.out.println("\t\t\t  =@@@@@@@@:                      -@@@@@@@       #@@@@@@@.         @@@@@@@=@@@@@@@+        %@@@@@@=       =@@@@@@@:.@@@@@@@=          #@@@@@@* "); 
        System.out.println("\t\t\t  *@@@@@@@*                       -@@@@@@@       @@@@@@@%.        +@@@@@@%.+@@@@@@%.       %@@@@@@=       *@@@@@@@:.@@@@@@@=          #@@@@@@*  ");  
        System.out.println("\t\t\t  %@@@@@@@-                       -@@@@@@@      =@@@@@@@#         @@@@@@@# .@@@@@@@-       %@@@@@@=      .@@@@@@@@ .@@@@@@@+::::::::::%@@@@@@*  "); 
        System.out.println("\t\t\t .@@@@@@@@                        -@@@@@@@     =@@@@@@@@+        =@@@@@@@.  *@@@@@@#       %@@@@@@=     =@@@@@@@@# .@@@@@@@@@@@@@@@@@@@@@@@@@*   "); 
        System.out.println("\t\t\t .@@@@@@@%       :@@@@@@@@@@@@@@%.-@@@@@@@%%%@@@@@@@@@@@         *@@@@@@%   =@@@@@@@.      %@@@@@@*===#@@@@@@@@@@= .@@@@@@@@@@@@@@@@@@@@@@@@@* ");  
        System.out.println("\t\t\t :@@@@@@@#       :@@@@@@@@@@@@@@%.-@@@@@@@@@@@@@@@@@@@@:         @@@@@@@-   .@@@@@@@*      %@@@@@@@@@@@@@@@@@@@@%. .@@@@@@@@@@@@@@@@@@@@@@@@@* "); 
        System.out.println("\t\t\t :@@@@@@@#       :@@@@@@@@@@@@@@%.-@@@@@@@@@@@@@@@@@@@=         *@@@@@@%.    *@@@@@@%.     %@@@@@@@@@@@@@@@@@@@@:  .@@@@@@@@@@@@@@@@@@@@@@@@@*  ");  
        System.out.println("\t\t\t .@@@@@@@%       :@@@@@@@@@@@@@@%.-@@@@@@@@@@@@@@@@@%:          @@@@@@@#     .@@@@@@@-     %@@@@@@@@@@@@@@@@@@@:   .@@@@@@@@@@@@@@@@@@@@@@@@@*   "); 
        System.out.println("\t\t\t .@@@@@@@@       :@@@@@@@@@@@@@@%.-@@@@@@@@@@@@@@@%+           =@@@@@@@:      #@@@@@@#     %@@@@@@@@@@@@@@@@@#.    .@@@@@@@@@@@@@@@@@@@@@@@@@*  "); 
        System.out.println("\t\t\t  %@@@@@@@:      :@@@@@@@@@@@@@@%.-@@@@@@@%@@@@@@@#            #@@@@@@@#######%@@@@@@@:    %@@@@@@@@@@@@@@@=:      .@@@@@@@+::::::::::%@@@@@@* ");  
        System.out.println("\t\t\t  #@@@@@@@*              +@@@@@@%.-@@@@@@@.%@@@@@@@*          :@@@@@@@@@@@@@@@@@@@@@@@#    %@@@@@@+:::::.          .@@@@@@@=          #@@@@@@*    "); 
        System.out.println("\t\t\t  +@@@@@@@@.             #@@@@@@%.-@@@@@@@ -@@@@@@@@+         *@@@@@@@@@@@@@@@@@@@@@@@@.   %@@@@@@=                .@@@@@@@=          #@@@@@@*");  
        System.out.println("\t\t\t  :@@@@@@@@*            :@@@@@@@* -@@@@@@@  +@@@@@@@@-       .@@@@@@@@@@@@@@@@@@@@@@@@@=   %@@@@@@=                .@@@@@@@=          #@@@@@@*   "); 
        System.out.println("\t\t\t   #@@@@@@@@+           #@@@@@@@= -@@@@@@@   +@@@@@@@@-      +@@@@@@@@@@@@@@@@@@@@@@@@@%   %@@@@@@=                .@@@@@@@=          #@@@@@@*  "); 
        System.out.println("\t\t\t   .@@@@@@@@@+        .*@@@@@@@@  -@@@@@@@   .%@@@@@@@%.     #@@@@@@@@@@@@@@@@@@@@@@@@@@:  %@@@@@@=                .@@@@@@@=          #@@@@@@*  ");  
        System.out.println("\t\t\t    +@@@@@@@@@%=    .+%@@@@@@@@-  -@@@@@@@    .@@@@@@@@%.   :@@@@@@@#############@@@@@@@#  %@@@@@@=                .@@@@@@@=          #@@@@@@* "); 
        System.out.println("\t\t\t    .%@@@@@@@@@@@%%@@@@@@@@@@@#   -@@@@@@@     -@@@@@@@@#   *@@@@@@@.            #@@@@@@@: %@@@@@@=                .@@@@@@@=          #@@@@@@*   ");  
        System.out.println("\t\t\t     .%@@@@@@@@@@@@@@@@@@@@@@@:   -@@@@@@@      +@@@@@@@@* .@@@@@@@*             :@@@@@@@= %@@@@@@=                .@@@@@@@=          #@@@@@@*  "); 
        System.out.println("\t\t\t     .%@@@@@@@@@@@@@@@@@@@@@@@:   -@@@@@@@      +@@@@@@@@* .@@@@@@@*             :@@@@@@@= %@@@@@@=                .@@@@@@@=          #@@@@@@* "); 
        System.out.println("\t\t\t       .#@@@@@@@@@@@@@@@@@@%:     -@@@@@@@       .%@@@@@@@@@@@@@@@@               =@@@@@@@:%@@@@@@=                .@@@@@@@=          #@@@@@@*   ");
        System.out.println("\t\t\t         +@@@@@@@@@@@@@@@@+       -@@@@@@@        :@@@@@@@@@@@@@@@*               :@@@@@@@%%@@@@@@=                .@@@@@@@=          #@@@@@@*");  
        System.out.println("\t\t\t          .+@@@@@@@@@@@@=.        -@@@@@@@         -@@@@@@@@@@@@@@.                #@@@@@@@@@@@@@@=                .@@@@@@@=          #@@@@@@*     "); 
        System.out.println("\t\t\t             -*#%%%##+:           .-------          :------------:                 :--------------.                 -------.          :------:  "); 
        System.out.println("\t\t\t\t\t\t\t==============================================================================\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\tWhat is Graph Data Structure?\n");
        System.out.println("\t\t\t\t\t\t\tA graph is an abstract data type (ADT) that consists of a set of objects ");
        System.out.println("\t\t\t\t\t\t\tthat are connected to each other via links. These objects are called ");
        System.out.println("\t\t\t\t\t\t\tvertices and the links are called edges.\n");
        System.out.println("\t\t\t\t\t\t\tUsually, a graph is represented as G = {V, E}, where G is the graph space, V");
        System.out.println("\t\t\t\t\t\t\tis the set of vertices and E is the set of edges. If E is empty, the");
        System.out.println("\t\t\t\t\t\t\tgraph is known as a forest.\n");
        System.out.println("\t\t\t\t\t\t\t==============================================================================");






        while (true) {
            System.out.println("\n\t\t\t\t\t\t\tBelow are the Two Operations of Graph Data Structure.");
            System.out.println("\t\t\t\t\t\t\tChoose an Option.\n");
            System.out.println("\t\t\t\t\t\t\t1. Add an edge");
            System.out.println("\t\t\t\t\t\t\t2. Perform Breadth First Search (BFS)");
            System.out.println("\t\t\t\t\t\t\t3. Perform Depth First Search (DFS)");
            System.out.println("\t\t\t\t\t\t\t4. Go Back to Menu\n");
            System.out.print("\t\t\t\t\t\t\tEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\t\tEnter source vertex: ");
                    int source = scanner.nextInt();
                    System.out.print("\n\t\t\t\t\t\t\tEnter destination vertex: ");
                    int destination = scanner.nextInt();
                    graph.addEdge(source, destination);
                    break;
                case 2:
                    clearScreen();
                    System.out.print("\n\n\t\t\t\t\t\t\tEnter the starting vertex for BFS: ");
                    int bfsStart = scanner.nextInt();
                    System.out.print("\n\t\t\t\t\t\t\tBFS traversal: ");
                    graph.BFS(bfsStart);
                    System.out.println();
                    break;
                case 3:
                    clearScreen();
                    System.out.print("\n\t\t\t\t\t\t\tEnter the starting vertex for DFS: ");
                    int dfsStart = scanner.nextInt();
                    System.out.print("\n\t\t\t\t\t\t\tDFS traversal: ");
                    graph.DFS(dfsStart);
                    System.out.println();
                    break;
                case 4:
                clearScreen();
                Menu.main(args);
                scanner.close();
                System.exit(0);
                break;
                default:
                System.out.println("\n\n\t\t\t\t\t\t ---------------------------------"); 
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
