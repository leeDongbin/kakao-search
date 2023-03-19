package biz.kakao.external.client;

import biz.kakao.external.client.kakao.api.KakaoSearchClient;
import biz.kakao.external.client.kakao.api.SearchApi;
import biz.kakao.external.client.kakao.code.Sort;
import biz.kakao.external.client.kakao.config.ExternalApiConfig;
import biz.kakao.external.client.kakao.dto.KakaoApiResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@ActiveProfiles({"local"})
@SpringBootTest(classes = {ExternalApiConfig.class, KakaoSearchClient.class})
public class KakaoSearchClientTest {

    @Autowired
    private SearchApi kakaoSearchClient;

    @Test
    public void testDefaultSearchBlogStatusOk() {
        String query = "이효리";
        Sort sort = Sort.RECENCY;

        KakaoApiResponse response = kakaoSearchClient.searchBlog(query, sort);

        assertNotNull(response);
    }

    @Test
    public void testSearchBlogPageSize20() {
        String query = "권상우";
        Sort sort = Sort.RECENCY;

        KakaoApiResponse response = kakaoSearchClient.searchBlog(query, sort, 1, 20);

        assertNotNull(response);
        assertEquals(20, response.getDocuments().size());
    }

    @Test(expected = RuntimeException.class)
    public void testSearchBlogErrorMissingParams() {
        kakaoSearchClient.searchBlog("", Sort.ACCURACY);
    }

}
