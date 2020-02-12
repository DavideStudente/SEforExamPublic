
package com.softeng.bankws;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BankImplService", targetNamespace = "http://bankws.softeng.com/", wsdlLocation = "http://localhost:8081/BankInterface?wsdl")
public class BankImplService
    extends Service
{

    private final static URL BANKIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException BANKIMPLSERVICE_EXCEPTION;
    private final static QName BANKIMPLSERVICE_QNAME = new QName("http://bankws.softeng.com/", "BankImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/BankInterface?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKIMPLSERVICE_WSDL_LOCATION = url;
        BANKIMPLSERVICE_EXCEPTION = e;
    }

    public BankImplService() {
        super(__getWsdlLocation(), BANKIMPLSERVICE_QNAME);
    }

    public BankImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKIMPLSERVICE_QNAME, features);
    }

    public BankImplService(URL wsdlLocation) {
        super(wsdlLocation, BANKIMPLSERVICE_QNAME);
    }

    public BankImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKIMPLSERVICE_QNAME, features);
    }

    public BankImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankIFace
     */
    @WebEndpoint(name = "BankImplPort")
    public BankIFace getBankImplPort() {
        return super.getPort(new QName("http://bankws.softeng.com/", "BankImplPort"), BankIFace.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankIFace
     */
    @WebEndpoint(name = "BankImplPort")
    public BankIFace getBankImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://bankws.softeng.com/", "BankImplPort"), BankIFace.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKIMPLSERVICE_EXCEPTION!= null) {
            throw BANKIMPLSERVICE_EXCEPTION;
        }
        return BANKIMPLSERVICE_WSDL_LOCATION;
    }

}
