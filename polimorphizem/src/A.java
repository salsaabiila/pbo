// public class A {
// void foo(){
// System.out.println("foo A");
// }
// class B extends A {
// void foo(){
// System.out.println("foo B");
// }
// void bar(){
// System.out.println("bar B");
// }
// }
// }

// A a = new A();
// B b = new B();

// a.foo(); //ndk bisa manggil a bar karena bukan turunannya //foo A

// a = b; //upcasting

// a.foo(); //foo B

// A a = new B(); //upcasting
// B b = (B) a;//downcasting
// b.bar();
// //proses downcasting dri variabel a ke variabel b bertipe kelas B memberikan
// //akses untuk memanggil method bar.
