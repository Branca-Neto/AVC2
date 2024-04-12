import java.util.Scanner;

/**
 * A classe PrincipalHeartRates é responsável por interagir com o usuário para coletar informações
 * sobre uma pessoa, como nome, sobrenome e data de nascimento, e exibir informações sobre a pessoa,
 * incluindo idade, frequência cardíaca máxima e frequência cardíaca alvo.
 */
public class PrincipalHeartRates {
    
    /**
     * O método main é o ponto de entrada do programa. Ele solicita ao usuário informações sobre uma pessoa,
     * cria um objeto HeartRates com essas informações e exibe as informações da pessoa, incluindo idade,
     * frequência cardíaca máxima e frequência cardíaca alvo.
     * 
     * @param args Os argumentos da linha de comando (não utilizado neste programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar informações sobre a pessoa
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o Sobrenome: ");
        String sobrenome = scanner.nextLine();
        
        System.out.println("Digite o ano de Nascimento: ");
        int anoNascimento = scanner.nextInt();
        
        System.out.println("Digite o mes de Nascimento: ");
        int mesNascimento = scanner.nextInt();
        
        System.out.println("Digite o dia de Nascimento: ");
        int diaNascimento = scanner.nextInt();

        // Criar um objeto HeartRates com as informações fornecidas
        HeartRates pessoa = new HeartRates(nome, sobrenome, anoNascimento, mesNascimento, diaNascimento);
        
        // Exibir informações sobre a pessoa
        System.out.println("\nInformacoes da pessoa: ");
        System.out.println("Nome Completo : " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento()); 
        System.out.println("idade : " + pessoa.calcularIdade() + " anos  "); 
        System.out.println("Frequencia Cardiaca Maxima: " + pessoa.calcularFreqCardiacaMaxima() + " bpm "); 
        System.out.println("Frequencia Cardiaca Alvo : " + pessoa.calcularFreqCardiacaAlvo() + " bpm  ");

        scanner.close();
    }
}
