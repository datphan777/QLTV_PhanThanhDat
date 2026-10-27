import java.util.Scanner;

public class baitaptuan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CHƯƠNG TRÌNH QUẢN LÝ THƯ VIỆN - TUẦN 4 =====");

        // Nhập thông tin sách từ bàn phím
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

        System.out.print("Nhập loại sách (1: SGK, 2: Tham khảo, 3: Chuyên ngành, 4: Khác): ");
        int loaiSach = sc.nextInt();

        // 1. Kiểm tra điều kiện hợp lệ (Bài 1)
        if (donGia > 0 && soLuong >= 0 && namXuatBan > 1900) {
            System.out.println("\n--- KẾT QUẢ XỬ LÝ ---");
            System.out.println("Tên sách: " + tenSach + " | Tác giả: " + tacGia);

            // 2. Phân loại giá (Bài 2)
            String phanLoaiGia;
            if (donGia < 50000) {
                phanLoaiGia = "Sách giá thấp";
            } else if (donGia <= 100000) {
                phanLoaiGia = "Sách giá trung bình";
            } else if (donGia <= 200000) {
                phanLoaiGia = "Sách giá cao";
            } else {
                phanLoaiGia = "Sách giá đặc biệt";
            }
            System.out.println("Phân loại giá: " + phanLoaiGia);

            // 3. Phân loại tồn kho (Bài 3)
            String tonKho;
            if (soLuong == 0) {
                tonKho = "Hết sách";
            } else if (soLuong <= 5) {
                tonKho = "Sắp hết";
            } else if (soLuong <= 20) {
                tonKho = "Còn ít";
            } else {
                tonKho = "Còn nhiều";
            }
            System.out.println("Tình trạng tồn kho: " + tonKho);

            // 4. Dùng switch chọn loại sách (Bài 4)
            String tenLoai;
            switch (loaiSach) {
                case 1:
                    tenLoai = "Sách giáo khoa";
                    break;
                case 2:
                    tenLoai = "Sách tham khảo";
                    break;
                case 3:
                    tenLoai = "Sách chuyên ngành";
                    break;
                case 4:
                    tenLoai = "Sách khác";
                    break;
                default:
                    tenLoai = "Không xác định";
                    break;
            }
            System.out.println("Loại sách: " + tenLoai);

        } else {
            System.out.println("\n[Lỗi] Dữ liệu không hợp lệ! (Đơn giá phải > 0, số lượng >= 0, năm xuất bản > 1900)");
        }
    }
}