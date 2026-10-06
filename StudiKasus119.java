import java.util.Scanner;
public class StudiKasus119 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hargaPerCup = 18000;
    int jumlahCup,uangBayar;
    int totalHarga,diskon,totalBayar;
    int kembalian,kurang;
    
    System.out.print("masukkan bearapa yang yang akan dibeli : ");
    jumlahCup = sc.nextInt();
    System.out.print("masukkan uang yang dibayar : ");
    uangBayar = sc.nextInt();

    totalHarga = jumlahCup*hargaPerCup;
    diskon = 0;

    if(totalHarga >= 100000){
        diskon = totalHarga*10/100;
    }else {
        totalBayar = totalHarga - diskon;
    }

    totalBayar = totalHarga - diskon; 
    
    System.out.println("total harga : " +totalHarga);
    System.out.println("diskon : " + diskon);
    System.out.println("total bayar : "+totalBayar);
     if (uangBayar>=totalBayar){
        kembalian= uangBayar-  totalBayar;
        System.out.println("kembalian : " + kembalian);
     }else{
        kurang = totalBayar-uangBayar;
        System.out.println("uang tidak cukup,kurang : "+ kurang);
     }
     sc.close();
}
}
