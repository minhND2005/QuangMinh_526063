public class HinhTron extends Hinh {
    private final double banKinh;

    public HinhTron(double banKinh) {
        if (banKinh <= 0) {
            throw new IllegalArgumentException("Ban kinh phai lon hon 0.");
        }
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
