module fantasy.football.model {
    exports com.fantasy.football.model;
    exports com.fantasy.football.servlet.controller;
    exports com.fantasy.football.autoconfigure to spring.beans;

    opens com.fantasy.football.envers to org.hibernate.orm.core;
    opens com.fantasy.football.model to org.hibernate.orm.core;

    requires org.hibernate.orm.envers;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires jakarta.validation;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.orm;
    requires spring.beans;
    requires io.swagger.v3.oas.annotations;
    requires spring.web;
    requires jakarta.annotation;
}