package biz.kakao.search.api.search.config;

import biz.kakao.external.client.kakao.config.ExternalApiConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        ExternalApiConfig.class
})
public class ApiWebMvcConfig {

}
