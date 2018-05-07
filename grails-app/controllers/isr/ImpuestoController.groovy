package isr

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ImpuestoController {


//Esta funcion es la chida
    def calculo(float num){
        Impuesto aux = new Impuesto()
        aux.setSalario_mensual(num)
       render (aux.getIsr())
    }


}
