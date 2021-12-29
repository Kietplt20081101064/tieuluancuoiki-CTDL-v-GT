package baiiiids;
public class MatHang {

    public
        String loai;
        String ma;
        String ten;
        int giaNhap;
        int soLuong;
        int ngayNhap;
    public MatHang(String loai, String ma, String ten, int giaNhap,int soLuong,int ngayNhap)
    {
        this.loai = loai;
        this.ma = ma;
        this.ten = ten;
        this.giaNhap = giaNhap;
        this.soLuong=soLuong;
        this.ngayNhap=ngayNhap;
    }
    public String toString()
    {
        return "Loai  "+loai+" -  Ma "+ma+" - Ten "+ten+" - Gia nhap "+giaNhap+" - SoLuong  "+soLuong+" - Ngay nhap "+ngayNhap;
    }
}
