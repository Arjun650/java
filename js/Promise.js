const p1 = new Promise((resolve, reject) =>{
    console.log("starting")
    setTimeout(() =>{
        resolve("Hello world")
    }, 2000)
})

// p1.then(value =>{
//     console.log(value)
// })

p1.then(console.log("hello world"))