package prep;

import java.util.Objects;

public class ImmutablePerson {

    private final String name;
    private final String surname;
    private final Dog dog;

    public ImmutablePerson(String name, String surname, Dog dog) {
        this.name = name;
        this.surname = surname;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutablePerson that = (ImmutablePerson) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(dog, that.dog);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, dog);
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dog=" + dog +
                '}';
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Fido", "Poodle");
        ImmutablePerson immutablePerson = new ImmutablePerson("John", "Smith", dog);

        System.out.println(immutablePerson);
        System.out.println(dog);

        dog.setName("jhk");

        System.out.println(immutablePerson);
        System.out.println(dog);
    }


}
