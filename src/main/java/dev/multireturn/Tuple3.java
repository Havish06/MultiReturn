package dev.multireturn;

/**
 * An immutable tuple containing three values.
 *
 * @param first the first value
 * @param second the second value
 * @param third the third value
 * @param <A> the type of the first value
 * @param <B> the type of the second value
 * @param <C> the type of the third value
 */
public record Tuple3<A, B, C>(A first, B second, C third) {
}
