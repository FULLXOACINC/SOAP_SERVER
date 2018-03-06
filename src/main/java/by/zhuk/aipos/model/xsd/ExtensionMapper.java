/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package by.zhuk.aipos.model.xsd;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://io.java/xsd".equals(namespaceURI) &&
                "FileNotFoundException".equals(typeName)) {
            return java.io.xsd.FileNotFoundException.Factory.parse(reader);
        }

        if ("http://io.java/xsd".equals(namespaceURI) &&
                "IOException".equals(typeName)) {
            return java.io.xsd.IOException.Factory.parse(reader);
        }

        if ("http://model.aipos.zhuk.by/xsd".equals(namespaceURI) &&
                "Article".equals(typeName)) {
            return by.zhuk.aipos.model.xsd.Article.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
