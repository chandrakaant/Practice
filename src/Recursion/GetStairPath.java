package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GetStairPath {

    /**
     * Given number of stairs. You can take 1, 2, 3 steps at a time to climb down to stair 0
     * Function calculates path by taking 1, 2, 3 steps respectively. Function uses recursion to caclulate the path.
     * @param numberOfStairs number of stairs
     * @return paths
     */
    public static List<String> getStairsPath(int numberOfStairs) {

        if (numberOfStairs == 0) {
            List<String> emptyList = new ArrayList<>();
            emptyList.add("");
            return emptyList;
        } else if (numberOfStairs < 0) {
            return new ArrayList<>();
        }

        List<String> path1 = getStairsPath(numberOfStairs - 1);
        List<String> path2 = getStairsPath(numberOfStairs - 2);
        List<String> path3 = getStairsPath(numberOfStairs - 3);

        List<String> paths = new ArrayList<>();

        for (String path : path1) {
            paths.add(1 + path);
        }

        for (String path : path2) {
            paths.add(2 + path);
        }

        for (String path : path3) {
            paths.add(3 + path);
        }
        return paths;
    }
}
