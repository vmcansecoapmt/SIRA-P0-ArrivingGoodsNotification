
package ws.recintos.privados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for masterConsolid complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="masterConsolid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cveFolioCAAT" type="{http://privados.recintos.ws}tipo_cve_folio_caat"/>
 *         &lt;element name="numeroGuiaBl" type="{http://privados.recintos.ws}tipo_numero_guia_bl"/>
 *         &lt;element name="ideTipoOperacionMaster" type="{http://privados.recintos.ws}tipo_ide_tipo_operacion_master"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "masterConsolid", propOrder = { "cveFolioCAAT", "numeroGuiaBl", "ideTipoOperacionMaster" })
public class MasterConsolid {

    @XmlElement(required = true)
    protected String cveFolioCAAT;
    @XmlElement(required = true)
    protected String numeroGuiaBl;
    @XmlElement(required = true)
    protected String ideTipoOperacionMaster;

    /**
     * Gets the value of the cveFolioCAAT property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCveFolioCAAT() {
        return cveFolioCAAT;
    }

    /**
     * Sets the value of the cveFolioCAAT property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCveFolioCAAT(String value) {
        this.cveFolioCAAT = value;
    }

    /**
     * Gets the value of the numeroGuiaBl property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroGuiaBl() {
        return numeroGuiaBl;
    }

    /**
     * Sets the value of the numeroGuiaBl property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroGuiaBl(String value) {
        this.numeroGuiaBl = value;
    }

    /**
     * Gets the value of the ideTipoOperacionMaster property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdeTipoOperacionMaster() {
        return ideTipoOperacionMaster;
    }

    /**
     * Sets the value of the ideTipoOperacionMaster property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdeTipoOperacionMaster(String value) {
        this.ideTipoOperacionMaster = value;
    }

}
