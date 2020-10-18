package p02;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class Interval{
    int start;
    int end;

    public Interval() {
        this.start = 0;
        this.end = 0;
    }

    public Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

public class MeetingRoom2 {
    public static void main(String[] args) {
        MeetingRoom2 a = new MeetingRoom2();
        Interval in1 = new Interval(5, 10);
        Interval in2 = new Interval(15, 20);
        Interval in3 = new Interval(0, 30);

        Interval[] intervals = {in1, in2, in3};
        System.out.println(a.solve(intervals));
    }

    private int solve(Interval[] intervals) {

        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        // 1. data
        Arrays.sort(intervals, (a, b) -> (a.start - b.start));
         Queue<Interval> minHeap = new PriorityQueue<>(intervals.length, (a, b) -> (a.end - b.end));
         int max = 0;

         // 2. for
        for (int i = 0; i < intervals.length; i++) {
            while (!minHeap.isEmpty() && minHeap.peek().end <= intervals[i].start) {
                minHeap.poll();
            }
            minHeap.offer(intervals[i]); //0 30
            max = Math.max(max, minHeap.size());
        }
        return max;
    }
}
