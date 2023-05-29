# Tom Z Assurity Consulting Assessment

**Used Tools and Frameworks**
1. Intellij IDE
2. RestAssured Framework
3. Java Programming Language
4. Google Gson
5. JUnit
6. Apache Log4j
7. Java 18 SDK
8. Apache Maven
9. Git/GitHub

# Concepts Included
1. Encapsulation used by creating Getters and Setters
2. Code Readability
3. Separation of Test Layer and objects
4. Plain Old Java Object (POJO) implementation

# Main Features
1. **pom.xml**
This file contains all the dependencies and once the contents are included in an IDE dependencies will be installed automatically
2. **SandBoxTest Class**
This is the class where the acceptance criteria is being validated
3. **Logging Class** 
The logger class has been created to track and record all issues encounted during execution
especially json serialization and deserialization
4. **Fees Class**
This class was created to manage all Fees object fields
5. **Promotions Class**
This class was created to manage all Promotions object fields
6. **Sandbox Class**
All the fields not the focus for the acceptance criteria are defined in this class and also getters and setters.
7. **Service Class**
This class is for getting the response from the API after querying with the GET method and will be used to add more HTTP methods 

# Execution
Once all the plugins and dependencies have been installed, navigate to src/main/test/java and run the SandBox class.

# Results 
They are three acceptance criterion to be meet and this will be shown by a green tick on corresponding  to the method name.

# Reports
Reporting has been excluded due to installation instructions needed to be followed, preference was Allure Reports
