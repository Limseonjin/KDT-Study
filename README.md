# js-study

태그감싸기 => 약어로 래핑

### ajax 실습시 JSON Server 설치(가상 Rest Api) 
 가상서버 실행시 npm install 필수 
```shell script
$ mkdir json-server-exam && cd json-server-exam
$ npm init -y
$ npm install json-server —D
```

- package.json에 추가
```json
"scripts": {
    "start": "json-server —watch db.json —port 5000"    
  },
```
json-fake-server 폴더에서 실행해야함.
`$ npm start`로 서버실행

—