package bai1;

public class HoaDonHeader {
    String maHD, ngayBan, tenKhachHang;

    public HoaDonHeader(String maHD, String ngayBan, String tenKhachHang){
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }
    @Override
    public String toString(){
        return "----Hoa don----\nMa hoa don: " + maHD + " -- Ngay ban: " + ngayBan + " -- Ten khach hang: " + tenKhachHang + "\n";
    }
}