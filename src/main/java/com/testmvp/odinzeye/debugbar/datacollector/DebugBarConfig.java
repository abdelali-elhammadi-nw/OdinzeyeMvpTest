package com.testmvp.odinzeye.debugbar.datacollector;

import com.testmvp.odinzeye.debugbar.datacollector.databasequerycollector.DataBaseQueriesCollector;
import com.testmvp.odinzeye.debugbar.datacollector.databasequerycollector.DataBaseQueryEntity;
import com.testmvp.odinzeye.debugbar.datacollector.databasequerycollector.JpaMethodsCollector;
import com.testmvp.odinzeye.debugbar.datacollector.logscollector.LogsConfiguration;
import com.testmvp.odinzeye.debugbar.websocket.IWSDispatcher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DebugBarConfig {
    @Bean
    public DataBaseQueriesCollector dataBaseQueriesCollector(final IWSDispatcher wsDispatcher) {
       return new DataBaseQueriesCollector(wsDispatcher);
    }
    @Bean
    public JpaMethodsCollector jpaMethodsCollector(final DataBaseQueryEntity dataBaseQueryEntity, final IWSDispatcher wsDispatcher)
    {
        return new JpaMethodsCollector(dataBaseQueryEntity, wsDispatcher);
    }
    @Bean
    public LogsConfiguration logsConfiguration(final IWSDispatcher wsDispatcher) {
        LogsConfiguration config = new LogsConfiguration(wsDispatcher);
        config.configure();
        return config;
    }


}