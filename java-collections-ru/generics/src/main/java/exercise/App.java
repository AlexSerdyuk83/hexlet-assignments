package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> book) {
        List<Map<String, String>> result = new ArrayList<>();

        for (var bookItem: books) {
            List<Boolean> flags = new ArrayList<>();

            for (Map.Entry<String, String> item: book.entrySet()) {
                var bookItemValue = bookItem.get(item.getKey());
                flags.add(bookItemValue.equals(item.getValue()));
            }

            if (!flags.contains(false)) {
                result.add(bookItem);
            }
        }

        return result;
    }
}
//END
