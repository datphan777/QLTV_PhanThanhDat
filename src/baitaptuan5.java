import java.util.Scanner;
public class baitaptuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== CHƯƠNG TRÌNH QUẢN LÝ THƯ VIỆN - TUẦN 5 =====");
            System.out.println("1. Nhập và xử lý thông tin n cuốn sách (Bài 1 + Bài 2)");
            System.out.println("2. Thoát chương trình (Bài 3)");
            System.out.print("Chọn chức năng (1 hoặc 2): ");
            choice = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng thừa
            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sách (n): ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    int tongSoLuongKho = 0;
                    double tongGiaTriKho = 0;

                    // Bài 1: Dùng vòng lặp for để nhập n sách
                    for (int i = 1; i <= n; i++) {
                        System.out.println("\n--- Nhập thông tin cuốn sách thứ " + i + " ---");

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
                        sc.nextLine(); // Đọc dòng thừa

                        // Kiểm tra điều kiện hợp lệ
                        if (donGia > 0 && soLuong >= 0 && namXuatBan > 1900) {
                            System.out.println("[Thông báo] Dữ liệu sách hợp lệ!");

                            // Bài 2: Tính tổng số lượng và tổng giá trị sách
                            double thanhTien = donGia * soLuong;
                            tongSoLuongKho += soLuong;
                            tongGiaTriKho += thanhTien;

                            System.out.println("-> Thành tiền của cuốn sách này: " + thanhTien + " VNĐ");
                        } else {
                            System.out.println("[Lỗi] Dữ liệu không hợp lệ! (Đơn giá > 0, số lượng >= 0, năm > 1900)");
                        }
                    }

                    // Hiển thị tổng kết sau khi nhập xong n cuốn
                    System.out.println("\n--- TỔNG KẾT KHO SÁCH VỪA NHẬP ---");
                    System.out.println("Tổng số lượng sách: " + tongSoLuongKho);
                    System.out.println("Tổng giá trị kho sách: " + tongGiaTriKho + " VNĐ");
                    break;

                case 2:
                    System.out.println("\nCảm ơn bạn đã sử dụng chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("\n[Lỗi] Lựa chọn không hợp lệ! Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 2); // Bài 3: Menu lặp đến khi chọn thoát
    }
}