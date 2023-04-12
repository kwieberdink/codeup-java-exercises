package rpg;

public class Fighter {

    // default/no key word: visible for everything in the package
    // private key word: only visible in the class
    // public key word: accessible by anyone
    private String name;
    private int hitPoints;
    private int maxDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public void printStats() {
        System.out.printf("%s has %d hit points and does %d maximum damage.%n",name, hitPoints, maxDamage);
    }

    public Fighter() {
        // no argument constructor

    }

    public Fighter(String name, int hitPoints, int maxDamage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;

    }

}
