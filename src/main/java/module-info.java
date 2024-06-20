module fantasy.football.model {
    exports com.fantasy.football.model;
    exports com.fantasy.football.servlet.controller;

    requires jakarta.validation;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.beans;
    requires io.swagger.v3.oas.annotations;
    requires spring.web;
    requires jakarta.annotation;
    requires spring.core;
    requires reactor.core;
	requires spring.data.relational;
	requires spring.data.commons;
}