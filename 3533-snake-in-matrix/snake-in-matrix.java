class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
           int grid[][] = new int[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = count;
                count++;
            }
        }
          int h = 0;
        int g = 0;
        int temp = 0;

     for (int i = 0; i < commands.size(); i++) {
            String command = commands.get(i);

            if (command.equals("DOWN")) {
                h += 1;
            } else if (command.equals("UP")) {
                h -= 1;
            } else if (command.equals("LEFT")) {
                g -= 1;
            } else if (command.equals("RIGHT")) {
                g += 1;
            }

            temp = grid[h][g];
        }


        return temp;

    }
    
}