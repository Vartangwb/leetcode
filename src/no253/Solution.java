package no253;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by twb on 2017/5/22.
 */
public class Solution {
/**
    思路
    overlap的条件依然是：intervals[i].end > intervals[j].start
    不同的是这题需要求房间数。还是先sort，i指向之前有overlap的最小end的那一个。

    复杂度
     Time Complexity: O(NlogN)，Space: O(N)。
*/
/**
 * heap
 因为要知道之前有overlap的最小的end，所以可以用一个min heap。每次检查新的start是否比heap的top元素小，是的话就把保存原来的end，同时放进新的end；否则就放新的end同时poll出原来的，因为没有overlap且新的end较大。最后heap的大小就是需要的房间数。比如：
 [1, 5], [2, 4], [3, 6], [5, 7]

 heap: [5]。[2, 4]的start是2，比5小，所以放入4。
 heap: [4, 5]。接着[3 ,6]的start是3，比4小，所以又放入6。
 heap: [4, 5, 6]。[5, 7]的start是5，比4大，因此poll出4，放入7。
 heap: [5, 6, 7]。最后heap的size为3。
 4被pop出来是因为[2, 4]和[5, 7]公用一个房间，只要放7进去就可以了。
 */
public static class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public int minMeetingRooms(Interval[] intervals) {
    // base case
    if(intervals == null || intervals.length == 0) return 0;
    // sort
    Arrays.sort(intervals, (a, b) -> a.start == b.start ? a.end - b.end : a.start - b.start);
    // min heap to store the end
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    minHeap.offer(intervals[0].end);
    for(int i = 1; i < intervals.length; i++) {
        // no overlap
        if(minHeap.peek() <= intervals[i].start) minHeap.poll();
        minHeap.offer(intervals[i].end);
    }

    return minHeap.size();
}

 }
