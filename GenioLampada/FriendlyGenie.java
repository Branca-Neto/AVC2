/**
 * A classe FriendlyGenie representa um gênio bem-humorado que concede desejos.
 * Ele mantém o controle de quantos desejos foram concedidos e quantos ainda
 * estão disponíveis para concessão.
 */
public class FriendlyGenie extends Genie {
    private int grantedWishes; // Número de desejos concedidos

    /**
     * Construtor padrão para criar um novo FriendlyGenie.
     * Inicializa o contador de desejos concedidos como zero.
     */
    public FriendlyGenie() {
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
     * Método para retornar uma representação em string deste gênio amigável,
     * incluindo o número de desejos concedidos e quantos ainda estão disponíveis
     * para concessão.
     *
     * @return uma string representando este gênio amigável
     */
    @Override
    public String toString() {
        int remainingWishes = 3 - grantedWishes;
        return "O gênio amigável concedeu " + grantedWishes + " desejos e ainda tem, " + remainingWishes + " para conceder.";
    }
}
