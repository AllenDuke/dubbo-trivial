# 这个用于测试dubbo与trivial的性能差异
就当前测试来看:
1. dubbo的首次连接构建似乎只需300ms，同步调用约为4，5ms.
2. trivial的首次连接构建需要1400ms，同步调用约为2，3ms.
trvial比dubbo稍快。