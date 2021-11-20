# Hospital-Subsystem
WEB&amp;SOA Hospital Subsystem

### API调用示例
```
GET localhost:18080/api/tests/getTest/1
content-type:application-json
Accept: application/json
```

```
//获得医院的总信息
GET http://139.196.194.51:18080/api/hospitals/1
content-type:application/json
Accept: application/json
```

```
//对医院财务进行更新
POST localhost:18080/api/finance
content-type:application/json
Accept: application/json

{
  "id": "1",
  "economy": 100
}
```
