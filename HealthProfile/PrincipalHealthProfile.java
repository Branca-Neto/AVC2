import java.util.Scanner;

/**
 * A classe PrincipalHealthProfile é responsável por interagir com o usuário
 * para obter informações sobre uma pessoa e exibir seu perfil de saúde,
 * incluindo informações como nome, sexo, data de nascimento, altura, peso,
 * idade, frequência cardíaca máxima, frequência cardíaca alvo e índice de
 * massa corporal (IMC).
 */
public class PrincipalHealthProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações do usuário
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

        System.out.println("Digite o sexo da Pessoa (M/F): ");
        char sexo = scanner.next().charAt(0); // Corrigindo a leitura do sexo

        System.out.println("Digite a altura em (metros): ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o peso em (quilogramas): ");
        double peso = scanner.nextDouble();

        // Criar um objeto HealthProfile com as informações fornecidas pelo usuário
        HealthProfile pessoa = new HealthProfile(nome, sobrenome, sexo, anoNascimento, mesNascimento, diaNascimento, altura, peso);

        // Exibir o perfil de saúde da pessoa
        System.out.println("\nInformacoes da pessoa: ");
        System.out.println("Nome Completo : " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Data de Nascimento: " + pessoa.getDiaNascimento() + " / " + pessoa.getMesNascimento() + " / " + pessoa.getAnoNascimento());
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
        System.out.println("Frequencia Cardiaca Maxima: " + pessoa.calcularFrequenciaCardiacaMaxima() + " bpm");
        System.out.println("Frequencia Cardiaca Alvo: " + pessoa.calcularFrequenciaCardiacaAlvo() + " bpm");
        System.out.println("IMC: " + pessoa.calcularIMC());

        // Exibir gráfico de valores IMC
        pessoa.exibirGraficoIMC();

        scanner.close();
    }
}
