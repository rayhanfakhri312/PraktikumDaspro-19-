import java.util.Scanner;
public class StudiKasus219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String namaMahasiswa, jenisKegiatan, status;
    int jumlahDokumen, juara, statusPendannaanPKM;

    System.out.print("Nama Mahasiswa : ");
    namaMahasiswa = sc.next();
    System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA : ");
    jenisKegiatan = sc.next();
    System.out.print("Jumlah Dokumen : ");
    jumlahDokumen = sc.nextInt();

    if (jenisKegiatan.equalsIgnoreCase("belmawa") || jenisKegiatan.equalsIgnoreCase("bakorma") || jenisKegiatan.equalsIgnoreCase("mandiri")){
        System.out.print("Peringkat Juara : ");
        juara = sc.nextInt();
        if (juara >=1 && juara <3){
            if(jumlahDokumen == 4){
                status = "pendannan diberikan,karena dokumen lengkap";
            }else{
                status = "pendanaan tidak diberikan, karena dokumen kurang : " +(4-jumlahDokumen);
            }
        }else{
            status = "pendanaan tidak diberikan karena tidak mendapatkan juara di kegiatan tersebut";
        }
    }else if(jenisKegiatan.equalsIgnoreCase("pkm")){
        System.out.print("Status Pendanaan PKM (1=LOLOS,2=TIDAK LOLOS) : ");
        statusPendannaanPKM = sc.nextInt();
        if(statusPendannaanPKM == 1){
           if(jumlahDokumen == 4){
            status = "Pendanaan diberikan, karena dokumen lengkap";
           }else{
            status = "Pendanaan tidak diberikan karena dokumen kurang : " +(4-jumlahDokumen);
           }
        }else{
            status = "Pendanaan tidak diberikan, karena belum lolos pendanaan PKM";
        }
    }else{
        status = "Tidak termasuk kegiatan yang mendapatkan pendanaan";
    }

    System.out.println("Nama Mahasiswa : "+ namaMahasiswa);
    System.out.println("status         : "+ status);

    sc.close();
    }
}
