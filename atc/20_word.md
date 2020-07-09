

# -----------
1. Extent
```
익스텐트는 파일 시스템에서 파일 용으로 예약 된 연속 스토리지 영역으로, 블록 번호 범위 또는 카운트 키 데이터 디바이스의 트랙으로 표시됩니다. 파일은 0 개 이상의 범위로 구성 될 수 있습니다. 하나의 파일 조각에는 하나의 익스텐트가 필요합니다.
```


2. RDMS / OODBMS / ORDBMS / MMDBMS

Relational database - 관계형
Object-oriented database - 객체 지향
Object-relational database - 객체 관계 : RDMS와 OODBMS (Object-Oriented Database) 사이의 중간 지점. RDBMS를 확장하여 광범위한 응용 프로그램 클래스를 지원하고 관계형 및 객체 지향 패러다임 사이의 브릿지를 작성하려고 시도
Main Memory Database - 메인 메모리 : DB 일부 또는 전체를 메인메모리에서 관리 (디스크접근 없음=> 고성능 트랜잭션 처리)
 단, 이때 MM 은 VM 과 다름
 - 메인메모리 데이터베이스(MMDB), 주기억장치 상주 데이터베이스(MRDB), 또 는 인-메모리 데이터베이스(IMDB)
 - -	기존의 실시간 시스템은 특정응용에 한정되도록 개발 됨으로써(ad-hoc designed system) 시스템의 범용성이 떨어질 뿐만 아니라 데이터베이스 관리의 개념이 희박 합니다.
-	산업 표준을 준수하는 프로그래밍 인터페이스, 트랜잭션의 실시간 처리 능력, 데이 터베이스 관리 시스템의 확장 가능한 구조 등을 동시에 만족시키는 데이터베이스 시스템이 아닙니다.
-	고객 지향적 요구 사항을 적시에 반영할 수 있는 유연한 구조 및 다른 응용 분야로 의 적용(customizing)이 어렵습니다. 즉, 특정 응용 분야에 한정됨으로써 시스템의 확장성, 가용성, 효율성이 매우 떨어집니다.

```
ORDBMS는 RDMS와 OODBMS (Object-Oriented Database) 사이의 중간 지점을 제공합니다. ORDBMS가 객체 지향 프론트 엔드를 RDBMS에 배치한다고 간단히 말할 수 있습니다. 응용 프로그램이 ORDBMS와 통신 할 때 보통 데이터가 오브젝트로 저장되는 것처럼 작동합니다. 그런 다음 ORDBMS는 오브젝트 정보를 행과 열이있는 데이터 테이블로 변환하고 RDBMS에 저장된대로 데이터를 처리합니다. 또한 데이터를 검색 할 때 단순 데이터를 재 조립하여 생성 된 복잡한 개체를 반환합니다. ORDBMS의 가장 큰 장점은 RDBMS 형식과 OODBMS 형식 사이에서 데이터를 변환하는 메소드를 제공하므로 프로그래머가 두 형식간에 변환하기 위해 코드를 작성할 필요가 없으며 오브젝트 지향 언어에서 데이터베이스 액세스가 용이하다는 것
```
```
https://m.blog.naver.com/PostView.nhn?blogId=sharon0a&logNo=110046003657&proxyReferer=https:%2F%2Fwww.google.com%2F
```
3. ITIL (IT Infrastructure Library v3)  - 2007 년 재정 `Service Lifecycle (SL)` ITIL v3는 2020년에 폐기 될 예정
 - IT 서비스 관리에 대한 프레임워크 구현을 돕기 위한 문서들의 집합
 - 체계적 ITSM 구축/관리 위한 Best Practice 기반 IT 서비스 제공 참조 모델
 * v2 와의 차이점
	- ITIL v2 : 프로세스 위주
	- ITIL v3 : 라이프 사이클 위주
 * v4 와의 차이점 (v3가 진화된 개념) - 2020 재정중
	- Service Value Chain (SVC)
	- 클라우드 컴퓨팅이나 IaaS, 머신 러닝, 블록체인 등에 관한 세부사항을 포함한다. 그리고 Lean, 애자일, 스크럼, 데브옵스와 같은 새로운 방법론에서의 weave개념을 도입


```
https://mobilenuri.tistory.com/105
https://raisonde.tistory.com/entry/ITIL-v30%EC%97%90%EC%84%9C-ITIL-4%EB%A1%9C%EC%9D%98-%EB%B3%80%ED%99%94-%EC%A0%95%EB%A6%AC
```

