function getDataAfter(ms){
    return new Promise((resolve, reject) =>{
        console.log("Fetching data ...")
        setTimeout(() =>{
            data = {name: "Arjun Kumar Das", rollNo: 86}
            resolve(data)
        }, ms)
    })
}

getDataAfter(2000)
.then(value =>{
    console.log("Fetched Data " + value.name + " " + value.rollNo)
})
.catch(error =>{
    console.log("The error is : ", error)
})