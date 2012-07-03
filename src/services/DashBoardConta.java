/**
 * Conta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

public class DashBoardConta  implements java.io.Serializable {
    private int idcc;

    private float limite;

    private java.lang.String numero;

    private float saldo;

    private java.lang.String situacao;

    public DashBoardConta() {
    }

    public DashBoardConta(
           int idcc,
           float limite,
           java.lang.String numero,
           float saldo,
           java.lang.String situacao) {
           this.idcc = idcc;
           this.limite = limite;
           this.numero = numero;
           this.saldo = saldo;
           this.situacao = situacao;
    }


    /**
     * Gets the idcc value for this Conta.
     * 
     * @return idcc
     */
    public int getIdcc() {
        return idcc;
    }


    /**
     * Sets the idcc value for this Conta.
     * 
     * @param idcc
     */
    public void setIdcc(int idcc) {
        this.idcc = idcc;
    }


    /**
     * Gets the limite value for this Conta.
     * 
     * @return limite
     */
    public float getLimite() {
        return limite;
    }


    /**
     * Sets the limite value for this Conta.
     * 
     * @param limite
     */
    public void setLimite(float limite) {
        this.limite = limite;
    }


    /**
     * Gets the numero value for this Conta.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Conta.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the saldo value for this Conta.
     * 
     * @return saldo
     */
    public float getSaldo() {
        return saldo;
    }


    /**
     * Sets the saldo value for this Conta.
     * 
     * @param saldo
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    /**
     * Gets the situacao value for this Conta.
     * 
     * @return situacao
     */
    public java.lang.String getSituacao() {
        return situacao;
    }


    /**
     * Sets the situacao value for this Conta.
     * 
     * @param situacao
     */
    public void setSituacao(java.lang.String situacao) {
        this.situacao = situacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DashBoardConta)) return false;
        DashBoardConta other = (DashBoardConta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idcc == other.getIdcc() &&
            this.limite == other.getLimite() &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            this.saldo == other.getSaldo() &&
            ((this.situacao==null && other.getSituacao()==null) || 
             (this.situacao!=null &&
              this.situacao.equals(other.getSituacao())));
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
        _hashCode += getIdcc();
        _hashCode += new Float(getLimite()).hashCode();
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        _hashCode += new Float(getSaldo()).hashCode();
        if (getSituacao() != null) {
            _hashCode += getSituacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DashBoardConta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo", "Conta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idcc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo", "idcc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo", "limite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo", "saldo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo", "situacao"));
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
