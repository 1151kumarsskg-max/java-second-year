public class dvr {
    static int INF = 9999;

    public static void vector(int[][] graph) {
        int n = graph.length;
        int[][] dist = new int[n][n];

        // Copy the graph to dist
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        // Floyd-Warshall algorithm for shortest paths
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Print the distance vector for each router
        for (int i = 0; i < n; i++) {
            System.out.print("Router " + i + " distances: ");
            for (int j = 0; j < n; j++) {
                if (dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 3, INF, INF, INF},
            {1, 0, 1, 7, 5, INF},
            {3, 1, 0, INF, 2, INF},
            {INF, 7, INF, 0, 3, 1},
            {INF, 5, 2, 3, 0, 2},
            {INF, INF, INF, 1, 2, 0}
        };
        vector(graph);
    }
}




