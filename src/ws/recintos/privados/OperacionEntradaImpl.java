package ws.recintos.privados;

import java.util.List;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;

@WebService(name = "OperacionEntrada", targetNamespace = "http://privados.recintos.ws",
            serviceName = "OperacionEntradaService", portName = "OperacionEntradaPort",
            wsdlLocation = "/WEB-INF/wsdl/recintoP0notificacion.wsdl")
@XmlSeeAlso({ ObjectFactory.class })
public class OperacionEntradaImpl {
    public OperacionEntradaImpl() {
    }

    @RequestWrapper(localName = "recibeP0", targetNamespace = "http://privados.recintos.ws",
                    className = "ws.recintos.privados.RecibeP0")
    @WebMethod(action = "http://privados.recintos.ws/recibeP0")
    @Oneway
    public void recibeP0(@WebParam(name = "informacionGeneral") InformacionGeneral informacionGeneral,
                         @WebParam(name = "transporte") Transporte transporte,
                         @WebParam(name = "guiaMaster") InformacionDelMaster guiaMaster,
                         @WebParam(name = "contenedor") List<Contenedor> contenedor,
                         @WebParam(name = "guiaHouse") List<GuiaHouse> guiaHouse,
                         @WebParam(name = "mercancia") List<Mercancia> mercancia,
                         @WebParam(name = "personas") List<Personas> personas) {
    }
}
