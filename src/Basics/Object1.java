package Basics;
class Mahesh{
    int x; //instance(object) member variable
    int y; //instance(object) member variable
    void fun1(){ // instance(object) member function
        System.out.println("fun1");

    }

    void fun2(){
        System.out.println("fun2");


    }

}
class Object1 { // creating object
   public  static void main(String[] args) {
       Mahesh m1 = new Mahesh(); // creating new object
       Mahesh m2 = new Mahesh(); // creating new object
       m1.x = 10;
       System.out.println(m1.y);
       System.out.println(m1.x);
       m2.x = 15;
       m2.y = 20;
       System.out.println(m2.x);
       System.out.println(m2.y);

       m1.fun1();   // fun1 call
       m1.fun2();   // fun2 call

    }
}
