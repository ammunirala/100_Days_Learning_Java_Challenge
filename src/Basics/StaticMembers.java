package Basics;
class A {
   private int x; //instance member
    private static int y; // static member
    void fun1() {
        y = 22;
        x = 5;
    }
    void fun2() {
        System.out.println(x);
    }
    void fun3(){
         y = 45;
    }
}

  class StaticMembers {
     public static void main(String[] args) {
         A a1 = new A ();
         A a2 = new A ();
         a2.fun1();
         a2.fun2();
         a2.fun3();



     }
}
