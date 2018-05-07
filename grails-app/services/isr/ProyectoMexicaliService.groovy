package isr

import grails.gorm.services.Service

@Service(ProyectoMexicali)
interface ProyectoMexicaliService {

    ProyectoMexicali get(Serializable id)

    List<ProyectoMexicali> list(Map args)

    Long count()

    void delete(Serializable id)

    ProyectoMexicali save(ProyectoMexicali proyectoMexicali)

}