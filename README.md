# 추가 기능
* swagger 추가 - http://localhost:8080/swagger-ui.html
* 검색 등록 API 추가
```
1. 동시성 이슈로 인하여 추가하였습니다.
2. API Flow는 아래와 같습니다.
   1) 블로그 검색 API 
   2) 검색 등록 API 
   3) 스케줄 처리 (10초) 
      > 검색 테이블 > 인기 검색 테이블 Insert 
       (키워드에 따른 검색 횟수 증가) 
```
# Jar 파일 깃 주소
* https://github.com/leeDongbin/kakao-search-jar
```
api.jar 실행시 profile은 local로 실행해야 됩니다.
java -jar -Dspring.profiles.active=local api-1.0.0.jar
```
# Jar 다운로드 주소
```
https://github.com/leeDongbin/kakao-search-jar/raw/master/api-1.0.0.jar
```
