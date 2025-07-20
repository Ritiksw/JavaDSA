package com.ritik.testing;

public class MainClass {
    public static void main(String[] args) {
        B obj = new A(); // This is like Queue<Integer> q = new LinkedList<>();

        obj.instanceMethodB();  // Works, defined in B
        // obj.instanceMethodA(); // ❌ Compile-time error: not accessible via B reference

        // Static method calls (not polymorphic)
        B.methodB(); // Calls methodB in B
        A.methodA(); // Calls methodA in A
    }
}
