package Module2;

//Using super to overcome name hiding.
class A1 {
int i;
}

//Create a subclass by extending class A.
class B1 extends A1 {
int i; // this i hides the i in A
B1(int a1, int b1) {
super.i = a1; // i in A
i = b1; // i in B
}
void show() {
System.out.println("i in superclass: " + super.i);
System.out.println("i in subclass: " + i);
}
}
class UseSuper {
public static void main(String args[]) {
B1 subOb = new B1(1, 2);
subOb.show();
}
}
