package collection_map_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingArrayListAsc {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(23,45,3,6,78));
        sortingArrayListAsc(list);
        System.out.println(list);
    }

    public static void sortingArrayListAsc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

}
