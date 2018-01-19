package com.huongdanjava.hdjlogger;

import org.mule.api.MuleEvent;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.display.FriendlyName;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;

import com.huongdanjava.hdjlogger.config.ConnectorConfig;
import com.huongdanjava.hdjlogger.constant.LoggingLevel;
import com.huongdanjava.hdjlogger.constant.Text;

@Connector(name="huong-dan-java-logger-component", friendlyName="Huong Dan Java Logger")
public class HuongDanJavaLoggerComponentConnector {

    @Config
    ConnectorConfig config;

    @Processor
    public Object log(
		@Placement(group = Text.GENERIC, order = 1) @Optional String message,
		@Placement(group = Text.GENERIC, order = 2) @Default("INFO") @FriendlyName(Text.LEVEL) LoggingLevel loggingLevel,

		@Placement(group = Text.OVERRIDE, order = 1) @Optional @FriendlyName(Text.OVVERIDE_CORRELATION_ID) String globalCorrelationIdOverride,
		@Placement(group = Text.OVERRIDE, order = 2) @Optional @FriendlyName(Text.OVVERIDE_CATEGORY) String overrideGlobalCategoryOverride,
		MuleEvent event) {

        return event.getMessage().getPayload();
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}