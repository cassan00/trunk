


# JSESSIONID

 - Tomcat 컨테이너에서 세션을 유지하기 위해 발급하는 키. 내부적으로 key-velue 타입.
 - jessiioID는 세션을 구현한 key 에 해당
 - Tomcat 은 클라이언트에게 JSESSIONID 를 발급해 세션을 유지할 수 있게 한다.
 - SesstionID 구현클래스 StandardSessionIdGenerator (org.apache.catalina.util) 을 보면
   16 byte의 랜덤바이트 문자열을 구성한후 route와 jvmRoute 정보를 '.' 문자뒤에 포함
 - 유지범위 : 동일한 Full 도메인 (서브도메인이 다를 경우 쿠키가 유지되지 않음, 포트번호는 무관)
 - 2개의 컨테이너사용시 세션 유지 불가. 세션 클러스터 등의 환경 구축이 필요   

# 크롬 개발자 도구
 Network > Cookie  항목에서 찾을 수 있다.
 - JSESSIONID : 암호화된 세션ID.루트 정보
 ex) .100, .101 서버를 레이드 해 각서버에 Tomcat 컨테이너를 구축했을때
   xfqwrnjzn@nwifiq.JVM루트명 식으로 발생해 몇번 서버에 붙었는지 알수있다.


```
/* 각 사이트별 쿠키 분석 */
/* 당연한 이야기지만 Tomcat 구조에 올라가 있어야 JSESSION 이 발생한다. 또한 페이지에서 세션을 발생시지키 않는 경우도 있음 */


# 국가법령 (https://www.law.go.kr/)
* https://www.law.go.kr/
 - JSESSIONID : bMzz5aP-6HauG7mF9eM1dxDW.LSW6
 - _ga : GA1.3.1303763083.1607662200
 - _gid : GA1.3.732327222.1607662200
 - _gat : 1

# 국세청 (https://www.hometax.go.kr/websquare/websquare.html?w2xPath=/ui/pp/index.xml)
* https://www.hometax.go.kr/permission.do?screenId=index
 - TXPPsessionID : lxA1cVpq3GsJMXrbEChxC8zEKNV81Z8XSBkhPZ2ZCeE8wla5VAfjQGxZbp2A9Cme.tupiwsp28_servlet_TXPP02

# 국민신문고 (https://www.epeople.go.kr/index.jsp)
* index.jsp
 - JESSIONID : Vhii7S1bWfDRr3Af03RSicdk.euser43

# 빅데이터센터 (https://kbig.kr/portal/kbig)
* kbig
 - JESSIONID : 320C16EC60DE163F207C53D0D3183B11
 - _ga : GA1.2.1033370216.1607646061
 - _gid : GA1.2.1804281061.1607646061
 - _gat : 1

```

# 구글애널리틱스 쿠키
`_ga`, `_gid`, `_get` Cookie 가 발견될 경우 구글 애널리틱스가 적용되어 있음.
## 종류별 설정 (명칭/만료기한/설명)
- `_ga` :	2년	사용자 구분을 위해 사용
- `_gid` : 24시간	사용자 구분을 위해 사용
- `_gat` : 1분	요청률 조절을 위해 사용
- `AMP_TOKEN` :	30초 ~ 1년	(AMP 클라이언트 ID 서비스) 클라이언트 ID 조회를 위한 토큰

## 형식 설명
- GA1 : 구글 애널리틱스 쿠키 형식 버전을 의미. 현재는 1버전
- X	: 도메인의 깊이 (예: example.com은 2, sub.example.com은 3)
- YYYYYYYYYY	10자리 숫자. 랜덤 생성된 사용자별 ID(식별자)
- TTTTTTTTTT	10자리 숫자. 쿠키 생성 일시의 타임스탬프
- 보통 뒤의 20자리를 묶어 USERSESSIONID가 구성




# 참고링크
https://dmobi.tistory.com/136
https://pshcode.tistory.com/114
https://analyticsmarketing.co.kr/digital-analytics/google-analytics/1655/
