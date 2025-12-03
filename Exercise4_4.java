public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        /* Derleyici UYARI VERMEZ ve HATA VERMEZ.
     * Program normal çalışır, ancak dönen değer kaybolur.
     * Bu kötü programlama pratiğidir ama Java buna izin verir.
     * 
     * Örnek:
     * returnMethod();  // 42 döner ama hiçbir yerde kullanılmaz
        */

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
      /*  DERLEME HATASI (Compile Error) verir!
      
      Hata Mesajı:
      "error: 'void' type not allowed here"
      
      Açıklama:
      void metotlar hiçbir değer döndürmez. Bu yüzden matematiksel
      işlemlerde, System.out.println() içinde veya herhangi bir
      ifadenin parçası olarak kullanılamazlar.
      
      Hatalı: System.out.println(voidMethod() + 7);
      Doğru:  voidMethod();
              System.out.println(7);
     */

        // Cevaplarinizi yorum olarak ekleyin.
    }
}

