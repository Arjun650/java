class Vehicle{
    constructor(name, type, color){
        this.name = name;
        this.type = type;
        this.color = color;
    }

    getDetails(){
        return `Name: ${this.name}, Type: ${this.type}, Color: ${this.color}`;
    }
}

const car = new Vehicle("Toyota", "Sedan", "Red");
console.log(car.getDetails()); // Output: Name: Toyota, Type: Sedan, Color: