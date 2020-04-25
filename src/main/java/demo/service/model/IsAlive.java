
package demo.service.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isAlive", propOrder = { "funktion" })
public class IsAlive implements Serializable {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Funktion")
    protected String funktion;

    public String getFunktion() {
        return funktion;
    }

    public void setFunktion(final String value) {
        this.funktion = value;
    }

    public IsAlive withFunktion(final String value) {
        setFunktion(value);
        return this;
    }

}
