public class JakaTravelMain extends JakaTravelSorting {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if (rabu[i] > cari) {
                System.out.println("Tiket terjual " + rabu[i] + " di hari Rabu");
            }
        }
        for (int i = 0; i < 6; i++) {
            if (kamis[i] > cari) {
                System.out.println("Tiket terjual " + kamis[i] + " di hari Kamis");
            }
        }
        System.out.println("\n");

        for (int j : BC01A) {
            sum0 += j;
        }
        System.out.println("1. Tiket untuk bus BC01A terjual " + sum0 + " dalam seminggu");
        int total0 = sum0 * 150000;
        System.out.println("Total Penjualan tiket BC01A " + total0);
        System.out.println("\n");

        for (int j : BC02A) {
            sum1 += j;
        }
        System.out.println("2. Tiket untuk bus BC02A terjual " + sum1 + " dalam seminggu");
        int total1 = sum1 * 95000;
        System.out.println("Total Penjualan tiket BC02A " + total1);
        System.out.println("\n");

        for (int j : BC02B) {
            sum2 += j;
        }
        System.out.println("3. Tiket untuk bus BC02B terjual " + sum2 + " dalam seminggu");
        int total2 = sum2 * 50000;
        System.out.println("Total Penjualan tiket BC02B " + total2);
        System.out.println("\n");

        for (int j : BT01B) {
            sum3 += j;
        }
        System.out.println("3. Tiket untuk bus BT01B terjual " + sum3 + " dalam seminggu");
        int total3 = sum3 * 100000;
        System.out.println("Total Penjualan tiket BT01B " + total3);
        System.out.println("\n");

        for (int j : DJ01A) {
            sum4 += j;
        }
        System.out.println("4. Tiket untuk bus DJ01A terjual " + sum4 + " dalam seminggu");
        int total4 = sum4 * 275000;
        System.out.println("Total Penjualan tiket DJ01A " + total4);
        System.out.println("\n");

        for (int j : DL01A) {
            sum5 += j;
        }
        System.out.println("5. Tiket untuk bus DL01A terjual " + sum5 + " dalam seminggu");
        int total5 = sum5 * 575000;
        System.out.println("Total Penjualan tiket DL01A " + total5);
        System.out.println("\n");

        int arr[] = {total0, total1, total2, total3, total4, total5};

        JakaTravelSorting ob = new JakaTravelSorting();
        ob.sort(arr);

        printArray(arr);
    }
}
