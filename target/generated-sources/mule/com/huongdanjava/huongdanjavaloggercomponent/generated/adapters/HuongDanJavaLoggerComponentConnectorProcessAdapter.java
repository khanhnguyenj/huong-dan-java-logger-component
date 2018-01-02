
package com.huongdanjava.huongdanjavaloggercomponent.generated.adapters;

import com.huongdanjava.huongdanjavaloggercomponent.HuongDanJavaLoggerComponentConnector;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>HuongDanJavaLoggerComponentConnectorProcessAdapter</code> is a wrapper around {@link HuongDanJavaLoggerComponentConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2018-01-02T04:15:48+07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class HuongDanJavaLoggerComponentConnectorProcessAdapter
    extends HuongDanJavaLoggerComponentConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<HuongDanJavaLoggerComponentConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, HuongDanJavaLoggerComponentConnectorCapabilitiesAdapter> getProcessTemplate() {
        final HuongDanJavaLoggerComponentConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,HuongDanJavaLoggerComponentConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, HuongDanJavaLoggerComponentConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, HuongDanJavaLoggerComponentConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
