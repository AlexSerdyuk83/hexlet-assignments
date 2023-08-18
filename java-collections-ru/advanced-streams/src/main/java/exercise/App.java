package exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String config) {
        List<String> configList = new ArrayList<>(Arrays.asList(config.split("\n")));

        String result = configList.stream()
                .filter(item -> item.startsWith("environment="))
                .map(item -> item.substring(12))
                .flatMap(item -> Stream.of(item.split(",")))
                .map(item -> item.replaceAll("\"", ""))
                .filter(item -> item.startsWith("X_FORWARDED_"))
                .map(item -> item.substring(12))
                .collect(Collectors.joining(","));
        return result;
    }
}
//END
