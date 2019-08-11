package sharedvalidateable

import grails.test.hibernate.HibernateSpec

class FooHibernateSpec extends HibernateSpec {

    void "can't validate"() {
        given:"a new foo"
        Foo f=new Foo()
        f.validate()

        expect:
        f.errors.getFieldError("name").codes.contains("junk")
    }
}
