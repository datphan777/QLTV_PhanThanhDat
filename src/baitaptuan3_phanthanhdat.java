import java.util.Scanner;
public class baitaptuan3_phanthanhdat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ===== BÀI 1: Nhập thông tin và hiển thị lại =====
        System.out.println("===== NHẬP THÔNG TIN SÁCH =====");
        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = sc.nextInt();
        System.out.print("Nhập đơn giá (VNĐ): ");
        double donGia = sc.nextDouble();
        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt();
        System.out.println("\n===== THÔNG TIN SÁCH VỪA NHẬP =====");
        System.out.println("Mã sách       : " + maSach);
        System.out.println("Tên sách      : " + tenSach);
        System.out.println("Tác giả       : " + tacGia);
        System.out.println("Năm xuất bản  : " + namXuatBan);
        System.out.printf("Đơn giá       : %,.0f VNĐ%n", donGia);
        System.out.println("Số lượng      : " + soLuong);

        // ===== BÀI 2: Thành tiền = đơn giá × số lượng =====
        double thanhTien = donGia * soLuong;

        // ===== BÀI 3: Phí vận chuyển = 5% giá trị sách =====
        double phiVanChuyen = thanhTien * 0.05;

        // ===== BÀI 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển =====
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n===== KẾT QUẢ TÍNH TOÁN =====");
        System.out.printf("Thành tiền       : %,.0f VNĐ%n", thanhTien);
        System.out.printf("Phí vận chuyển   : %,.0f VNĐ%n", phiVanChuyen);
        System.out.printf("Tổng tiền nhập   : %,.0f VNĐ%n", tongTienNhap);

        sc.close();
    }
}