package teste;

import java.util.*;
 
public class Cobra {
    // Represents possible directions and their corresponding coordinate changes
    private static final Map<Character, int[]> DIRECTIONS = Map.of(
        '>', new int[]{-1, 0},  // To follow arrow, go left
        '<', new int[]{1, 0},   // To follow arrow, go right
        'v', new int[]{0, -1},  // To follow arrow, go up
        '^', new int[]{0, 1}    // To follow arrow, go down
    );
    
    public static int[][] findSnakeCoordinates(String[] grid) {
        List<int[]> coordinates = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length();
        
        // Find snake head
        int headX = -1, headY = -1;
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {
                if (grid[y].charAt(x) == 'h') {
                    headX = x;
                    headY = y;
                    break;
                }
            }
            if (headX != -1) break;
        }
        
        // Add head coordinates
        coordinates.add(new int[]{headX, headY});
        
        // Follow the snake
        int currentX = headX;
        int currentY = headY;
        
        while (true) {
            boolean foundNext = false;
            
            // Check all adjacent cells
            for (Map.Entry<Character, int[]> direction : DIRECTIONS.entrySet()) {
                int nextX = currentX + direction.getValue()[0];
                int nextY = currentY + direction.getValue()[1];
                
                // Check if next position is within bounds
                if (nextX >= 0 && nextX < cols && nextY >= 0 && nextY < rows) {
                    char nextChar = grid[nextY].charAt(nextX);
                    
                    // If we find an arrow pointing to our current position
                    if (nextChar == direction.getKey()) {
                        coordinates.add(new int[]{nextX, nextY});
                        currentX = nextX;
                        currentY = nextY;
                        foundNext = true;
                        break;
                    }
                }
            }
            
            if (!foundNext) break;
        }
        
        // Convert List to array
        return coordinates.toArray(new int[0][]);
    }

    // Helper method to print the result
    public static void printResult(int[][] coordinates) {
        System.out.println("[");
        for (int[] coord : coordinates) {
            System.out.println("  [" + coord[0] + ", " + coord[1] + "],");
        }
        System.out.println("]");
    }

    // Test the solution
    public static void main(String[] args) {
        String[] grid = {
            " >>h   ",
            " ^   v ",
            " ^<<<< "
        };
        
        int[][] result = findSnakeCoordinates(grid);
        printResult(result);
    }
}