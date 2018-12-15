import java.util.Random;

    public class Main {

        public static void main(String[] args) {
            scen1(); scen2(); scen3(); scen4(); 
        }
        public static int play, a, b, c, d, y, z;

//      6-sided die that always lands on evens
        public static void scen1() {

            Random rand = new Random();
            float expected = (float) 3 / 6;
            System.out.printf("The First Scenario:\nExpected Result: %.4f", expected);
            y = 0;
            z = 0;
            for (int i = 1; i<9999; i++) {
                play = rand.nextInt(6)+1;
                if (play%2 == 0) {
                    z++;
                }
                else {
                    y++;
                }
            }
            System.out.println("\nScenarios in which true: " + y);
            System.out.println("Scenarios in which false: " + z);
            System.out.println("When the occurance happens " + (double)y/100000);
        }

//      10-sided die even that has an outcome of either of an even number or greater than 5
        public static void scen2() {

            Random rand = new Random();
            float expected = (float) (2 + 5) / 10;
            System.out.printf("\nThe Second Scenario:\nExpected Result: %.4f", expected);
            y = 0;
            z = 0;
            for (int i = 1; i < 100001; i++) {
                play = rand.nextInt(10) + 1;
                if (play % 2 == 0) {
                    y++;
                }
                else {
                    if (play > 5) {
                        y++;
                    }
                }
            }
            System.out.println("\nScenarios in which true: " + y);
            System.out.println("Scenarios in which false: " + (100000-y));
            System.out.println("When the occurance happens " + (double) y / 100000);
        }

//      6-side die that has outcomes of it being even, then odd
        public static void scen3() {

            Random rand = new Random();
            double expected = (3.00 / 6.00)*(3.00 / 6.00);
            System.out.printf("\nThe Third Scenario:\nExpected Result: %.4f", expected);
            y = 0;
            z = 0;
            for (int i = 1; i<100001; i++) {
                play = rand.nextInt(6)+1;
                if (play%2 == 0) {
                    play = rand.nextInt(6)+1;
                    if (play%2 == 0) {
                        y++;
                    }
                }
            }
            System.out.println("\nScenarios in which true: " + y);
            System.out.println("Scenarios in which false: " + (100000-y));
            System.out.println("When the occurance happens " + (double)y/100000);
        }

//      6-sided die with 1 or 2, then 3 or 4, and lastly, a 5 or 6
        public static void scen4() {

            Random rand = new Random();
            double expected = (2.00 / 6.00)*(2.00 / 6.00);
            System.out.printf("\nThe Fourth Scenario:\nExpected Result: %.4f", expected);
            y = 0;
            z = 0;
            for (int i = 1; i<100001; i++) {
                play = rand.nextInt(6)+1;
                if (play == 1 || play == 2) {
                    play = rand.nextInt(6)+1;
                    if (play == 3 || play == 4) {
                        y++;
                    }
                }
            }
            System.out.println("\nScenarios in which true: " + y);
            System.out.println("Scenarios in which false: " + (100000-y));
            System.out.println("When the occurance happens " + (double)y/100000);
        }
        }
    }
