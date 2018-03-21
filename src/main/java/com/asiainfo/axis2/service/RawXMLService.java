package com.asiainfo.axis2.service;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * TODO
 * 
 * @author       zq
 * @date         2018年3月21日  上午9:24:46
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
@Component
public class RawXMLService {

    protected final Logger logger = LoggerFactory.getLogger(getClass());
    
    /**
     * 自定义输入报文和输出报文
     * 
     * @param in
     * @return
     */
    public OMElement feedback(OMElement in) {
        
        logger.info("request:\n{}", in);
        OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = fac.createOMNamespace("http://model.axis2.asiainfo.com", "xsd");
        OMElement element = fac.createOMElement("Response", omNs);
        OMElement symbol = fac.createOMElement("Result", omNs);
        symbol.addChild(fac.createOMText(symbol, "1"));
        element.addChild(symbol);
        return element;
    }
}
