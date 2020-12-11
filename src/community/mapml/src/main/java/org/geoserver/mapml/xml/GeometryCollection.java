//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.12.17 at 04:13:52 PM PST
//

package org.geoserver.mapml.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}Point"/>
 *         &lt;element ref="{}LineString"/>
 *         &lt;element ref="{}Polygon"/>
 *         &lt;element ref="{}MultiPoint"/>
 *         &lt;element ref="{}MultiLineString"/>
 *         &lt;element ref="{}MultiPolygon"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"pointOrLineStringOrPolygon"}
)
public class GeometryCollection {

    @XmlElements({
        @XmlElement(name = "point", type = Point.class),
        @XmlElement(name = "linestring", type = LineString.class),
        @XmlElement(name = "polygon", type = Polygon.class),
        @XmlElement(name = "multipoint", type = MultiPoint.class),
        @XmlElement(name = "multilinestring", type = MultiLineString.class),
        @XmlElement(name = "multipolygon", type = MultiPolygon.class)
    })
    protected List<Object> pointOrLineStringOrPolygon;

    /**
     * Gets the value of the pointOrLineStringOrPolygon property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the pointOrLineStringOrPolygon property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getPointOrLineStringOrPolygon().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link Point } {@link LineString
     * } {@link Polygon } {@link MultiPoint } {@link MultiLineString } {@link MultiPolygon }
     */
    public List<Object> getPointOrLineStringOrPolygon() {
        if (pointOrLineStringOrPolygon == null) {
            pointOrLineStringOrPolygon = new ArrayList<Object>();
        }
        return this.pointOrLineStringOrPolygon;
    }
}
