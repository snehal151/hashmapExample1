import java.util.*;

class HashmapExample1{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        System.out.println("List of elements: "+map);
        map.put(1,"Sneha");
        map.put(2,"Rohini");
        map.put(3,"Aashu");

        System.out.println("After put() method ");
        listMap(map);

        map.putIfAbsent(4, "Madhuri");
        System.out.println("After putIfAbsent() method ");
        listMap(map);

        map.put(5,"Shweta");
        map.put(6,"Rani");

        map.putAll(map);
        System.out.println("After putAll() method ");
        listMap(map);

        map.remove(4);
        System.out.println("Updated list: ");
        listMap(map);

        map.replace(6, "Manisha");
        System.out.println("after replace() : ");
        listMap(map);
    }

    private static void listMap(Map<Integer, String> map) {
        for(Map.Entry e1:map.entrySet()){
            System.out.println(e1.getKey()+" "+e1.getValue());
        }

    }
}
