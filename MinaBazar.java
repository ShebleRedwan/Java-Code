package mina.bazar;

import java.util.Scanner;

public class MinaBazar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter product id:");
        int pId = input.nextInt();
        System.out.println("enter product name:");
        String pName = input.next();
        System.out.println("product price:");
        double pPrice = input.nextDouble();
        System.out.println("product quintity :");
        double productquintity = input.nextDouble();
        Product p = new Product(pId, pName, pPrice, productquintity);
        p.billcalculation();
        p.productabalitiry();
        p.display();
        System.out.println("Name :");
        String cName = input.next();
        System.out.println("Id :");
        String cId = input.next();
        System.out.println("Address :");
        String cAddress = input.next();
        System.out.println("Customer Type :");
        String cType = input.next();

        member m = new member(cName, cId, cAddress, cType, p);
        m.customer(cType);
        m.display();
    }

}
