package com.example.lab4;

public class customerModel {
    public customerModel(int ID, String s, int i, boolean checked) {

        this.ID = ID;
        this.name = s;
        this.age = i;
        this.isActive = checked;
    }
    @Override
    public String toString() {
        return "customerModel{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                '}';
    }
    private int ID;
    private String name;
    private int age;
    private boolean isActive;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
}
