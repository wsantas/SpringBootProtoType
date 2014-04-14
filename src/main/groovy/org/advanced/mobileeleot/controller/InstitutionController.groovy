package org.advanced.mobileeleot.controller

import org.advanced.mobileeleot.model.Greeting
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

/**
 * Created with IntelliJ IDEA.
 * User: wsantasiero
 * Date: 4/13/14
 * Time: 4:10 PM
 * To change this template use File | Settings | File Templates.
 */
@RestController
class InstitutionController {

    @RequestMapping("/")
    def @ResponseBody index() {
        return new Greeting(2,"This is a test");
    }
}
