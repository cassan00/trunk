



+ tibero Plan : Action > Current Plan (SYS 계정이여야할 수 있음) w



# 2020.06.08 init -----------------------------------

0. 오라클 like full scan?
http://www.dba-oracle.com/oracle_tips_like_sql_index.htm
```
Because standard Oracle cannot index into a large column, there 'like' queries cause full-table scans, and Oracle must examine every row in the table, even when the result set is very small.  These unnecessary full-table scans are a problem:
```

1. 각 DBMS 별 port, serviceName-> sid(DB-name: System Identifier 명의 약자로 데이터베이스를 식별함에 있어 고유한)
최근에는 SID로 직접 기술하여 접근하는 것보다는 service name 을 tns 에 기술하여 사용.

서비스명 ?
인스턴스명 ?
데이터베이스 명 (오라클에서는 SID, MYSQL에서는 )
SID : 오라클에서는 고유 DB명칭이 SID 약어가 된다.
;
```
Oracle : 1521        -- https://docs.oracle.com/cd/B19306_01/install.102/b25293/app_port.htm
Mysql(Maria) : 3306
MSSQL : 1433
Tibero : 8629
tomcat : 8080

```
 + MySQL Orcale 차이 : https://hue9010.github.io/db/mysql_schema/
 + 오라클 인스턴스 데이터베이스 비교 : https://srzero.tistory.com/entry/Oracle-%EC%9A%A9%EC%96%B4-Instance-VS-Database
 + 오라클 sid : http://blog.naver.com/hea1920/10105980947
 + MS-SQL sid : https://androiddev.tistory.com/4 https://mozi.tistory.com/302

2. wireSHak
https://m.blog.naver.com/harry5313/221413016102

2-1. HTTp http://blog.naver.com/PostView.nhn?blogId=dmbs335&logNo=10174018152



3. DB OBJT
4. 소스트리 사용법
5. 웹 페이지 로딩 순서 (웹엔진)
- https://jeong-pro.tistory.com/90
6. 상속 VO

7. CLOB 타입을 SPRING 으로 할 수 없는 이유
 => CLOB 은 레퍼런스 타입
 https://sites.google.com/site/smcgbu/home/gongbu-iyagi/hyangsangdoengaegchelob
 http://www.gnujava.com/board/article_view.jsp?article_no=1459&menu_cd=30&board_no=17&table_cd=EPAR06&table_no=06
```
com.tmax.tibero.jdbc.TbClob content = (com.tmax.tibero.jdbc.TbClob) detailMap.get("CNSLT_CN");
		if(content != null){
			StringBuffer sb = new StringBuffer();
			try {
				Reader reader = content.getCharacterStream();
				BufferedReader br = new BufferedReader(reader);

				String line = "";
				while ((line = br.readLine()) != null) {
					sb.append(line+"\r\n");
				}
				br.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
```
tochar 로 하게되면 x
https://tomining.tistory.com/95
\

8. DB object


9. spring json


10. IP request
https://www.lesstif.com/java/spring-client-ip-18220218.html

11. 이클립스 내에서 확인가능한 tomcat Server 내부파일의 용도

12. ssl : https://offbyone.tistory.com/274
13. sql 실행순서

20. jdbc?
21. 오라클 복구
22. TCP Protocol   
23. 톰캣 서버 폴더구조
  - WEB(apache) vs WAS(jboss)
24. documnet ready
```
$(document).ready()는 DOM (Document Object Model) 이 load 된 후에 즉시 실행 되게 된다.

출처: https://aljjabaegi.tistory.com/43 [알짜배기 프로그래머]

DOM load => $(document).ready() => <body onload> => image, resource load =>  $(window).load()

```
https://blog.devari.kr/2017/publishing/ready-document-window-onload



25. ``` *.prop , *.attri but```
https://ojava.tistory.com/133




26. pollyfill
```
https://jjester.tistory.com/17
 - MDN(Mozilla Developer Network) 웹 문서는 웹 표준과 모질라 프로젝트에 대한 개발 문서들이 담긴 모질라의 공식 웹사이트이다  MDN 웹 문서는 개발자 커뮤니티가 관리하는 위키로, HTML, 자바스크립트, CSS, 웹 API, MathML 등 다양한 주제의 웹 개발 자료를 담고 있다.
 -

```


27. JS >>  
```
 숫자로 치환할 수 있을때 숫자표기(num), 없을때 0 표기
 비트연산자인데 어떻게 이것이 가능하지?
```


28. JS : repaat(n)
```
str.repeat(10) // 해당문자열을 10 회 반복
```


# URL, URI 차이
String	getRequestURI()
Returns the part of this request's URL from the protocol name up to the query string in the first line of the HTTP request.
StringBuffer	getRequestURL()
Reconstructs the URL the client used to make the request.




29. 오라클 한글 3 byte
https://plakia.tistory.com/432
utf8 - 3byte, 한글정렬 가능




30. dense_rank()
https://m.blog.naver.com/gglee0127/221318160003


31. # fractional <> decimal <> numeric

- https://ikeyword.tistory.com/entry/DB-%EA%B8%B0%EB%B3%B8-%EB%8D%B0%EC%9D%B4%ED%84%B0-%ED%83%80%EC%9E%85-%EB%82%A0%EC%A7%9C-%EC%8B%9C%EA%B0%84-DATE-TIMESTAMP
- https://docs.oracle.com/cd/B28359_01/server.111/b28286/sql_elements001.htm#SQLRF0021



32. INTERVAL_YEAR
https://farmerkyh.tistory.com/category/%28DB%29%20Oracle%20%ED%8A%9C%EB%8B%9D



33. xX mM lL 과 일치하는 처리 명령 대상은 허용되지 않습니다.



34. 구체화 뷰
https://ko.wikipedia.org/wiki/%EA%B5%AC%EC%B2%B4%ED%99%94_%EB%B7%B0
https://myjamong.tistory.com/220?category=928965
