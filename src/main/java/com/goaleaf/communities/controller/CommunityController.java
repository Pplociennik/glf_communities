package com.goaleaf.communities.controller;

import com.github.pplociennik.commons.dto.ResponseDto;
import com.goaleaf.communities.dto.CommunityDto;
import com.goaleaf.communities.dto.CreateCommunityDto;
import com.goaleaf.communities.service.CommunityService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * A controller being the API for managing communities.
 *
 * @author Created by: Pplociennik at 23.03.2024 15:51
 */
@RestController
@RequestMapping( path = "/api/communities" )
@AllArgsConstructor
class CommunityController {

    private final CommunityService communityService;


    @PostMapping( path = "/create" )
    ResponseEntity< ResponseDto > createCommunity( @RequestBody CreateCommunityDto aCreateCommunityDto ) {
        communityService.createNewCommunity( aCreateCommunityDto );
        return ResponseEntity
                .status( HttpStatus.CREATED )
                .body( new ResponseDto( "201", "Community created successfully." ) );
    }

    @GetMapping( "/community" )
    ResponseEntity< CommunityDto > fetchCommunity( @RequestParam String aIdentifier ) {
        CommunityDto community = communityService.getCommunityById( aIdentifier );
        return ResponseEntity
                .status( HttpStatus.OK )
                .body( community );
    }

    @PutMapping( path = "/update" )
    ResponseEntity< ResponseDto > updateCommunity( @RequestBody CommunityDto aCommunityDto ) {
        communityService.updateCommunity( aCommunityDto );
        return ResponseEntity
                .status( HttpStatus.OK )
                .body( new ResponseDto( "200", "Community updated successfully." ) );
    }

    @DeleteMapping( path = "/delete" )
    ResponseEntity< ResponseDto > deleteCommunity( @RequestParam String aIdentifier ) {
        communityService.deleteCommunity( aIdentifier );
        return ResponseEntity
                .status( HttpStatus.OK )
                .body( new ResponseDto( "200", "Community deleted successfully." ) );
    }


}