4. XMI : XML 메타 데이터 교환은 Extensible Markup Language를 통해 메타 데이터 정보를 교환하기위한 객체 관리 그룹 표준입니다. 메타 모델이 Meta-Object Facility로 표현 될 수있는 모든 메타 데이터에 사용할 수 있습니다
 - XMI(XML Metadata Interchange)는 특정 벤더의 모델링 도구나 메타데이터 저장소간에 객체 기반의 구조화된 메타데이터의 상호 교환을 가능케 하기 위한 표준
 - MOF, UML을 XML 파일로 일관되게 매핑하고 해석되게 하기 위하여 XML 문서의 구조와 문법을 정의한 것이 XMI DTD
 => XML 을 통해 데이터 교환하는 표준안을 의미


 5. SOAP / REST
 1) SOAP(Simple Object Access Protocol)은 일반적으로 널리 알려진 HTTP, HTTPS, SMTP 등을 통해 XML 기반의 메시지를 컴퓨터 네트워크 상에서 교환하는 프로토콜.
  - SOA 개념을 실행하기 위한 기술
 	ㄴ SOA : 서비스 지향 아키텍처(Service Oriented Architecture, 약칭 SOA 「에스오에이」혹은 「소아」로 발음)란 대규모 컴퓨터 시스템을 구축할 때의 개념으로 업무상에 일 처리에 해당하는 소프트웨어 기능을 서비스로 판단하여 그 서비스를 네트워크상에 연동하여 시스템 전체를 구축해 나가는 방법론이다.
 ``
 웹서비스 내의 모든 데이터는 XML로 표현된다.
 그 데이터들과 이를 다룰 수 있는 오퍼레이션들이 WSDL로 정의되면 UDDI라는 전역적 서비스 저장 소에 등록(publish)되어 누구라도 서비스를 찾을 수 있도록 공개된다. 공개된 웹서비스가 이용될 때, 서비스 요청자와 서비스 제공자 간에 SOAP을 이용하 여 서비스를 호출하고 결과를 돌려받게 된다.  SOAP 메시지는 아래 그림과 같이 SOAP 봉투(envelope), SOAP 헤더(header), SOAP 바디(body)로 구성된 하나의 XML 문서로 표현되는 데 이러한 복잡한 구성으로 인해 HTTP 상에서 전 달되기 무겁고, 메시지 인코딩/디코딩 과정 등 웹 서비스 개발의 난이도가 높아 개발 환경의 지원이 필요하다.
 ex.연말정산 xml
 ```

 2) REST(Representational State Transfer)는 월드 와이드 웹과 같은 분산 하이퍼미디어 시스템을 위한 소프트웨어 아키텍처의 한 형식이다. REST 원리를 따르는 시스템은 종종 RESTful이란 용어로 지칭된다
  - ROA 개념의 기술
 	ㄴ ROA : 자원 지향 아키텍처(Resource Oriented Architecture)으로, 소프트웨어 공학에서 리소스 지향 아키텍처 (ROA)은 "RESTful" 인터페이스 자원의 형태로 소프트웨어를 설계 및 개발을 위한 소프트웨어 아키텍처와 프로그래밍 패러다임의 스타일이다. 이러한 리소스는 다른 용도로 재사용 될 수 있는 소프트웨어 구성 요소 (부호의 개별 조각 및 / 또는 데이터 구조)이다. ROA 설계 원칙과 지침은 소프트웨어 개발 및 시스템 통합의 단계에서 사용된다.
 ```
 REST는 HTTP 프로토콜로 데이터를 전달하는 프레임워크이다. 또 한 클라이언트/서버 간의 구성요소를 엄격히 분리하여 구현은 단순화시키고 확장성과 성능은 높일 수 있는 아키텍처다. 여기서 리소스 (resource)란 REST 아키텍처의 핵심 요소로서 웹 사이트, 블로그, 이미지, 음악, 이용자, 지도, 검색 결 과 등 웹에서 다른 이들과 공유하고자 개방된 모든 자원을 의미한다. REST 구조에서의 리소스는 그들 의 고유한 URI를 가지며, HTTP의 기본 메소드인 GET/PUT/POST/DELETE만으로 접근할 수 있다.  

 + 그렇다면 REST API는 무엇인가? REST는 아키텍처라고 계속해서 정의하고 있다.실질적인 구현이 아닌 설계적 지침이라고 보면 된다. REST라는 설계를 가진 API라고 보면 된다. 이렇게 설명하는 이유는 요즘 API를 통한 처리가 많이 이루어지고 있다. 그렇기에 이러한 서비스들은 모두 REST API라고 생각하는 경우가 있다. 그렇기에 이러한 구조를 통해 만들었다하여도 쉽게 REST API이라고 말하고 다니면 안된다. REST API를 구현할 때는 기본 원칙과 지침이 따라야 한다.
 ```

 https://mygumi.tistory.com/55

 https://mygumi.tistory.com/55
