
package com.rest.api.service1;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements I1 {
    
    
    @NotNull(message = "name cant be null")
    @Size(min = 5 , message = "name less than 5 chars")
    private String name;
    
    @NotNull(message = "email cant be null")
    @Size(min = 5 , message = "email less than 10 chars")
    private String email;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", email=" + email + '}';
    }
    
    I1 i=null;
    
}
