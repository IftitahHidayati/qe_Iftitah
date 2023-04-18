import {Given , When, And, Then} from "cypress-cucumber-preprocessor/steps";

Given ("I am on the main page",function(){
    console.log("Main Page")
});
When ("I click on the other buttons on the menu bar available to view and select the type of product",function(){
    console.log("Other button menu verified")
});
And ("I select and click on one of the product categories, for example: Selecting the Telecommunications category",function(){
    console.log("Product categories verified")
});
Then ("I selects and clicks the desired product, for example: selecting the pulse product",function(){
    console.log("Select product verified")
});
When ("I enter a valid mobile number",function(){
    console.log("Mobile number verified")
});
Then ("I am on the payment page",function(){
    console.log("Payment page verified")
});