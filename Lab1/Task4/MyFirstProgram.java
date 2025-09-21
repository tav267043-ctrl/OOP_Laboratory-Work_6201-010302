import myfirstpackage.MySecondClass;
class MyFirstClass {
public static void main(String[] s) {
MySecondClass o = new MySecondClass(0,0);
o.setAnum(5);
o.setBnum(6);
System.out.println(o.maxNum());
for (int i = 1; i <= 8; i++) {
for (int j = 1; j <= 8; j++) {
o.setAnum(i);
o.setBnum(j);
System.out.print(o.maxNum());
System.out.print(" ");
}
System.out.println();
}
}
}