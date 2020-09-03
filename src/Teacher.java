/**
 * TODO: I don't like this since it is so threadbare. Perhaps an OOP approach isn't the best. In a real
 *       production setting, I would just have a Person class with an enum called PersonType that is either
 *       Teacher or Student. But since they asked for an OOP solution, this is what I did.
 */
public class Teacher extends Person {

    /**
     * @param fullName - This person's full legal name.
     */
    public Teacher(String fullName) {
        super(fullName);
    }
}
