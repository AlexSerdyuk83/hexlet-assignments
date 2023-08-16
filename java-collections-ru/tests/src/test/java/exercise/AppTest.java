package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    List<Integer> data;

    @BeforeEach
    void InitIntegerList() {
        this.data = new ArrayList<>();

        this.data.add(1);
        this.data.add(2);
        this.data.add(3);
        this.data.add(4);
        this.data.add(5);
    }

    @Test
    void testTake() {
        // BEGIN
        List<Integer> result1 = App.take(this.data, 2);
        List<Integer> result2 = App.take(this.data, 0);
        List<Integer> result3 = App.take(this.data, 5);

        Assertions.assertEquals(result1.size(), 2);
        Assertions.assertEquals(result1.get(1), 2);
        Assertions.assertEquals(result2.size(), 0);
        // END
    }
}
