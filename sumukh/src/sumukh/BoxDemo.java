package sumukh;


class Box2c {
double width;
double height;
double depth;
}
// This class declares an object of type Box.
class boxdemo {
public static void main(String args[]) {
Box2c mybox = new Box2c();
double vol;
// assign values to mybox's instance variables
mybox.width = 10;
mybox.height = 20;
mybox.depth = 15;
// compute volume of box
vol = mybox.width * mybox.height * mybox.depth;
System.out.println("Volume is " + vol);
}
}
