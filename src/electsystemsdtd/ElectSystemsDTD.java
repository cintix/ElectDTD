package electsystemsdtd;

import electsystemsdtd.xml.XmlMapper;

/**
 *
 * @author migo
 */
public class ElectSystemsDTD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        XmlMapper.setEncodingProfile("utf8");
        XmlMapper.setLowerCaseFields(true);
        XmlMapper.setPrettyPrintXml(true);
        
        System.out.println(XMLWriter.toXML(new Metadata()));
    }
    
}
