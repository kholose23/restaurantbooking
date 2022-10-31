# Restaurantbooking

## Introducction

This is a backend spring boot application which could enable the frontend of a restaurant booking web service to access a MYSQL database.  It uses CRUD capability for both a Customer and a Booking table within the database.  Using this application would make it easier to track all the restaurant reservations and the tables that have OneToMany relationships and vice versa.  The README file provides an overview of the application's functionality and explains how to run the application.

## Functionality
* Viewing new Customers.
* Viewing a Customer by their ID
* Viewing a Booking by their ID
* Updating an existing Booking
* Viewing the entire Bookings

### The table contents

#### Table One
* Customer's Id for Booking reference
* Customer's name
* Customer's email
* Customer's password
* Customer's username
* Customer's name

### Table Two:
* Booking 's records by Id for Customers
* Date
* Time
* Type of Booking (mechilin, prime time or Basic)
* Customer's Id

## Tools used in this project.
* The STS IDE made it easier to import and debug the codes.
* Maven made it easier to manage the many dependencies that have to be used in the entire application.
* MYSQL Workbench made it easier for me to manage my local MYSQL and make sure that the application actually functions on the database.
* The postman made it possible to test the functionality of my backend without requiring a full anteceding frontend.

## Project Structure!

<img src="https://user-images.githubusercontent.com/112514094/198723201-d693bfef-d167-4bc6-b56b-1bba8c31654c.png " width="200" height="200">

Below is the ERD Diagram for the Database Tables

<img src="https://user-images.githubusercontent.com/112514094/198720511-9af1cafc-b33f-4cfa-b031-76ecee2132ab.png" width="200" height="200">

## Application Overview
### Below are examples of program running and performing various actions in the application.

<img src="https://user-images.githubusercontent.com/112514094/198943611-ceadc728-b808-4262-8262-0f697580b1da.jpg" width="200" height="200">

### Below is the CRUD Functionalities from Postman API

#### This shows the read test functionality

<img src="https://user-images.githubusercontent.com/112514094/198724312-ed573d48-2c60-44fd-bffd-1c98c43197a1.png" width="200" height="200">

#### This shows the delete test functionality

<img src="https://user-images.githubusercontent.com/112514094/198723923-6847c272-e1c0-4c57-a3da-8e0fb1e8e531.png" width="200" height="200">

### Below are the images from MYSQL Database  

#### This shows Customer Table

<img src="https://user-images.githubusercontent.com/112514094/198724863-3c72bacb-0544-4ff4-ad80-666d9e2403ed.png" width="200" height="200">

#### This shows the Booking Table.

<img src="https://user-images.githubusercontent.com/112514094/198724825-763b27ae-8275-4279-960f-4d788426d186.png" width="200" height="200">

## Steps to run the application:
1. The application runs on server.port = 8080 and makes sure it runs on Tomcat as well as checking that the port is not in use.  Since it is java application running, the user must make sure it is running java version 8
2.  The user must make sure the pom file has appropriate dependencies in order for the application to run successfully.
3.  The user must make sure the application properties datasource url is correct. i.e. url=jdbc:mysql:localhost:3306 restaurant booking  and the correct username as well as the password is used.
4. The project must exist within the local instance of the MYSQL database.
5. The user must run "RestaurantBookingApplication" as a Spring Boot App with a green leaf symbol.
6. To access the functionality of the application some external applications like postman are necessary to make resounding inputs.

The tests on the project ran successfully using JUnit and Mockito.

<img src="https://user-images.githubusercontent.com/112514094/198740202-9cbd5392-c520-40a0-bfc6-2fc4b55ea3bd.png" width="200" height="200">


<img src="https://user-images.githubusercontent.com/112514094/198740173-1054391e-8830-45fe-a9bb-eee597371c64.png" width="200" height="200">

## What I Learnt.
This project has taught me about integrating the various parts of the QA java course.  I was able to understand how MYSQL(Database) andd postman work together to bring the project output.  Given more time, I would have liked to perform more of my CRUD functionalities to my project.  I am planning to continue expanding more features to this project. Even Though, java script was a new experience to me as I come from Food Technology(from the kitchen to IT), I find it enjoyable as time goes on and proud of myself to have produced it.

## Future Project
Build my own mechilin style menu app 
The app will feature mechilin type menu as per picture below. 

<img src="https://axwwgrkdco.cloudimg.io/v7/__gmpics__/735b637636734cceaa7653aab2db89a4?" width="200" height="200">
