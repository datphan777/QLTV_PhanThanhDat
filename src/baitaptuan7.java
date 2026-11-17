import java.util.ArrayList;

public class baitaptuan7 {
    public static void main(String[] args) {
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        Sach toan = new Sach();
        toan.maSach = "M001";
        toan.donGia = 50000.0;
        toan.soLuong = 5;
        danhSachSach.add(toan);

        Sach ly = new Sach();
        ly.maSach = "M002";
        ly.donGia = 40000.0;
        ly.soLuong = 3;
        danhSachSach.add(ly);

        Sach hoa = new Sach();
        hoa.maSach = "M003";
        hoa.donGia = 45000.0;
        hoa.soLuong = 4;
        danhSachSach.add(hoa);

        System.out.println("DANH SACH CAC SACH TRONG THU VIEN");
        for (Sach s : danhSachSach) {
            s.Inthongtinsach();
            System.out.println("-----------------------------");
        }
    }
}