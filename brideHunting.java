class brideHunting {
    public static void main(String[] args) {
        int[][] arr = { { 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 1, 0 }, { 0, 0, 1, 1, 1, 0 },
                { 0, 0, 1, 1, 1, 0 }, { 0, 0, 0, 0, 0, 0 } };

        // make val array
        // get brides with high vals
        // select closest of them

        int[][] val = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (i != 0 && j != 0) {

                    if (j - 1 >= 0) {
                        val[i][j] += arr[i][j - 1];
                    }
                    if (j + 1 < arr[0].length) {
                        val[i][j] += arr[i][j + 1];
                    }
                    if (i - 1 >= 0) {
                        val[i][j] = val[i][j] + arr[i - 1][j];
                        if (j - 1 >= 0) {
                            val[i][j] += arr[i - 1][j - 1];
                        }
                        if (j + 1 < arr[0].length) {
                            val[i][j] += arr[i - 1][j + 1];
                        }
                    }

                    if (i + 1 < arr.length) {
                        val[i][j] = val[i][j] + arr[i + 1][j];
                        if (j - 1 >= 0) {
                            val[i][j] += arr[i - 1][j - 1];
                        }
                        if (j + 1 < arr.length) {
                            val[i][j] += arr[i + 1][j + 1];
                        }
                    }
                }
            }
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        int p = 0;
        int q = 0;
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val[0].length; j++) {
                if (val[i][j] >= max) {
                    max = val[i][j];

                    if ((p - i) + (q - j) < min) {
                        min = p - i + q - j;
                        p = i;
                        q = j;
                    }
                }
            }

        }

        p++;
        q++;
        System.out.println("p is " + p + " q is " + q);
        System.out.println("max is " + max);
    }
}