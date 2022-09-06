public class person {
    double height;
    String name;
    int age;

    person(double h, String n, int a){
        height = h;
        name = n;
        age = a;
    }

    void greet(){
        System.out.println("Hello! My name is " + name + ".");
    }

    void tall(){
        System.out.println("I am " + height + " feet tall");
    }
}