public class Programmer {
    String name;
    String surName;
    int age;

    public Programmer(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public void getAge() {
        System.out.println(2023 - age);
    }
}
