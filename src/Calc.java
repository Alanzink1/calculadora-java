import java.util.Scanner;

public class Calc {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Num n1 = new Num();
        Num n2 = new Num();
        Num res = new Num();
        String opt = "S";

        while (opt.equalsIgnoreCase("s")) {

            System.out.printf("%nDigite o primeiro valor:");
            n1.setValue(scan.nextInt());

            System.out.printf("%nDigite o segundo valor:");
            n2.setValue(scan.nextInt());

            res.setValue(n1.getValue() + n2.getValue());
            System.out.printf("%nA soma de %d com %d e igual a %d", n1.getValue(), n2.getValue(), res.getValue());

            System.out.printf("%nDeseja somar outro valor? (s/n)");
            opt = scan.next();
            System.out.printf("%n%n%n");
        }
    }
}
