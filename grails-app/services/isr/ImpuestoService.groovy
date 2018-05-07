package isr

import grails.gorm.services.Service

@Service(Impuesto)
interface ImpuestoService {

    Impuesto get(Serializable id)

    List<Impuesto> list(Map args)

    Long count()

    void delete(Serializable id)

    Impuesto save(Impuesto impuesto)

}