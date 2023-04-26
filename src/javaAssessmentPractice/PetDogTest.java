package javaAssessmentPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PetDogTest {
    public static void main(String[] args) {
        PetDog buddy = new PetDog("Buddy","German Shephard",true);
        PetDog belle = new PetDog("Belle","Chow Chow",true);
        PetDog kodi = new PetDog("Kodi","Australian Shephard", true);
        ArrayList<PetDog> dogs = new ArrayList<>(List.of(buddy,belle,kodi));
        PetDog.allSnuggle(dogs);
    }

}
