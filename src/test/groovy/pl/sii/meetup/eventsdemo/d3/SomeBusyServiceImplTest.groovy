package pl.sii.meetup.eventsdemo.d3

import org.springframework.context.ApplicationEventPublisher
import spock.lang.Specification

class SomeBusyServiceImplTest extends Specification {

    def "When job is done JobDoneCustomEvent with requestId should be sent"() {
        given:
        def eventPublisherMock = Mock( ApplicationEventPublisher )
        def someBusyServiceImpl = new SomeBusyServiceImpl()
        someBusyServiceImpl.setApplicationEventPublisher( eventPublisherMock )

        when:
        someBusyServiceImpl.doWork( 5 )

        then:
        1 * eventPublisherMock.publishEvent( ( JobDoneCustomEvent ) _ ) >> {}
    }
}
