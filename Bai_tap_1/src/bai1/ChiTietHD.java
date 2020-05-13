package bai1;

public class ChiTietHD {
    String sanPham;
    int soLuong;
    double donGia;
    float chietKhau;

    public ChiTietHD(String sanPham, int soLuong, double donGia, float chietKhau){
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString(){
        return "San pham: " + sanPham + " -- So luong: " + soLuong + 
            " -- Don gia: " + donGia + " -- Chiet khau: " + chietKhau + "\n";
    }
}