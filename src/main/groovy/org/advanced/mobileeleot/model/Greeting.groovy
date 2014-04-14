package org.advanced.mobileeleot.model

/**
 * Created with IntelliJ IDEA.
 * User: wsantasiero
 * Date: 4/13/14
 * Time: 6:08 PM
 * To change this template use File | Settings | File Templates.
 */
class Greeting {
    def id
    def content

    Greeting(id, content){
        this.id=id
        this.content=content
    }

    def getId() {
        return id
    }

    void setId(id) {
        this.id = id
    }

    def getContent() {
        return content
    }

    void setContent(content) {
        this.content = content
    }
}
