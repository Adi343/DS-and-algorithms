class dungeon {

    public static void main(String[] args) {

        int[][] dungeon = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };
        int h = 0;

        for (int i = 0; i < dungeon.length; i++) {
            for (int j = 0; j < dungeon[0].length; j++) {

                if (i == dungeon.length - 1 && j == dungeon[0].length - 1) {
                    h = h + dungeon[i][j];
                } else if (i == dungeon.length - 1) {
                    h = h + dungeon[i][j + 1];
                } else if (j == dungeon.length - 1) {
                    h = h + dungeon[i + 1][j];
                }

                else {
                    int a = dungeon[i][j + 1];
                    int b = dungeon[i + 1][j];

                    if (a > b) {
                        h = h + dungeon[i][j + 1];
                    } else if (b > a) {
                        h = h + dungeon[i + 1][j];
                    }
                }
            }
        }

        System.out.println("Health is " + h);
    }
}