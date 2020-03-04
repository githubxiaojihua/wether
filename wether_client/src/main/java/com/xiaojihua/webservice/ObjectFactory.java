
package com.xiaojihua.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xiaojihua.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCityInfoByName_QNAME = new QName("http://webservice.xiaojihua.com/", "getCityInfoByName");
    private final static QName _GetCityInfoByNameResponse_QNAME = new QName("http://webservice.xiaojihua.com/", "getCityInfoByNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xiaojihua.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCityInfoByNameResponse }
     * 
     */
    public GetCityInfoByNameResponse createGetCityInfoByNameResponse() {
        return new GetCityInfoByNameResponse();
    }

    /**
     * Create an instance of {@link GetCityInfoByName }
     * 
     */
    public GetCityInfoByName createGetCityInfoByName() {
        return new GetCityInfoByName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCityInfoByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.xiaojihua.com/", name = "getCityInfoByName")
    public JAXBElement<GetCityInfoByName> createGetCityInfoByName(GetCityInfoByName value) {
        return new JAXBElement<GetCityInfoByName>(_GetCityInfoByName_QNAME, GetCityInfoByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCityInfoByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.xiaojihua.com/", name = "getCityInfoByNameResponse")
    public JAXBElement<GetCityInfoByNameResponse> createGetCityInfoByNameResponse(GetCityInfoByNameResponse value) {
        return new JAXBElement<GetCityInfoByNameResponse>(_GetCityInfoByNameResponse_QNAME, GetCityInfoByNameResponse.class, null, value);
    }

}
