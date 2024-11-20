class Animal{
    constructor(name, food){
        this.name = name;
        this.food = food;
    }
    animalProp(){
        return `${name} ${food}`;
    }
    msg(){
        return `Im an animal ${name}`;
    }
}

class Dog extends Animal{
    constructor(name, food, breed){
        super(name, food);
        this.breed = breed;
    }
    breedName(){
        return `${breed}`;
    }
    msg(){
        return `I'm animal ${this.name}, Im a dog of breed ${this.breed}`;
    }
    
}

let a1 = new Dog('Tom', 'Dog', 'dbreed');

console.log(a1.msg())
