public class Main {

    public static void main(String[] args) {
        DichotomyMethod dm = new DichotomyMethod();
        System.out.println("Метод дихотомии");
        System.out.println(dm.min());
        GoldenSectionMethod gsm = new GoldenSectionMethod();
        System.out.println("Метод золотого сечения");
        System.out.println(gsm.min());
        FibonacciMethod fm = new FibonacciMethod();
        System.out.println("Метод Фибоначчи");
        System.out.println(fm.min());
    }


}
