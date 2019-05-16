# spring-boot-file-upload-download-rest-api-example

This branch demonstrates how to store the files in ORACLE database.

Steps to Setup
1. Clone the repository

git clone https://github.com/zeeshanalamkhan/spring-boot-file-upload-download-rest-api-example.git
2. Configure ORACLE database

Create a ORACLE database named file_demo, and change the username and password in src/main/resources/application.properties as per your ORACLE installation -

spring.datasource.username= <YOUR ORACLE USERNAME>
spring.datasource.password= <YOUR ORACLE PASSWORD>
3. Run the app using maven

cd spring-boot-file-upload-download-rest-api-example
mvn spring-boot:run
That's it! The application can be accessed at http://localhost:8083.

You may also package the application in the form of a jar and then run the jar file like so -

mvn clean package
java -jar target/file-demo-0.0.1-SNAPSHOT.jar
