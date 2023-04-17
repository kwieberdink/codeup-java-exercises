// Inheritance and Polymorphism Lecture

package birds;

// Linking Quaker to the Bird Class
// Saying Quaker is a Bird
// Bird is the super class while Quaker is the subclass
public class Quaker extends Bird{

    public void makeNoise() {
        super.makeNoise();
        System.out.println(this.getName() + " goes ack-squeek");
    }

}
