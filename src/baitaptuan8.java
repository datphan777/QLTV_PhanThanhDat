import java.util.ArrayList;

public class baitaptuan8 {
    public static void main(String[] args) {
        // Tạo danh sách sách bằng ArrayList
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        // Sử dụng Constructor đầy đủ tham số (Yêu cầu 4)
        Sach toan = new Sach("M001", "Giai tich dai cuong", "Nguyen Van A", 2023, 5);
        Sach ly = new Sach("M002", "Vat ly dai cuong", "Tran Van B", 2022, 3);
        Sach hoa = new Sach("M003", "Hoa dai cuong", "Le Thi C", 2024, 4);

        danhSachSach.add(toan);
        danhSachSach.add(ly);
        danhSachSach.add(hoa);

        // Duyệt và in thông tin toàn bộ danh sách sách trong thư viện
        System.out.println("=== DANH SACH CAC SACH TRONG THU VIEN ===");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
        }
    }
}