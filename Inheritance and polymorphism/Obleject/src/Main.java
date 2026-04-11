import java.util.Objects;

class Person {
    private String name;
    private int age;
    private String passportId;

    public Person(String name, int age, String passportId) {
        this.name = name;
        this.age = age;
        this.passportId = passportId;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPassportId() { return passportId; }

    @Override
    public boolean equals(Object obj) {
        // 1. Рефлексивность: проверка на равенство с самим собой
        if (this == obj) {
            return true;
        }

        // 2. Проверка на null
        if (obj == null) {
            return false;
        }

        // 3. Проверка на совместимость типов
        if (getClass() != obj.getClass()) {
            return false;
        }

        // 4. Приведение типа
        Person other = (Person) obj;

        // 5. Сравнение значимых полей
        return age == other.age &&
                Objects.equals(name, other.name) &&
                Objects.equals(passportId, other.passportId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passportId);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", passportId='" + passportId + "'}";
    }
}