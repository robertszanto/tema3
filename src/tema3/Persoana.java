package tema3;

import java.util.Locale;

public class Persoana {
    public static String curs;
    private String firstName;
    private String lastName;
    private Integer age;
    private String city;
    private boolean esteCasatorita;

    public Persoana(String firstName, String lastName, Integer age, String city, boolean esteCasatorita) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.esteCasatorita = esteCasatorita;
    }

   public Persoana () {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        age = incrementAge(age);
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isEsteCasatorita() {
        return esteCasatorita;
    }

    public void setEsteCasatorita(boolean esteCasatorita) {
        this.esteCasatorita = esteCasatorita;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", esteCasatorita=" + esteCasatorita +
                ", curs=" + curs +
                '}';
    }

    private Integer incrementAge(Integer x){
        x = x + 1;
        return x;
    }

    public String obtineIdentificator(String firstName, String lastName) {
        StringBuilder ID = new StringBuilder();
        ID.append(firstName.toLowerCase());
        ID.append("_");
        ID.append(lastName.toUpperCase());

        return ID.toString();
    }

}
