package mina.bazar;

public class Product {

    public int pId;
    public String pName;
    public double pPrice;
    public double bill;
    public double productquintity;

    public Product(int pId, String pName, double pPrice, double productquintity) {
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
        this.productquintity = productquintity;
    }

    /*public int getid(){
    return pId;
}    
public String getname(){
    return pName;
}
public double getprice()
{
    return pPrice;
}*/
    public void productabalitiry() {
        if (pId != 0) {
            System.out.println("product is availabel");
        } else {
            System.out.println("product is not in stock");
        }

    }

    public double billcalculation() {
        bill += (pPrice * productquintity);
        bill += bill * 0.02;
        return bill;
    }

    public void display() {
        System.out.println("product id :" + pId);
        System.out.println("product name:" + pName);
        System.out.println("product price :" + pPrice);
        //System.out.println("Bill  " + bill);
    }

}
