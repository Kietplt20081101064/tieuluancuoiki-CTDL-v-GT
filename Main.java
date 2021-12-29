package baiiiids;
import java.util.Scanner;
import java.util.ArrayList;
public class main 
{
    Scanner tt=new Scanner(System.in);
    ArrayList<MatHang> a=new ArrayList<MatHang>();
    void xuat() 
    { 
        for(int i=0; i<a.size(); i++) 
            System.out.println(a.get(i).toString()); 
    }
    void themHangHoa()
    {
        String ma="",ten="",loai="";
        int giaNhap=0,soLuong=0,ngayNhap=0;
        tt.nextLine();
        System.out.print("Nhap ma hang hoa : ");
        ma=tt.nextLine();
        int i;
        for (i=0;i<a.size();i++)
            if(a.get(i).ma.compareTo(ma)==0)
                break;
        if(i==a.size())
            System.out.println("Loi trung ma voi hang hoa khac !");
            else
            {
                System.out.print("Nhap loai hang hoa : ");
                loai=tt.nextLine();
                System.out.print("Nhap ten hang hoa : ");
                ten=tt.nextLine();
                System.out.print("Nhap gia nhap hang hoa : ");
                giaNhap=tt.nextInt();
                System.out.print("Nhap so luong hang hoa : ");
                soLuong=tt.nextInt();
                System.out.print("Nhap ngay nhap hang hoa : ");
                ngayNhap=tt.nextInt();
                a.add(new MatHang(loai,ma,ten,giaNhap,soLuong,ngayNhap));
                System.out.println("Them moi thanh cong");
            }
    }   
    void xoaHangHoa(String ma) 
    { 
        int i;
        for (i=0;i<a.size();i++)
            if(a.get(i).ma.compareTo(ma)==0)
                break;
        if(i==a.size())
           System.out.println("Ma hang hoa khong ton tai !");
           else
           {
               a.remove(i);
               System.out.println("Xoa thanh cong hang hoa co ma la "+ma);
           }
    } 

