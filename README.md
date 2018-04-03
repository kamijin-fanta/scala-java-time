# scala-java-time

Scala wrapper for java.time.

## Usage

### Import

```scala
import java.time._
import com.github.kamijin_fanta.scala_java_time.Imports._
```

### Date / Time / Duration Operations

```scala
import java.time._
import com.github.kamijin_fanta.scala_java_time.Imports._

6.hours + 5.minutes  // java.time.Duration = PT6H5M
OffsetDateTime.now() + 2.seconds  // java.time.OffsetDateTime = 2018-04-03T22:22:12.289148300+09:00
```
