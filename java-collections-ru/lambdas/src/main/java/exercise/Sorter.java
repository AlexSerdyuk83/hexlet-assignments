package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        Predicate<Map<String, String>> isMen = (m) -> m.get("gender").equals("male");

        return users.stream()
                .filter(isMen)
                .sorted(Comparator.comparing(man -> LocalDate.parse(man.get("birthday"))))
                .map(man -> man.get("name"))
                .collect(Collectors.toList());
    }
}
// END
