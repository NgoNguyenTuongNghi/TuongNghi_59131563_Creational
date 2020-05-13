package bai1;

public class Main {
    public static void main(String[] args) throws Exception {
        HoaDon HD1 = new HoaDon.Creater().setHeader(new HoaDonHeader("01", "13/05/2020", "Ngo Nguyen Tuong Nghi"))
        .addListHD(new ChiTietHD("Ca phe", 100, 200000, 0.05f))
        .addListHD(new ChiTietHD("Thuoc la", 20, 100000, 0.01f))
        .build();
        HoaDon HD2 = new HoaDon.Creater().setHeader(new HoaDonHeader("02", "13/05/2020", "Nguyen Thi Lan Anh"))
        .addListHD(new ChiTietHD("Tra xanh", 10, 150000, 0.1f))
        .addListHD(new ChiTietHD("Tra sua", 10, 150000, 0.1f))
        .build();
        System.out.println(HD1.toString());
        System.out.println(HD2.toString());
    }
}