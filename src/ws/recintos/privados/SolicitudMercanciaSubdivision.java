
package ws.recintos.privados;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solicitudMercanciaSubdivision complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="solicitudMercanciaSubdivision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMercancia" type="{http://privados.recintos.ws}tipo_id_mercancia"/>
 *         &lt;element name="idAsociado" type="{http://privados.recintos.ws}tipo_id_asociado"/>
 *         &lt;element name="numSecuencia" type="{http://privados.recintos.ws}tipo_id_secuencia"/>
 *         &lt;element name="numPiezas" type="{http://privados.recintos.ws}tipo_num_piezas_mercancia"/>
 *         &lt;element name="cveUmPiezas" type="{http://privados.recintos.ws}tipo_cve_um_piezas"/>
 *         &lt;element name="numPeso" type="{http://privados.recintos.ws}tipo_peso"/>
 *         &lt;element name="numSecuenciaD" type="{http://privados.recintos.ws}tipo_id_secuencia"/>
 *         &lt;element name="numPiezasD" type="{http://privados.recintos.ws}tipo_num_piezas_mercancia"/>
 *         &lt;element name="cveUmPiezasD" type="{http://privados.recintos.ws}tipo_cve_um_piezas"/>
 *         &lt;element name="numPesoD" type="{http://privados.recintos.ws}tipo_peso"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudMercanciaSubdivision", propOrder = {
         "idMercancia", "idAsociado", "numSecuencia", "numPiezas", "cveUmPiezas", "numPeso", "numSecuenciaD",
         "numPiezasD", "cveUmPiezasD", "numPesoD"
    })
public class SolicitudMercanciaSubdivision {

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idMercancia;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger idAsociado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numSecuencia;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numPiezas;
    @XmlElement(required = true)
    protected String cveUmPiezas;
    @XmlElement(required = true)
    protected BigDecimal numPeso;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numSecuenciaD;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numPiezasD;
    @XmlElement(required = true)
    protected String cveUmPiezasD;
    @XmlElement(required = true)
    protected BigDecimal numPesoD;

    /**
     * Gets the value of the idMercancia property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIdMercancia() {
        return idMercancia;
    }

    /**
     * Sets the value of the idMercancia property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIdMercancia(BigInteger value) {
        this.idMercancia = value;
    }

    /**
     * Gets the value of the idAsociado property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIdAsociado() {
        return idAsociado;
    }

    /**
     * Sets the value of the idAsociado property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIdAsociado(BigInteger value) {
        this.idAsociado = value;
    }

    /**
     * Gets the value of the numSecuencia property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getNumSecuencia() {
        return numSecuencia;
    }

    /**
     * Sets the value of the numSecuencia property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setNumSecuencia(BigInteger value) {
        this.numSecuencia = value;
    }

    /**
     * Gets the value of the numPiezas property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getNumPiezas() {
        return numPiezas;
    }

    /**
     * Sets the value of the numPiezas property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setNumPiezas(BigInteger value) {
        this.numPiezas = value;
    }

    /**
     * Gets the value of the cveUmPiezas property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCveUmPiezas() {
        return cveUmPiezas;
    }

    /**
     * Sets the value of the cveUmPiezas property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCveUmPiezas(String value) {
        this.cveUmPiezas = value;
    }

    /**
     * Gets the value of the numPeso property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getNumPeso() {
        return numPeso;
    }

    /**
     * Sets the value of the numPeso property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setNumPeso(BigDecimal value) {
        this.numPeso = value;
    }

    /**
     * Gets the value of the numSecuenciaD property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getNumSecuenciaD() {
        return numSecuenciaD;
    }

    /**
     * Sets the value of the numSecuenciaD property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setNumSecuenciaD(BigInteger value) {
        this.numSecuenciaD = value;
    }

    /**
     * Gets the value of the numPiezasD property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getNumPiezasD() {
        return numPiezasD;
    }

    /**
     * Sets the value of the numPiezasD property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setNumPiezasD(BigInteger value) {
        this.numPiezasD = value;
    }

    /**
     * Gets the value of the cveUmPiezasD property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCveUmPiezasD() {
        return cveUmPiezasD;
    }

    /**
     * Sets the value of the cveUmPiezasD property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCveUmPiezasD(String value) {
        this.cveUmPiezasD = value;
    }

    /**
     * Gets the value of the numPesoD property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getNumPesoD() {
        return numPesoD;
    }

    /**
     * Sets the value of the numPesoD property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setNumPesoD(BigDecimal value) {
        this.numPesoD = value;
    }

}
