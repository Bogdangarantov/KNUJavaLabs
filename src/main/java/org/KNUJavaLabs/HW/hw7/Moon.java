package org.KNUJavaLabs.HW.hw7;

public class Moon {
    String name;
    Moon(){
        this.name = "Moon";
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Moon{" +
                "name='" + name + '\'' +
                '}';
    }
}
