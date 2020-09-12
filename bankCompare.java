import java.util.HashMap;

class bankCompare {
    public static void main(String[] args) {

        // calculate emi for each slab
        // calculate interest for bank
        // compare banks

        int prp = 10000;
        int ten = 20;
        int n = 3;
        HashMap<Integer, Double> hashMap = new HashMap<Integer, Double>(n);
        HashMap<Integer, Double> hashMap1 = new HashMap<Integer, Double>(n);

        hashMap.put(5, 9.5);
        hashMap.put(10, 9.6);
        hashMap.put(5, 8.5);

        hashMap1.put(10, 6.9);
        hashMap1.put(5, 8.5);
        hashMap1.put(5, 7.9);

        double emoni = 0;
        for (int key : hashMap.keySet()) {
            double mi = hashMap.get(key) / 12;
            mi++;
            int num = ten * 12;
            double res = Math.pow(mi, num);
            emoni += 1 - (1 / res);
            System.out.println("!!val is " + emoni);

        }

        double res1 = 0;
        double res2 = 0;
        res1 = emoni - prp;

        double emoni2 = 0;
        for (int key : hashMap1.keySet()) {
            double mi = hashMap1.get(key) / 12;
            mi++;
            int num = ten * 12;
            double res = Math.pow(mi, num);

            emoni2 += 1 - (1 / res);
            System.out.println("**val is " + emoni2);

        }

        res2 = emoni2 - prp;
        System.out.println("emoni is " + emoni);
        System.out.println("emoni2 is " + emoni2);
        System.out.println("difference is " + (emoni - emoni2));
        if (res1 >= res2) {
            System.out.println("bank b is better");
        } else {
            System.out.println("bank a is better");
        }
    }
}