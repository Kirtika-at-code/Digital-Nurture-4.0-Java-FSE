public class Product{
    int ProductId;
    String ProductName;
    String Category;

    public Product(int ProductId,String ProductName,String Category){
        this.ProductId=ProductId;
        this.ProductName=ProductName;
        this.Category=Category;
    }

    @Override
    public String toString(){
        return ProductId+" -> "+ ProductName+" -> "+ Category;
    }
}