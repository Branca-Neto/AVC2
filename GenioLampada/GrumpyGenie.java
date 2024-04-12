/**
 * A classe GrumpyGenie representa um tipo de gênio que concede desejos de forma mal-humorada.
 * Ele concede um único desejo e se recusa a conceder mais depois disso.
 */
public class GrumpyGenie extends Genie {
    private boolean wishGranted; // Indica se o desejo foi concedido

    /**
     * Construtor padrão para criar um novo GrumpyGenie.
     * Inicializa o estado do desejo como não concedido.
     */
    public GrumpyGenie() {
        this.wishGranted = false;
    }

    /**
     * Método para conceder um desejo.
     * Este método só concede um desejo se ainda não tiver concedido nenhum.
     * @return true se o desejo foi concedido com sucesso, false caso contrário.
     */
    @Override
    public boolean grantWish() {
        if (!wishGranted) {
            wishGranted = true;
            return true;
        }
        return false;
    }



    // Implementação do método abstrato getGrantedWishes()
    @Override
    public int getGrantedWishes() {
        return 0; // Implemente a lógica para retornar o número de desejos concedidos
    }

    /**
     * Retorna uma representação em formato de string do estado atual do gênio.
     * Se o desejo foi concedido, retorna uma mensagem indicando isso.
     * Caso contrário, retorna uma mensagem indicando que o gênio tem um desejo para conceder.
     * @return Representação em formato de string do gênio.
     */
    @Override
    public String toString() {
        if (wishGranted) {
            return "O gênio mal-humorado concedeu um desejo.";
        } else {
            return "O gênio mal-humorado tem um desejo para conceder.";
        }
    }
}
