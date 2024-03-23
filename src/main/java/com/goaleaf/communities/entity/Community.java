package com.goaleaf.communities.entity;

import com.github.pplociennik.commons.persistence.ModifiableDataEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

/**
 * An entity being a representation of the COMMUNITIES database table.
 *
 * @author Created by: Pplociennik at 22.03.2024 23:28
 */
@EqualsAndHashCode( callSuper = true )
@Entity
@Table( name = "COMMUNITIES" )
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Community extends ModifiableDataEntity {

    @Id
    @UuidGenerator
    @Column( name = "ID", nullable = false, unique = true, updatable = false )
    private String id;

    @Column( name = "TITLE" )
    private String title;
}
