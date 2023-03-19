package biz.kakao.search.api.search.dto;

import biz.kakao.external.client.kakao.code.Sort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@ApiModel(description = "카카오 블로그 검색 조건")
public class KakaoBlogSearchOption {

    @ApiModelProperty(value = "검색명")
    private String query;

    @ApiModelProperty(value = "Sorting")
    private Sort sort;

}
