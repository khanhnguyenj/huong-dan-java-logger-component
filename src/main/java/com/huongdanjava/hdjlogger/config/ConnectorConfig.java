package com.huongdanjava.hdjlogger.config;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.display.FriendlyName;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.param.Default;

import com.huongdanjava.hdjlogger.constant.Text;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

	@Configurable
	@Placement(group = Text.GENERIC, order = 1)
	@FriendlyName(Text.CORRELATION_ID)
	@Default("#[message.rootId]")
	private String correlationId;

	@Configurable
	@Placement(group = Text.GENERIC, order = 2)
	private String category;

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}