import java.time.LocalDate;

/**
 * A classe HeartRates é responsável por armazenar informações sobre uma pessoa,
 * incluindo nome, sobrenome e data de nascimento, e fornece métodos para calcular
 * a idade da pessoa em anos, a frequência cardíaca máxima e a frequência cardíaca
 * alvo com base na idade da pessoa.
 */
public class HeartRates {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    /**
     * Construtor da classe HeartRates.
     * 
     * @param nome           O nome da pessoa.
     * @param sobrenome      O sobrenome da pessoa.
     * @param anoNascimento  O ano de nascimento da pessoa.
     * @param mesNascimento  O mês de nascimento da pessoa.
     * @param diaNascimento  O dia de nascimento da pessoa.
     */
    public HeartRates(String nome, String sobrenome, int anoNascimento, int mesNascimento, int diaNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
    }

    // Métodos Get e Set

    /**
     * Obtém o nome da pessoa.
     * 
     * @return O nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     * 
     * @param nome O nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o sobrenome da pessoa.
     * 
     * @return O sobrenome da pessoa.
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Define o sobrenome da pessoa.
     * 
     * @param sobrenome O sobrenome da pessoa.
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * Obtém a data de nascimento da pessoa.
     * 
     * @return A data de nascimento da pessoa.
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define a data de nascimento da pessoa.
     * 
     * @param dataNascimento A data de nascimento da pessoa.
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Métodos de cálculo

    /**
     * Calcula e retorna a idade da pessoa em anos.
     * 
     * @return A idade da pessoa em anos.
     */
    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        int idade = hoje.getYear() - dataNascimento.getYear();
        if (hoje.getMonthValue() < dataNascimento.getMonthValue() || (hoje.getMonthValue() == dataNascimento.getMonthValue() && hoje.getDayOfMonth() < dataNascimento.getDayOfMonth())) {
            idade--;
        }
        return idade;
    }

    /**
     * Calcula e retorna a frequência cardíaca máxima da pessoa.
     * 
     * @return A frequência cardíaca máxima da pessoa.
     */
    public int calcularFreqCardiacaMaxima() {
        return 220 - calcularIdade();
    }

    /**
     * Calcula e retorna a frequência cardíaca alvo da pessoa.
     * 
     * @return A frequência cardíaca alvo da pessoa no formato "min - max" bpm.
     */
    public String calcularFreqCardiacaAlvo() {
        int maximo = calcularFreqCardiacaMaxima();
        int minimo = (int) (maximo * 0.5); // 50% da frequencia cardiaca maxima
        int maximoAlvo = (int) (maximo * 0.85); // 85% da frequencia cardiaca maxima
        return minimo + " - " + maximoAlvo;
    }
}
