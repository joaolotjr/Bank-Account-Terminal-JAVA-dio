import java.util.Locale;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        
        System.out.println("Digite seu Número da Conta:");
        int numero = sc.nextInt();

        System.out.println("Digite sua Agência:");
        String agencia = sc.next();
               
        System.out.println("Digite seu Saldo:");
        double saldo = sc.nextDouble();


        System.out.println("Ola " + nome + " brigado por criar uma conta em nosso banco, sua agência é " + agencia + " ,conta " + numero + " e seu saldo de " + saldo + " reais já está disponível para saque." );


    }
}
