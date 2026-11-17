public class Sach {
    public String maSach;
    public String ngayNhap;
    public double donGia;
    public int soLuong;
    public String nhaXuatBan;

    // Constructor 1: Không tham số
    public Sach() {
    }
    // Constructor 2: 3 tham số
    public Sach(String maSach, int soLuong, double donGia) {
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    // Constructor 3: Đầy đủ 5 tham số (dùng cho bài Tuần 8)
    public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }
    public void Inthongtinsach() {
        System.out.println("Ma sach: " + maSach);
        if (ngayNhap != null) System.out.println("Ngay nhap: " + ngayNhap);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        if (nhaXuatBan != null) System.out.println("Nha xuat ban: " + nhaXuatBan);
    }
}