package isr

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ProyectoMexicaliServiceSpec extends Specification {

    ProyectoMexicaliService proyectoMexicaliService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ProyectoMexicali(...).save(flush: true, failOnError: true)
        //new ProyectoMexicali(...).save(flush: true, failOnError: true)
        //ProyectoMexicali proyectoMexicali = new ProyectoMexicali(...).save(flush: true, failOnError: true)
        //new ProyectoMexicali(...).save(flush: true, failOnError: true)
        //new ProyectoMexicali(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //proyectoMexicali.id
    }

    void "test get"() {
        setupData()

        expect:
        proyectoMexicaliService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ProyectoMexicali> proyectoMexicaliList = proyectoMexicaliService.list(max: 2, offset: 2)

        then:
        proyectoMexicaliList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        proyectoMexicaliService.count() == 5
    }

    void "test delete"() {
        Long proyectoMexicaliId = setupData()

        expect:
        proyectoMexicaliService.count() == 5

        when:
        proyectoMexicaliService.delete(proyectoMexicaliId)
        sessionFactory.currentSession.flush()

        then:
        proyectoMexicaliService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ProyectoMexicali proyectoMexicali = new ProyectoMexicali()
        proyectoMexicaliService.save(proyectoMexicali)

        then:
        proyectoMexicali.id != null
    }
}
