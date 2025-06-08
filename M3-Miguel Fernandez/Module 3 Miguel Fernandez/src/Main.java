// Miguel Fernandez
// Module 3
// 6/08/2025
public class Main {
    public static void main(String[] args) {
        for (int Alpha = 0; Alpha < 7; Alpha++) {
            // Make spaces
            for (int Bravo = 0; Bravo < 7 - Alpha - 1; Bravo++) {
                System.out.print("   ");
            }

            // Make pyramid numbers
            int number = 1;
            for (int Delta = 0; Delta <= Alpha; Delta++) {
                System.out.print(number + " ");
                number *= 2;
            }
            for (int Delta = Alpha - 1; Delta >= 0; Delta--) {
                number /= 2;
                System.out.print(number + " ");
            }

            // Put @
            System.out.println(" @");
        }
    }
}
