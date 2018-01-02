package com.huongdanjava.huongdanjavaloggercomponent;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import com.huongdanjava.huongdanjavaloggercomponent.config.ConnectorConfig;

@Connector(name="huong-dan-java-logger-component", friendlyName="Huong Dan Java Logger Component")
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
    public String greet(String friend) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return config.getGreeting() + " " + friend + ". " + config.getReply();
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}