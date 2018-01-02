
package com.huongdanjava.huongdanjavaloggercomponent.generated.adapters;

import com.huongdanjava.huongdanjavaloggercomponent.HuongDanJavaLoggerComponentConnector;
import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;


/**
 * A <code>HuongDanJavaLoggerComponentConnectorCapabilitiesAdapter</code> is a wrapper around {@link HuongDanJavaLoggerComponentConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2018-01-02T04:15:48+07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class HuongDanJavaLoggerComponentConnectorCapabilitiesAdapter
    extends HuongDanJavaLoggerComponentConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
