
package org.netbeans.j2ee.wsdl.imapreceivesmtpsendbp.sendemail;

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
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SendEmailService", targetNamespace = "http://j2ee.netbeans.org/wsdl/IMapReceiveSMTPSendBP/SendEmail", wsdlLocation = "http://wiki.open-esb.java.net/attach/EmailBC.WSDLSamples/SendEmail.wsdl")
public class SendEmailService
    extends Service
{

    private final static URL SENDEMAILSERVICE_WSDL_LOCATION;
    private final static WebServiceException SENDEMAILSERVICE_EXCEPTION;
    private final static QName SENDEMAILSERVICE_QNAME = new QName("http://j2ee.netbeans.org/wsdl/IMapReceiveSMTPSendBP/SendEmail", "SendEmailService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://wiki.open-esb.java.net/attach/EmailBC.WSDLSamples/SendEmail.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SENDEMAILSERVICE_WSDL_LOCATION = url;
        SENDEMAILSERVICE_EXCEPTION = e;
    }

    public SendEmailService() {
        super(__getWsdlLocation(), SENDEMAILSERVICE_QNAME);
    }

    public SendEmailService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SENDEMAILSERVICE_QNAME, features);
    }

    public SendEmailService(URL wsdlLocation) {
        super(wsdlLocation, SENDEMAILSERVICE_QNAME);
    }

    public SendEmailService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SENDEMAILSERVICE_QNAME, features);
    }

    public SendEmailService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SendEmailService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SendEmailPortType
     */
    @WebEndpoint(name = "SendEmailPort")
    public SendEmailPortType getSendEmailPort() {
        return super.getPort(new QName("http://j2ee.netbeans.org/wsdl/IMapReceiveSMTPSendBP/SendEmail", "SendEmailPort"), SendEmailPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SendEmailPortType
     */
    @WebEndpoint(name = "SendEmailPort")
    public SendEmailPortType getSendEmailPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://j2ee.netbeans.org/wsdl/IMapReceiveSMTPSendBP/SendEmail", "SendEmailPort"), SendEmailPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SENDEMAILSERVICE_EXCEPTION!= null) {
            throw SENDEMAILSERVICE_EXCEPTION;
        }
        return SENDEMAILSERVICE_WSDL_LOCATION;
    }

}
