package com.fantasy.football.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Table;
import org.assertj.core.api.Assertions;
import org.springframework.core.annotation.AnnotationUtils;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public abstract class JpaRegistrarTestBase {
    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("fantasy-test");

    public abstract void isTablePresentTest ();

    protected <T extends Class<?>> void checkTableIsCreated (T entityClass) {
        try (EntityManager entityManager = this.entityManagerFactory.createEntityManager()) {
            Table tableAnnotation = Optional.ofNullable(AnnotationUtils.findAnnotation(entityClass, Table.class)).orElseThrow();
            List<Map<String, String>> allTables = entityManager.createNativeQuery("show tables", Map.class).getResultList();
            Assertions.assertThat(
                    allTables.stream()
                            .anyMatch(
                                    tableRecord -> tableRecord.get("table_name").equals(tableAnnotation.name())
                            )
            ).isTrue();
        }
    }
}