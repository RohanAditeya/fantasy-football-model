module fantasy.football.model.main {

    requires com.fasterxml.jackson.annotation;
    requires jakarta.validation;
    requires io.swagger.v3.oas.annotations;
    requires jakarta.annotation;
    requires spring.data.commons;
    requires spring.data.relational;
    requires spring.web;
    requires spring.context;
    requires reactor.core;

    exports com.fantasy.football.dto;
    exports com.fantasy.football.model;
    exports com.fantasy.football.reactive.controller;
}