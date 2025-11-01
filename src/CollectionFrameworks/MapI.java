package CollectionFrameworks;

import java.util.HashMap;
import java.util.Map;

/*
1.Map stores the data in key-value pair
2.In map keys should be unique but value can be duplicate
3.In map, we can store maximum one null value in key but in
values we can store any number of null values
4.Map does not follow the sorting order
5.Map does not follow the insertion order
*/
public class MapI {
    public static void main(String[] args) {
        Map<Integer,String> h=new HashMap<>();
        h.put(101,"Arman");
        h.put(102,"Deepak sir");
        h.put(null,null);
        h.put(null,"hallo");
        h.put(103,"Arman");//duplicate values
        //h.put(102,"Alam"); replace the old key value pair
        System.out.println(h);
        System.out.println(h.containsKey(101));
        System.out.println(h.containsValue("Arman"));


        HashMap<String ,String> h1=new HashMap<>();
        //h1.putAll(h);
    }
}
