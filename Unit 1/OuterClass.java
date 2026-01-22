public class OuterClass {

    class InnerClass {
        void display() {
            System.out.println("Hello from Inner Class!");
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}

/*Output
  Hello from Inner Class!
*/
