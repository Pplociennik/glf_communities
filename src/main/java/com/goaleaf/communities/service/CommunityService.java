package com.goaleaf.communities.service;

import com.goaleaf.communities.dto.CommunityDto;
import com.goaleaf.communities.dto.CreateCommunityDto;
import org.springframework.lang.NonNull;

/**
 * A service providing functionalities related to communities.
 *
 * @author Created by: Pplociennik at 23.03.2024 14:40
 */
public interface CommunityService {

    /**
     * Creates a new community.
     *
     * @param aDto
     *         data necessary during the community creation process.
     * @return the newly created community.
     */
    CommunityDto createNewCommunity( @NonNull CreateCommunityDto aDto );

    /**
     * Returns the community with the specified title.
     *
     * @param aId
     *         an identifier of the community.
     * @return a community data.
     */
    CommunityDto getCommunityById( @NonNull String aId );

    /**
     * Updates the community.
     *
     * @param aCommunityDto
     *         the new community data.
     * @return the modified community.
     */
    CommunityDto updateCommunity( @NonNull CommunityDto aCommunityDto );

    /**
     * Deletes a community with the specified identifier from database.
     *
     * @param aId
     *         the identifier of the community to be deleted.
     */
    void deleteCommunity( @NonNull String aId );


}
