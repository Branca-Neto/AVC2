/**
 * Classe que representa a execução das operações de Arabian Nights.
 */
public class ArabianNights {
    /**
     * Método principal que executa as operações de Arabian Nights.
     *
     * @param args os argumentos de linha de comando (não utilizado neste caso)
     */
    public static void main(String[] args) {
        MagicLamp lamp = new MagicLamp();

        // 1. Criar uma lâmpada mágica com capacidade para 4 génios.
        System.out.println("1. Criar uma lâmpada mágica com capacidade para 4 génios.");

        // 2. Esfregar 5 vezes a lâmpada, indicando os números de desejos 2, 3, 4, 5, 1.
        System.out.println("2. Esfregar 5 vezes a lâmpada, indicando os números de desejos 2, 3, 4, 5, 1.");
        for (int i = 0; i < 5; i++) {
            Genie genie = lamp.releaseGenie();
            System.out.println("Genie " + (i + 1) + " consedendo desejo: " + genie.grantWish());
        }

        // 3. Invocar e imprimir o resultado do método toString sobre cada um dos génios.
        System.out.println("3. Invocar e imprimir o resultado do método toString sobre cada um dos génios.");
        for (int i = 0; i < 5; i++) {
            Genie genie = lamp.releaseGenie();
            System.out.println(genie);
        }

        // 4. Pedir um desejo a cada um dos génios.
        System.out.println("4. Pedir um desejo a cada um dos génios.");
        for (int i = 0; i < 5; i++) {
            Genie genie = lamp.releaseGenie();
            genie.grantWish();
        }

        // 5. Invocar e imprimir o resultado do método toString sobre cada um dos génios.
        System.out.println("5. Invocar e imprimir o resultado do método toString sobre cada um dos génios.");
        for (int i = 0; i < 5; i++) {
            Genie genie = lamp.releaseGenie();
            System.out.println(genie);
        }

        // 6. Pedir um desejo a cada um dos génios.
        System.out.println("6. Pedir um desejo a cada um dos génios.");
        for (int i = 0; i < 5; i++) {
            Genie genie = lamp.releaseGenie();
            genie.grantWish();
        }

        // 7. Invocar e imprimir o resultado do método toString sobre cada um dos génios.
        System.out.println("7. Invocar e imprimir o resultado do método toString sobre cada um dos génios.");
        for (int i = 0; i < 5; i++) {
            Genie genie = lamp.releaseGenie();
            System.out.println(genie);
        }

        // 8. Colocar o demónio reciclável na lâmpada.
        System.out.println("8. Colocar o demónio reciclável na lâmpada.");
        lamp.feedDemon();

        // 9. Esfregar a lâmpada, indicando 7 como número de desejos.
        System.out.println("9. Esfregar a lâmpada, indicando 7 como número de desejos.");
        Genie demon = lamp.releaseGenie();
        for (int i = 0; i < 7; i++) {
            demon.grantWish();
        }

        // 10. Invocar e imprimir o resultado do método toString sobre o génio obtido.
        System.out.println("10. Invocar e imprimir o resultado do método toString sobre o génio obtido.");
        System.out.println(demon);
    }
}
