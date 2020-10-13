package ch01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval2 {
    int start;
    int end;

    public Interval2() {
        start = 0;
        end = 0;
    }

    public Interval2(int s, int e) {
        start = s;
        end = e;
    }
}

public class MergeInterval {

    public static void main(String[] args) {
        Interval2 in1 = new Interval2(1, 3);
        Interval2 in2 = new Interval2(2, 6);
        Interval2 in3 = new Interval2(8, 10);
        Interval2 in4 = new Interval2(15, 18);

        List<Interval2> intervals = new ArrayList<>();
        intervals.add(in1);
        intervals.add(in2);
        intervals.add(in3);
        intervals.add(in4);
        MergeInterval m = new MergeInterval();
        List<Interval2> list = m.merge(intervals);

        System.out.println("====result=======");
        m.print(list);

    }

    public List<Interval2> merge(List<Interval2> intervals) {
        if(intervals.isEmpty()) return intervals;

        List<Interval2> result = new ArrayList<>();
        Collections.sort(intervals, (a, b) -> (a.start - b.start));

        Interval2 before = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval2 current = intervals.get(i);

            if (before.end >= current.start) {
                before.end = Math.max(before.end, current.end);
            } else {
                result.add(before);
                before = current;
            }

        }

        if (!result.contains(before)) {
            result.add(before);
        }

        return result;
    }


    private void print(List<Interval2> list) {
        for (int i = 0; i < list.size(); i++) {
            Interval2 in = list.get(i);
            System.out.println(in.start + " " + in.end);
        }
    }

    Comparator comp = new Comparator<Interval2>() {
        public int compare(Interval2 a, Interval2 b) {
            return a.start - b.start;
        }
    };
}
