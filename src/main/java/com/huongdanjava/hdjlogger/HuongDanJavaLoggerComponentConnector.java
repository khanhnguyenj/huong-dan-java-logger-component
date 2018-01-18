package com.huongdanjava.hdjlogger;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import com.huongdanjava.hdjlogger.config.ConnectorConfig;

@Connector(name="huong-dan-java-logger-component", friendlyName="Huong Dan Java Logger")
public class HuongDanJavaLoggerComponentConnector {

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     */
    @Processor
    public String logging() {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return config.getCorrelationId();
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}