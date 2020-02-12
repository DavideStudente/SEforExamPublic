
package com.softeng.professorws;

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
@WebServiceClient(name = "ProfessorWSImplService", targetNamespace = "http://professorws.softeng.com/", wsdlLocation = "http://localhost:8080/ProfessorInterface?wsdl")
public class ProfessorWSImplService
    extends Service
{

    private final static URL PROFESSORWSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PROFESSORWSIMPLSERVICE_EXCEPTION;
    private final static QName PROFESSORWSIMPLSERVICE_QNAME = new QName("http://professorws.softeng.com/", "ProfessorWSImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ProfessorInterface?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PROFESSORWSIMPLSERVICE_WSDL_LOCATION = url;
        PROFESSORWSIMPLSERVICE_EXCEPTION = e;
    }

    public ProfessorWSImplService() {
        super(__getWsdlLocation(), PROFESSORWSIMPLSERVICE_QNAME);
    }

    public ProfessorWSImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PROFESSORWSIMPLSERVICE_QNAME, features);
    }

    public ProfessorWSImplService(URL wsdlLocation) {
        super(wsdlLocation, PROFESSORWSIMPLSERVICE_QNAME);
    }

    public ProfessorWSImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PROFESSORWSIMPLSERVICE_QNAME, features);
    }

    public ProfessorWSImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProfessorWSImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProfessorWSInterface
     */
    @WebEndpoint(name = "ProfessorWSImplPort")
    public ProfessorWSInterface getProfessorWSImplPort() {
        return super.getPort(new QName("http://professorws.softeng.com/", "ProfessorWSImplPort"), ProfessorWSInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProfessorWSInterface
     */
    @WebEndpoint(name = "ProfessorWSImplPort")
    public ProfessorWSInterface getProfessorWSImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://professorws.softeng.com/", "ProfessorWSImplPort"), ProfessorWSInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PROFESSORWSIMPLSERVICE_EXCEPTION!= null) {
            throw PROFESSORWSIMPLSERVICE_EXCEPTION;
        }
        return PROFESSORWSIMPLSERVICE_WSDL_LOCATION;
    }

}