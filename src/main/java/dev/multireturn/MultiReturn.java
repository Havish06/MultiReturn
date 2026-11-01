package dev.multireturn;

/**
 * Factory for creating immutable tuples containing multiple values.
 *
 * <p>Each component retains its own generic type, allowing values of
 * different types to be returned together from a Java method.
 *
 * <p>Example:
 * <pre>{@code
 * Tuple2<String, Integer> result = MultiReturn.of("answer", 42);
 * String label = result.first();
 * Integer value = result.second();
 * }</pre>
 */
public final class MultiReturn {

    private MultiReturn() {
        // Utility class; do not instantiate.
    }

    /**
     * Creates a tuple containing two values.
     *
     * @param first the first value
     * @param second the second value
     * @param <A> the type of the first value
     * @param <B> the type of the second value
     * @return a tuple containing {@code first} and {@code second}
     */
    public static <A, B> Tuple2<A, B> of(A first, B second) {
        return new Tuple2<>(first, second);
    }

    /**
     * Creates a tuple containing three values.
     *
     * @param first the first value
     * @param second the second value
     * @param third the third value
     * @param <A> the type of the first value
     * @param <B> the type of the second value
     * @param <C> the type of the third value
     * @return a tuple containing the supplied values in order
     */
    public static <A, B, C> Tuple3<A, B, C> of(
            A first, B second, C third) {
        return new Tuple3<>(first, second, third);
    }

    /**
     * Creates a tuple containing four values.
     *
     * @param first the first value
     * @param second the second value
     * @param third the third value
     * @param fourth the fourth value
     * @param <A> the type of the first value
     * @param <B> the type of the second value
     * @param <C> the type of the third value
     * @param <D> the type of the fourth value
     * @return a tuple containing the supplied values in order
     */
    public static <A, B, C, D> Tuple4<A, B, C, D> of(
            A first, B second, C third, D fourth) {
        return new Tuple4<>(first, second, third, fourth);
    }
}
