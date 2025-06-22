//package Week 1.E-commerce Platform Search Function;

import java.util.Arrays;
import java.util.Comparator;

public class ProductBinarysearch {
    public static Product binarySearch(Product[] prods,int targetId){
        Arrays.sort(prods, Comparator.comparingInt(Id->Id.ProductId));
        
        int left=0;
        int right=prods.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(prods[mid].ProductId==targetId){
                return prods[mid];
            }else if(prods[mid].ProductId<targetId){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return null;
    }
}
