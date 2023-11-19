//file:noinspection ClassJavadoc
package com.fernando

import groovy.transform.CompileStatic
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path('/hellog')
@CompileStatic
class IndexResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String hello() {
        return 'Hello from RESTEasy Reactive 3'
    }

}
