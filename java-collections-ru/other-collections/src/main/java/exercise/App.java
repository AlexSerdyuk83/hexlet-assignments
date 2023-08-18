package exercise;

import java.util.*;

// BEGIN
class  App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> obj1, Map<String, Object> obj2) {
        Set<String> keys1 = new TreeSet<>(obj1.keySet());
        Set<String> keys2 = new TreeSet<>(obj2.keySet());
        Set<String> union = new TreeSet<>();

        union.addAll(keys1);
        union.addAll(keys2);

        LinkedHashMap<String, String> result = new LinkedHashMap<>();

        for (var item: union) {
            Object value1 = obj1.getOrDefault(item, null);
            Object value2 = obj2.getOrDefault(item, null);

            if ((value1 == null) && (value2 != null)) {
                result.put(item, "added");
            } else if ((value1 != null) && (value2 == null)) {
                result.put(item, "deleted");
            } else if (value1 != null && !value2.equals(value1)) {
                result.put(item, "changed");
            } else {
                result.put(item, "unchanged");
            }
        }

        return result;
    }
}
//END
