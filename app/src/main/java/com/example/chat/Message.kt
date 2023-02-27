package com.example.chat

class Message { // this message model
    var message: String? = null
    var senderId: String? = null

    constructor(){}

    constructor(message: String?, senderid: String?){
        this.message = message
        this.senderId = senderid
    }

}