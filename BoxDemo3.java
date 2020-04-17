class Box1 {
double width;
double height;
double depth;
void volume() {
System.out.println("Volume is "+(width * height * depth));
}
}
class BoxDemo3 {
public static void main(String args[]) {
Box1 a = new Box1();
a.width = 10;
a.height = 20;
a.depth = 15;
a.volume();
}
}









