package Basics;

 class Student { // class
     String name; //instance variable
     int age; //instance variable

     Student(String name, int age) { // constructor
         this.name = name;
         this.age  = age;
         //Left side this.name → object ka variable
         //Right side name → constructor ka parameter

     }
     void display() {
         System.out.println(name + " " + age);
     }

     static void main(String[] args) {
         Student s1 = new Student("Amresh" , 24);
         s1.display();
     }

}
