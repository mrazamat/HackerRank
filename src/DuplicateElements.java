import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        String names[] = {"java", "javascript", "ruby", "C", "python", "java"};

        // 1. compare each element: O(nxn) --- worst solution

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("duplicate elements is:: " + names[i]);
                }
            }
        }
        System.out.println("**************");
        // 2. using HashSet: Java Collection: is stores unique values: O(n)
        Set<String> store = new HashSet<>();
        for (String name : names) {
            if (store.add(name) == false) {
                System.out.println("duplicate elements is:: " + name);
            }
        }
        System.out.println("**************");
        // 3. using HashMap
        Map<String, Integer> storeMap = new HashMap<String, Integer>();
        for (String name : names) {
            Integer count = storeMap.get(name);
            if (count == null) {
                storeMap.put(name, 1);
            } else {
                storeMap.put(name, ++count);
            }
        }

        // get values from this HashMap:
        Set<Map.Entry<String, Integer>> entrySet = storeMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("dublicate element is:: " + entry.getKey());
            }
        }


    }


}
