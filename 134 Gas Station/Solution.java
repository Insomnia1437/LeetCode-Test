

/**
 There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

 You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

 Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

 Note:
 The solution is guaranteed to be unique.
 **
 */
public class Solution {
	
	//got TLE!!!!
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int N = gas.length;
        int inx = 0,start = 0,k = 0;
        while (k++ < N) {
            int remind = 0;
            inx = start;
            for (int i = 0; i < N; i++) {
                remind += gas[inx % N];
                remind -= cost[inx % N];
                if (remind < 0) break;
                inx++;
            }
            if (remind >= 0)
                return start;
            start++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int gas[] = {4,3,2,5};
        int cost[] = {5,4,1,4};
        System.out.println(solution.canCompleteCircuit(gas,cost));

    }
}


