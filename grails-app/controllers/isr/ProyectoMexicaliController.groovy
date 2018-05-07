package isr

import grails.converters.JSON
import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ProyectoMexicaliController {

    ProyectoMexicaliService proyectoMexicaliService
    HashMap jsonMap = new HashMap()

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    /*def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond proyectoMexicaliService.list(params), model:[proyectoMexicaliCount: proyectoMexicaliService.count()]
    }*/

    def proyectos(int year){
        List<ProyectoMexicali> list = proyectoMexicaliService.list()
        long  sum
        for (int i =0; i< list.size();i++){
            if (list.get(i).año != year){
                list.remove(i)
                i--
            }else{
                sum += list.get(i).monto_Aprobado
            }
        }
        jsonMap.proyectos = list.collect() { comp ->
            return [no: comp.no , proyecto : comp.proyecto, estado: comp.estado, municipio: comp.municipio, año: comp.año, monto_Aprobado: comp.monto_Aprobado]
        }
        jsonMap.cant = list.size()

        jsonMap.sum = sum
        render jsonMap as JSON
    }
/*
    def show(Long id) {
        respond proyectoMexicaliService.get(id)
    }

    def create() {
        respond new ProyectoMexicali(params)
    }

    def save(ProyectoMexicali proyectoMexicali) {
        if (proyectoMexicali == null) {
            notFound()
            return
        }

        try {
            proyectoMexicaliService.save(proyectoMexicali)
        } catch (ValidationException e) {
            respond proyectoMexicali.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'proyectoMexicali.label', default: 'ProyectoMexicali'), proyectoMexicali.id])
                redirect proyectoMexicali
            }
            '*' { respond proyectoMexicali, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond proyectoMexicaliService.get(id)
    }

    def update(ProyectoMexicali proyectoMexicali) {
        if (proyectoMexicali == null) {
            notFound()
            return
        }

        try {
            proyectoMexicaliService.save(proyectoMexicali)
        } catch (ValidationException e) {
            respond proyectoMexicali.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'proyectoMexicali.label', default: 'ProyectoMexicali'), proyectoMexicali.id])
                redirect proyectoMexicali
            }
            '*'{ respond proyectoMexicali, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        proyectoMexicaliService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'proyectoMexicali.label', default: 'ProyectoMexicali'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'proyectoMexicali.label', default: 'ProyectoMexicali'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
    */
}
