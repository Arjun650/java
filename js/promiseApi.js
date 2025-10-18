// --------------------
// 1. Simple Promise and chaining
// --------------------
function asyncTask(value, delay) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if (value !== "error") {
                resolve(`Resolved: ${value}`);
            } else {
                reject(`Rejected: ${value}`);
            }
        }, delay);
    });
}

asyncTask("Task 1", 1000)
    .then(result => {
        console.log(result); // Resolved: Task 1
        return asyncTask("Task 2", 1000); // chaining another promise
    })
    .then(result => {
        console.log(result); // Resolved: Task 2
        return "Direct value"; // returning a plain value
    })
    .then(result => {
        console.log("Returned value:", result); // Returned value: Direct value
    })
    .catch(error => {
        console.error("Error caught:", error);
    })
    .finally(() => {
        console.log("First chain finished\n");
    });

// --------------------
// 2. Promise.resolve and Promise.reject
// --------------------
Promise.resolve("Immediate Resolve").then(console.log); // Immediate Resolve
Promise.reject("Immediate Reject").catch(console.error); // Immediate Reject

// --------------------
// 3. Promise.all
// --------------------
Promise.all([
    asyncTask("A", 1000),
    asyncTask("B", 1500),
    asyncTask("C", 500)
]).then(values => {
    console.log("Promise.all results:", values); // ["Resolved: A", "Resolved: B", "Resolved: C"]
}).catch(err => console.error(err));

// --------------------
// 4. Promise.allSettled
// --------------------
Promise.allSettled([
    asyncTask("X", 500),
    asyncTask("error", 1000),
    asyncTask("Y", 1500)
]).then(results => {
    console.log("Promise.allSettled results:", results);
    /*
    [
      {status: "fulfilled", value: "Resolved: X"},
      {status: "rejected", reason: "Rejected: error"},
      {status: "fulfilled", value: "Resolved: Y"}
    ]
    */
});

// --------------------
// 5. Promise.race
// --------------------
Promise.race([
    asyncTask("Fast", 500),
    asyncTask("Slow", 1500)
]).then(result => {
    console.log("Promise.race winner:", result); // Promise.race winner: Resolved: Fast
});

// --------------------
// 6. Promise.any
// --------------------
Promise.any([
    asyncTask("error", 500),
    asyncTask("Success!", 1000),
    asyncTask("Another", 1500)
]).then(result => {
    console.log("Promise.any first fulfilled:", result); // Promise.any first fulfilled: Resolved: Success!
}).catch(err => console.error("All promises failed:", err));

// --------------------
// 7. Sequential vs Parallel Example
// --------------------

// Sequential execution
asyncTask("Seq1", 500)
    .then(() => asyncTask("Seq2", 500))
    .then(() => asyncTask("Seq3", 500))
    .then(() => console.log("Sequential tasks done\n"));

// Parallel execution
Promise.all([
    asyncTask("Par1", 500),
    asyncTask("Par2", 1000),
    asyncTask("Par3", 1500)
]).then(() => console.log("Parallel tasks done"));
