import java.time.LocalDate;

/**
 * A classe HealthProfile representa o perfil de saúde de um usuário,
 * incluindo informações como nome, sexo, data de nascimento, altura e peso.
 * Também fornece métodos para calcular a idade, o IMC, a frequência cardíaca máxima
 * e o intervalo de frequência cardíaca alvo do usuário.
 */
public class HealthProfile {
    private String nome;
    private String sobrenome;
    private char sexo;
    private int anoNascimento;
    private int mesNascimento;
    private int diaNascimento;
    private double altura; // em metros
    private double peso; // em quilogramas

    /**
     * Construtor para criar um objeto HealthProfile com os parâmetros fornecidos.
     *
     * @param nome            O nome do usuário.
     * @param sobrenome       O sobrenome do usuário.
     * @param sexo            O sexo do usuário ('M' para masculino, 'F' para feminino).
     * @param anoNascimento   O ano de nascimento do usuário.
     * @param mesNascimento   O mês de nascimento do usuário.
     * @param diaNascimento   O dia de nascimento do usuário.
     * @param altura          A altura do usuário em centímetros.
     * @param peso            O peso do usuário em quilogramas.
     */

    public HealthProfile(String nome, String sobrenome, char sexo, int anoNascimento, int mesNascimento, int diaNascimento, double altura, double peso) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setSexo(sexo);
        this.setAnoNascimento(anoNascimento);
        this.setMesNascimento(mesNascimento);
        this.setDiaNascimento(diaNascimento);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    // Métodos set e get para cada atributo (nome, sobrenome, sexo, anoNascimento, mesNascimento, diaNascimento, altura, peso) ...

    /**
     * Calcula e retorna a idade do usuário em anos.
     *
     * @return A idade do usuário em anos.
     */
    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        int idade = hoje.getYear() - getAnoNascimento();
        if (hoje.getMonthValue() < getMesNascimento() || (hoje.getMonthValue() == getMesNascimento() && hoje.getDayOfMonth() < getDiaNascimento())) {
            idade--;
        }
        return idade;
    }

    /**
     * Calcula e retorna o Índice de Massa Corporal (IMC) do usuário.
     *
     * @return O IMC do usuário.
     */
    public double calcularIMC() {
        double alturaMetros = getAltura() / 100.0; // Convertendo altura de centímetros para metros
        return getPeso() / (alturaMetros * alturaMetros);
    }

    /**
     * Calcula e retorna a frequência cardíaca máxima do usuário.
     *
     * @return A frequência cardíaca máxima do usuário.
     */
    public int calcularFrequenciaCardiacaMaxima() {
        return 220 - calcularIdade();
    }

    /**
     * Calcula e retorna o intervalo de frequência cardíaca alvo do usuário.
     *
     * @return O intervalo de frequência cardíaca alvo do usuário (em batimentos por minuto).
     */
    public String calcularFrequenciaCardiacaAlvo() {
        int frequenciaMaxima = calcularFrequenciaCardiacaMaxima();
        int minimo = (int) (frequenciaMaxima * 0.5); // 50% da frequência cardíaca máxima
        int maximo = (int) (frequenciaMaxima * 0.85); // 85% da frequência cardíaca máxima
        return minimo + " - " + maximo + " bpm";
    }

    /**
     * Exibe um gráfico de valores IMC.
     */
    public void exibirGraficoIMC() {
        System.out.println("A exibição do gráfico IMC ainda não está implementada.");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
