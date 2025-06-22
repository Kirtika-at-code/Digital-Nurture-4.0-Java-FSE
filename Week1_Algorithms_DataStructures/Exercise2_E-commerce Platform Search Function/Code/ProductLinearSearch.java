//package Week 1.E-commerce Platform Search Function;

public class ProductLinearSearch {
    public static Product linearSearch(Product[] prods, int targetId){
        for(Product pro:prods){
            if(pro.ProductId==targetId){
                return pro;
            }
        }
        return null;
    }
}
