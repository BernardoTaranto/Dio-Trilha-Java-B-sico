
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //TO  DO: Importar e conhecer a classe Scanner

        //TO DO: Exibir as mensagens para o nosso usuário

        //TO DO: Obter pela classe Scanner os valores obtidos pelo terminal

        //TO DO: exibir a mensagem conta criada

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da agencia");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o valor a ser depositado");
        double saldo = scanner.nextDouble();

        System.out.println("Por favor, digite seu nome");
        String nome = scanner.next();
        
        

        
        //imprimindo os dados obtidos pelo usuario

        
        System.out.println("Olá " + nome +  ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        
    }
}