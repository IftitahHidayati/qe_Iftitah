import {Given , When, And, Then} from "cypress-cucumber-preprocessor/steps";

Given ("I am on the payment pages",function(){
    console.log("Payment Page")
});
When ("I select the payment method",function(){
    console.log("Payment method verified")
});
And ("I click the Pay Now button",function(){
    console.log("Pay Now verified")
});
Then ("I am on the payment confirmation page",function(){
    console.log("Payment confirmation verified")
});
When ("I click Payment Instructions with Scan",function(){
    console.log("Payment instruction verified")
});
And ("I open the Gojek application then head to the GoPay menu",function(){
    console.log("Applicattion open verified")
});
Then ("I select the Pay feature",function(){
    console.log("Pay feature verified")
});
When ("I do a scan of the payment",function(){
    console.log("Scan payment verified")
});
And ("I enter your 6-digit GoPay PIN",function(){
    console.log("Digit Pin verified")
});
Then ("I am on the paid success page",function(){
    console.log("Paid success verified")
});