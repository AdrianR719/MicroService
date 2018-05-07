package isr

class ProyectoMexicali {
    int id;
    int no;
    String proyecto;
    String estado;
    String municipio;
    String clave;
    int año;
    BigInteger monto_Aprobado;

    int getId() {
        return id
    }

    void setId(int id) {
        this.id = id
    }

    int getNo() {
        return no
    }

    void setNo(int no) {
        this.no = no
    }

    String getProyecto() {
        return proyecto
    }

    void setProyecto(String proyecto) {
        this.proyecto = proyecto
    }

    String getEstado() {
        return estado
    }

    void setEstado(String estado) {
        this.estado = estado
    }

    String getMunicipio() {
        return municipio
    }

    void setMunicipio(String municipio) {
        this.municipio = municipio
    }

    String getClave() {
        return clave
    }

    void setClave(String clave) {
        this.clave = clave
    }

    int getAño() {
        return año
    }

    void setAño(int año) {
        this.año = año
    }

    BigInteger getMonto_Aprobado() {
        return monto_Aprobado
    }

    void setMonto_Aprobado(BigInteger monto_Aprovado) {
        this.monto_Aprobado = monto_Aprobado
    }

    ProyectoMexicali(int id, int no, String proyecto, String estado, String municipio, String clave, int año, BigInteger monto_Aprobado) {
        this.id = id
        this.no = no
        this.proyecto = proyecto
        this.estado = estado
        this.municipio = municipio
        this.clave = clave
        this.año = año
        this.monto_Aprobado = monto_Aprobado
    }
    static constraints = {
    }
}
