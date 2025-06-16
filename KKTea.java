
public class KKTea extends Tea {

    public int teabag = 0;
    public static int totalSales;
    public static int regularSales;
    public int weight;

    public KKTea(int price, int teabag) {
        super("KK Regular Tea",price);
        this.teabag = teabag;
    }

    public void productDetail() {
        super.productDetail();
        System.out.println("Weight: " + teabag * 2 + ", Tea Bags: " + teabag);
    }

    public static void updateSoldStatusRegular(KKTea t) {
        t.status = true;
        totalSales++;
        regularSales++;
    }

    public static void totalSales() {
        System.out.println("Total Sales: " + totalSales);
        System.out.println("KK Regular Tea: " + regularSales);
    }
}
