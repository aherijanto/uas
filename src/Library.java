import org.jetbrains.annotations.NotNull;

public class Library {
    public static void PrintTitle(String Judul){
        System.out.println(Judul);

    }


    public static void HitungTotalAngka(int @NotNull [] isiAngka) {
        double jumlahTotalAngka = 0;
        for(int index = 0; index < isiAngka.length; index++){
            System.out.println("Angka Dalam Array Index Ke " + index + " Adalah " + isiAngka[index]);
            jumlahTotalAngka+=isiAngka[index];
        }
        Library.PrintTitle("==============================================");
        System.out.println("Total                           " + jumlahTotalAngka);
    }
}
