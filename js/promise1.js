function fetchData(){
    return new Promise((resolve, reject) =>{
        console.log("Fetching Data...")
        setTimeout(() =>{
            const data = {name: "Arjun Das", rollNo: 20}
            resolve(data) 
        }, 2000)
    })
}

fetchData()
.then(data =>{
    console.log(data.name + " roll no is " + data.rollNo)
})
.catch(error =>{
    console.log("Error occoured: " + error); 
})