const jsonData = pm.response.json();
let resStatus = pm.response.code;
let title = jsonData.title;
let body = jsonData.body;
let resTime = pm.response.responseTime;
let exresTime = pm.environment.get("responseTime");

pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});
pm.test(`Response Time Less Than ${exresTime}`, function(){
    pm.expect(resTime).to.below(Number(exresTime));
});
pm.test("Response is valid JSON", function () {
    pm.response.to.be.json;
});
pm.test("Title is updated", function () {
    pm.expect(jsonData.title).to.eql("Updated Title");
});
pm.test("Body is updated", function () {
    pm.expect(jsonData.body).to.eql("Updated Body");
});
pm.test("User ID is 1", function () {
    pm.expect(jsonData.userId).to.eql(1);
});