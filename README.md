# MoveinSync Automation-Testing Intern case study


https://github.com/ydpatel0309/Testing/assets/91671051/4175dab2-1ec6-45e1-a305-afe4f2fab05f

* video link : https://drive.google.com/file/d/1l3sim3930kmNDZ-8Zzc7zO4gsF4E_zlR/view?usp=sharing

* Case Study (Automation Question): 
Write a script to automatically login in the website using any language and automation tools.

 Task Details: 1.) Launch the URL(https://demoqa.com/login) in the browser. 
 
 2.) Fill login details.
 
 3.) Login.


# Result

* after testing every test case I am also printing the output like it's successful or unsuccessful in the console

![Screenshot (2314)](https://github.com/ydpatel0309/Testing/assets/91671051/252567c4-bf7b-4400-a51c-d852b004da25)

* JUnit output
 
![Screenshot (2306)](https://github.com/ydpatel0309/Testing/assets/91671051/1a2e0b4d-f150-4f35-8e5f-ecf750f9d163)


# steps to test login page

1) Create a Selenium WebDriver Instance:
   
* Instantiate a WebDriver object (e.g., ChromeDriver) to control the browser.

2) Identify and Interact with Elements:
   
* Use the findElement method to locate HTML elements on the login page and interact with them. For a login page, you typically have username and password fields, a submit button, etc.

3) Assertions:
   
* Use JUnit or another testing framework to perform assertions to verify if the login was successful or if there are any error messages.

4) Handle Wait and Timing Issues:
   
* To ensure that your tests are reliable, use implicit or explicit waits to handle timing issues that may arise due to page loading or AJAX requests.
# Technologies I have used

* Selenium:
  
Selenium is an open-source framework for automating web applications. It provides a set of tools and APIs for interacting with web browsers, allowing developers and testers to automate the testing and interaction with web applications. Selenium supports various programming languages like Java, Python, C#, etc., and it can be used for functional testing as well as for browser automation.In this project I have used Java.

* Maven:
  
Maven is a powerful build automation and project management tool. It simplifies the process of managing a project's build lifecycle, dependencies, and documentation. Maven uses a declarative approach, allowing developers to define project configurations in a simple XML file (pom.xml). It helps in managing dependencies, compiling code, running tests, and packaging applications, making the build process more efficient and consistent.

* Git and GitHub:

Git is a distributed version control system used for tracking changes in source code during software development. It enables collaboration among developers and allows for efficient branching, merging, and versioning of code. GitHub, on the other hand, is a web-based platform that provides hosting for Git repositories. It adds collaboration features like pull requests, code review, issue tracking, and more. Together, Git and GitHub facilitate collaborative and version-controlled software development.

* JUnit:
  
JUnit is a popular testing framework for Java programming language. It is widely used for writing and running repeatable tests to ensure the correctness of Java code. JUnit provides annotations to define test methods, fixtures, and assertions, making it easy to structure and automate unit tests. It supports the creation of test suites, and its integration with tools like Maven allows for the seamless execution of tests during the build process.

# Pros and Cons of Selenium:

## Pros:

Open Source:

Selenium is an open-source tool, making it freely available for use, and it has a large community of developers contributing to its improvement and support.
Cross-Browser Compatibility:

Selenium supports multiple web browsers, allowing for cross-browser testing to ensure that web applications work consistently across different browsers.
Multiple Programming Language Support:

Selenium supports various programming languages, including Java, Python, C#, Ruby, and JavaScript. This flexibility allows developers to choose a language they are comfortable with.
Parallel Test Execution:

Selenium Grid enables parallel test execution on multiple machines and browsers simultaneously, reducing test execution time and improving efficiency.
Integration with Testing Frameworks:

Selenium can be integrated with popular testing frameworks like JUnit, TestNG, NUnit, etc., making it easier to manage test cases, generate reports, and integrate with Continuous Integration (CI) tools.
Large Community and Documentation:

Selenium has a vast and active community, providing extensive documentation and support. This makes it easier for users to get started, find solutions to common problems, and stay updated on the latest features.
Browser Automation:

Selenium WebDriver allows users to automate browser actions, such as clicking, typing, navigating, and more, providing a realistic simulation of user interactions.
Versatility:

Selenium is not limited to just testing; it can also be used for tasks like web scraping, automating repetitive tasks, and more.

## Cons:

Dynamic Elements and Synchronization:

Handling dynamic elements and synchronization can be challenging in Selenium, as web applications often include elements that change dynamically, requiring careful handling in scripts.
No Support for Desktop or Mobile Applications:

Selenium is primarily designed for web applications and does not provide direct support for automating desktop or mobile applications.
Steep Learning Curve for Beginners:

Selenium may have a steep learning curve for beginners, especially those new to automation or programming. However, the extensive community and documentation help mitigate this challenge.
Limited Support for Captcha and Image-Based Testing:

Selenium may struggle with certain types of challenges, such as handling captchas and image-based testing, which are more complex and may require additional tools or workarounds.
Handling Pop-Ups and Alerts:

Handling certain types of pop-ups and alerts can be tricky in Selenium, and developers may need to use workarounds or additional libraries to address these challenges.
Maintenance of Test Scripts:

Test scripts in Selenium may require regular maintenance, especially when dealing with changes in the application under test or browser updates.
Resource Intensive:

Running tests in parallel or on multiple browsers can be resource-intensive, requiring substantial computing resources.



