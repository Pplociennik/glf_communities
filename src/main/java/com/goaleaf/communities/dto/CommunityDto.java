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
@EqualsAndHashCode( callSuper = true )
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommunityDto extends BaseAbstractExtendableDto {

    @Schema( description = "A unique identifier.", example = "1" )
    private String id;

    @Schema( description = "A title of the community.", example = "Test Community" )
    private String title;
}
