package bai2;

public class Main {
    public static void main(String[] args) throws Exception {
        MyStringBuilder msb = new MyStringBuilder("Tuong Nghi").addString(" -- 59131563 -- ").addFloat(9.9f).addbool(true);
        System.out.println(msb.toString());
    }
}
