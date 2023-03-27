pm.test("Response code is 200", function () {
    pm.response.to.have.status(200);
});

pm.test("Response has valid data", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData).to.eql({});
});

pm.sendRequest({
    url: 'https://jsonplaceholder.typicode.com/posts/1',
    method: 'DELETE',
    headers: {
        'Content-Type': 'application/json'
    }
}, function (err, res) {
    if (err) {
        console.log(err);
    }
    else {
        console.log(res.json());
    }
});