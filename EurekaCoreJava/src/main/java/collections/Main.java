package collections;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ProductImp productImp=new ProductImp();
        Comparator<Product> comparator=(Product o1, Product o2) -> {
                return Double.compare(o1.Price, o2.Price);
            };
        List<Product> result =  new ArrayList<>();
        result=productImp.GetAll();
        List<Product> streamsres=result
                .stream()
                .filter(p -> p.Price>20)
                .sorted(comparator)
                .toList();
//        for(Product p : streamsres){
//            System.out.println(p.ProductName+" "+p.Price);
//        }
        List<ProductDto> productDtos=new ArrayList<>();
        productDtos=result
                .stream()
                .map(x-> {
                    ProductDto dto=new ProductDto();
                    dto.name=x.ProductName;
                    dto.productId= x.Id;
                    dto.Category= x.Category;
                    dto.QTY=x.Quantity;
                    dto.Price= x.Price;
                    return  dto;
                }).toList();

//        for(ProductDto p : productDtos){
//            System.out.println(p.name+" "+p.Category+" "+p.QTY+" "+p.Price);
//        }
//        Collections.sort(result);
     //   result = productImp.Getproducts(Main :: GetProductsByQuantity);
//        Collections.sort(result);
//        Predicate<Product> predicate=(Product product)-> product.Quantity>100?true:false;
//        result=productImp.getProductsbyPredicate(predicate);
//        for(Product p : result){
//            System.out.println(p.Id +" "+ p.Quantity);
//        }
//using FI and default way using anaymous object
        List<Product> result2=new ArrayList<>();
        result2=productImp.GetAll();
        List<Product> prodUsingFI=new ArrayList<>();
        prodUsingFI=productImp.Getproducts(
                new ProductFilter(){
                    @Override
                    public boolean check(Product p) {
                        return p.Quantity>100;
                    }
                }
        );
        prodUsingFI=productImp.Getproducts(Main::GetProductsByQuantity);
        for(Product p : prodUsingFI){
            System.out.println(p.ProductName +" "+p.Quantity);
        }
//        / using Predicate now -------------/
        List<Product> result3=new ArrayList<>();
        result3=productImp.GetAll();
        List<Product> prodUsingPredicate= productImp.getPredicatesProduct( p -> p.Category =="Electronics");
        for(Product p : prodUsingPredicate){
            System.out.println(p.ProductName +" "+p.Quantity);
        }
    }
    public static boolean GetProductsByPredicate(Product product){
        if(product.Quantity>100)
            return true;
        else
            return false;
    }
    public static boolean GetProductsByQuantity(Product product){
        if(product.Quantity>100)
            return true;
        else
            return false;
    }
}
