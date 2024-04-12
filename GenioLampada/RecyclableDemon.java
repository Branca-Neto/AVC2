/**
 * A classe RecyclableDemon representa um demônio reciclável que concede desejos.
 * Ele mantém o controle de quantos desejos foram concedidos.
 */
public class RecyclableDemon extends Genie {
    private int grantedWishes; // Número de desejos concedidos

    /**
     * Construtor padrão para criar um novo RecyclableDemon.
     * Inicializa o contador de desejos concedidos como zero.
     */
    public RecyclableDemon() {
        this.grantedWishes = 0;
    }

    /**
     * Método para conceder um desejo.
     * Aumenta o contador de desejos concedidos e retorna true.
     *
     * @return true para indicar que o desejo foi concedido com sucesso
     */
    @Override
    public boolean grantWish() {
        grantedWishes++;
        return true;
    }

    /**
     * Método para obter o número de desejos já concedidos.
     *
     * @return o número de desejos já concedidos
     */
    public int getGrantedWishes() {
        return grantedWishes;
    }

    /**
     * Método para retornar uma representação em string deste demônio reciclável,
     * incluindo o número de desejos concedidos.
     *
     * @return uma string representando este demônio reciclável
     */
    @Override
    public String toString() {
        return "O demônio reciclável concedeu " + grantedWishes + " desejos.";
    }
}
