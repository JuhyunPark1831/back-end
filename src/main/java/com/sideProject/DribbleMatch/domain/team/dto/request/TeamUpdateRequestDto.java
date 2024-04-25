package com.sideProject.DribbleMatch.domain.team.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TeamUpdateRequestDto {
    @NotNull(message = "이름이 입력되지 않았습니다.")
    private String name;
    @NotNull(message = "지역이 입력되지 않았습니다.")
    private String region;
    @NotNull(message = "팀장 아이디가 입력되지 않았습니다.")
    private Long leaderId;

    @Builder
    public TeamUpdateRequestDto(String name, String region, Long leaderId) {
        this.name = name;
        this.region = region;
        this.leaderId = leaderId;
    }
}
