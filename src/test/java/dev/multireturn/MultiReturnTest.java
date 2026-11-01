package dev.multireturn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiReturnTest {

    @Test
    void createsTuple2WithDifferentTypes() {
        Tuple2<Integer, Boolean> result = MultiReturn.of(42, true);

        assertEquals(42, result.first());
        assertTrue(result.second());
    }

    @Test
    void createsTuple3WithDifferentTypes() {
        Tuple3<String, Integer, Double> result =
                MultiReturn.of("score", 95, 97.5);

        assertEquals("score", result.first());
        assertEquals(95, result.second());
        assertEquals(97.5, result.third());
    }

    @Test
    void createsTuple4WithDifferentTypes() {
        Tuple4<String, Integer, Boolean, Double> result =
                MultiReturn.of("Havish", 21, true, 8.5);

        assertEquals("Havish", result.first());
        assertEquals(21, result.second());
        assertTrue(result.third());
        assertEquals(8.5, result.fourth());
    }

    @Test
    void acceptsNullValues() {
        Tuple2<String, Integer> result = MultiReturn.of(null, 10);

        assertNull(result.first());
        assertEquals(10, result.second());
    }

    @Test
    void equalTuplesHaveEqualHashCodes() {
        Tuple2<Integer, String> first = MultiReturn.of(7, "seven");
        Tuple2<Integer, String> second = MultiReturn.of(7, "seven");

        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    void tuplesHaveRecordStyleStringRepresentation() {
        Tuple3<String, Integer, Boolean> result =
                MultiReturn.of("MultiReturn", 1, true);

        assertEquals(
                "Tuple3[first=MultiReturn, second=1, third=true]",
                result.toString()
        );
    }
}
