
package ws.recintos.privados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sellos complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="sellos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sello" type="{http://privados.recintos.ws}tipo_sello"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sellos", propOrder = { "sello" })
public class Sellos {

    @XmlElement(required = true)
    protected String sello;

    /**
     * Gets the value of the sello property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSello() {
        return sello;
    }

    /**
     * Sets the value of the sello property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSello(String value) {
        this.sello = value;
    }

}
