package dev.lpa;

public class Parent {
    {
        System.out.println("Parent static initializer: class being constructed");
    }
    private final String name;
    private final String dob;
    protected final int siblings;

    {
//        name = "John Doe";
//        dob = "01/01//1900";
        System.out.println("in Parent Inititalizer");
    }

//    public Parent(){
//        System.out.println("in Parent's No Arg Constructor");
//    }

    public Parent(String name, String dob, int siblings) {
        this.name = name;
        this.dob = dob;
        this.siblings = siblings;
        System.out.println("in Parent Constructor");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", dob='" + dob + '\'';
    }

    public String getDob() {
        return dob;
    }
}
