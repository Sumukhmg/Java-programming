package Module2;

//Demonstrate when constructors are called.
//Create a super class.
class A2 {
A2() {
System.out.println("Inside A's constructor.");
}
}
//Create a subclass by extending class A.
class B2 extends A2 {
B2() {
System.out.println("Inside B's constructor.");
}
}
//Create another subclass by extending B.
class C extends B2 {
C() {
System.out.println("Inside C's constructor.");
}
}
class CallingCons {
public static void main(String args[]) {
	C c=new C();
}
}
