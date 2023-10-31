public class Parent {
    int x;

    Parent(int x) {
        this.x = x;
        System.out.printf("This is the constructor of the \"Parent\" class (x: %d)\n", this.x);
    }

    public void myMethod() {
        x++;
    }
}
