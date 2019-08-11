grails.gorm.default.constraints = {
    sharedConstraint(nullable: true, validator: {val ->
        return ['junk']
    })
}
