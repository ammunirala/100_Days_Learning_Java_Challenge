package oops;
class Constructor {
    int id;
    String name;

    Constructor(){
        id = 101;
        name = "Amresh";

    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
        System.out.println(c.id);
        System.out.println(c.name);

    }
}