function firstPromise() {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("This is running in setTimeout and first promise");
        }, 2000);
    });
}

function secondPromise() {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("This is second promise 2");
        }, 2000);
    });
}

function thirdPromise() {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("This is third promise 3");
        }, 1000);
    });
}

firstPromise()
  .then(value1 => {
      console.log(value1);
      return secondPromise();
  })
  .then(value2 => {
      console.log(value2);
      return thirdPromise();
  })
  .then(value3 => {
      console.log(value3);
  })
  .catch(error => {
      console.error("Error:", error);
  });
