import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        int burc;
        System.out.println("1:22 Aralık-21 Ocak\n2:22 Ocak-19 Şubat\n3:20 Şubat-20 Mart");
        System.out.println("4:21 Mart-20 Nisan\n5:21 Nisan-21 Mayıs\n6:22 Mayıs-22 Haziran");
        System.out.println("7:23 Haziran-22 Temmuz\n8:23 Temmuz-22 Ağustos\n9:23 Ağustos-22 Eylül");
        System.out.println("10:23 Eylül-22 Ekim\n11:23 Ekim-21 Kasım\n12:22 Kasım-21 Aralık");
        System.out.println("Doğum Tarihinizin Olduğu Aralığı Seçiniz:");
        burc = input.nextInt();

        switch (burc){
            case 1:
                System.out.println("Oğlak Burcusunuz.");
                break;
            case 2:
                System.out.println("Kova Burcusunuz.");
                break;
            case 3:
                System.out.println("Balık Burcusunuz.");
                break;
            case 4:
                System.out.println("Koç Burcusunuz.");
                break;
            case 5:
                System.out.println("Boğa Burcusunuz.");
                break;
            case 6:
                System.out.println("İkizler Burcusunuz.");
                break;
            case 7:
                System.out.println("Yengeç Burcusunuz.");
                break;
            case 8:
                System.out.println("Aslan Burcusunuz.");
                break;
            case 9:
                System.out.println("Başak Burcusunuz.");
                break;
            case 10:
                System.out.println("Terazi Burcusunuz.");
                break;
            case 11:
                System.out.println("Akrep Burcusunuz.");
                break;
            case 12:
                System.out.println("Yay Burcusunuz.");
                break;
            default:
                System.out.println("Yanlış Değer Girdiniz.");
                break;
        }
         */
        //-------IF-ELSE İLE----------
        int burc;
        System.out.println("1:22 Aralık-21 Ocak\n2:22 Ocak-19 Şubat\n3:20 Şubat-20 Mart");
        System.out.println("4:21 Mart-20 Nisan\n5:21 Nisan-21 Mayıs\n6:22 Mayıs-22 Haziran");
        System.out.println("7:23 Haziran-22 Temmuz\n8:23 Temmuz-22 Ağustos\n9:23 Ağustos-22 Eylül");
        System.out.println("10:23 Eylül-22 Ekim\n11:23 Ekim-21 Kasım\n12:22 Kasım-21 Aralık");
        System.out.print("Doğum Tarihinizin Olduğu Aralığı Seçiniz:");
        burc = input.nextInt();

        if(burc == 1){
            System.out.println("Oğlak Burcusunuz.");
        }
        else if (burc == 2){
            System.out.println("Kova Burcusunuz.");
        }
        else if (burc == 3){
            System.out.println("Balık Burcusunuz.");
        }
        else if (burc == 4){
            System.out.println("Koç Burcusunuz.");
        }
        else if (burc == 5){
            System.out.println("Boğa Burcusunuz.");
        }
        else if (burc == 6){
            System.out.println("İkizler Burcusunuz.");
        }
        else if (burc == 7){
            System.out.println("Yengeç Burcusunuz.");
        }
        else if (burc == 8){
            System.out.println("Aslan Burcusunuz.");
        }
        else if (burc == 9){
            System.out.println("Başak Burcusunuz.");
        }
        else if (burc == 10){
            System.out.println("Terazi Burcusunuz.");
        }
        else if (burc == 11){
            System.out.println("Akrep Burcusunuz.");
        }
        else if (burc == 12){
            System.out.println("Yay Burcusunuz.");
        }
        else{
            System.out.println("Yanlış Değer Girdiniz.");
        }
    }
}
