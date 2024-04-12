import java.util.Random;

/**
 * A MagicLamp class representing a magical lamp that releases genies when rubbed.
 */
public class MagicLamp {
    private int initialGenies;
    private int currentGenies;
    private int demonsFed;
    private int rubCount;

    /**
     * Constructs a MagicLamp object with an initial capacity of genies.
     */
    public MagicLamp() {
        this.initialGenies = 4;
        this.currentGenies = initialGenies;
        this.demonsFed = 0;
        this.rubCount = 0;
    }

    /**
     * Releases a genie from the lamp.
     * 
     * @return A genie released from the lamp.
     */
    public Genie releaseGenie() {
        if (currentGenies > 0) {
            Random random = new Random();
            boolean isFriendly = rubCount % 2 == 0; // Checks if the lamp has been rubbed an even number of times
            rubCount++;
            currentGenies--;
            if (isFriendly) {
                return new GrumpyGenie();
            } else {
                return new GrumpyGenie();
            }
        } else {
            demonsFed++;
            return new RecyclableDemon();
        }
    }

    /**
     * Feeds the demon to recharge the lamp.
     */
    public void feedDemon() {
        System.out.println("Alimentando o demônio para recarregar a lâmpada.");
        currentGenies = initialGenies;
        demonsFed--;
        rubCount = 0; // Reset the rub count after recharging
    }
}
