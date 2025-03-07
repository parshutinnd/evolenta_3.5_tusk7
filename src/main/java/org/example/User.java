package org.example;

public class User {
    private String Name;
    private int Age;

    public User(String name,int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        this.Age = age;
    }

    @Override
    public String toString() {
        return Name + ", возраст " + Age + " лет";
    }
}
