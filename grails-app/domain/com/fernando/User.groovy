package com.fernando

class User {
    Long id
    String username
    String password

    static constraints = {
        username nullable:false, blank:false
        password nullable:false, blank:false
    }
}
