package com.example.demo.mapper.typehandler;

import org.apache.ibatis.type.TypeHandler;

import lombok.extern.slf4j.Slf4j;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.UUID;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.JdbcType; 

@MappedTypes(UUID.class)
@Slf4j
public class UuidTypeHandler implements TypeHandler<UUID> {

    @Override
    public void setParameter(java.sql.PreparedStatement ps, int i, UUID parameter, org.apache.ibatis.type.JdbcType jdbcType) throws java.sql.SQLException {
        if (parameter != null) {
            ps.setString(i, parameter.toString());
        } else {
            ps.setNull(i, java.sql.Types.VARCHAR);
        }
    }

    @Override
    public UUID getResult(java.sql.ResultSet rs, String columnName) throws java.sql.SQLException {
        String value = rs.getString(columnName);
        return value != null ? UUID.fromString(value) : null;
    }

    @Override
    public UUID getResult(java.sql.ResultSet rs, int columnIndex) throws java.sql.SQLException {
        String value = rs.getString(columnIndex);
        return value != null ? UUID.fromString(value) : null;
    }

    @Override
    public UUID getResult(java.sql.CallableStatement cs, int columnIndex) throws java.sql.SQLException {
        String value = cs.getString(columnIndex);
        return value != null ? UUID.fromString(value) : null;
    }

}
