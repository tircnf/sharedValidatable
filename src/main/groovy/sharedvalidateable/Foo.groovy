package sharedvalidateable

import grails.validation.Validateable

class Foo implements Validateable {

    static constraints = {
        name shared: "sharedConstraint"
    }

    String name
}
