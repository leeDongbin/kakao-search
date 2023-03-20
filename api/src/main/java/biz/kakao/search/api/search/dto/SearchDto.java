package biz.kakao.search.api.search.dto;

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
@ApiModel(description = "검색")
public class SearchDto {

    @ApiModelProperty(value = "검색어")
    private String searchWord;

}
