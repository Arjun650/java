const a = fetch("https://api.thecatapi.com/v1/images/0XYvRd7oD")

a.then((value)=>{
    value = value.json()
    return value
})
.then((value) =>{
    console.log(value)
})