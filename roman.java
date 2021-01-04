public class roman {

    public static void main(String[] args) {

        int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        String s = "MCMXCIV";

        int len = s.length();
        int res = 0;

        for (int i = 0; i < len; i++) {

            if (s.charAt(i) == 'I') {
                if (i + 1 < len && s.charAt(i + 1) == 'V') {
                    res += 4;
                    i++;
                } else if (i + 1 < len && s.charAt(i + 1) == 'X') {
                    res += 9;
                    i++;
                } else {
                    res += 1;
                }
            }

            else if (s.charAt(i) == 'X') {
                if (i + 1 < len && s.charAt(i + 1) == 'L') {
                    res += 40;
                    i++;
                } else if (i + 1 < len && s.charAt(i + 1) == 'C') {
                    res += 90;
                    i++;
                } else {
                    res += 10;
                }
            }

            else if (s.charAt(i) == 'C') {
                if (i + 1 < len && s.charAt(i + 1) == 'D') {
                    res += 400;
                    i++;
                } else if (i + 1 < len && s.charAt(i + 1) == 'M') {
                    res += 900;
                    i++;
                } else {
                    res += 100;
                }
            }

            else if (s.charAt(i) == 'V') {
                res += 5;
            }

            else if (s.charAt(i) == 'L') {
                res += L;
            }

            else if (s.charAt(i) == 'D') {
                res += D;
            } else if (s.charAt(i) == 'M') {
                res += 1000;
            } else {
                System.out.println("error");
            }

        }

        System.out.println("result is " + res);
    }
}