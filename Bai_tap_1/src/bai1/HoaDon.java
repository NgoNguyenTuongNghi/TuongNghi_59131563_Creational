package bai1;

import java.util.ArrayList;

public class HoaDon {
    HoaDonHeader header;
    ArrayList<ChiTietHD> list;

    protected HoaDon(Creater creater) {
        this.header = creater.header;
        this.list = creater.list;
    }

    @Override
    public String toString(){
        String string = header.toString();
        for(ChiTietHD cthd : list) {
            string += cthd.toString();
        }
        return string;
    }
    public static class Creater {
        HoaDonHeader header;
        ArrayList<ChiTietHD> list;
        public Creater() {
            this.list = new ArrayList<>();
        }
        public Creater setHeader(HoaDonHeader header) {
            this.header = header;
            return this;
        }
        public Creater addListHD(ChiTietHD ct) {
            this.list.add(ct);
            return this;
        }
        public HoaDon build() {
            return new HoaDon(this);
        }
    }
}