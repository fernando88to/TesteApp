package com.fernando

import grails.gorm.transactions.Transactional

class BootStrap {

    @Transactional
    void config() {

        User user = User.findByUsername('123')
        if (!user) {
            user =  new  User()
            user.username = "123"
            user.password = "123"
            user.save(flush:true)
        }
    }
    def init = { servletContext ->
        config()

    }
    def destroy = {
    }
}
