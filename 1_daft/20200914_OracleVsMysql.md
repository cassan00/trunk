
# ORACLE VS MYSLQ

# 대소문자의 구분
 - MYsql은 대소문자를 구분하지 않는다
 => 이거는 서버 옵션에 따라 설정 가능


# 2. 오라클에서는 커서를 리턴할 수 있는데 mysql은 그런기능이 없다.
 - mybatis에서 resultType or resultMap로 바로 받으면 된다.
 - 프로시져에서 실행된 쿼리의 결과를 받을 수 있다.
 - 두개의 실행결과를 받고 싶으면 union으로 합친다. 이때 두쿼리의 메타정보를 결과의 첫줄에 삽입한다
# DECLARE VS SET @temp
 - DECLARE 는 PLSQL 블록 안에서만 사용할 수 있다
 - SET 은 내장변수로 SQL 블록에서 사용할 수 있음 (MYSQL 에서만 지원) << 확인요청

# ROWNUM 없음
 -

# default값 생성시 오라클은 function을 넣을 수 있다. 하지만 mysql은 안된다.
```
진짜로?
```
# MYSQL 는 스키마의 개념이 없음. 계정명 == DB명
 - MYSQL 의 경우 : 테이블스페이스 > 계정명 == DB명  (그럼 SYS db는?)
 - 오라클의 경우 : 테이블스페이지 > 스키마 > 계정명 > DB명  1스키마에 멀티DB  << `확인요청`


# 출처
```
https://m.blog.naver.com/PostView.nhn?blogId=3yong2ya&logNo=220906443461&proxyReferer=https:%2F%2Fwww.google.com%2F
```

# WINDOW 함수절을 제공하지 아니함
