package isr

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ImpuestoServiceSpec extends Specification {

    ImpuestoService impuestoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Impuesto(...).save(flush: true, failOnError: true)
        //new Impuesto(...).save(flush: true, failOnError: true)
        //Impuesto impuesto = new Impuesto(...).save(flush: true, failOnError: true)
        //new Impuesto(...).save(flush: true, failOnError: true)
        //new Impuesto(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //impuesto.id
    }

    void "test get"() {
        setupData()

        expect:
        impuestoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Impuesto> impuestoList = impuestoService.list(max: 2, offset: 2)

        then:
        impuestoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        impuestoService.count() == 5
    }

    void "test delete"() {
        Long impuestoId = setupData()

        expect:
        impuestoService.count() == 5

        when:
        impuestoService.delete(impuestoId)
        sessionFactory.currentSession.flush()

        then:
        impuestoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Impuesto impuesto = new Impuesto()
        impuestoService.save(impuesto)

        then:
        impuesto.id != null
    }
}
