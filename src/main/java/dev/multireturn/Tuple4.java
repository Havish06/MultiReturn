package dev.multireturn;

/**
 * An immutable tuple containing four values.
 *
 * @param first the first value
 * @param second the second value
 * @param third the third value
 * @param fourth the fourth value
 * @param <A> the type of the first value
 * @param <B> the type of the second value
 * @param <C> the type of the third value
 * @param <D> the type of the fourth value
 */
public record Tuple4<A, B, C, D>(
        A first, B second, C third, D fourth) {
}
