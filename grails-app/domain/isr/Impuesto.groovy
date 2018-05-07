package isr

class Impuesto {
    float salario_mensual;
    double isr;
    Long id;

    float getSalario_mensual() {
        return salario_mensual
    }

    void setSalario_mensual(float salario_mensual) {
        this.salario_mensual = salario_mensual
    }

    double getIsr() {
        double isr = 0, limite_inferior = 0, impuesto_marginal = 0, cuota_fija = 0, porcentaje_aplicado = 0, exedente_limite_inferior = 0;
        int nivel = 0;
        if (salario_mensual > 0.01 && salario_mensual < 578.52) {
            limite_inferior = 0.01;
            cuota_fija = 0;
            porcentaje_aplicado = 1.92;
        } else if (salario_mensual > 578.53 && salario_mensual < 4910.18) {
            limite_inferior = 578.53;
            cuota_fija = 11.11;
            porcentaje_aplicado = 6.40;
        } else if (salario_mensual > 4910.19 && salario_mensual < 8629.20) {
            limite_inferior = 4910.19;
            cuota_fija = 288.33;
            porcentaje_aplicado = 10.88;
        } else if (salario_mensual > 8629.21 && salario_mensual < 10031.07) {
            limite_inferior = 8629.21;
            cuota_fija = 692.96;
            porcentaje_aplicado = 16;
        } else if (salario_mensual > 10031.08 && salario_mensual < 12009.94) {
            limite_inferior = 10031.08;
            cuota_fija = 917.26;
            porcentaje_aplicado = 17.92;
        } else if (salario_mensual > 12009.95 && salario_mensual < 24222.31) {
            limite_inferior = 12009.95;
            cuota_fija = 1271.87;
            porcentaje_aplicado = 21.36;
        } else if (salario_mensual > 24222.32 && salario_mensual < 38177.69) {
            limite_inferior = 24222.32;
            cuota_fija = 3880.44;
            porcentaje_aplicado = 23.52;
        } else if (salario_mensual > 38177.70 && salario_mensual < 72887.5) {
            limite_inferior = 38177.70;
            cuota_fija = 7162.74;
            porcentaje_aplicado = 30;
        } else if (salario_mensual > 72887.51 && salario_mensual < 97183.33) {
            limite_inferior = 72887.51;
            cuota_fija = 17575.69;
            porcentaje_aplicado = 32;
        } else if (salario_mensual > 97183.34 && salario_mensual < 291550) {
            limite_inferior = 971183.34;
            cuota_fija = 25350.35;
            porcentaje_aplicado = 34;
        } else if (salario_mensual > 291550.01) {
            limite_inferior = 291550.01;
            cuota_fija = 91435.02;
            porcentaje_aplicado = 35;
        }
        exedente_limite_inferior = salario_mensual - limite_inferior;
        impuesto_marginal = (exedente_limite_inferior * porcentaje_aplicado) / 100;
        isr = impuesto_marginal + cuota_fija;
        return isr
    }

    Long getId() {
        return id
    }

    void setId(Long id) {
        this.id = id
    }

    static constraints = {
    }
}
