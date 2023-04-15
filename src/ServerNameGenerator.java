// Exercise 2 on Java II: Arrays

import java.sql.SQLOutput;
import java.util.Random;

public class ServerNameGenerator {

    private String adjective;
    private String noun;

// Start of SETTER/GETTER
    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }
// End of SETTER/GETTER

// Start of CONSTRUCTOR
    public ServerNameGenerator(String adjective, String noun) {
        this.adjective = adjective;
        this.noun = noun;
    }
// End of CONSTRUCTOR

    static String[] adjectives = {"Zany","Bizarre","Wacky","Absurd","Eccentric","Ludicrous","Outlandish","Freaky","Whimsical","Insane"};
    static String[] nouns = {"Banana","Giraffe","Starfish","Helicopter","Bubblegum","Lightning","Hippopotamus","Pancake","Lemon","Tangerine"};

// Start of Main
    public static void main(String[] args) {
        Random rand = new Random();
        int index = rand.nextInt(adjectives.length);
        int index2 = rand.nextInt(nouns.length);
        System.out.printf("Here is your server name:%n %s-%s",adjectives[index],nouns[index2]);
    }
// End of Main

}
