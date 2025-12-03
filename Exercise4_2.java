public class Exercise4_2 {
    public static void main(String[] args) {          // 1
        zippo("rattle", 13);              // 2
    }

    public static void baffle(String blimp) {         // 6
        System.out.println(blimp);                    // 7
        zippo("ping", -5);                // 8
    }

    public static void zippo(String quince, int flag) { // 3, 9
        if (flag < 0) {                               // 10
            System.out.println(quince + " zoop");     // 11
        } else {                                      // 4
            System.out.println("ik");                 // 5
            baffle(quince);                           // 6
            System.out.println("boo -wa-ha-ha");      // 12
        }
    }
}
