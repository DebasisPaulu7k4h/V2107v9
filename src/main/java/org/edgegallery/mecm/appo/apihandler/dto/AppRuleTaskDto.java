package org.edgegallery.mecm.appo.apihandler.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

@Validated
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public final class AppRuleTaskDto {

    private String taskId;

    private String appInstanceId;

    private String detailed;

    private String configResult;
}
