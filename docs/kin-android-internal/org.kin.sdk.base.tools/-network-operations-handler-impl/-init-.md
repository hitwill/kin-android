[kin-android](../../index.md) / [org.kin.sdk.base.tools](../index.md) / [NetworkOperationsHandlerImpl](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`NetworkOperationsHandlerImpl(ioScheduler: `[`ScheduledExecutorService`](https://docs.oracle.com/javase/6/docs/api/java/util/concurrent/ScheduledExecutorService.html)` = Executors.newSingleThreadScheduledExecutor(), ioExecutor: `[`ExecutorService`](https://docs.oracle.com/javase/6/docs/api/java/util/concurrent/ExecutorService.html)` = Executors.newScheduledThreadPool(
        Runtime.getRuntime().availableProcessors()
    ), logger: `[`KinLoggerFactory`](../-kin-logger-factory/index.md)`, shouldRetryError: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = { false })`