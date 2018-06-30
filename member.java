package mina.bazar;

public class member extends customer {

    Product p;
    public int pId;
    public String pName;
    public double pPrice;
    public double productquintity;
    public double Bill;

    public member(String cId, String cName, String cAddress, String cType, Product p) {
        super(cId, cName, cAddress, cType);
        // p=new Product(pId,pName,pPrice,productquintity);
        this.p = p;
    }

    public void customer(String cType) {
        if (cType.equals("member")) {
            Bill += p.bill - (p.bill * 0.05);

        } else {
            Bill = p.bill;
        }
    }

    public void display() {
        System.out.println("Id " + cId);
        System.out.println("Name " + cName);
        System.out.println("Address " + cAddress);
        System.out.println("Total Bill  " + Bill);
    }
}
