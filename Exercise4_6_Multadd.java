public class Exercise4_6_Multadd {

   // Temel Metot: a * b + c işlemini yapar
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // expSum Metodu: x * e^-x + sqrt(1 - e^-x)
    public static double expSum(double x) {
        // Senin mantığınla parçalara ayırıyoruz:
        
        // 1. Terim: x * e^(-x) hesaplamak için -> multadd(x, e^-x, 0)
        double term1 = multadd(x, Math.exp(-x), 0);
        
        // 2. Terim: sqrt(1 - e^(-x)) hesaplamak için:
        // İçerisi (1 - e^-x) -> Bunu (-1 * e^-x + 1) olarak düşünebiliriz.
        // Yani multadd(-1, e^-x, 1)
        double insideSqrt = multadd(-1.0, Math.exp(-x), 1.0);
        double term2 = Math.sqrt(insideSqrt);

        // Sonuç: İkisinin toplamı
        return term1 + term2;
    }

    public static void main(String[] args) {
        
        // --- 1. Bölüm: sin(pi/4) + cos(pi/4)/2 ---
        // Senin Yöntemin: sin * 1 + cos/2 -> a=sin, b=1, c=cos/2
        double sinVal = Math.sin(Math.PI / 4);
        double cosVal = Math.cos(Math.PI / 4);
        double result1 = multadd(sinVal, 1.0, cosVal / 2.0);

        // --- 2. Bölüm: log(10) + log(20) ---
        // Senin Yöntemin: log(10) * 1 + log(20) -> a=log10, b=1, c=log20
        double log10Val = Math.log10(10);
        double log20Val = Math.log10(20);
        double result2 = multadd(log10Val, 1.0, log20Val);

        // --- 3. Bölüm: expSum(1) ---
        double x = 1.0;
        double result3 = expSum(x);

        // --- İSTEDİĞİN ÇIKTI FORMATI ---
        System.out.println("\n=== Açıklamalar ===");
        
        System.out.println("1. sin(π/4) + cos(π/4)/2 formülü:");
        System.out.println("   multadd(sin(π/4), 1, cos(π/4)/2)");
        System.out.println("   = sin(π/4) * 1 + cos(π/4)/2");
        System.out.println("   Sonuç: " + result1); // Hesaplanan gerçek sonucu da ekledim

        System.out.println("\n2. log(10) + log(20) formülü:");
        System.out.println("   multadd(log(10), 1, log(20))");
        System.out.println("   = log(10) * 1 + log(20)");
        System.out.println("   Sonuç: " + result2);

        System.out.println("\n3. x*e^(-x) + sqrt(1 - e^(-x)) formülü:");
        System.out.println("   İlk terim: multadd(x, exp(-x), 0) = x * e^(-x)");
        System.out.println("   İkinci terim: sqrt(multadd(-1, exp(-x), 1))");
        System.out.println("   = sqrt(-1 * e^(-x) + 1) = sqrt(1 - e^(-x))");
        System.out.println("   Sonuç (x=1 için): " + result3);
    }
}
