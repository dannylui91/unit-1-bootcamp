import java.util.*;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    public static void main(String args[]) {
        List<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Garfield"));
        cats.add(new Cat("Pink Panther"));
        cats.add(new Cat("Cat Woman"));
        cats.add(new Cat("Floof"));
        cats.add(new Cat("Puff"));

        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i).getName());
        }

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        System.out.println(mostFrequentElement(arrayList));


        // 3. Pod HashMap
        Map<String, Integer> podMap = new HashMap<>();
        podMap.put("Rusi", 29);
        podMap.put("Mel", 25);
        podMap.put("Hyunjoo", 25);
        podMap.put("Asia", 26);

        Iterator<String> mapIterator = podMap.keySet().iterator();
        while (mapIterator.hasNext()) {
            String name = mapIterator.next();
            System.out.println(name + ": " + podMap.get(name));
        }

        // 4. canRentACar
        System.out.println(canRentACar(podMap));

    }

    private static boolean canRentACar(Map<String, Integer> podMap) {
        Iterator<String> mapIterator = podMap.keySet().iterator();
        while (mapIterator.hasNext()) {
            String name = mapIterator.next();
            if (podMap.get(name) > 25) {
                return true;
            }
        }
        return false;
    }

    // 2. Most Frequent Element
    public static int mostFrequentElement(ArrayList<Integer> list) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == element) {
                    count++;
                }
            }
            countMap.put(element, count);
        }

        int max = 0;
        int popular = 0;
        Iterator<Integer> mapIterator = countMap.keySet().iterator();
        while (mapIterator.hasNext()) {
            int element = mapIterator.next();
            if (countMap.get(element) > max) {
                max = countMap.get(element);
                popular = element;
            }
        }

        return popular;
    }

}
