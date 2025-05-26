package io.cavia.homenet.repository;

import io.cavia.homenet.domain.ApiCredential;
import io.cavia.homenet.domain.CredentialType;
import jakarta.persistence.EntityManager;

import java.util.Map;
import java.util.stream.Collectors;

public class ApiOAuthRepository {

    private final EntityManager em;

    public ApiOAuthRepository(EntityManager em) {
        this.em = em;
    }

    public ApiCredential save(ApiCredential apiCredential) {
        em.persist(apiCredential);
        return apiCredential;
    }

    public Map<CredentialType, ApiCredential> findAllByCredentialOwner(String credentialOwner) {
        return em.createQuery("SELECT ac " +
                    "FROM ApiCredential ac " +
                    "WHERE ac.credentialOwner = :credentialOwner",
                ApiCredential.class)
            .setParameter("credentialOwner", credentialOwner)
            .getResultStream()
            .collect(Collectors.toMap(o -> o.getCredentialType(), o -> o));
    }
}
