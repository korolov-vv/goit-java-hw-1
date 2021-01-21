package HomeWork5;

import java.util.Arrays;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int[] result;
        int dist1 = Math.toIntExact((Math.round(Math.sqrt((targets[0][0] - aiCoords[0]) * (targets[0][0] - aiCoords[0]) + (targets[0][1] - aiCoords[1]) * (targets[0][1] - aiCoords[1])))));
        int dist2 = Math.toIntExact((Math.round(Math.sqrt((targets[1][0] - aiCoords[0]) * (targets[1][0] - aiCoords[0]) + (targets[1][1] - aiCoords[1]) * (targets[1][1] - aiCoords[1])))));
        if(dist1 < dist2) {result = new int[]{targets[0][0], targets[0][1]};}else
        {result = new int[]{targets[1][0], targets[1][1]};}
        return result;
    }
}
