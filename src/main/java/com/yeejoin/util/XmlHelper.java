package com.yeejoin.util;


import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.sax.SAXResult;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by zhou on 2017/3/27.
 */
public class XmlHelper {
    public static String objectToXmlWithCDATA(Object object, String[] list, Class clazz) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(clazz);
        OutputFormat of = new OutputFormat();
        of.setCDataElements(list);

        ByteArrayOutputStream op = new ByteArrayOutputStream();
        XMLSerializer serializer = new XMLSerializer(op,of);
        SAXResult result = new SAXResult(serializer.asContentHandler());
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        mar.marshal(object,result);
        return op.toString("utf-8");
    }
}
