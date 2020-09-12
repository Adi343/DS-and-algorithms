class jurassicpark {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        int c = 1;
        int d = 0;

        int e = 2;
        int f = 0;

        int x = 0;
        int y = 2;

        int[][] gates = { { 0, 0 }, { 1, 0 }, { 2, 0 } };

        char[][] grid = { { 'G', 'G', 'G', 'G' }, { 'G', 'W', 'W', M }, { 'G', 'G', 'W', 'W' },
                { 'M', 'G', 'M', 'M' } };
        int total = 0;
        int safe = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 'G') {
                    total++;
                    if (calcSafe(grid, i, j, x, y, gates)) {
                        safe++;
                    }
                }
            }
        }

        int res = safe / total;
        res = res * 100;
        System.out.println("res is " + res);
    }

    public static boolean calcSafe(char[][] grid, int i, int j, int x, int y, int[][] gates) {
        boolean check = false;
        // calculate time using dfs for human-gate
        // catculate time using dfs for smiledion-human
        // if t1>t2 return true safe
        // else return false
        return check;
    }
}