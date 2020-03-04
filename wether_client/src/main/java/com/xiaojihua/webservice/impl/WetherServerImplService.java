
package com.xiaojihua.webservice.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WetherServerImplService", targetNamespace = "http://impl.webservice.xiaojihua.com/", wsdlLocation = "http://localhost:12345/weather?wsdl")
public class WetherServerImplService
    extends Service
{

    private final static URL WETHERSERVERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException WETHERSERVERIMPLSERVICE_EXCEPTION;
    private final static QName WETHERSERVERIMPLSERVICE_QNAME = new QName("http://impl.webservice.xiaojihua.com/", "WetherServerImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:12345/weather?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WETHERSERVERIMPLSERVICE_WSDL_LOCATION = url;
        WETHERSERVERIMPLSERVICE_EXCEPTION = e;
    }

    public WetherServerImplService() {
        super(__getWsdlLocation(), WETHERSERVERIMPLSERVICE_QNAME);
    }

    public WetherServerImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WETHERSERVERIMPLSERVICE_QNAME, features);
    }

    public WetherServerImplService(URL wsdlLocation) {
        super(wsdlLocation, WETHERSERVERIMPLSERVICE_QNAME);
    }

    public WetherServerImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WETHERSERVERIMPLSERVICE_QNAME, features);
    }

    public WetherServerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WetherServerImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WetherServer
     */
    @WebEndpoint(name = "WetherServerImplPort")
    public WetherServer getWetherServerImplPort() {
        return super.getPort(new QName("http://impl.webservice.xiaojihua.com/", "WetherServerImplPort"), WetherServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WetherServer
     */
    @WebEndpoint(name = "WetherServerImplPort")
    public WetherServer getWetherServerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.webservice.xiaojihua.com/", "WetherServerImplPort"), WetherServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WETHERSERVERIMPLSERVICE_EXCEPTION!= null) {
            throw WETHERSERVERIMPLSERVICE_EXCEPTION;
        }
        return WETHERSERVERIMPLSERVICE_WSDL_LOCATION;
    }

}
