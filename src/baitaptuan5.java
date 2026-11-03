import java.util.Scanner;

public class baitaptuan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== CHƯƠNG TRÌNH QUẢN LÝ THƯ VIỆN - TỔNG HỢP (TUẦN 3, 4, 5) =====");
            System.out.println("1. Nhập và xử lý thông tin n cuốn sách");
            System.out.println("2. Thoát chương trình");
            System.out.print("Chọn chức năng (1 hoặc 2): ");
            choice = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng thừa

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sách (n): ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    int tongSoLuongKho = 0;
                    double tongThanhTienKho = 0;
                    double tongPhiVanChuyenKho = 0;
                    double tongTienNhapKho = 0;

                    // Dùng vòng lặp for để nhập và xử lý n cuốn sách (Tuần 5)
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

                        // 1. Kiểm tra điều kiện hợp lệ (Tuần 4)
                        if (donGia > 0 && soLuong >= 0 && namXuatBan > 1900) {
                            System.out.println("\n--- KẾT QUẢ XỬ LÝ CUỐN SÁCH NÀY ---");
                            System.out.println("Tên sách: " + tenSach + " | Tác giả: " + tacGia);

                            // 2. Phân loại giá (Tuần 4)
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

                            // 3. Phân loại tồn kho (Tuần 4)
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

                            // 4. Chọn loại sách bằng switch (Tuần 4)
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

                            // 5. Tính toán tài chính (Tuần 3 đưa vào trong vòng lặp)
                            double thanhTien = donGia * soLuong;
                            double phiVanChuyen = thanhTien * 0.05;
                            double tongTienNhap = thanhTien + phiVanChuyen;

                            System.out.printf("Thành tiền       : %,.0f VNĐ%n", thanhTien);
                            System.out.printf("Phí vận chuyển   : %,.0f VNĐ%n", phiVanChuyen);
                            System.out.printf("Tổng tiền nhập   : %,.0f VNĐ%n", tongTienNhap);

                            // Cộng dồn các chỉ số cho toàn kho
                            tongSoLuongKho += soLuong;
                            tongThanhTienKho += thanhTien;
                            tongPhiVanChuyenKho += phiVanChuyen;
                            tongTienNhapKho += tongTienNhap;

                        } else {
                            System.out.println("\n[Lỗi] Dữ liệu không hợp lệ! (Đơn giá > 0, số lượng >= 0, năm xuất bản > 1900)");
                        }
                    }

                    // Tổng kết toàn bộ sau khi nhập xong n cuốn
                    System.out.println("\n========================================");
                    System.out.println("        TỔNG KẾT TOÀN BỘ KHO SÁCH       ");
                    System.out.println("========================================");
                    System.out.println("Tổng số lượng sách       : " + tongSoLuongKho);
                    System.out.printf("Tổng thành tiền          : %,.0f VNĐ%n", tongThanhTienKho);
                    System.out.printf("Tổng phí vận chuyển      : %,.0f VNĐ%n", tongPhiVanChuyenKho);
                    System.out.printf("Tổng tiền nhập kho       : %,.0f VNĐ%n", tongTienNhapKho);
                    break;

                case 2:
                    System.out.println("\nCảm ơn bạn đã sử dụng chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("\n[Lỗi] Lựa chọn không hợp lệ! Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 2);
    }
}