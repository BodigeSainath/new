package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProductImp{
    List<Product> products = new ArrayList<>();
    public List<Product> GetAll() {
        Product p1 = new Product();
        p1.Id = 1;
        p1.ProductName = "Laptop";
        p1.Price = 999.99;
        p1.Quantity = 15;
        p1.Category = "Electronics";
        p1.BrandName = "Dell";
        products.add(p1);

        Product p2 = new Product();
        p2.Id = 2;
        p2.ProductName = "Smartphone";
        p2.Price = 699.50;
        p2.Quantity = 30;
        p2.Category = "Electronics";
        p2.BrandName = "Samsung";
        products.add(p2);

        Product p3 = new Product();
        p3.Id = 52;
        p3.ProductName = "Headphones";
        p3.Price = 149.99;
        p3.Quantity = 50;
        p3.Category = "Accessories";
        p3.BrandName = "Sony";
        products.add(p3);

        Product p4 = new Product();
        p4.Id = 4;
        p4.ProductName = "Keyboard";
        p4.Price = 79.99;
        p4.Quantity = 40;
        p4.Category = "Accessories";
        p4.BrandName = "Logitech";
        products.add(p4);

        Product p5 = new Product();
        p5.Id = 5;
        p5.ProductName = "Mouse";
        p5.Price = 29.99;
        p5.Quantity = 100;
        p5.Category = "Accessories";
        p5.BrandName = "Logitech";
        products.add(p5);

        Product p6 = new Product();
        p6.Id = 6;
        p6.ProductName = "Monitor";
        p6.Price = 329.00;
        p6.Quantity = 20;
        p6.Category = "Electronics";
        p6.BrandName = "Dell";
        products.add(p6);

        Product p7 = new Product();
        p7.Id = 40;
        p7.ProductName = "Webcam";
        p7.Price = 89.99;
        p7.Quantity = 25;
        p7.Category = "Accessories";
        p7.BrandName = "Logitech";
        products.add(p7);

        Product p8 = new Product();
        p8.Id = 8;
        p8.ProductName = "USB Cable";
        p8.Price = 9.99;
        p8.Quantity = 200;
        p8.Category = "Accessories";
        p8.BrandName = "Anker";
        products.add(p8);

        Product p9 = new Product();
        p9.Id = 9;
        p9.ProductName = "External Hard Drive";
        p9.Price = 119.99;
        p9.Quantity = 35;
        p9.Category = "Storage";
        p9.BrandName = "Seagate";
        products.add(p9);

        Product p10 = new Product();
        p10.Id = 10;
        p10.ProductName = "Printer";
        p10.Price = 199.99;
        p10.Quantity = 10;
        p10.Category = "Electronics";
        p10.BrandName = "HP";
        products.add(p10);

        Product p11 = new Product();
        p11.Id = 11;
        p11.ProductName = "Tablet";
        p11.Price = 449.00;
        p11.Quantity = 22;
        p11.Category = "Electronics";
        p11.BrandName = "Apple";
        products.add(p11);

        Product p12 = new Product();
        p12.Id = 12;
        p12.ProductName = "Smartwatch";
        p12.Price = 249.99;
        p12.Quantity = 45;
        p12.Category = "Wearables";
        p12.BrandName = "Apple";
        products.add(p12);

        Product p13 = new Product();
        p13.Id = 13;
        p13.ProductName = "Bluetooth Speaker";
        p13.Price = 79.50;
        p13.Quantity = 60;
        p13.Category = "Audio";
        p13.BrandName = "JBL";
        products.add(p13);

        Product p14 = new Product();
        p14.Id = 14;
        p14.ProductName = "Gaming Chair";
        p14.Price = 299.99;
        p14.Quantity = 8;
        p14.Category = "Furniture";
        p14.BrandName = "Secretlab";
        products.add(p14);

        Product p15 = new Product();
        p15.Id = 15;
        p15.ProductName = "Desk Lamp";
        p15.Price = 39.99;
        p15.Quantity = 75;
        p15.Category = "Furniture";
        p15.BrandName = "Ikea";
        products.add(p15);

        Product p16 = new Product();
        p16.Id = 16;
        p16.ProductName = "Power Bank";
        p16.Price = 49.99;
        p16.Quantity = 90;
        p16.Category = "Accessories";
        p16.BrandName = "Anker";
        products.add(p16);

        Product p17 = new Product();
        p17.Id = 17;
        p17.ProductName = "Router";
        p17.Price = 129.99;
        p17.Quantity = 18;
        p17.Category = "Networking";
        p17.BrandName = "TP-Link";
        products.add(p17);

        Product p18 = new Product();
        p18.Id = 18;
        p18.ProductName = "Microphone";
        p18.Price = 159.00;
        p18.Quantity = 12;
        p18.Category = "Audio";
        p18.BrandName = "Blue";
        products.add(p18);

        Product p19 = new Product();
        p19.Id = 19;
        p19.ProductName = "HDMI Cable";
        p19.Price = 14.99;
        p19.Quantity = 150;
        p19.Category = "Accessories";
        p19.BrandName = "Anker";
        products.add(p19);

        Product p20 = new Product();
        p20.Id = 20;
        p20.ProductName = "Graphics Card";
        p20.Price = 599.99;
        p20.Quantity = 5;
        p20.Category = "Components";
        p20.BrandName = "Nvidia";
        products.add(p20);

        Product p21 = new Product();
        p21.Id = 21;
        p21.ProductName = "RAM 16GB";
        p21.Price = 89.99;
        p21.Quantity = 40;
        p21.Category = "Components";
        p21.BrandName = "Corsair";
        products.add(p21);

        Product p22 = new Product();
        p22.Id = 22;
        p22.ProductName = "SSD 1TB";
        p22.Price = 109.99;
        p22.Quantity = 33;
        p22.Category = "Storage";
        p22.BrandName = "Samsung";
        products.add(p22);

        Product p23 = new Product();
        p23.Id = 23;
        p23.ProductName = "Motherboard";
        p23.Price = 249.99;
        p23.Quantity = 14;
        p23.Category = "Components";
        p23.BrandName = "Asus";
        products.add(p23);

        Product p24 = new Product();
        p24.Id = 24;
        p24.ProductName = "CPU Cooler";
        p24.Price = 69.99;
        p24.Quantity = 28;
        p24.Category = "Components";
        p24.BrandName = "Corsair";
        products.add(p24);

        Product p25 = new Product();
        p25.Id = 25;
        p25.ProductName = "Case Fan";
        p25.Price = 19.99;
        p25.Quantity = 120;
        p25.Category = "Components";
        p25.BrandName = "Corsair";
        products.add(p25);

        Product p26 = new Product();
        p26.Id = 26;
        p26.ProductName = "Office Chair";
        p26.Price = 189.99;
        p26.Quantity = 16;
        p26.Category = "Furniture";
        p26.BrandName = "Ikea";
        products.add(p26);

        Product p27 = new Product();
        p27.Id = 27;
        p27.ProductName = "Notebook";
        p27.Price = 4.99;
        p27.Quantity = 300;
        p27.Category = "Stationery";
        p27.BrandName = "Moleskine";
        products.add(p27);

        Product p28 = new Product();
        p28.Id = 25;
        p28.ProductName = "Pen Set";
        p28.Price = 12.99;
        p28.Quantity = 250;
        p28.Category = "Stationery";
        p28.BrandName = "Parker";
        products.add(p28);

        Product p29 = new Product();
        p29.Id = 29;
        p29.ProductName = "Backpack";
        p29.Price = 59.99;
        p29.Quantity = 55;
        p29.Category = "Bags";
        p29.BrandName = "Samsonite";
        products.add(p29);

        var p30 = new Product();
        p30.Id = 30;
        p30.ProductName = "Water Bottle";
        p30.Price = 19.99;
        p30.Quantity = 80;
        p30.Category = "Lifestyle";
        p30.BrandName = "Hydro Flask";
        products.add(p30);
        return products;
    }

        public List<Product> getMatched (String category) {
            List<Product> selected = new ArrayList<>();
            for (Product p : products) {
                if (p.Category.equals(category)) {
                    selected.add(p);
                }
            }
            return selected;
    }
    public List<Product> Getproducts(ProductFilter objFilter){
        List<Product> products = GetAll();
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {

            if(objFilter.check(product))
            {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
    public List<Product> getProductsbyPredicate(Predicate<Product> obj){
        List<Product> products = GetAll();
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {

            if(obj.test(product))
            {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
    public List<Product> getPredicatesProduct(Predicate<Product> predicate){
        List<Product> products = GetAll();
        List<Product> filteredProducts = new ArrayList<>();
        for(Product p : products){
            if(predicate.test(p)){
                filteredProducts.add(p);
            }
        }
    return filteredProducts;
    }
}
