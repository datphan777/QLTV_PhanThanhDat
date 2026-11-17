import java.util.ArrayList;

public class baitaptuan9 {
    public static void main(String[] args) {
        ArrayList<Sachgiaokhoa> dsSGK = new ArrayList<>();
        ArrayList<Sachthamkhao> dsSTK = new ArrayList<>();

        // Khởi tạo theo Constructor mới: (tinhTrang/thue, maSach, soLuong, donGia)
        Sachgiaokhoa sgk1 = new Sachgiaokhoa("moi", "GK01", 10, 50000.0);
        Sachgiaokhoa sgk2 = new Sachgiaokhoa("cu", "GK02", 5, 40000.0);
        dsSGK.add(sgk1);
        dsSGK.add(sgk2);

        Sachthamkhao stk1 = new Sachthamkhao(5000.0, "TK01", 4, 80000.0);
        Sachthamkhao stk2 = new Sachthamkhao(10000.0, "TK02", 2, 120000.0);
        dsSTK.add(stk1);
        dsSTK.add(stk2);
        System.out.println("=== DANH SACH SACH GIAO KHOA ===");
        for (Sachgiaokhoa sgk : dsSGK) {
            sgk.Inthongtinsach();
            System.out.println("-----------------------------");
        }
        System.out.println("\n=== DANH SACH SACH THAM KHAO ===");
        for (Sachthamkhao stk : dsSTK) {
            stk.Inthongtinsach();
            System.out.println("-----------------------------");
        }
        // Tính tổng thành tiền từng loại
        double tongTienSGK = 0;
        for (Sachgiaokhoa sgk : dsSGK) {
            tongTienSGK += sgk.tinhThanhTien();
        }
        double tongTienSTK = 0;
        for (Sachthamkhao stk : dsSTK) {
            tongTienSTK += stk.tinhThanhTien();
        }
        System.out.println("\n===========================================");
        System.out.println("Tong thanh tien Sach Giao Khoa: " + tongTienSGK);
        System.out.println("Tong thanh tien Sach Tham Khao: " + tongTienSTK);
    }
}