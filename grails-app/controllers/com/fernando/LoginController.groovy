package com.fernando

import grails.gorm.transactions.Transactional


@Transactional
class LoginController {

    def index() {}


    def teste (){
        render User.count
    }
    def login() {
        String username = params.username
        String password = params.password

        User user = User.findByUsernameAndPassword(username, password)

        if (user) {
            render "Logged"
            return
        }

        render "Not logged in"
    }
}
