/*
 */
package electsystemsdtd;

import electsystemsdtd.xml.XmlMapper;

/**
 *
 * @author migo
 */
public class XMLWriter {
    
    
    /**
     *
     * @param obj
     * @param name
     * @return
     */
    @SuppressWarnings("unchecked")
    public static String toXML(Object obj) {        
        return XmlMapper.toXML(obj);
    }
}
