package myfirstpackage;
public class MySecondClass {
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
public MySecondClass() {
this.anum = 0;
this.bnum = 0;
}
public MySecondClass(int anum, int bnum) {
this.anum = anum;
this.bnum = bnum;
}
public int maxNum() {
int max = (this.anum > this.bnum) ? this.anum : this.bnum;
return max;
}
}