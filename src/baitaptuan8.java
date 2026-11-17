import java.util.ArrayList;

public class baitaptuan8 {
    public static void main(String[] args) {
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        // Truyền đúng thứ tự: maSach (String), ngayNhap (String), donGia (double), soLuong (int), nhaXuatBan (String)
        Sach toan = new Sach("M001", "01/01/2023", 50000.0, 5, "NXB Gia Duc");
        Sach ly = new Sach("M002", "02/01/2022", 40000.0, 3, "NXB Gia Duc");
        Sach hoa = new Sach("M003", "03/01/2024", 45000.0, 4, "NXB KHKT");

        danhSachSach.add(toan);
        danhSachSach.add(ly);
        danhSachSach.add(hoa);

        System.out.println("=== DANH SACH CAC SACH TRONG THU VIEN ===");
        for (Sach s : danhSachSach) {
            s.Inthongtinsach();
            System.out.println("-----------------------------");
        }
    }
}