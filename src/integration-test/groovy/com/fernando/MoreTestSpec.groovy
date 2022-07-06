package com.fernando

import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration

import spock.lang.Specification

@Integration
@Rollback
class MoreTestSpec extends Specification {


    void "usuario possui acesso ao sistema GISE"() {
        given:
            Long total = User.count
        when: 'Não é passado nenhum paramero'
        then: 'Sem acesso ao sistema'
            total == 1

    }
}
