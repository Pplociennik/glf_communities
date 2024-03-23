package com.goaleaf.communities.service.impl;

import com.github.pplociennik.commons.exc.ResourceNotFoundException;
import com.goaleaf.communities.dto.CommunityDto;
import com.goaleaf.communities.dto.CreateCommunityDto;
import com.goaleaf.communities.entity.Community;
import com.goaleaf.communities.map.CommunityMapper;
import com.goaleaf.communities.repository.CommunityRepository;
import com.goaleaf.communities.service.CommunityService;
import lombok.AllArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.github.pplociennik.commons.utility.CustomObjects.requireNonEmpty;
import static java.util.Objects.requireNonNull;

/**
 * An implementation of the {@link CommunityService}.
 *
 * @author Created by: Pplociennik at 23.03.2024 15:22
 */
@Service
@AllArgsConstructor
public class CommunityServiceImpl implements CommunityService {

    private CommunityRepository communityRepository;

    /**
     * Creates a new community.
     *
     * @param aDto
     *         data necessary during the community creation process.
     * @return the newly created community.
     */
    @Override
    public CommunityDto createNewCommunity( @NonNull CreateCommunityDto aDto ) {
        requireNonNull( aDto );
        Community communityToBeCreated = CommunityMapper.mapToEntity( aDto );
        Community savedCommunity = communityRepository.save( communityToBeCreated );

        return CommunityMapper.mapToDto( savedCommunity );
    }

    /**
     * Returns the community with the specified title.
     *
     * @param aId
     *         an identifier of the community.
     * @return a community data.
     */
    @Override
    public CommunityDto getCommunityById( @NonNull String aId ) {
        requireNonEmpty( aId );

        Community community = getCommunity( aId );

        return CommunityMapper.mapToDto( community );
    }

    /**
     * Updates the community.
     *
     * @param aCommunityDto
     *         the new community data.
     * @return the modified community.
     */
    @Override
    public CommunityDto updateCommunity( @NonNull CommunityDto aCommunityDto ) {
        requireNonNull( aCommunityDto );

        Community communityFromDatabase = getCommunity( aCommunityDto.getId() );

        communityFromDatabase.setTitle( aCommunityDto.getTitle() );
        communityRepository.save( communityFromDatabase );

        return CommunityMapper.mapToDto( communityFromDatabase );
    }

    /**
     * Deletes a community with the specified identifier from database.
     *
     * @param aId
     *         the identifier of the community to be deleted.
     */
    @Override
    public void deleteCommunity( @NonNull String aId ) {
        requireNonNull( aId );

        Community community = getCommunity( aId );
        communityRepository.delete( community );
    }

    private Community getCommunity( String aId ) {
        Optional< Community > optionalCommunity = communityRepository.findById( aId );
        return optionalCommunity.orElseThrow(
                () -> new ResourceNotFoundException( Community.class.getName(), "ID", aId )
        );
    }
}
