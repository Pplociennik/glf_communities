package com.goaleaf.communities.controller;

import com.github.pplociennik.commons.exc.GlobalExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * A controller advice being the global exception handler for the {@link CommunityController}.
 *
 * @author Created by: Pplociennik at 23.03.2024 16:54
 */
@ControllerAdvice( assignableTypes = { CommunityController.class } )
class CommunityControllerAdvise extends GlobalExceptionHandler {
}
