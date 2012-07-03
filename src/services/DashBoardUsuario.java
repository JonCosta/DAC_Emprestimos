/**
 * DashBoardUsuario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

public class DashBoardUsuario  implements java.io.Serializable {
    private java.lang.String nomeUsuario;

    private java.lang.String senhaUsuario;

    public DashBoardUsuario() {
    }

    public DashBoardUsuario(
           java.lang.String nomeUsuario,
           java.lang.String senhaUsuario) {
           this.nomeUsuario = nomeUsuario;
           this.senhaUsuario = senhaUsuario;
    }


    /**
     * Gets the nomeUsuario value for this DashBoardUsuario.
     * 
     * @return nomeUsuario
     */
    public java.lang.String getNomeUsuario() {
        return nomeUsuario;
    }


    /**
     * Sets the nomeUsuario value for this DashBoardUsuario.
     * 
     * @param nomeUsuario
     */
    public void setNomeUsuario(java.lang.String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }


    /**
     * Gets the senhaUsuario value for this DashBoardUsuario.
     * 
     * @return senhaUsuario
     */
    public java.lang.String getSenhaUsuario() {
        return senhaUsuario;
    }


    /**
     * Sets the senhaUsuario value for this DashBoardUsuario.
     * 
     * @param senhaUsuario
     */
    public void setSenhaUsuario(java.lang.String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DashBoardUsuario)) return false;
        DashBoardUsuario other = (DashBoardUsuario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nomeUsuario==null && other.getNomeUsuario()==null) || 
             (this.nomeUsuario!=null &&
              this.nomeUsuario.equals(other.getNomeUsuario()))) &&
            ((this.senhaUsuario==null && other.getSenhaUsuario()==null) || 
             (this.senhaUsuario!=null &&
              this.senhaUsuario.equals(other.getSenhaUsuario())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNomeUsuario() != null) {
            _hashCode += getNomeUsuario().hashCode();
        }
        if (getSenhaUsuario() != null) {
            _hashCode += getSenhaUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DashBoardUsuario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo", "DashBoardUsuario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo", "nomeUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senhaUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo", "senhaUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
