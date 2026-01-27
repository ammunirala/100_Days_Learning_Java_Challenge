package oops;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }

}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
//    Student() { // non parameter constructor
//        System.out.println("constructor called");
//    }
//    Student( String name, int age){ // constructor parameter
//        this.name = name;
//        this.age = age;
    Student(Student s2){ // copy constructor
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){

    }

    }


public class OOPS {
    public static void main(String[] args) {
//        Pen pen1 = new Pen();
//        pen1.color = "blue";
//        pen1.type = "gel";
//
//        Pen pen2 = new Pen();
//        pen2.color ="black";
//        pen2.type = "ballpoint";
//
//        pen1.printColor();
//        pen2.printColor();
//
//        pen1.write();

        Student s1 = new Student();
        s1.name = "Amresh";
        s1.age = 24;
        Student s2 = new Student(s1);
        s2.printInfo();
        s1.printInfo();
    }

}
