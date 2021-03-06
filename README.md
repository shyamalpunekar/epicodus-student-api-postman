# Epicodus Student API

#### _A Epicodus Student extended Web Application for Epicodus Java Week 4 Independent Project, Aug 25, 2017_

#### By _**Shyamal Punekar**_

## Description

This is a program that allows a  to track epicodus and their students average age, gender breakdown, most popular track, zipcode, last job held before enrolling.
Management software with dashboard for a hypothetical epicodus to allow to do the following:
* VIEW all students and each Epicodus's student;
* ADD a student epicodus;
* UPDATE Epicodus details;
* DELETE epicodus if no longer required and delete a student if they no longer required.

## Specifications

* It allows the user to add new epicodus's details.
  * Input: POST request -> localhost:4567/epicodus/new [Postman]
  * Output:
  ![POST request epicodus details](https://github.com/shyamalpunekar/epicodus-student-api-postman/blob/master/src/main/resources/public/img/POST-request-epicodus.png)

* It allows the user to see new epicodus's details.
  * Input:GET request -> localhost:4567/epicodus
  * Output:
  ![GET request epicodus details](https://github.com/shyamalpunekar/epicodus-student-api-postman/blob/master/src/main/resources/public/img/GET-request-epicodus.png)

* It allows the user to add new students to an existing epicodus.
  * Input: POST request ->localhost:4567/students/new
  * Output:
  ![POST request student](https://github.com/shyamalpunekar/epicodus-student-api-postman/blob/master/src/main/resources/public/img/POST-request-student.png)

* It allows the user to see new students to an existing epicodus.
  * Input: GET request -> localhost:4567/students
  * Output:
  ![GET request student](https://github.com/shyamalpunekar/epicodus-student-api-postman/blob/master/src/main/resources/public/img/GET-request-student.png)

* It allows us to add new tracks with an epicodus id.
  * Input: POST request -> localhost:4567/epicodus/1/tracks/new
  * Output:
   ![POST request epicodus id tracks](https://github.com/shyamalpunekar/epicodus-student-api-postman/blob/master/src/main/resources/public/img/POST-request-epicodus-id-tracks.png)

* It allows us to see tracks with epicodus id.
  * Input: GET request -> localhost:4567/epicodus/1/tracks
  * Output:
  ![GET request epicodus id tracks](https://github.com/shyamalpunekar/epicodus-student-api-postman/blob/master/src/main/resources/public/img/GET-request-epicodus-id-tracks.png)


  ## What's Included

```
epicodus-api

├── README.md
├── build.gradle
├── .gitignore
└── src
     ├── main
     │     ├── java
     │     │     ├── App.java
     │     │     ├── Student.java
     │     │     ├── Epicodus.java
     │     │     ├── Tracks.java
     │     └── resources
     │             └── db
     │              └── create.sql
     └── test
           └── java
                 ├── Sql2oEpicodusDaoTest.java
                 ├── Sql2oStudentDaoTest.java
                 └── Sql2oTracksDaoTest.java
```

## Setup/Installation Requirements

You will need [gradle](https://gradle.org/gradle-download/) installed on your device.

* `$ https://github.com/shyamalpunekar/epicodus-student-api-postman`

Using Postman:
* Fire up Postman, and set the HTTP request type to POST, create a record before we can read it.
* Point the URL to localhost:4567/epicodus/new
* Select the radio button marked "raw", and the type to " JSON application/json" in the dropdown menu.
* Select the Body radio button, and copy in JSON below.
* Hit Send!


## Support and contact details

Please feel free to contact shyamal.punekar@gmail.com if you have any questions, issues, concerns, comments or suggestions.

## Technologies Used

* Java
* jUnit
* Gradle
* spark
* Postman
* postgres

### License

_Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.


Copyright (c) 2017 **_Shyamal Punekar_**
