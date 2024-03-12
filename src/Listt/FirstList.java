package Listt;
import java.util.*;

class A{
    String name;
    A(String name){
        this.name = name;
    }
}
public class FirstList {
    public static void main(String[] args) {
        List<String> list =  new ArrayList<>();
        list.add("Hello");
        System.out.println(list);
        list.add(0,"World");
        System.out.println(list);
        list.add("How");
        list.set(1,"Avanish");
        System.out.println(list);
        System.out.println(list.get(2));
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        List<A> list1 = new ArrayList<>();
        list1.add(new A("Amit"));
        list1.add(new A("Tiger"));
        System.out.println(list1);
        Iterator<A> iterator1 = list1.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("Ankush");
        System.out.println(set.stream().findFirst());

        System.out.println(set);
        Map<Integer, String> map = new TreeMap<>();
        map.put(105,"Ravindra");
        map.put(101,"Rajesndra");
        map.put(99,"Kala");
        System.out.println(map);
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

    }
}
