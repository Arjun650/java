import express from "express";

const app = express();

// Middleware to parse JSON
app.use(express.json());

let users = [{id: 1, name: "John Doe", age: 22}, {id: 2, name: "Jane Smith", age: 28}];

app.get("/users", (req, res) => {
    try{
        res.status(200).json(users); 
    }
    catch(error){
        res.status(500).json({message:"server error"}); 
    }
})

app.get("/user/:id", (req, res) => {
  try {
    const id = parseInt(req.params.id, 10);

    const user = users.find(u => u.id === id);
    if (!user) {
      return res.status(404).json({ message: "User not found" });
    }

    res.status(200).json(user);
  } catch (error) {
    console.error("Error caught:", error);
    res.status(500).json({ message: "Server error" });
  }
});

app.post("/user", (req, res) =>{
    const ele = {
        id: users.length + 1,
        name: req.body.name, 
        age: req.body.age
    }

    users.push(ele); 
    res.status(201).json(ele);
})





// Basic route
app.get("/", (req, res) => {
  res.status(200).send({ message: "API is running" });
});

// Start the server
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Server started on port ${PORT}`);
});
