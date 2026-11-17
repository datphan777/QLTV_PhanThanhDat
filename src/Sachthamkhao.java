public class Sachthamkhao extends Sach {
    public double thue;
    // Constructor
    public Sachthamkhao(double thue, String maSach, int soLuong, double donGia) {
        super(maSach, soLuong, donGia);
        this.thue = thue;
    }
    public double tinhThanhTien() {
        return soLuong * donGia + thue;
    }
    public void Inthongtinsach() {
        super.Inthongtinsach();
        System.out.println("Thue: " + thue);
        System.out.println("Thanh tien: " + tinhThanhTien());
    }
}