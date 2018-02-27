
package ws.recintos.privados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informacionGeneral" type="{http://privados.recintos.ws}informacionGeneral"/>
 *         &lt;element name="contenedorOrigen" type="{http://privados.recintos.ws}contenedor"/>
 *         &lt;element name="contenedorDestino" type="{http://privados.recintos.ws}contenedor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "informacionGeneral", "contenedorOrigen", "contenedorDestino" })
@XmlRootElement(name = "recibeTraspaleo")
public class RecibeTraspaleo {

    @XmlElement(required = true)
    protected InformacionGeneral informacionGeneral;
    @XmlElement(required = true)
    protected Contenedor contenedorOrigen;
    @XmlElement(required = true)
    protected Contenedor contenedorDestino;

    /**
     * Gets the value of the informacionGeneral property.
     *
     * @return
     *     possible object is
     *     {@link InformacionGeneral }
     *
     */
    public InformacionGeneral getInformacionGeneral() {
        return informacionGeneral;
    }

    /**
     * Sets the value of the informacionGeneral property.
     *
     * @param value
     *     allowed object is
     *     {@link InformacionGeneral }
     *
     */
    public void setInformacionGeneral(InformacionGeneral value) {
        this.informacionGeneral = value;
    }

    /**
     * Gets the value of the contenedorOrigen property.
     *
     * @return
     *     possible object is
     *     {@link Contenedor }
     *
     */
    public Contenedor getContenedorOrigen() {
        return contenedorOrigen;
    }

    /**
     * Sets the value of the contenedorOrigen property.
     *
     * @param value
     *     allowed object is
     *     {@link Contenedor }
     *
     */
    public void setContenedorOrigen(Contenedor value) {
        this.contenedorOrigen = value;
    }

    /**
     * Gets the value of the contenedorDestino property.
     *
     * @return
     *     possible object is
     *     {@link Contenedor }
     *
     */
    public Contenedor getContenedorDestino() {
        return contenedorDestino;
    }

    /**
     * Sets the value of the contenedorDestino property.
     *
     * @param value
     *     allowed object is
     *     {@link Contenedor }
     *
     */
    public void setContenedorDestino(Contenedor value) {
        this.contenedorDestino = value;
    }

}
