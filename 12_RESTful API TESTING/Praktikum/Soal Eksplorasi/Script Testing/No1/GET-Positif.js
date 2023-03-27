const jsonData = pm.response.json();
let resStatus = pm.response.code;
let resTime = pm.response.responseTime;
let exresponseTime = pm.environment.get("responseTime");
console.log(resTime);

pm.test(`Response Status Code is 200`,function(){
    pm.response.to.have.status(resStatus);
});
pm.test(`Response Time Less Than ${exresponseTime}`, function(){
    pm.expect(resTime).to.below(Number(exresponseTime));
});
pm.test("Response is valid JSON", function () {
    pm.response.to.be.json;
});