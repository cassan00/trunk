



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

# URL, URI 차이
String	getRequestURI()
Returns the part of this request's URL from the protocol name up to the query string in the first line of the HTTP request.
StringBuffer	getRequestURL()
Reconstructs the URL the client used to make the request.
