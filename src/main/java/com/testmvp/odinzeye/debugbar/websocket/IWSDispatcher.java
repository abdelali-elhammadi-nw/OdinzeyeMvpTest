package com.testmvp.odinzeye.debugbar.websocket;

import com.testmvp.odinzeye.debugbar.datacollector.databasequerycollector.DataBaseQueryEntity;
import com.testmvp.odinzeye.debugbar.datacollector.exceptionscollector.ExceptionsCollectorEntity;
import com.testmvp.odinzeye.debugbar.datacollector.logscollector.LogsEntity;
import com.testmvp.odinzeye.debugbar.datacollector.metricscollector.CPUEntity;
import com.testmvp.odinzeye.debugbar.datacollector.metricscollector.HeapMemoryEntity;

public interface IWSDispatcher {
    void sendCollectedDBQueries(DataBaseQueryEntity dataBaseQueryEntity);
    void sendCollectedExceptions(ExceptionsCollectorEntity exceptionsCollector);
    void sendCollectedMemoryHeap(HeapMemoryEntity heapMemoryEntity);
    void sendCollectedCPUUsage(CPUEntity cpuEntity);
    void sendCollectedLogs(LogsEntity logsEntity);
}
