
package com.rest.api.service1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ConstraintViolationEntity {
    
    private String errorMsg;

    public ConstraintViolationEntity() {
    }

    public ConstraintViolationEntity(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    
    
}
