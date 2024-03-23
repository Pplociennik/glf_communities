package com.goaleaf.communities.dto;

import com.github.pplociennik.commons.dto.BaseAbstractExtendableDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * A data transfer object being used to transfer data necessary during the community creation process.
 *
 * @author Created by: Pplociennik at 23.03.2024 14:54
 */
@Schema(
        name = "CreateCommunity Data Transfer Object",
        description = "A representation of the data necessary for the new Community creation process." )
@Getter
@EqualsAndHashCode( callSuper = true )
public class CreateCommunityDto extends BaseAbstractExtendableDto {

    @Schema(
            description = "A title of the community.",
            example = "Test Community." )
    private String title;
}
