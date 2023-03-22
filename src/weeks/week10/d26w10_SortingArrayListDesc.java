package weeks.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class d26w10_SortingArrayListDesc {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(34,54,33,23,2,6,9,90));
        sortingArrayListDesc(list);
        System.out.println(list);

    }
    public static void sortingArrayListDesc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

}
