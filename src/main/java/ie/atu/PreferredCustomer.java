package ie.atu;

public class PreferredCustomer extends Customer{

    private String purchase;
    private String discount;

    public PreferredCustomer(){
    }

    public PreferredCustomer(String name, String address, String phone, String customerNumber, boolean mailingList,String purchase, String discount){
        super(name, address, phone, customerNumber, mailingList);
        this.purchase = purchase;
        this.discount = discount;
    }

    public String getPurchase() {
        return purchase;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }


    @Override
    public String toString() {
        return super.toString() + " " + "  Purchase : " + purchase + " " + "  Discount : " + discount;
    }
}


