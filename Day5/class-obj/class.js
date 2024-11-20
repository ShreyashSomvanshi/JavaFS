class Person1{
    constructor(name, age){
        this.name = name;
        this.age = age;
    }
    hello(){
        console.log(`Hello, my name is ${this.name} and Im ${this.age} yrs old.`);
        
    }
}

const P1 = new Person1('abc', 22);
console.log(P1.name);
console.log(P1.age);
P1.hello();


class Employee{
    constructor(name, id){
        this.name = name;
        this.id = id
    }
    disp(){
        console.log(`Employee name is ${this.name}, id is ${this.id}`);
    }
}

let e1 = new Employee('ABC', 22);
let e2 = new Employee('XYZ', 24);

e1.disp(); e2.disp();




