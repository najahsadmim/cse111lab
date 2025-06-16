
public class KKFlavouredTea extends KKTea {

    public String flavour;
    public static int flavouredSales = 0;

    public KKFlavouredTea(String flavour, int price, int teabag) {
        super(price, teabag);
        this.flavour = flavour;
        super.name = "KK " + flavour + " Tea";
    }

    public void productDetail() {
        super.productDetail();
    }

    public static void updateSoldStatusFlavoured(KKFlavouredTea t) {
        t.status = true;
        flavouredSales++;
        KKTea.totalSales++;
    }

    public static void totalSales() {
        KKTea.totalSales();
        System.out.println("KK Flavoured Tea: " + flavouredSales);
    }
}
