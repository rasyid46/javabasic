public class ContohArray {
    public static void main(String args[]) {
       String[] nama = new String[5];
        nama[0] = "Linda";
        nama[1] = "Santi";
        nama[2] = "Susan";
        nama[3] = "Mila";
        nama[4] = "Ayu";
        // System.out.println("nama teman "+nama[2]);
        for (int i = 0; i < nama.length; i++) {
            //  System.out.println("nama dari index "+ i +":"+ nama[i]);
        }
        int[] tampungAngka = new int[4];
        tampungAngka[0] = 10; 
        tampungAngka[1] = 11; 
        tampungAngka[2] = 12;
        tampungAngka[2] = 14;
        int counter = 1;
        for (int j = 0; j < tampungAngka.length; j++) {
            if(tampungAngka[j] % 2 == 1 ){
                System.out.println("Angka Genap "+ j +":"+ tampungAngka[j]);
                counter++;
            }
        }
        
        System.out.println("Jumlah Angka Ganjil "+ counter);

    }
}