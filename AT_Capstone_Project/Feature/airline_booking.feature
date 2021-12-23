Feature: airline Booking

@book
Scenario: SignUp a user
Given the user click on the login/signup button
And he clicks on the not a member?SignUp
And he entered the valid details
And he clicks on the signup button
Then the user registered succesfully




@book
Scenario: Booking of airline

Given  the user clicks on the login page
And he enters the details
And he clicks on the login button
And he clicks on the home button
And the user select the source location
And he selects destination
And he clicks on the submit button
And he clicks on the book Flight
And he clicks on the confirm bookings
And he see his bookings
Then the user login searching and booking verified succesfully


