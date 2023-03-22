package weeks.week10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class d27w10_Map_SortByValues {

    public static void main(String[] args) {
        Map<String, Integer> mmap=new LinkedHashMap<>();
        mmap.put("Sheyma", 23);
        mmap.put("Ali", 25);
        mmap.put("Mary",29);
        mmap.put("Neil",31);
        mmap.put("Carol",35);

        Map<String, Integer> map=sortByValue(mmap);
        System.out.println(map);
    }



    /*
        Write a method that can sort the map by values
     */

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        return map;

    }

}
