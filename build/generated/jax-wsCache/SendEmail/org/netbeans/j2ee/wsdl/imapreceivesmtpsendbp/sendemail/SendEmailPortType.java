
package org.netbeans.j2ee.wsdl.imapreceivesmtpsendbp.sendemail;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SendEmailPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/IMapReceiveSMTPSendBP/SendEmail")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SendEmailPortType {


    /**
     * 
     * @param to
     * @param body
     * @param subject
     */
    @WebMethod(operationName = "SendEmailOperation")
    @Oneway
    public void sendEmailOperation(
        @WebParam(name = "to", partName = "to")
        String to,
        @WebParam(name = "subject", partName = "subject")
        String subject,
        @WebParam(name = "body", partName = "body")
        String body);

}