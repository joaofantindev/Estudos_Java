package Clean;

public class Human {
    public String name;
    public int age;
    public float height;

    private String socialSecurityNumber;
    
    protected String occupation;
    protected String nationality;
    protected String gender;

    private Human(String name, int age, float height, String socialSecurityNumber, String address, String occupation, String nationality, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.socialSecurityNumber = socialSecurityNumber;
        this.occupation = occupation;
        this.nationality = nationality;
        this.gender = gender;
    }

    public static Human createHuman(String name, int age, float height, String socialSecurityNumber, String occupation, String nationality, String gender) {
        return new Human(name, age, height, socialSecurityNumber, null, occupation, nationality, gender);
    }
}
