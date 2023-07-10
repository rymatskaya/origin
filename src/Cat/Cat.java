package Cat;

public class Cat {
    private String name;
    private int age;

    public Cat() {
        this.name = "Морфий";
        this.age = 3;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + name + '\'' +
                ", age=" + age +
                "}";
    }

    @Override
    public boolean equals(Object object) {
        Cat anotherCat = (Cat) object;
        if (this.name.compareTo(anotherCat.name) != 0 ||
                (this.age != anotherCat.age)) {
            return false;
        }
        return true;
    }
}
