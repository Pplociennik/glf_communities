package com.goaleaf.communities.repository;

import com.goaleaf.communities.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

/**
 * A repository providing CRUD operations for the {@link Community} entity.
 *
 * @author Created by: Pplociennik at 22.03.2024 23:52
 */
public interface CommunityRepository extends JpaRepository< Community, Long > {

    /**
     * Gets the optional {@link Community} from the database if it exists and have the specified title.
     *
     * @param aId
     *         an identifier of the {@link Community} being searched.
     * @return the {@link Optional} containing the {@link Community} being searched if it exists or the empty one otherwise.
     */
    Optional< Community > findById( String aId );

    /**
     * Deletes the {@link Community} from the database.
     *
     * @param aCommunity
     *         the {@link Community} to be deleted.
     */
    void delete( Community aCommunity );

}
