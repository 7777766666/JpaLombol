package com.example.jpalombol.repository;

import org.postgresql.jdbc2.optional.ConnectionPool;

public class UserRepository {

    private final ConnectionPool connectionPool;


    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
