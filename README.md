# Hospital-Subsystem
WEB&amp;SOA Hospital Subsystem

#### 患者信息与医院对应
```
患者信息与医院对应
```

#### 患者卡类型type
```
就诊卡----------0
社保卡----------1
医保卡----------2
```

### API调用示例
```
GET http://139.196.194.51:18080/api/tests/getTest/1
content-type:application-json
Accept: application/json
```

```
//获得医院的总信息,加入系统（仅可进行操作一次）
GET http://139.196.194.51:18080/api/hospitals/1
content-type:application/json
Accept: application/json
```

```
//对医院财务进行更新
POST http://139.196.194.51:18080/api/finance
content-type:application/json
Accept: application/json

{
  "hospitalId": "1",
  "economy": 100
}
```

```
//获取患者就诊卡余额
GET http://139.196.194.51:18080/api/patients/{id}
content-type:application/json
Accept:application/json
```

```
//对患者就诊卡余额进行更新
POST http://139.196.194.51:18080/api/hospitals/updatePatient
content-type:application/json
Accept: application/json

{
  "id":"100"
  "economy": 100
}
```

```
//对医院信息进行更新（测试的时候用该接口获得医院信息进行测试）
GET http://139.196.194.51:18080/api/hospitals/updateInfo
content-type:application/json
Accept: application/json
```

```
//更新预约信息
Post http://139.196.194.51:18080/api/hospitals/updateReservation
content-type:application/json
Accept:application/json

{
    "departmentName":"",
    "doctorName":"",
    "patientId":"",
    "patientName":"",
    "reserveDate":"",
    "reserveTime":"".
    "hospitalId":""
    "number":""
}
```

```
Post http://139.196.194.51:18080/api/hospitals/cancelReservation
content-type:application/json
Accept:application/json

{
    "hospitalId":"",
    "patientId":"",
    "reserveDate":"",
    "reserveTime":""
}
```

```
Post http://139.196.194.51:18080/api/hospitals/updateNotice
content-type:application/json
Accept:application/json

{
    "id":"1",
    "notice":"xxxxxx"
}
```
