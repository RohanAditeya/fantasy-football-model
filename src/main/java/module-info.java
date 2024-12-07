module fantasy.football.model.main {

    requires com.fasterxml.jackson.annotation;
    requires jakarta.validation;
    requires io.swagger.v3.oas.annotations;
    requires jakarta.annotation;

    exports com.fantasy.football.dto;
    exports com.fantasy.football.model;
    exports com.fantasy.football.reactive.controller;
}