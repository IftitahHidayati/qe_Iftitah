const jsonData = pm.response.json();
let resStatusCode = pm.response.code;
console.log(resStatusCode);

if (resStatusCode === 500) {
let resTime = pm.response.responseTime;
let exresponseTime = pm.environment.get("responseTime");
let title = jsonData.title;
let body = jsonData.body;

pm.test("Status code is 201", function () {
    pm.response.to.have.status(201);
});
pm.test(`Response time less than ${exresponseTime}ms`, function(){
pm.expect(resTime).to.below(Number(exresponseTime));
});
pm.test("Response is valid JSON", function () {
    pm.response.to.be.json;
});
pm.test("Title is Created", function () {
    pm.expect(jsonData.title).to.eql("Input title");
});
pm.test("Body is Created", function () {
    pm.expect(jsonData.body).to.eql("Input body");
});

} else if (resStatusCode !== 500){
pm.test(`fail to create user`);
};