class Outer {
    void outerMethod() {
        System.out.println("Inside outerMethod");
        
        // Method-local inner class
        class Inner {
            void innerMethod() {
                System.out.println("Inside innerMethod");
            }
        }
        
        Inner inner = new Inner();
        inner.innerMethod();
    }
}

class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }
}

/*Output
  Inside outerMethod
Inside innerMethod
  */
