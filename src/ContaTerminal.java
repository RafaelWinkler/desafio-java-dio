import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("====================================================");
        System.out.println("Digitar dados da nova conta: ");
        System.out.print("Número da agência: ");
        int agency = sc.nextInt();
        System.out.print("Número: ");
        String accountNumber =   sc.next();
        System.out.print("Nome do Cliente: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Saldo: ");
        Double balance  = sc.nextDouble();
        System.out.println("====================================================");
        System.out.println(name
                + ", obrigado por criar uma conta em nosso banco,\nsua agência é "
                + agency
                +  ", conta "
                + accountNumber
                + " e seu saldo é "
                + String.format("%.2f", balance) + "\njá está disponível para saque.");

        System.out.println("\n====================================================");

        sc.close();
    }
}
