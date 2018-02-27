
package ws.recintos.privados;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transporte complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="transporte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroVueloBuqueViaje " type="{http://privados.recintos.ws}tipo_num_vuelo_buque_viaje"/>
 *         &lt;element name="fechaHoraDeArribo" type="{http://privados.recintos.ws}tipo_fec_hora_estimada_arribo"/>
 *         &lt;element name="ideTipoTransporte" type="{http://privados.recintos.ws}tipo_ide_tipo_transporte"/>
 *         &lt;element name="origenVueloBuque" type="{http://privados.recintos.ws}tipo_origen_vuelo_buque"/>
 *         &lt;element name="numManifiesto" type="{http://privados.recintos.ws}tipo_num_manifiesto"/>
 *         &lt;element name="cveFolioCAAT" type="{http://privados.recintos.ws}tipo_cve_folio_caat"/>
 *         &lt;element name="numPesoBruto" type="{http://privados.recintos.ws}tipo_num_peso_bruto_total"/>
 *         &lt;element name="codUnidadPeso" type="{http://privados.recintos.ws}tipo_cod_unidad_peso"/>
 *         &lt;element name="numPiezasTotal" type="{http://privados.recintos.ws}tipo_num_piezas"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transporte", propOrder = {
         "numeroVueloBuqueViaje0020", "fechaHoraDeArribo", "ideTipoTransporte", "origenVueloBuque", "numManifiesto",
         "cveFolioCAAT", "numPesoBruto", "codUnidadPeso", "numPiezasTotal"
    })
public class Transporte {

    @XmlElement(name = "numeroVueloBuqueViaje ", required = true)
    protected String numeroVueloBuqueViaje0020;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraDeArribo;
    @XmlElement(required = true)
    protected String ideTipoTransporte;
    @XmlElement(required = true)
    protected String origenVueloBuque;
    @XmlElement(required = true)
    protected String numManifiesto;
    @XmlElement(required = true)
    protected String cveFolioCAAT;
    @XmlElement(required = true)
    protected BigDecimal numPesoBruto;
    @XmlElement(required = true)
    protected BigDecimal codUnidadPeso;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numPiezasTotal;

    /**
     * Gets the value of the numeroVueloBuqueViaje0020 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroVueloBuqueViaje_0020() {
        return numeroVueloBuqueViaje0020;
    }

    /**
     * Sets the value of the numeroVueloBuqueViaje0020 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroVueloBuqueViaje_0020(String value) {
        this.numeroVueloBuqueViaje0020 = value;
    }

    /**
     * Gets the value of the fechaHoraDeArribo property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaHoraDeArribo() {
        return fechaHoraDeArribo;
    }

    /**
     * Sets the value of the fechaHoraDeArribo property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFechaHoraDeArribo(XMLGregorianCalendar value) {
        this.fechaHoraDeArribo = value;
    }

    /**
     * Gets the value of the ideTipoTransporte property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdeTipoTransporte() {
        return ideTipoTransporte;
    }

    /**
     * Sets the value of the ideTipoTransporte property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdeTipoTransporte(String value) {
        this.ideTipoTransporte = value;
    }

    /**
     * Gets the value of the origenVueloBuque property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrigenVueloBuque() {
        return origenVueloBuque;
    }

    /**
     * Sets the value of the origenVueloBuque property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrigenVueloBuque(String value) {
        this.origenVueloBuque = value;
    }

    /**
     * Gets the value of the numManifiesto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumManifiesto() {
        return numManifiesto;
    }

    /**
     * Sets the value of the numManifiesto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumManifiesto(String value) {
        this.numManifiesto = value;
    }

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
     * Gets the value of the numPesoBruto property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getNumPesoBruto() {
        return numPesoBruto;
    }

    /**
     * Sets the value of the numPesoBruto property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setNumPesoBruto(BigDecimal value) {
        this.numPesoBruto = value;
    }

    /**
     * Gets the value of the codUnidadPeso property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCodUnidadPeso() {
        return codUnidadPeso;
    }

    /**
     * Sets the value of the codUnidadPeso property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCodUnidadPeso(BigDecimal value) {
        this.codUnidadPeso = value;
    }

    /**
     * Gets the value of the numPiezasTotal property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getNumPiezasTotal() {
        return numPiezasTotal;
    }

    /**
     * Sets the value of the numPiezasTotal property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setNumPiezasTotal(BigInteger value) {
        this.numPiezasTotal = value;
    }

}
