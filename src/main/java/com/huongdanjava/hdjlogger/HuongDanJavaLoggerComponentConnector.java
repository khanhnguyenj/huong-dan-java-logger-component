package com.huongdanjava.hdjlogger;

import org.apache.commons.lang.StringUtils;
import org.mule.api.MuleEvent;
import org.mule.api.annotations.Category;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.display.FriendlyName;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.slf4j.MDC;

import com.huongdanjava.hdjlogger.config.ConnectorConfig;
import com.huongdanjava.hdjlogger.constant.LoggingLevel;
import com.huongdanjava.hdjlogger.constant.Text;

@Connector(name="huong-dan-java-logger-component", friendlyName="Huong Dan Java Logger")
@Category(name = "org.mule.tooling.category.core", description = "Components")
public class HuongDanJavaLoggerComponentConnector {

	private static final String CORRELATION_ID_ELEMENT = "correlationId";

    @Config
    ConnectorConfig config;

    @Processor
    public Object log(
		@Placement(group = Text.GENERIC, order = 1) @Optional String message,
		@Placement(group = Text.GENERIC, order = 2) @Default("INFO") @FriendlyName(Text.LEVEL) LoggingLevel loggingLevel,

		@Placement(group = Text.OVERRIDE, order = 1) @Optional @FriendlyName(Text.OVVERIDE_CORRELATION_ID) String globalCorrelationIdOverride,
		@Placement(group = Text.OVERRIDE, order = 2) @Optional @FriendlyName(Text.OVVERIDE_CATEGORY) String globalCategoryOverride,
		MuleEvent event) {
    	String category = getCategory(config, globalCategoryOverride);
    	String correlationId = getCorrelationId(config, globalCorrelationIdOverride);

    	MDC.put(CORRELATION_ID_ELEMENT, correlationId);

        return event.getMessage().getPayload();
    }

    private String getCorrelationId(ConnectorConfig cc, String globalCorrelationIdOverride) {
    	if (!StringUtils.isEmpty(globalCorrelationIdOverride)) {
			return globalCorrelationIdOverride;
		}

		return cc.getCorrelationId();
    }

    private String getCategory(ConnectorConfig cc, String globalCategoryOverride) {
		if (!StringUtils.isEmpty(globalCategoryOverride)) {
			return globalCategoryOverride;
		}

		return cc.getCategory();
	}

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}