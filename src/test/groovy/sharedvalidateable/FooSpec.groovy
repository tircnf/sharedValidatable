package sharedvalidateable

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class FooSpec extends Specification  {

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
