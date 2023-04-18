import {Given , When, And, Then} from "cypress-cucumber-preprocessor/steps";

Given ("I am on the login page",function(){
    console.log("Successfully login")
});
When ("I enter by valid email or telephone and password correctly",function(){
    console.log("Data verified")
});
And ("I click login button",function(){
    console.log("Login verified")
});
Then ("I am on the home page",function(){
    console.log("Home page verified")
});