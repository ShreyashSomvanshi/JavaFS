// constructor func

function Person(name, age){
    this.name = name;
    this.age = age;
}

// adding a method to the prototype
Person.prototype.greet = function(){
    console.log(`Hello my name is ${this.name} and my age is ${this.age}.`);
    
}

// create instance
const p1 = new Person('Alice', 22);
const p2 = new Person('Xyz', 33);

console.log(Object.getPrototypeOf(Person));
//OR
console.log(p1.__proto__);



p1.greet(); p2.greet();



