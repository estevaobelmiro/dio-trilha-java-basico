import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da sua conta: ");
        int numConta = sc.nextInt();
        System.out.print("Digite o número da sua agência: ");
        sc.nextLine();
        String numAgencia = sc.nextLine();
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o seu saldo atual: ");
        double saldo = sc.nextDouble(); 

        System.out.println("Olá " 
                            + nome 
                            + ", obrigado por criar uma conta em nosso banco, sua agência é "
                            + numAgencia 
                            + ", conta "
                            + numConta
                            + " e seu saldo "
                            + saldo
                            + " já está disponível para saque");

        sc.close();

    }
}
