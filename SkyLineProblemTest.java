import java.util.Arrays;
import java.util.List;

public class SkyLineProblemTest {
    public static void main(String[] args) {
        SkyLineProblem solver = new SkyLineProblem();

        // Test case 1
        int[][] buildings1 = {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(2, 10),
                Arrays.asList(3, 15),
                Arrays.asList(7, 12),
                Arrays.asList(12, 0),
                Arrays.asList(15, 10),
                Arrays.asList(20, 8),
                Arrays.asList(24, 0)
        );
        List<List<Integer>> output1 = solver.getSkyline(buildings1);
        System.out.println("Test case 1:");
        System.out.println("Expected output: " + expected1);
        System.out.println("Actual output: " + output1);
        System.out.println("Result: " + expected1.equals(output1));
        System.out.println();

        // Test case 2
        int[][] buildings2 = {{0, 2, 3}, {2, 5, 4}};
        List<List<Integer>> expected2 = Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(2, 4),
                Arrays.asList(5, 0)
                
        );
        List<List<Integer>> output2 = solver.getSkyline(buildings2);
        System.out.println("Test case 2:");
        System.out.println("Expected output: " + expected2);
        System.out.println("Actual output: " + output2);
        System.out.println("Result: " + expected2.equals(output2));
        System.out.println();

        // Test case 3
        int[][] buildings3 = {{1, 2, 1}, {1, 3, 3}, {2, 4, 2}};
        List<List<Integer>> expected3 = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(3, 2),
                Arrays.asList(4, 0)
        );
        List<List<Integer>> output3 = solver.getSkyline(buildings3);
        System.out.println("Test case 3:");
        System.out.println("Expected output: " + expected3);
        System.out.println("Actual output: " + output3);
        System.out.println("Result: " + expected3.equals(output3));
        System.out.println();

    }
}