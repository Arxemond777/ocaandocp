public class ImplTwoInterfacesWithSimilarDEFAULTNames {
    public static void main(String[] args) {

    }
}

interface A {
    default void show() {
        System.out.println(1);
    }
}

interface B {
    default void show() {
        System.out.println(2);
    }
}

class C implements A, B {
//    @Override // compile error without overriding
//    public void show() {
//        System.out.println(3);
//    }
}