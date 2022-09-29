public class Main {
    public static void main(String[] args) {
task1();
task2();
task3();
task4();
task5();
    }
    public static void task1 () {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 1.0f;
        double d = 2.0;
        boolean bool = true;
        char c = 'C';
    }
    public static void task2 (){
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var total = firstBoxer + secondBoxer;
                var difference = Math.abs(firstBoxer - secondBoxer);
                System.out.println(total);
                System.out.println(difference);
    }
    public static void task3(){
var banana = 5;
var bananaWeight = 80;

var milk = 200/100;
var milkWeight = 105;

var iceCream = 2;
var iceCreamWeight = 100;

var egg = 4;
var eggWeight = 70;

var total = (banana * bananaWeight) + (milk * milkWeight) + (iceCream * iceCreamWeight) + (egg * eggWeight);
 var gramsInKg = 1000;

 var totalKg = total / (gramsInKg * 1.0);
 System.out.println(totalKg);
    }
    public static void task4 (){
        var weight = 7;
                var gramsInKg = 1000;
                var weightInGrams = weight * gramsInKg;
                var minGramsPerDay = 250;
                var maxGramsPerDay = 500;
                var minDays = weightInGrams / minGramsPerDay;
                var maxDays = weightInGrams / maxGramsPerDay;
                var avgDays = (minDays + maxDays) / 2;

                System.out.println("Min " + minDays + " days");
                System.out.println("Max " + maxDays + " days");
                System.out.println("Avg " + avgDays + " days");

    }
    public static void task5 (){
        int percent = 10;
        double multiplier = percent / (100 * 1.0);


        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalry = 76_230;

        int mashaNewSlary = (int) (mashaSalary + mashaSalary * multiplier);
                int denisNewSalary = (int) (denisSalary + denisSalary * multiplier);
                int kristinaNewSalary = (int) (kristinaSalry + kristinaSalry * multiplier);

                int mashaDifference = (mashaNewSlary - mashaSalary) * 12;
                int denisDifference = (denisNewSalary - denisSalary) * 12;
                int kristinaDifference = (kristinaNewSalary - kristinaSalry) * 12;

                System.out.println("Маша теперь получает " + mashaNewSlary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary+ " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");
    }
}