//package biz.kakao.search.api;
//
//import biz.kakao.common.generator.ApiResponseGenerator;
//import biz.kakao.common.response.ApiResponse;
//import biz.kakao.common.response.PageResponse;
//import biz.kakao.common.support.PagingOption;
//import biz.kakao.external.client.kakao.dto.Documents;
//import biz.kakao.search.api.search.dto.KakaoBlogSearchOption;
//import biz.kakao.search.api.search.service.SearchService;
//import io.swagger.annotations.ApiOperation;
//import lombok.AllArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.validation.Valid;
//
//@AllArgsConstructor
//@RestController
//@RequestMapping("/v1/searches")
//public class SearchControllerTest {
//
//    private final SearchService searchService;
//
//    @ApiOperation(tags = "블로그 검색 API", value = "주문 회원 정보", notes = "단일 회원 주문 정보를 노출합니다.")
//    @GetMapping(value = "/blogs")
//    public ResponseEntity<ApiResponse<PageResponse<Documents>>> searchBlogList(@Valid @ModelAttribute KakaoBlogSearchOption searchOption,
//                                                                       @ModelAttribute PagingOption pagingOption){
//        PageResponse<Documents> pageResponse = searchService.searchBlogList(searchOption, pagingOption);
//        ApiResponse<PageResponse<Documents>> apiResponse = ApiResponseGenerator.success(pageResponse);
//        return ResponseEntity.ok(apiResponse);
//    }
//
//}
