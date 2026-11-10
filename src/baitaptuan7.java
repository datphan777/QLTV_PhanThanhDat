import java.util.ArrayList;
public class baitaptuan7 {
    public static void main(String[] args) {
        // Tạo danh sách sách bằng ArrayList
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        // 1. Sách Toán
        Sach toan = new Sach();
        toan.maSach = "M001";
        toan.tieuDe = "Giai tich dai cuong";
        toan.tacGia = "Nguyen Van A";
        toan.namXuatBan = 2023;
        toan.soLuong = 5;
        danhSachSach.add(toan);

        // 2. Sách Lý
        Sach ly = new Sach();
        ly.maSach = "M002";
        ly.tieuDe = "Vat ly dai cuong";
        ly.tacGia = "Tran Van B";
        ly.namXuatBan = 2022;
        ly.soLuong = 3;
        danhSachSach.add(ly);

        // 3. Sách Hóa
        Sach hoa = new Sach();
        hoa.maSach = "M003";
        hoa.tieuDe = "Hoa dai cuong";
        hoa.tacGia = "Le Thi C";
        hoa.namXuatBan = 2024;
        hoa.soLuong = 4;
        danhSachSach.add(hoa);

        // Duyệt và in thông tin toàn bộ danh sách sách trong thư viện
        System.out.println("DANH SACH CAC SACH TRONG THU VIEN");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }
    }
}