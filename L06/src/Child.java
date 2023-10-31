public class Child extends Parent{

    int y;
    Child(int x, int y) {
        super(x);
        this.y = y;
        System.out.printf("This is the constructor of the \"Child\" class (x: %d)\n", this.x);
    }

    @Override
    public void myMethod() {
        super.myMethod();
        y++;
    }

}
