package biz.kakao.external.client.kakao.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "search.kakao-search-client")
public class ExternalApiProperties {

    private String rootUri;
    private String findBlogUriPath;
    private String authorName;
    private String authorValue;

    @Value("${external-client.connect-timeout:}")
    private long connectTimeout;

    @Value("${external-client.read-timeout:}")
    private long readTimeout;

}
