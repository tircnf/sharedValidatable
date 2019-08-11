package sharedvalidateable

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.*
import spock.lang.Specification

@Integration
@Rollback
class FooIntegrationSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "can't validate"() {
        given:"a new foo"
        Foo f=new Foo()
        f.validate()

        expect:
        f.errors.getFieldError("name").codes.contains("junk")
    }
}
