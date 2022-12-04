import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String patronymic;
    private String birthDate;
    private int phoneNumber;
    private char gender;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name+" "+surname+" "+patronymic+" "+birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return gender == person.gender && name.equals(person.name) && surname.equals(person.surname) && patronymic.equals(person.patronymic) && birthDate.equals(person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, birthDate, gender);
    }
}
