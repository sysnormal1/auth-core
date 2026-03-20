package com.sysnormal.security.auth.auth_core.dtos;

import lombok.Getter;
import lombok.Setter;

/**
 * the agent dto
 *
 * @author aalencarvz1
 * @version 1.0.0
 */
@Getter
@Setter
public class AgentAuthDto {
    private Long systemId = null;
    private Long accessProfileId = null;
    private Long agentId = null;
    private Long identifierTypeId = null;//IdentifierType.EMAIL_ID;
    private String identifier = null;
    private String email = null;
    private String password = null;
    private Long expiration = null;
    private String token = null;
    private String passwordChangeInterfacePath = null;
    private String code = null;
    private String redirectUri = null;
}