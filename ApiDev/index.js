import express from 'express'

const app = express(); 

app.use(express.json()); 


const users = [{id: 1, name: "Arjun Das", age: 22}, {id: 2, name: "John Doe", age: 25}]

app.get("/", (req, res) =>{
    res.status(200).json({message: "API is running"})
})

app.get("/api/user", (req, res) =>{
    try{
        if(!users){
            res.status(404).json({message: "No user found"})
        }

        res.status(200).json({users, message: "User fetched successfully"}); 
    }

    catch(error){
        res.status(500).json({message: "Server error"})
    }
})

app.get("/api/user/:id", (req, res) =>{
    try{
        const id = parseInt(req.params.id); 
        const user = users.find(e => e.id === id )
        console.log(user)

        if(!user){
            res.status(404).json({message: "No user found"})
        }

        res.status(200).json({user, message: "User fetched successfully"})
    }
    catch(error){
        res.status(500).json({message: "Internal Server Error"})
    }
})

app.post("/api/addUser", (req, res) =>{
    const user = {
        id : users.length + 1,
        name : req.body.name, 
        age: req.body.age
    }

    try{
        const resp = users.push(user); 
        console.log(resp); 

        res.status(201).json({user, message: "user added successfully"}); 
    }
    catch(error){
        res.status(500).json({message: "Internal Server Error"}); 
    }
})


app.put("/api/updateUser/:id", (req, res) =>{
    const name = req.body.name; 
    const age = req.body.age; 

    try{
        const id = parseInt(req.params.id)
        const user = users.find(e => e.id === id); 
        user.name = name; 
        user.age = age; 
        res.status(200).json({user, message: "user updated successfully"}); 
    }
    catch(error){
        res.status(500).json({message: "Internal server error"})
    }
})

app.delete("/api/deleteUser/:id", (req, res) =>{
    
    try{
        const id = parseInt(req.params.id); 
        const user = users.find( e => e.id === id); 
        users.pop(user)

        res.status(200).json({message: "user deleted successfully", user})
    }
    catch(error){
        res.status(500).json({message: "Internal Server Error"})
    }
})



const PORT = process.env.PORT || 3000;

app.listen(PORT, () =>{
    console.log(`Server started on port ${PORT}`); 
})



