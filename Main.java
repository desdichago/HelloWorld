public class Main {

    static class A {
        String str = "abc";

        public A() {
            print();
        }

        void print() {
            System.out.println(str.length());
        }
    }

    static class B extends A {
        String str = "ab";

        public B() {
            System.out.println(str.length());
            print();
        }

        @Override
        void print() {
            System.out.println(str.length());
        }
    }

    public static void main(String[] args) {
        new B();
    }
}
