package Map;
import java.util.Map;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import static java.lang.System.out;
public class CheckKey {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(10,"hello");
        map.put(12,"java");
        map.put(11,"Connection");
        map.put(13,"Rajiv Ghadhi");
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            out.println(entry.getKey()+"\t"+entry.getValue());
        }
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            out.println(entry.getKey());
        }
//        for(Integer key : map.keySet()){
//            out.println(map.get(key));
//        }
//        for(String value : map.values()){
//            out.println(map.get(value));
//        }
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        out.println(list);

    }
}
