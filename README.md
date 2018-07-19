# fastutil-benchmark

## Motivation

Benchmarking fastutil's size.

## Result

### Memory size

<img src="https://raw.githubusercontent.com/tokuhirom/fastutil-benchmark/master/HashMap%20and%20Int2ObjectArrayMap.png">

    Size	HashMap	Int2ObjectArrayMap
    1	216	120
    10	648	232
    100	5928	1128
    1000	56296	8296
    10000	545640	131176
    100000	5848680	1048680

### Benchmark result

    Benchmark                            (size)   Mode  Cnt          Score           Error  Units
    FullBenchmark.getHashMap                  1  thrpt    5  527560083.083 ±  50122696.157  ops/s
    FullBenchmark.getHashMap                100  thrpt    5  365682020.700 ± 128837905.060  ops/s
    FullBenchmark.getHashMap             100000  thrpt    5  357987697.046 ± 102458103.214  ops/s
    FullBenchmark.getInt2ObjectArrayMap       1  thrpt    5  317549752.399 ±  58104073.817  ops/s
    FullBenchmark.getInt2ObjectArrayMap     100  thrpt    5   13017530.565 ±   1756300.518  ops/s
    FullBenchmark.getInt2ObjectArrayMap  100000  thrpt    5       5174.124 ±      9859.870  ops/s
    FullBenchmark.putHashMap                  1  thrpt    5  172411983.454 ± 104530905.163  ops/s
    FullBenchmark.putHashMap                100  thrpt    5  240858138.541 ±  16214862.238  ops/s
    FullBenchmark.putHashMap             100000  thrpt    5  116023689.378 ±  40059844.212  ops/s
    FullBenchmark.putInt2ObjectArrayMap       1  thrpt    5  106280093.188 ± 140405332.516  ops/s
    FullBenchmark.putInt2ObjectArrayMap     100  thrpt    5    3442293.042 ±   2559506.093  ops/s
    FullBenchmark.putInt2ObjectArrayMap  100000  thrpt    5       2112.553 ±       497.801  ops/s


## References

* jol
 * http://openjdk.java.net/projects/code-tools/jol/
 * http://blog.y-yuki.net/entry/2016/10/27/000000
