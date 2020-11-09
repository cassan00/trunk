# Project Setting
 - jdk 1.8
 - tomcat 9.0
 - eclipse Version: 2020-09 (4.17.0)


# Create Date : 2020.10.20


------------------------------------------------------------
## 2020-10-29 vue3 + Sprgin boot 연동
 - 참고 : https://deockstory.tistory.com/26

### 1. pront vue 생성

```
D:\77. 개인\trunk\sb\spkswm\src>vue -V
@vue/cli 4.5.6

D:\77. 개인\trunk\sb\spkswm\src>vue create frontend

Vue CLI v4.5.6
┌─────────────────────────────────────────┐
│                                         │
│   New version available 4.5.6 → 4.5.8   │
│    Run npm i -g @vue/cli to update!     │
│                                         │
└─────────────────────────────────────────┘

? Please pick a preset: (Use arrow keys)
  Default ([Vue 2] babel, eslint)
 > Default (Vue 3 Preview) ([Vue 3] babel, eslint)
  Manually select features
V3 로 선택
```

### 2. Vue.js dev 서버에 proxy 설정 & 빌드 타깃 디렉터리 설정
 vue.js dev서버에 proxy 설정을 해서 spring으로 오게 될 요청들을 모두 vue.js dev서버(8080)에서 proxing 하여 받고, spring쪽(9000)으로 보내주도록 설정

```
# reqeust 모듈은 프론트쪽에서 백엔드쪽으로 ajax 요청을 할 때 사용할 모듈
D:\77. 개인\trunk\sb\spkswm\src\frontend>npm install request

# path는 vue.config.js에서 빌드된 결과물을 떨어뜨릴 타깃 디렉토리 설정을 할 때 필요한 모듈
D:\77. 개인\trunk\sb\spkswm\src\frontend>npm install path

# Spring Server Port 변경
# frontend/vue.config.js 생성 - 프록시 설정

```


## 2020-11-02
```
http://localhost:8080/api (VUE) 로 호출하면
http://localhost:9000/spkswm/login (Spring Boot) 로 프록시하는 부분까지 완료


Tomcat 9.0 Start + > npm run serve
```

### 1. build 경로 변경
 - vue build 는 기본으로 dist 폴더를 생성해 css/img/js 를 떨구기 떄문에
 - Spring 에서 인식하는 경로로 옮겨줌

 ```
 D:\77. 개인\trunk\sb\spkswm\src\main\resources\static

 > npm run build

 ```



