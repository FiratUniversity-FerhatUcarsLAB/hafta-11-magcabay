public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}



    /*
     * CEVAP 1: zoop metodu İKİNCİ KEZ çağrıldığında Stack Diyagramı
     * 
     * İkinci zoop çağrısı clink içinden yapılır: zoop("breakfast", 4)
     * 
     * ┌────────────────────────────────┐
     * │ zoop(fred, bob)                │  <- En üstte (şu an çalışıyor)
     * │ fred = "breakfast"             │
     * │ bob = 4                        │
     * ├────────────────────────────────┤
     * │ clink(fork)                    │
     * │ fork = 4                       │
     * ├────────────────────────────────┤
     * │ main(args)                     │
     * │ args = String[]                │
     * │ bizz = 5                       │
     * │ buzz = 2                       │
     * └────────────────────────────────┘
     * 
     * Not: İkinci zoop çağrısında bob=4 (5 değil), bu yüzden else bloğu çalışacak
     * 
     * 
     * CEVAP 2: Program Çıktısı
     * 
     * just for
     * anynotmore
     * It's breakfast
     * !
     * 
     * 
     * Adım Adım Açıklama:
     * 
     * 1. main başlar
     * 2. bizz = 5, buzz = 2 atanır
     * 3. zoop("just for", 5) çağrılır (BİRİNCİ ÇAĞRI)
     * 4. "just for" yazdırılır
     * 5. bob == 5 kontrolü: DOĞRU
     * 6. ping("not") çağrılır
     * 7. "any" + "not" + "more" = "anynotmore" yazdırılır
     * 8. main'e geri dönülür
     * 9. clink(2 * 2) = clink(4) çağrılır
     * 10. "It's " yazdırılır (print, satır atlamaz)
     * 11. zoop("breakfast", 4) çağrılır (İKİNCİ ÇAĞRI)
     * 12. "breakfast" yazdırılır (println, satır atlar)
     * 13. bob == 5 kontrolü: YANLIŞ (bob=4)
     * 14. else bloğu çalışır
     * 15. "!" yazdırılır
     * 16. Program sona erer
     * 
     * Önemli Notlar:
     * - print() satır atlamaz, println() satır atlar
     * - 2 * buzz = 2 * 2 = 4
     * - İkinci zoop'ta bob=4 olduğu için else çalışır
     */
}
