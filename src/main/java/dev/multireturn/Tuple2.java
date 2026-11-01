package dev.multireturn;

/**
 * An immutable tuple containing two values.
 *
 * @param first the first value
 * @param second the second value
 * @param <A> the type of the first value
 * @param <B> the type of the second value
 */
public record Tuple2<A, B>(A first, B second) {
}
