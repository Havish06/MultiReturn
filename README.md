# MultiReturn

**Multiple values. One return. Less boilerplate.**

A lightweight Java 21 library for returning multiple values of different types through immutable, type-safe tuples, with simple factory methods, minimal dependencies, and a focused API for everyday method results.

## Requirements

- Java 21 or later
- Maven 3.9+ to build from source

## Build and test

Clone the repository and run:

```bash
mvn clean verify
```

## Quick start

```java
import dev.multireturn.MultiReturn;
import dev.multireturn.Tuple2;

public class ArrayAnalyzer {

    public static Tuple2<Integer, Boolean> analyze(int[] numbers) {
        int maximum = numbers[0];
        boolean allEqual = true;

        for (int i = 1; i < numbers.length; i++) {
            maximum = Math.max(maximum, numbers[i]);
            if (numbers[i] != numbers[0]) {
                allEqual = false;
            }
        }

        return MultiReturn.of(maximum, allEqual);
    }

    public static void main(String[] args) {
        Tuple2<Integer, Boolean> result = analyze(new int[]{10, 20, 30});

        int maximum = result.first();
        boolean allEqual = result.second();

        System.out.println(maximum);
        System.out.println(allEqual);
    }
}
```

## Supported tuple sizes

| Factory call | Return type | Accessors |
|---|---|---|
| `MultiReturn.of(a, b)` | `Tuple2<A, B>` | `first()`, `second()` |
| `MultiReturn.of(a, b, c)` | `Tuple3<A, B, C>` | `first()`, `second()`, `third()` |
| `MultiReturn.of(a, b, c, d)` | `Tuple4<A, B, C, D>` | `first()`, `second()`, `third()`, `fourth()` |

Each tuple is a Java record. Records provide value-based `equals()`, `hashCode()`, and `toString()` implementations. Tuple immutability is shallow: component references cannot be reassigned, but mutable objects stored inside a tuple can still be changed.

Null values are permitted.

## Maven coordinates

The project currently uses these coordinates:

- **Group ID:** `dev.multireturn`
- **Artifact ID:** `multireturn`
- **Version:** `0.1.0-SNAPSHOT`

The library is not published to Maven Central yet. Until it is published, use it by building from source or installing it into your local Maven repository:

```bash
mvn clean install
```

Then add the dependency to your project:

```xml
<dependency>
    <groupId>dev.multireturn</groupId>
    <artifactId>multireturn</artifactId>
    <version>0.1.0-SNAPSHOT</version>
</dependency>
```

## Scope

The initial release focuses on `Tuple2`, `Tuple3`, `Tuple4`, and overloaded `MultiReturn.of(...)` factory methods. It does not add native Java destructuring syntax or modify the Java language.

## License

MultiReturn is licensed under the [MIT License](LICENSE).
