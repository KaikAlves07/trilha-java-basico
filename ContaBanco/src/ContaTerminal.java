import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
    //Chamando o Scanner para fazer a variavel das informações digitadas pelo usuario;
        Scanner input = new Scanner(System.in);
    //Definindo a localização do Scanner como US para utilizar ponto;    
        input.useLocale(Locale.US);
    //Atribuindo o numero da conta em uma variavel;
        System.out.println("Por favor, digite o numero da sua conta: Exemplo(0000): ");
        int numero = input.nextInt();
    //Atribuindo o numero da Agência em uma variavel;
        System.out.println("Digite o número da Agência: Exemplo(000-0): ");
        String agencia = input.next();
    //Atribuindo o nome do cliente em uma variavel;
        System.out.println("Digite o seu nome: ");
        input.nextLine();
        String nomeCliente = input.nextLine();
    //Atribuindo o saldo do cliente em uma variavel;
        System.out.println("Digite o saldo da sua conta");
        double saldo = input.nextDouble();
    //Exibindo uma mensagem e as informações da conta do cliente;
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    //Fechando o Scanner;
        input.close();
    }
}
