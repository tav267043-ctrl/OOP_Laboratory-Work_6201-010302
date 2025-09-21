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
class MySecondClass {
private int anum;
private int bnum;
public int getAnum() {
return anum;
}
public int getBnum() {
return bnum;
}
public void setAnum(int anum) {
this.anum = anum;
}
public void setBnum(int bnum) {
this.bnum = bnum;
}
MySecondClass() {
this.anum = 0;
this.bnum = 0;
}

MySecondClass(int anum, int bnum) {
this.anum = anum;
this.bnum = bnum;
}
public int maxNum() {
int max = (this.anum > this.bnum) ? this.anum : this.bnum;
return max;
}
}