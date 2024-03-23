package com.goaleaf.communities.map;

import com.goaleaf.communities.dto.CommunityDto;
import com.goaleaf.communities.dto.CreateCommunityDto;
import com.goaleaf.communities.entity.Community;

import java.util.UUID;

/**
 * A mapper related to the {@link com.goaleaf.communities.entity.Community} data.
 *
 * @author Created by: Pplociennik at 23.03.2024 14:49
 */
public class CommunityMapper {

    /**
     * Creates and returns data mapped to the {@link Community} typed object.
     *
     * @param aCommunityDto
     *         a community dto data.
     * @return the {@link Community} typed object.
     */
    public static Community mapToEntity( CommunityDto aCommunityDto ) {
        return aCommunityDto == null
                ? null
                : new Community( aCommunityDto.getId(), aCommunityDto.getTitle() );
    }

    /**
     * Creates and returns data mapped to the {@link Community} typed object.
     *
     * @param aCreateCommunityDto
     *         a data necessary for the community creation process.
     * @return the {@link Community} typed object.
     */
    public static Community mapToEntity( CreateCommunityDto aCreateCommunityDto ) {
        return aCreateCommunityDto == null
                ? null
                : new Community( UUID.randomUUID().toString(), aCreateCommunityDto.getTitle() );
    }

    /**
     * Creates and returns data mapped to the {@link CommunityDto} typed object.
     *
     * @param aCommunity
     *         a community entity data.
     * @return the {@link CommunityDto} typed object.
     */
    public static CommunityDto mapToDto( Community aCommunity ) {
        return aCommunity == null
                ? null
                : new CommunityDto( aCommunity.getId(), aCommunity.getTitle() );
    }
}
