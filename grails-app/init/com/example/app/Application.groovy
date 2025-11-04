package com.example.app

import groovy.transform.CompileStatic

import io.micronaut.spring.boot.starter.EnableMicronaut

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

@CompileStatic
@EnableMicronaut
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}
