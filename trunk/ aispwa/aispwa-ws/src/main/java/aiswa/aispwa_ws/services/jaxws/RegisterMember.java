
package aiswa.aispwa_ws.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "registerMember", namespace = "http://services.aispwa_ws.aiswa/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerMember", namespace = "http://services.aispwa_ws.aiswa/")
public class RegisterMember {

    @XmlElement(name = "arg0", namespace = "")
    private aiswa.aispwa_ws.dto.members.MemberDetailsDTO arg0;

    /**
     * 
     * @return
     *     returns MemberDetailsDTO
     */
    public aiswa.aispwa_ws.dto.members.MemberDetailsDTO getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(aiswa.aispwa_ws.dto.members.MemberDetailsDTO arg0) {
        this.arg0 = arg0;
    }

}
