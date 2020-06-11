



# 2020.06.08 init -----------------------------------
1. 각 DBMS 별 port, sid(DB-name: System Identifier 명의 약자로 데이터베이스를 식별함에 있어 고유한)
```
Oracle : 1521 / ?       -- https://docs.oracle.com/cd/B19306_01/install.102/b25293/app_port.htm
Mysql(Maria) : 3306
MSSQL : 1433
Tibero : 8629 / tibero

```
 + MySQL Orcale 차이 : https://hue9010.github.io/db/mysql_schema/
 + 오라클 인스턴스 데이터베이스 비교 : https://srzero.tistory.com/entry/Oracle-%EC%9A%A9%EC%96%B4-Instance-VS-Database
 + 오라클 sid : http://blog.naver.com/hea1920/10105980947
 + MS-SQL sid : https://androiddev.tistory.com/4 https://mozi.tistory.com/302

  + TCP Protocol   
  + jdbc?
  + 오라클 복구
2. ip 관련처리
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

8. DB object


9. spring json


10. IP request
https://www.lesstif.com/java/spring-client-ip-18220218.html

11. 이클립스 내에서 확인가능한 tomcat Server 내부파일의 용도

12. ssl : https://offbyone.tistory.com/274


# URL, URI 차이
String	getRequestURI()
Returns the part of this request's URL from the protocol name up to the query string in the first line of the HTTP request.
StringBuffer	getRequestURL()
Reconstructs the URL the client used to make the request.
