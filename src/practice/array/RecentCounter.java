package practice.array;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    public static void main(String[] args) {

    }
}
class Example{
    public Queue<Integer> queue;
    public Example(){
        queue = new LinkedList<>();
    }

    public int ping(int t){
        queue.add(t);
        while(queue.peek()< t-3000) queue.poll();
        return queue.size();
    }
}
