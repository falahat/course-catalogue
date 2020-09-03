/**
 * A general interface to represent a unique Person with a name
 *
 * TODO: Can a person be both a student and a teacher?
 */
public abstract class Person {
    private String fullName;

    /**
     * @param fullName - This person's full legal name.
     */
    public Person(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return This person's full legal name.
     * This may be localized to different regions, which will affect how the full name is written.
     */
    public String getFullName() {
        return this.fullName;
    }
}
