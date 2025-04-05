# Simple Spring Boot Messaging Web Application

This is a basic Spring Boot web application that demonstrates sending and receiving messages on a simple webpage, along with regularly updating data.

## Technologies Used

* Java
* Spring Boot
* Maven
* Thymeleaf (for the HTML template)

## Prerequisites

Before running this application, ensure you have the following installed:

* **Java Development Kit (JDK)** 8 or higher.
    * Verify installation: `java -version`
* **Apache Maven**.
    * Verify installation: `mvn -version`

## Getting Started

1.  **Clone the Repository (if you have this code in a Git repository):**
    ```bash
    git clone https://github.com/faresDev345/simple_Spring_Boot_web.git
    cd simple_Spring_Boot_web
    ```

2.  **Build the Application (if needed):**
    ```bash
    mvn clean install
    ```

3.  **Run the Application:**

    You can run the application in a few ways:

    * **Using Maven (Recommended for simple execution):**
        ```bash
        mvn spring-boot:run
        ```

    * **From your IDE:** Import the project into your preferred IDE (IntelliJ IDEA, Eclipse, etc.) as a Maven project and run the main application class (`DemoApplication.java`).

    * **As a JAR file (after building):**
        ```bash
        java -jar target/messaging-app-0.0.1-SNAPSHOT.jar
        ```
        (Note: The `0.0.1-SNAPSHOT` part might vary depending on your project version.)

4.  **Access the Application:**

    Once the application is running, open your web browser and navigate to:

    ```
    http://localhost:8090/
    ```

## Functionality

* **Send a Message:** Enter text in the "Send a Message" form and click the "Send" button. The message will be added to the "Received Messages" list on the page.
* **Receive Messages:** The "Received Messages" section displays all the messages sent so far.
* **Regularly Updated Data:** The "Regularly Updated Data" section shows a timestamp that updates approximately every 2.5 seconds due to a client-side page reload. The backend also updates this data every 3 seconds using a scheduled task.

## Code Structure

* `/src/main/java/tuto/dev/mssg/`: Contains the main Java source code.
    * `DemoApplication.java`: The main Spring Boot application entry point.
    * `controller/MessageController.java`: The Spring MVC controller that handles web requests.
* `src/main/resources/templates/`: Contains the Thymeleaf HTML template (`index.html`).
* `pom.xml`: The Maven project configuration file.

## Further Improvements

This is a basic example and can be further improved by:

* Using AJAX to update the "Regularly Updated Data" section without a full page reload for a better user experience.
* Implementing proper data persistence (e.g., using a database) to store messages permanently.
* Exploring real-time communication using WebSockets for a more interactive messaging experience.
* Adding input validation and error handling.
* Styling the webpage with CSS.

## License

[Your License Information Here (e.g., MIT License)]