const jsonData = pm.response.json();
const Id = 2;
let resStatus = pm.response.code;
let resContent = pm.response.headers;
let resTime = pm.response.responseTime;
let exresponseTime = pm.environment.get("responseTime");
console.log(resTime);


pm.test(`Response Status Code is 200`,function(){
    pm.response.to.have.status(500);
});
pm.test(`Response Time Less Than ${exresponseTime}`, function(){
    pm.expect(resTime).to.below(10);
});
pm.test("Response ID is valid", function() {
pm.expect(jsonData.id).to.eql(Id);
});
pm.test('response Content-Type header should have application/json', function(){
    pm.expect(pm.response.headers.get('Content-Type')).to.equals('application/json; charset=utf-8')
});