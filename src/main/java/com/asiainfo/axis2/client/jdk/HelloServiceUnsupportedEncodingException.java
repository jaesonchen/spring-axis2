
package com.asiainfo.axis2.client.jdk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnsupportedEncodingException" type="{http://io.java/xsd}UnsupportedEncodingException" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "unsupportedEncodingException"
})
@XmlRootElement(name = "helloServiceUnsupportedEncodingException")
public class HelloServiceUnsupportedEncodingException {

    @XmlElementRef(name = "UnsupportedEncodingException", namespace = "http://service.axis2.asiainfo.com", type = JAXBElement.class, required = false)
    protected JAXBElement<UnsupportedEncodingException> unsupportedEncodingException;

    /**
     * ��ȡunsupportedEncodingException���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnsupportedEncodingException }{@code >}
     *     
     */
    public JAXBElement<UnsupportedEncodingException> getUnsupportedEncodingException() {
        return unsupportedEncodingException;
    }

    /**
     * ����unsupportedEncodingException���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnsupportedEncodingException }{@code >}
     *     
     */
    public void setUnsupportedEncodingException(JAXBElement<UnsupportedEncodingException> value) {
        this.unsupportedEncodingException = value;
    }

}
