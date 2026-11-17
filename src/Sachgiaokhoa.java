public class Sachgiaokhoa extends Sach {
    public String tinhTrang; // "moi" hoac "cu"

    // Constructor tự động / khởi tạo nhanh theo mẫu
    public Sachgiaokhoa(String tinhTrang, String maSach, int soLuong, double donGia) {
        super(maSach, soLuong, donGia);
        this.tinhTrang = tinhTrang;
    }
    public double tinhThanhTien() {
        if (tinhTrang != null && tinhTrang.equalsIgnoreCase("moi")) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * 0.5;
        }
    }
    public void Inthongtinsach() {
        super.Inthongtinsach();
        System.out.println("Tinh trang: " + tinhTrang);
        System.out.println("Thanh tien: " + tinhThanhTien());
    }
}