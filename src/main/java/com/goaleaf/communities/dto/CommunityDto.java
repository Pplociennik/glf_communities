package com.goaleaf.communities.dto;

import com.github.pplociennik.commons.dto.BaseAbstractExtendableDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * A data transfer object being a representation of the {@link com.goaleaf.communities.entity.Community} entity.
 *
 * @author Created by: Pplociennik at 23.03.2024 14:41
 */
@Schema(
        name = "Community Data Transfer Object",
        description = "A representation of the Community object data." )
@EqualsAndHashCode( callSuper = true )
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommunityDto extends BaseAbstractExtendableDto {

    @Schema(
            description = "A unique identifier.",
            example = "5e210740-b339-4e33-b46d-d9d46a188635" )
    private String id;

    @Schema(
            description = "A title of the community.",
            example = "Test Community" )
    private String title;
}
