
# electron(nodeJS) + vuetify
```
Vuetify 란? Vue 생태계에서 가장 활동적이며 다양한, 완벽한 기능을 갖춘 개발 프레임 워크이다. 쉽게 말해 vue에서 사용할 수 있는 용이한 UI toolkit이라고 할 수 있다. css에서 사용할 수 있는 부트스트랩과 비슷하다고 생각한다.
```

### VSCode - 실행안됨 -> 대체가능여부 확인
### 참고
https://fkkmemi.github.io/electron/electron-05-vuecli3-update/

### node js 설치 - 패키지 설치
```
>npm -v
6.14.6
```

### yarn 설치
```
1) NPM 으로 설치
  $ npm install -g yarn

2) 설치된 버전확인
>yarn -v
1.22.5

3) Path 설정
    환경변수 추가 C:\Users\Administrator\AppData\Roaming\npm\node_modules\yarn\bin

4) GLOBAL 설정  https://gonna-be.tistory.com/31
C:\Windows\SysWOW64>yarn config set prefix C:\Users\Administrator\AppData\Roaming\npm\node_modules\yarn\yarn-global
yarn config v1.22.5
success Set "prefix" to "C:\\Users\\Administrator\\AppData\\Roaming\\npm\\node_modules\\yarn\\yarn-global".
Done in 0.16s.

5) yarn list
yarn list v1.22.5
error No lockfile in this directory. Run `yarn install` to generate one.
info Visit https://yarnpkg.com/en/docs/cli/list for documentation about this command.

6) yarn install
yarn install v1.22.5
info No lockfile found.
[1/4] Resolving packages...
[2/4] Fetching packages...
[3/4] Linking dependencies...
[4/4] Building fresh packages...
success Saved lockfile.
Done in 0.26s.

7) C:\Windows\SysWOW64>yarn list
yarn list v1.22.5
Done in 0.13s.
```

### vue-cil 설치
https://fkkmemi.github.io/electron/electron-00-intro/
```
D:\77. 개인\trunk>npm install -g vue-cli
npm WARN deprecated vue-cli@2.9.6: This package has been deprecated in favour of @vue/cli
npm WARN deprecated request@2.88.2: request has been deprecated, see https://github.com/request/request/issues/3142
npm WARN deprecated coffee-script@1.12.7: CoffeeScript on NPM has moved to "coffeescript" (no hyphen)
npm WARN deprecated har-validator@5.1.5: this library is no longer supported
C:\Users\Administrator\AppData\Roaming\npm\vue-init -> C:\Users\Administrator\AppData\Roaming\npm\node_modules\vue-cli\bin\vue-init
C:\Users\Administrator\AppData\Roaming\npm\vue -> C:\Users\Administrator\AppData\Roaming\npm\node_modules\vue-cli\bin\vue
C:\Users\Administrator\AppData\Roaming\npm\vue-list -> C:\Users\Administrator\AppData\Roaming\npm\node_modules\vue-cli\bin\vue-list
+ vue-cli@2.9.6
updated 1 package in 16.415s


D:\77. 개인\trunk>vue -V
@vue/cli 4.5.6


vue init vuetifyjs/electron elecapp => 업데이트 되면서 사라짐 3방식은 아래처럼 사용

D:\77. 개인\trunk>vue create eleTest

  vue create is a Vue CLI 3 only command and you are using Vue CLI 2.9.6.
  You may want to run the following to upgrade to Vue CLI 3:

  npm uninstall -g vue-cli
  npm install -g @vue/cli

--> 순서대로 uninstall > install
```


### 프로젝트 생성하기 : vue create (프로젝트명)
```
D:\77. 개인\trunk>vue create el

Vue CLI v4.5.6
? Please pick a preset: Default ([Vue 2] babel, eslint)
? Pick the package manager to use when installing dependencies: Yarn


Vue CLI v4.5.6
✨  Creating project in D:\77. 개인\trunk\el.
⚙️  Installing CLI plugins. This might take a while...

yarn install v1.22.5
info No lockfile found.
[1/4] Resolving packages...
[2/4] Fetching packages...
info fsevents@2.1.3: The platform "win32" is incompatible with this module.
info "fsevents@2.1.3" is an optional dependency and failed compatibility check. Excluding it from installation.
info fsevents@1.2.13: The platform "win32" is incompatible with this module.
info "fsevents@1.2.13" is an optional dependency and failed compatibility check. Excluding it from installation.
                                                                                                                                                                                                                      success Saved lockfile.
Done in 163.21s.
�  Invoking generators...
�  Installing additional dependencies...

yarn install v1.22.5
[1/4] Resolving packages...
[2/4] Fetching packages...
info fsevents@2.1.3: The platform "win32" is incompatible with this module.
info "fsevents@2.1.3" is an optional dependency and failed compatibility check. Excluding it from installation.
info fsevents@1.2.13: The platform "win32" is incompatible with this module.
info "fsevents@1.2.13" is an optional dependency and failed compatibility check. Excluding it from installation.
[3/4] Linking dependencies...
[4/4] Building fresh packages...
success Saved lockfile.
Done in 46.90s.
⚓  Running completion hooks...

�  Generating README.md...

�  Successfully created project el.
�  Get started with the following commands:

 $ cd el
 $ yarn serve

```

### 서비스 실행  $ cd el >  $ yarn serve
```
 DONE  Compiled successfully in 20812ms                                                   4:42:43 ├F10: PM┤


  App running at:
  - Local:   http://localhost:8080/
  - Network: http://172.16.0.27:8080/

  Note that the development build is not optimized.
  To create a production build, run yarn build.

```


### 일렉트론/뷰티파이 플러그인 설치
```
vue add electron-builder

? Choose Electron Version ^8.0.0
⚓  Running completion hooks...

✔  Successfully invoked generator for plugin: vue-cli-plugin-electron-builder


vue add vuetify


ed plugin: vue-cli-plugin-vuetify

? Choose a preset: Configure (advanced)
? Use a pre-made template? (will replace App.vue and HelloWorld.vue) Yes
? Use custom theme? No
? Use custom properties (CSS variables)? No
? Select icon font Material Icons
? Use fonts as a dependency (for Electron or offline)? Yes
? Use a-la-carte components? Yes
? Select locale English


```

### 실행해보자
```
개발용
$ yarn electron:serve
배포용
$ yarn electron:build  -> 에러


D:\77. 개인\trunk\el>yarn build -> 이거는 됨
yarn run v1.22.5

  dist\js\chunk-vendors.22a4a106.js      208.71 KiB                                             70.73 KiB
  dist\js\app.41d0a92f.js                5.64 KiB                                               2.18 KiB
  dist\css\chunk-vendors.e5aa4ac2.css    383.05 KiB                                             48.61 KiB

  Images and other types of assets omitted.

 DONE  Build complete. The dist directory is ready to be deployed.
 INFO  Check out deployment instructions at https://cli.vuejs.org/guide/deployment.html
```

D:\77. 개인\trunk\el\dist_electron\win-unpacked\el.exe 실행
https://www.clien.net/service/board/lecture/12267795 참고
