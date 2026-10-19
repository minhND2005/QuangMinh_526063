public class ChuNhat extends Hinh {
    private final double chieuDai;
    private final double chieuRong;

    public ChuNhat(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            throw new IllegalArgumentException("Chieu dai va chieu rong phai lon hon 0.");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
}
