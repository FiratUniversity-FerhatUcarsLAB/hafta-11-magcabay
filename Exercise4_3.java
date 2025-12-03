public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}

/*
main başlar: "No, I " (yan yana)

zoop çağrılır -> baffle çağrılır -> " wug" (yan yana)

ping çağrılır -> "." ve alt satıra geç (println).

Şu anki çıktı: No, I wug.

zoop devam eder: " You wugga " (yan yana)

zoop içinde tekrar baffle -> " wug" (yan yana)

ping -> "." ve alt satıra geç.

Şu anki çıktı satırı: You wugga wug.

main devam eder: "I " (yan yana)

main içinde baffle -> " wug" (yan yana)

ping -> "." ve alt satıra geç.

Tam Çıktı:
    No, I  wug.
 You wugga  wug.
I  wug.
*/

