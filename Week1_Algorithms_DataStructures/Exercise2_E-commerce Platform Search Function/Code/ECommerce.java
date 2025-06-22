public class ECommerce {
    public static void main(String[] args){
        Product[] products={
            new Product(21, "Mobile Phone", "Electronics"),
            new Product(67, "Sneakers", "Footwear"),
            new Product(90, "Saree", "Clothes"),
            new Product(87, "Monoply", "Toys"),
            new Product(108, "Stove", "Kitchen")
        };

        Product Linear=ProductLinearSearch.linearSearch(products, 110);
        System.out.println("Linear Search:"+(Linear != null ? Linear : "Product Not Found"));

        Product Binary=ProductBinarysearch.binarySearch(products, 90);
        System.out.println("Binary Search:"+(Binary != null ? Binary : "Product Not Found"));
    }
    
}
