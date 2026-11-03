import java.util.Scanner;

public class baitaptuan6 { //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 100;
        String[] maSachs = new String[max];
        String[] tenSachs = new String[max];
        String[] tacGias = new String[max];
        int[] namXuatBans = new int[max];
        double[] donGias = new double[max];
        int[] soLuongs = new int[max];
        int[] loaiSachs = new int[max];

        int soLuongSachHienTai = 0;
        int choice;

        do {
            System.out.println("\n===== CHƯƠNG TRÌNH QUẢN LÝ THƯ VIỆN - TUẦN 6 =====");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Tìm sách theo mã");
            System.out.println("4. Xóa sách theo mã");
            System.out.println("5. Sửa thông tin sách theo mã");
            System.out.println("6. Tính tổng số lượng sách");
            System.out.println("7. Tính tổng giá trị kho sách");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng (1-8): ");
            choice = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng thừa

            switch (choice) {
                case 1: // Thêm sách
                    if (soLuongSachHienTai >= max) {
                        System.out.println("\n[Lỗi] Kho sách đã đầy!");
                        break;
                    }
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
                    sc.nextLine();

                    // Kiểm tra điều kiện hợp lệ (Tuần 4)
                    if (donGia > 0 && soLuong >= 0 && namXuatBan > 1900) {
                        maSachs[soLuongSachHienTai] = maSach;
                        tenSachs[soLuongSachHienTai] = tenSach;
                        tacGias[soLuongSachHienTai] = tacGia;
                        namXuatBans[soLuongSachHienTai] = namXuatBan;
                        donGias[soLuongSachHienTai] = donGia;
                        soLuongs[soLuongSachHienTai] = soLuong;
                        loaiSachs[soLuongSachHienTai] = loaiSach;
                        soLuongSachHienTai++;
                        System.out.println("[Thông báo] Thêm sách thành công!");
                    } else {
                        System.out.println("[Lỗi] Dữ liệu không hợp lệ! (Đơn giá > 0, số lượng >= 0, năm > 1900)");
                    }
                    break;

                case 2: // Hiển thị sách
                    if (soLuongSachHienTai == 0) {
                        System.out.println("\n[Thông báo] Thư viện hiện chưa có cuốn sách nào!");
                    } else {
                        System.out.println("\n--- DANH SÁCH THƯ VIỆN ---");
                        for (int i = 0; i < soLuongSachHienTai; i++) {
                            System.out.println((i + 1) + ". Mã: " + maSachs[i]
                                    + " | Tên: " + tenSachs[i]
                                    + " | Tác giả: " + tacGias[i]
                                    + " | Năm XB: " + namXuatBans[i]
                                    + " | Đơn giá: " + donGias[i]
                                    + " | SL: " + soLuongs[i]);
                        }
                    }
                    break;

                case 3: // Tìm sách
                    if (soLuongSachHienTai == 0) {
                        System.out.println("\n[Thông báo] Thư viện chưa có dữ liệu!");
                    } else {
                        System.out.print("Nhập mã sách cần tìm: ");
                        String maTim = sc.nextLine();
                        boolean found = false;
                        for (int i = 0; i < soLuongSachHienTai; i++) {
                            if (maSachs[i].equalsIgnoreCase(maTim)) {
                                System.out.println("\n--- ĐÃ TÌM THẤY ---");
                                System.out.println("Mã sách: " + maSachs[i]);
                                System.out.println("Tên sách: " + tenSachs[i]);
                                System.out.println("Tác giả: " + tacGias[i]);
                                System.out.println("Năm XB: " + namXuatBans[i]);
                                System.out.println("Đơn giá: " + donGias[i]);
                                System.out.println("Số lượng: " + soLuongs[i]);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("[Thông báo] Không tìm thấy sách có mã: " + maTim);
                        }
                    }
                    break;

                case 4: // Xóa sách theo mã
                    if (soLuongSachHienTai == 0) {
                        System.out.println("\n[Thông báo] Thư viện chưa có dữ liệu để xóa!");
                    } else {
                        System.out.print("Nhập mã sách cần xóa: ");
                        String maXoa = sc.nextLine();
                        int indexXoa = -1;
                        for (int i = 0; i < soLuongSachHienTai; i++) {
                            if (maSachs[i].equalsIgnoreCase(maXoa)) {
                                indexXoa = i;
                                break;
                            }
                        }
                        if (indexXoa != -1) {
                            // Dịch chuyển các phần tử phía sau lên để lấp chỗ trống
                            for (int i = indexXoa; i < soLuongSachHienTai - 1; i++) {
                                maSachs[i] = maSachs[i + 1];
                                tenSachs[i] = tenSachs[i + 1];
                                tacGias[i] = tacGias[i + 1];
                                namXuatBans[i] = namXuatBans[i + 1];
                                donGias[i] = donGias[i + 1];
                                soLuongs[i] = soLuongs[i + 1];
                                loaiSachs[i] = loaiSachs[i + 1];
                            }
                            soLuongSachHienTai--;
                            System.out.println("[Thông báo] Xóa sách thành công!");
                        } else {
                            System.out.println("[Thông báo] Không tìm thấy mã sách cần xóa.");
                        }
                    }
                    break;

                case 5: // Sửa thông tin sách
                    if (soLuongSachHienTai == 0) {
                        System.out.println("\n[Thông báo] Thư viện chưa có dữ liệu để sửa!");
                    } else {
                        System.out.print("Nhập mã sách cần sửa: ");
                        String maSua = sc.nextLine();
                        boolean edited = false;
                        for (int i = 0; i < soLuongSachHienTai; i++) {
                            if (maSachs[i].equalsIgnoreCase(maSua)) {
                                System.out.println("Nhập thông tin mới cho sách:");
                                System.out.print("Tên sách mới: ");
                                tenSachs[i] = sc.nextLine();
                                System.out.print("Tác giả mới: ");
                                tacGias[i] = sc.nextLine();
                                System.out.print("Năm xuất bản mới: ");
                                namXuatBans[i] = sc.nextInt();
                                System.out.print("Đơn giá mới: ");
                                donGias[i] = sc.nextDouble();
                                System.out.print("Số lượng mới: ");
                                soLuongs[i] = sc.nextInt();
                                System.out.print("Loại sách mới: ");
                                loaiSachs[i] = sc.nextInt();
                                sc.nextLine();

                                System.out.println("[Thông báo] Cập nhật thông tin sách thành công!");
                                edited = true;
                                break;
                            }
                        }
                        if (!edited) {
                            System.out.println("[Thông báo] Không tìm thấy mã sách cần sửa.");
                        }
                    }
                    break;

                case 6: // Tính tổng số lượng sách
                    int tongSL = 0;
                    for (int i = 0; i < soLuongSachHienTai; i++) {
                        tongSL += soLuongs[i];
                    }
                    System.out.println("\nTổng số lượng sách trong kho: " + tongSL);
                    break;

                case 7: // Tính tổng giá trị kho sách (tích hợp Tuần 3: thành tiền + 5% phí vận chuyển)
                    double tongGiaTri = 0;
                    for (int i = 0; i < soLuongSachHienTai; i++) {
                        double thanhTien = donGias[i] * soLuongs[i];
                        double phiVanChuyen = thanhTien * 0.05;
                        tongGiaTri += (thanhTien + phiVanChuyen);
                    }
                    System.out.printf("\nTổng giá trị kho sách (đã gồm 5%% phí VC): %,.0f VNĐ%n", tongGiaTri);
                    break;

                case 8: // Thoát
                    System.out.println("\nCảm ơn bạn đã sử dụng chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("\n[Lỗi] Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 8.");
                    break;
            }
        } while (choice != 8);
    }
}