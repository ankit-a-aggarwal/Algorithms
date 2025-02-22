package Graph.Representation;

/**
 * 
 * @author Lewin
 *
 */
public class AdjacencyMatrix implements Graph {
    public static int N;
    public static int [][] grid;
    
    @Override
    public void init(int N, int M) {
        this.N = N;
        grid = new int [N][N];
    }

    @Override
    public void addEdge(int a, int b, int weight) {
        grid [a][b] = weight;
        // if don't want bidirectional, comment out next line
        grid [b][a] = weight;
    }

}
