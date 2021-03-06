
package edu.mit.ilab;

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
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LabServerWebService", targetNamespace = "http://ilab.mit.edu", wsdlLocation = "file:/C:/NetBeans327/UQ-iLab-BatchLabServer-Java-master/Radioactivity/LabServer/src/conf/xml-resources/web-services/LabServerService/wsdl/ILabServerWebService.asmx.wsdl")
public class LabServerWebService
    extends Service
{

    private final static URL LABSERVERWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException LABSERVERWEBSERVICE_EXCEPTION;
    private final static QName LABSERVERWEBSERVICE_QNAME = new QName("http://ilab.mit.edu", "LabServerWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/NetBeans327/UQ-iLab-BatchLabServer-Java-master/Radioactivity/LabServer/src/conf/xml-resources/web-services/LabServerService/wsdl/ILabServerWebService.asmx.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LABSERVERWEBSERVICE_WSDL_LOCATION = url;
        LABSERVERWEBSERVICE_EXCEPTION = e;
    }

    public LabServerWebService() {
        super(__getWsdlLocation(), LABSERVERWEBSERVICE_QNAME);
    }

    public LabServerWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LABSERVERWEBSERVICE_QNAME, features);
    }

    public LabServerWebService(URL wsdlLocation) {
        super(wsdlLocation, LABSERVERWEBSERVICE_QNAME);
    }

    public LabServerWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LABSERVERWEBSERVICE_QNAME, features);
    }

    public LabServerWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LabServerWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LabServerWebServiceSoap
     */
    @WebEndpoint(name = "LabServerWebServiceSoap")
    public LabServerWebServiceSoap getLabServerWebServiceSoap() {
        return super.getPort(new QName("http://ilab.mit.edu", "LabServerWebServiceSoap"), LabServerWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LabServerWebServiceSoap
     */
    @WebEndpoint(name = "LabServerWebServiceSoap")
    public LabServerWebServiceSoap getLabServerWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://ilab.mit.edu", "LabServerWebServiceSoap"), LabServerWebServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns LabServerWebServiceSoap
     */
    @WebEndpoint(name = "LabServerWebServiceSoap12")
    public LabServerWebServiceSoap getLabServerWebServiceSoap12() {
        return super.getPort(new QName("http://ilab.mit.edu", "LabServerWebServiceSoap12"), LabServerWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LabServerWebServiceSoap
     */
    @WebEndpoint(name = "LabServerWebServiceSoap12")
    public LabServerWebServiceSoap getLabServerWebServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://ilab.mit.edu", "LabServerWebServiceSoap12"), LabServerWebServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LABSERVERWEBSERVICE_EXCEPTION!= null) {
            throw LABSERVERWEBSERVICE_EXCEPTION;
        }
        return LABSERVERWEBSERVICE_WSDL_LOCATION;
    }

}
