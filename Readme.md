# Test Automation Framework

This framework is an open-source tool to combine API test-automation, UI test-automation, Mobile test-automation into a single, unified framework. It is base on the many steps (key-words). So you can create test cases with using this steps even you don't know codding.

### Table of Contents
1- [Api Test Framework](#api)
- 1.1 [Steps](#apiSteps)    
    - [Defining api request](#step1)
    - [Add base url](#step2)
    - [Adding base path](#step3)
    - [Adding path parameter](#step4)
    - [Adding Headers](#step5)
    - [Query Parameter](#step6)
    - [Form Parameter](#step7)
    - [Multi form parameter](#step8)
    - [Adding file as multi-part param](#step9)


<a name='api'></a>
### Api Test Framework
<a name='apiSteps'></a>
#### Steps
<a name='step1'></a>
##### 1- Defining api request
Defining a new api request you can use following step

```* Define new request```
<a name='step2'></a>
##### 2- Add base url
To add the base url to the request you can use following step.
You should pass the base url as a parameter.

```* Add base url <url>```
<a name='step3'></a>
##### 3- Adding base path (endpoint)
To add the base url to the request you can use following step.
You should pass the base url as a parameter.

```* Add base path <url>```

<a name='step4'></a>
##### 4- Adding path parameter
To add the base url to the request you can use following step.

```* Add base path "/v2/pet/{patId}"```

```* Add path parameter "patId" = "1234".```

to check more option to add path parameter please check [PathParamImp](https://github.com/vmso/io.bdd_testing_frameworks/blob/bf4efcca584de9cfeeea06e5cd22863bdc6b3afa/mutual_methods/src/main/java/imp/PathParamImp.java#L1) class.
<a name='step5'></a>
##### 5- Adding Headers
To add headers to the request you can use following step.
```
* Add Headers
    |key            |value              |
    |---------------|-------------------|
    |accept         |application/json   |
    |Content-Type   |application/json   |
    |Cache-Control  |max-age=0          |
```
to check more option to add query parameter please check [HeaderImp](https://github.com/vmso/io.bdd_testing_frameworks/blob/bf4efcca584de9cfeeea06e5cd22863bdc6b3afa/mutual_methods/src/main/java/imp/HeaderImp.java#L1) class.
<a name='step6'></a>
##### 6- Query Parameter
To add the query parameters to the request you can use following step.

```
* Add query parameter
  |key            |value              |
  |---------------|-------------------|
  |patId          |1234               |
  |category       |dog                |
```
to check more option to add query parameters please check [QueryParamImp](https://github.com/vmso/io.bdd_testing_frameworks/blob/fa184ebc892b8d1f45e2acef0ba2ef7d2db6c70f/mutual_methods/src/main/java/imp/QueryParamImp.java#L1) class.

<a name='step7'></a>
##### 7- Form Parameter
To add the form parameters to the request you can use following step.

```
* Add query parameter
  |key            |value              |
  |---------------|-------------------|
  |patId          |1234               |
  |category       |dog                |
```
to check more option to add form data parameter please check [FormParamImp](https://github.com/vmso/io.bdd_testing_frameworks/blob/fa184ebc892b8d1f45e2acef0ba2ef7d2db6c70f/mutual_methods/src/main/java/imp/FormParamImp.java#L1) class.
name='step8'></a>
##### 8- Multi form parameter (endpoint)
To add multi form parameter to the request you can use following step.

```* Add to request "key"="value" as multi-part form data```

to check more option to add multi form parameter please check [MultiPartFormDataImp](https://github.com/vmso/io.bdd_testing_frameworks/blob/fa184ebc892b8d1f45e2acef0ba2ef7d2db6c70f/mutual_methods/src/main/java/imp/MultiPartFormDataImp.java#L1) class.
name='step9'></a>
##### 9- Adding file as multi part form param

To adding a file to request, first, you should add the file under the [file](https://github.com/vmso/io.bdd_testing_frameworks/tree/master/api_testing/src/test/resources/files) directory in test resource.
Then you can pass the file name as parameter to add to request as multi form parameter with following step.

```* Get "<fileName>" file and add to request as multi-part form data```