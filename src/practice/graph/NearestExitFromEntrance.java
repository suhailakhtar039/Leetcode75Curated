package practice.graph;

import java.util.LinkedList;
import java.util.Queue;

public class NearestExitFromEntrance {
    public static void main(String[] args) {
        char[][] maze = {
                {'+', '+', '.', '+'},
                {'.', '.', '.', '+'},
                {'+', '+', '+', '.'}
        };
        int[] entrance = {1, 2};

        int ans = 0;
        int n = maze.length;
        int m = maze[0].length;
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{entrance[0], entrance[1]});
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        maze[entrance[0]][entrance[1]] = '+';
        while (queue.size() != 0) {
            int sz = queue.size();
            ans++;
            for(int i = 0; i<sz; i++){
                Integer[] temp = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int x = temp[0] + dx[j];
                    int y = temp[1] + dy[j];

                    if(x<0 || x>=n || y<0 || y>=m || maze[x][y] == '+')continue;
                    if(x == 0 || x == n-1 || y == 0 || y == m-1){
                        System.out.println("inside ans = " + ans);
                        System.exit(0);
                    }
                    maze[x][y] = '+';
                    queue.add(new Integer[]{x,y});
                }
            }
        }
        System.out.println("outside ans = " + ans);

    }
}
