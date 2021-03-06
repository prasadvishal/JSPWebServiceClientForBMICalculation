
package org.mindfire.webservices;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BmiCalculatorWS", targetNamespace = "http://webservices.mindfire.org/", wsdlLocation = "http://localhost:8080/SimpleSoapBmiCalculator/BmiCalculatorWS?wsdl")
public class BmiCalculatorWS_Service
    extends Service
{

    private final static URL BMICALCULATORWS_WSDL_LOCATION;
    private final static WebServiceException BMICALCULATORWS_EXCEPTION;
    private final static QName BMICALCULATORWS_QNAME = new QName("http://webservices.mindfire.org/", "BmiCalculatorWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SimpleSoapBmiCalculator/BmiCalculatorWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BMICALCULATORWS_WSDL_LOCATION = url;
        BMICALCULATORWS_EXCEPTION = e;
    }

    public BmiCalculatorWS_Service() {
        super(__getWsdlLocation(), BMICALCULATORWS_QNAME);
    }

    public BmiCalculatorWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), BMICALCULATORWS_QNAME, features);
    }

    public BmiCalculatorWS_Service(URL wsdlLocation) {
        super(wsdlLocation, BMICALCULATORWS_QNAME);
    }

    public BmiCalculatorWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BMICALCULATORWS_QNAME, features);
    }

    public BmiCalculatorWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BmiCalculatorWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BmiCalculatorWS
     */
    @WebEndpoint(name = "BmiCalculatorWSPort")
    public BmiCalculatorWS getBmiCalculatorWSPort() {
        return super.getPort(new QName("http://webservices.mindfire.org/", "BmiCalculatorWSPort"), BmiCalculatorWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BmiCalculatorWS
     */
    @WebEndpoint(name = "BmiCalculatorWSPort")
    public BmiCalculatorWS getBmiCalculatorWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.mindfire.org/", "BmiCalculatorWSPort"), BmiCalculatorWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BMICALCULATORWS_EXCEPTION!= null) {
            throw BMICALCULATORWS_EXCEPTION;
        }
        return BMICALCULATORWS_WSDL_LOCATION;
    }

}