    MatHang minValue() 
    { 
        MatHang min = a.get(0); 
        for (int i=1;i<a.size();i++) 
            ;
            return min;
    } 
    void xoaHangHoa()
    {
        String ma;
        tt.nextLine();
        System.out.print("Nhap ma hang hoa can xoa: ");
        ma=tt.nextLine();
        xoaHangHoa(ma);
    }
    void update(String ma)
    { 
        int i;
        for (i=0;i<a.size();i++)
            if(a.get(i).ma.compareTo(ma)==0)
                break;
        if (i<a.size()) 
        {
            int choice;
            do
            {
                System.out.print("-------------Menu-Cap nhat-------------\n1. Cap nhat loai hang hoa\n2. Cap nhat ten hang hoa\n3. Cap nhat gia nhap\n4. Cap nhap ngay nhap hang hoa\n5. Quay ve Menu-1\nHay chon...");
                choice=tt.nextInt();
                tt.nextLine();
                switch (choice)
                {
                    case 1:
                    {
                        System.out.print("Nhap loai hang hoa : ");
                        a.get(i).loai=tt.nextLine();
                        System.out.println("Cap nhat loai hang hoa thanh cong ");
                        break;
                    }
                    case 2:
                    {
                        System.out.print("Nhap ten hang hoa moi : ");
                        a.get(i).ten=tt.nextLine();
                        System.out.println("Cap nhat ten hang hoa thanh cong ");
                        break;
                    }
                    case 3:
                    {
                        System.out.print("Nhap gia hang hoa moi : ");
                        a.get(i).giaNhap=tt.nextInt();
                        System.out.println("Cap nhat gia hang hoa thanh cong ");
                        break;
                    }
                    case 4:
                    {
                        System.out.print("Nhap ngay nhap hang hoa moi : ");
                        a.get(i).ngayNhap=tt.nextInt();
                        System.out.println("Cap nhat ngay nhap hang hoa thanh cong ");
                        break;
                    }
                }
            }while(choice!=5);
            System.out.println("Sua thong tin thanh cong ");
            return;
        }
        else
            System.out.println("Ma hang hoa khong ton tai !");
    }
    void xuatLoai(String x)  
    { 
        int i;
        for (i=0;i<a.size();i++)
            if(a.get(i).loai.compareTo(x)==0)
                System.out.println(a.get(i).toString());
    }
    int TongSoLuong()
    {
        int tong=0;
        int i;
        for (i=0;i<a.size();i++)
            tong+=a.get(i).soLuong;
        return tong;
    }
    int demLoaiHangHoa(String loai)
    {
        int dem=0;
        int i;
        for (i=0;i<a.size();i++)
            if(a.get(i).loai.compareTo(loai)==0)
                dem++;
        return dem;
    }
    int TongGiaTriHangHoa()
    {
        int tong=0;
        int i;
        for (i=0;i<a.size();i++)
            tong+=a.get(i).soLuong*a.get(i).giaNhap;
        return tong;
    }
    void xuly () 
    {  
        a.add(new MatHang("Banh","B01","Banh quy",10000,22,23));
        a.add(new MatHang("Banh","B02","Banh xop",2000,10,21));
        a.add(new MatHang("Banh","B03","Banh xoai",10000,11,22));
        a.add(new MatHang("Banh","B04","Banh socola",10000,20,12));
        a.add(new MatHang("Banh","B05","Banh kem",100000,10,11));
        a.add(new MatHang("Banh","B06","Banh pia",20000,20,23));
        a.add(new MatHang("Banh","B07","Banh mit",10000,20,21));
        a.add(new MatHang("Banh","B08","Banh sau rieng",10000,20,16));
        a.add(new MatHang("Banh","B09","Banh my",10000,23,2));
        a.add(new MatHang("Banh","B10","Banh que",10000,22,5));
        a.add(new MatHang("Keo","K01","Keo mit",5000,50,7));
        a.add(new MatHang("Keo","K02","Keo oi",5000,50,7));
        a.add(new MatHang("Keo","K03","Keo xoai",5000,50,7));
        a.add(new MatHang("Keo","K04","Keo sau rieng",5000,50,7));
        a.add(new MatHang("Keo","K05","Keo gung",5000,50,7));
        a.add(new MatHang("Keo","K06","Keo nho",5000,50,7));
        a.add(new MatHang("Keo","K07","Keo bac ha",5000,50,7));
        a.add(new MatHang("Keo","K08","Keo cao su",5000,50,7));
        a.add(new MatHang("Keo","K09","Keo tao",5000,50,7));
        a.add(new MatHang("Keo","K10","Keo ca phe",5000,50,7));
        int choice=0;
        do
        {
            System.out.print("\n------------MENU------------\n1. Them, xoa, sua hang hoa\n2. Tim kiem hang hoa\n3. Sap xep hang hoa\n4. Thong ke\n0. Thoat\nHay chon : ");
            choice=tt.nextInt();
            switch(choice)
            {
                case 1:
                {
                    int choice1;
                    do
                    {
                        System.out.print("\n------------MENU-1----------\n1. Them hang hoa\n2. Xoa hang hoa\n3. Sua hang hoa\n0. Quay ve menu chinh\nHay chon : ");
                        choice1=tt.nextInt();
                        switch(choice1)
                        {
                            case 1:
                            {
                                themHangHoa();
                                break;
                            }
                            case 2:
                            {
                                xoaHangHoa();
                                break;
                            }
                            case 3:
                            {
                                System.out.print("Nhap ma hang hoa can sua thong tin : ");
                                String ma;
                                tt.nextLine();
                                ma=tt.nextLine();
                                update(ma);
                                break;
                            }
                        }
                    }while(choice1!=0);
                    break;
                }
                case 2:
                {
                    int choice2;
                    do
                    {
                        System.out.print("\n------------MENU-2----------\n1. Tim kiem theo loai\n2. Tim kiem theo khoang  gia\n3. Tim kiem theo khoang ngay nhap\n0. Quay ve menu chinh\nHay chon : ");
                        choice2=tt.nextInt();
                        switch(choice2)
                        {
                            case 1:
                            {
                                System.out.print("Nhap loai hang hoa can tim : ");
                                String x=new String();
                                tt.nextLine();
                                x=tt.nextLine();
                                xuatLoai(x);
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Chuc nang chua hoan thien ! ");
                                break;
                            }
                            case 3:
                            {
                               System.out.println("Chuc nang chua hoan thien ! ");
                                break;
                            }
                        }
                    }while(choice2!=0);
                    break;
                }
                case 3:
                {
                    int choice3;
                    do
                    {
                        System.out.print("\n------------MENU-3----------\n1. Sap xep giam dan theo gia\n2. Sap xep tang dan theo gia\n3. Sap xep giam dan theo ngay nhap\n4. Sap xep tang dan theo ngay nhap\n0. Quay ve menu chinh\nHay chon : ");
                        choice3=tt.nextInt();
                        switch(choice3)
                        {
                            case 1:
                            {
                                for(int i=0;i<a.size()-1;i++)
                                    for(int j=i+1;j<a.size();j++)
                                        if(a.get(i).giaNhap<a.get(j).giaNhap)
                                        {
                                            MatHang tam1=a.get(i);
                                            a.set(i,a.get(j));
                                            a.set(j,tam1);
                                        }
                                for(int i=0;i<a.size();i++)
                                    System.out.println(a.get(i).toString());
                                break;
                            }
                            case 2:
                            {
                                for(int i=0;i<a.size()-1;i++)
                                    for(int j=i+1;j<a.size();j++)
                                        if(a.get(i).giaNhap>a.get(j).giaNhap)
                                        {
                                            MatHang tam1=a.get(i);
                                            a.set(i,a.get(j));
                                            a.set(j,tam1);
                                        }
                                for(int i=0;i<a.size();i++)
                                    System.out.println(a.get(i).toString());
                                break;
                            }
                            case 3:
                            {
                                for(int i=0;i<a.size()-1;i++)
                                    for(int j=i+1;j<a.size();j++)
                                        if(a.get(i).ngayNhap<a.get(j).ngayNhap)
                                        {
                                            MatHang tam1=a.get(i);
                                            a.set(i,a.get(j));
                                            a.set(j,tam1);
                                        }
                                for(int i=0;i<a.size();i++)
                                    System.out.println(a.get(i).toString());
                                break;
                            }
                            case 4:
                            {
                                for(int i=0;i<a.size()-1;i++)
                                    for(int j=i+1;j<a.size();j++)
                                        if(a.get(i).ngayNhap>a.get(j).ngayNhap)
                                        {
                                            MatHang tam1=a.get(i);
                                            a.set(i,a.get(j));
                                            a.set(j,tam1);
                                        }
                               for(int i=0;i<a.size();i++)
                                    System.out.println(a.get(i).toString());
                                break;
                            }
                        }
                    }while(choice3!=0);
                    break;
                }
                case 4:
                {
                    int choice4;    
                    do
                    {
                        System.out.print("\n------------MENU-4----------\n1. Thong ke tong so luong hang hoa\n2. Thong ke tong gia tri nhap kho\n3. Thong ke so luong tung loai hang\n0. Quay ve menu chinh\nHay chon : ");
                        choice4=tt.nextInt();
                        switch(choice4)
                        {
                            case 1:
                            {
                                System.out.println("Tong so luong hang hoa : "+TongSoLuong());
                                break;
                            }
                            case 2:
                            {
                                System.out.println("Tong gia tri nhap kho la "+TongGiaTriHangHoa()+"(vnd)");
                                break;
                            }
                            case 3:
                            {
                                System.out.println("Chuc nang chua hoan thien ! ");
                                break;
                            }
                        }
                    }while(choice4!=0);
                    break;
                }
            }
        }while(choice!=0);
    } 
    public static void main (String arg[]) 
    {  
        main a=new main();
        a.xuly();
    }    
}
