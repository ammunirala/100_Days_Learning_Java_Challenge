package onedimensionalarrays;

public class ForEachLoop {
    public static void main(String[] args) {
        String names[] = {"Ram","Shyam","Mohan","Karan", "Vir"};
        for(int i = 0; i <names.length; i++){
            System.out.println("Name is " +names[i]);
        }
        for(String name: names){
            System.out.println("for each " +name);
        }


    }
}
