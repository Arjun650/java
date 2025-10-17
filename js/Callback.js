function divide(a, b, callback) {
    if (a > 5 && b > 5) {
        callback(null, "this is greater than 5");
    } else {
        callback("Error: not greater than 5");
    }
}

divide(10, 5, (error, data) => {
    if (error) {
        console.log(error);
    } else {
        console.log(data); 
    }
});
